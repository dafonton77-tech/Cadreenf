package fr.educationnumeriquefrance.cadre

import android.app.Activity
import android.app.admin.DevicePolicyManager
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.*

class MainActivity : Activity() {
 private lateinit var policy: DevicePolicyManager
 private lateinit var admin: ComponentName
 private val prefs by lazy { getSharedPreferences("cadre_rights", MODE_PRIVATE) }
 private fun owner() = policy.isDeviceOwnerApp(packageName)
 private fun notifyUser(msg:String) = Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
 override fun onCreate(savedInstanceState:Bundle?) {
  super.onCreate(savedInstanceState)
  policy=getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager
  admin=ComponentName(this,CadreAdminReceiver::class.java)
  render()
 }
 override fun onResume(){ super.onResume(); render() }
 private fun render(){
  val layout=LinearLayout(this).apply { orientation=LinearLayout.VERTICAL; setPadding(30,24,30,36); setBackgroundColor(Color.rgb(247,239,229)) }
  val scroll=ScrollView(this).apply { addView(layout) }
  setContentView(scroll)
  fun text(s:String,sz:Float=16f){layout.addView(TextView(this).apply { text=s; textSize=sz; setTextColor(Color.DKGRAY); setPadding(0,12,0,12) })}
  fun button(s:String,act:()->Unit){layout.addView(Button(this).apply { text=s; setOnClickListener { act() } })}
  text("CADRE · Laboratoire Android",24f)
  text("Version 0.1 expérimentale. Aucun accès aux messages ou photos.")
  text("Mode administrateur complet : "+if(owner()) "ACTIF" else "INACTIF")
  if(!policy.isAdminActive(admin)) button("Demander l'administration classique") {
   startActivity(Intent(DevicePolicyManager.ACTION_ADD_DEVICE_ADMIN).apply {
    putExtra(DevicePolicyManager.EXTRA_DEVICE_ADMIN,admin)
    putExtra(DevicePolicyManager.EXTRA_ADD_EXPLANATION,"Test expérimental de désactivation de la caméra.")
   })
  }
  text("Caméra",21f)
  val camera=Switch(this).apply {
   text="Caméra désactivée"
   isChecked=try {policy.getCameraDisabled(admin)} catch(e:Exception){false}
  }
  camera.setOnCheckedChangeListener { _,checked ->
   try {policy.setCameraDisabled(admin,checked); notifyUser("Réglage caméra appliqué")}
   catch(e:Exception){notifyUser("Refus Android : "+e.message); render()}
  }
  layout.addView(camera)
  text("Applications · nécessite Device Owner",21f)
  val pkg=EditText(this).apply {hint="Nom du package Android";setSingleLine(true)}
  layout.addView(pkg)
  fun suspendApp(value:Boolean){
   val name=pkg.text.toString().trim()
   if(!owner()){notifyUser("Mode Device Owner requis");return}
   if(name.isEmpty() || name==packageName || name=="com.android.systemui"){notifyUser("Application non autorisée");return}
   try {val failed=policy.setPackagesSuspended(admin,arrayOf(name),value);notifyUser(if(failed.isEmpty())"Commande appliquée" else "Échec : "+failed.joinToString())}
   catch(e:Exception){notifyUser("Refus Android : "+e.message)}
  }
  button("Suspendre l'application"){suspendApp(true)}
  button("Réautoriser l'application"){suspendApp(false)}
  text("Compétences numériques · préférences uniquement",21f)
  listOf("Messages texte","Recevoir des photos","Envoyer des photos","Vidéos","Liens Internet","Documents").forEachIndexed { index,name ->
   val key="right_"+index
   layout.addView(Switch(this).apply {
    text=name;isChecked=prefs.getBoolean(key,index==0)
    setOnCheckedChangeListener { _,checked ->prefs.edit().putBoolean(key,checked).apply() }
   })
  }
  text("IMPORTANT : les interrupteurs de compétences n'imposent aucune restriction aux messageries tierces.",14f)
  text("Filtrage web, synchronisation et blocage des médias WhatsApp/Snapchat : non développés.",14f)
 }
}
