# CADRE — educational, modular Android parental controls

CADRE aims to support families through configurable protections, school/learning/leisure modes, usage awareness, family dialogue and gradual autonomy. The future Éducation Numérique France association is being established. This is a social-purpose project, not a claim of official charitable recognition or unique technological novelty.

Our delivery goal is a working Android pilot offered free to volunteer parents at ENF conferences, improved through their needs, usability feedback and bug reports. We welcome concrete volunteer engagement, including implementation, testing and communication within each contributor’s availability; occasional contributions and parent participation are welcome. The current prototype is not ready to protect a child. Android coverage must be validated; iOS, universal compatibility and an integrated forum are outside the first pilot.

The [feature register](FEATURE_REGISTER.md) retains known requests and limitations. It distinguishes time reminders from actual scroll detection and records image/media/link/language filtering requests without promising universal third-party-app control or access to private content. No private messages, photos, videos or audio collection, keylogging or screen recording is allowed. Semantic filtering may conflict with that boundary and is not implicitly authorized.

Implementation tasks: #13–#19. Pilot delivery and acceptance: #12. Original introductory material follows for technical context.

# CADRE — Educational Android Parental Controls

**Status: experimental Android v0.1 prototype; not ready to protect children.**

CADRE is an initiative associated with Éducation Numérique France (ENF). We aim to combine feasible Android safety controls with family dialogue, gradual digital autonomy, transparent rules and privacy by design.

**Existing:** Kotlin Android skeleton, GitHub Actions build, local preference switches (not enforced), experimental DevicePolicyManager camera and package controls (not device-validated).

**Not built:** parent/child pairing, secure synchronization, time schedules, app limits, web allowlist, reports, permission requests, production UI, tests and privacy/security architecture.

**Android limitations:** we cannot universally block media inside third-party encrypted messengers while allowing text, nor guarantee device-wide enforcement without suitable Android management privileges. Device Owner must not be casually enabled on personal devices.

We welcome **volunteer** Android/Kotlin engineers, security reviewers, QA, UX and documentation contributors. See [contributing](../CONTRIBUTING.md), [roadmap](ROADMAP.md) and [technical feasibility](FAISABILITE_ANDROID.md).

**Code license: MIT** (see [LICENSE](../LICENSE) and [NOTICE.md](../NOTICE.md)). ENF's pre-existing educational content, marks and logos are not automatically licensed. Contributions are voluntary; no paid work is promised.

[Repository issues](../../issues)
