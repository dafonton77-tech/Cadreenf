# CADRE — Educational Android Parental Controls

**Status: experimental Android v0.1 prototype; not ready to protect children.**

CADRE is an initiative associated with Éducation Numérique France (ENF). We aim to combine feasible Android safety controls with family dialogue, gradual digital autonomy, transparent rules and privacy by design.

**Existing:** Kotlin Android skeleton, GitHub Actions build, local preference switches (not enforced), experimental DevicePolicyManager camera and package controls (not device-validated).

**Not built:** parent/child pairing, secure synchronization, time schedules, app limits, web allowlist, reports, permission requests, production UI, tests and privacy/security architecture.

**Android limitations:** we cannot universally block media inside third-party encrypted messengers while allowing text, nor guarantee device-wide enforcement without suitable Android management privileges. Device Owner must not be casually enabled on personal devices.

We welcome **volunteer** Android/Kotlin engineers, security reviewers, QA, UX and documentation contributors. See [contributing](../CONTRIBUTING.md), [roadmap](ROADMAP.md) and [technical feasibility](FAISABILITE_ANDROID.md).

**Licensing is not decided yet.** Public source does not mean open-source licensing. Please discuss licensing before submitting code. No paid work is promised.

[Repository issues](../../issues)
