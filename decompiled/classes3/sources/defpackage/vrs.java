package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vrs {
    public boolean a;
    public boolean b;
    public defpackage.vrr c;
    public defpackage.vrr e;
    public defpackage.vrr f;
    public defpackage.vrr h;
    public byte l;
    public j$.util.Optional d = j$.util.Optional.empty();
    public j$.util.Optional g = j$.util.Optional.empty();
    public j$.util.Optional i = j$.util.Optional.empty();
    public j$.util.Optional j = j$.util.Optional.empty();
    public j$.util.Optional k = j$.util.Optional.empty();

    public final void a(defpackage.vrr vrrVar) {
        if (vrrVar == null) {
            throw new java.lang.NullPointerException("Null changeGreetingPreferenceState");
        }
        this.h = vrrVar;
    }

    public final void b(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null changePinIntent");
        }
        this.k = optional;
    }

    public final void c(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null changePinPreferenceTitle");
        }
        this.j = optional;
    }

    public final void d(defpackage.vrr vrrVar) {
        if (vrrVar == null) {
            throw new java.lang.NullPointerException("Null donateTranscribedPreferenceState");
        }
        this.f = vrrVar;
    }

    public final void e(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null donateTranscribedVoicemailPreferenceSummary");
        }
        this.g = optional;
    }

    public final void f(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null voicemailChangePinPreferenceSummary");
        }
        this.i = optional;
    }

    public final void g(defpackage.vrr vrrVar) {
        if (vrrVar == null) {
            throw new java.lang.NullPointerException("Null voicemailPreferenceState");
        }
        this.c = vrrVar;
    }

    public final void h(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null voicemailSummaryMessage");
        }
        this.d = optional;
    }

    public final void i(defpackage.vrr vrrVar) {
        if (vrrVar == null) {
            throw new java.lang.NullPointerException("Null voicemailTranscriptionPreferenceState");
        }
        this.e = vrrVar;
    }
}
