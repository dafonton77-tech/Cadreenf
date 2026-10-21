plugins { kotlin("jvm") version "2.0.21"; application }
repositories { mavenCentral() }
kotlin { jvmToolchain(17) }
dependencies { testImplementation(kotlin("test-junit5")); testRuntimeOnly("org.junit.platform:junit-platform-launcher") }
tasks.test { useJUnitPlatform() }

application { mainClass.set("fr.educationnumeriquefrance.cadre.rules.ExampleKt") }
