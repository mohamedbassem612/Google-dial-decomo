package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vrq {
    private boolean a;
    private android.content.Intent b;
    private android.content.Intent c;
    private j$.util.Optional d;
    private defpackage.vrr e;
    private j$.util.Optional f;
    private j$.util.Optional g;
    private j$.util.Optional h;
    private byte i;

    public vrq(defpackage.vru vruVar) {
        this.d = j$.util.Optional.empty();
        this.f = j$.util.Optional.empty();
        this.g = j$.util.Optional.empty();
        this.h = j$.util.Optional.empty();
        this.a = vruVar.a;
        this.b = vruVar.b;
        this.c = vruVar.c;
        this.d = vruVar.d;
        this.e = vruVar.e;
        this.f = vruVar.f;
        this.g = vruVar.g;
        this.h = vruVar.h;
        this.i = (byte) 1;
    }

    public final defpackage.vru a() {
        android.content.Intent intent;
        android.content.Intent intent2;
        defpackage.vrr vrrVar;
        if (this.i == 1 && (intent = this.b) != null && (intent2 = this.c) != null && (vrrVar = this.e) != null) {
            return new defpackage.vru(this.a, intent, intent2, this.d, vrrVar, this.f, this.g, this.h);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.i == 0) {
            sb.append(" isVvmEligible");
        }
        if (this.b == null) {
            sb.append(" notificationSettingsIntent");
        }
        if (this.c == null) {
            sb.append(" advancedSettingsIntent");
        }
        if (this.e == null) {
            sb.append(" changeFiGreetingPreferenceState");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(android.content.Intent intent) {
        if (intent == null) {
            throw new java.lang.NullPointerException("Null advancedSettingsIntent");
        }
        this.c = intent;
    }

    public final void c(defpackage.vrr vrrVar) {
        if (vrrVar == null) {
            throw new java.lang.NullPointerException("Null changeFiGreetingPreferenceState");
        }
        this.e = vrrVar;
    }

    public final void d(boolean z) {
        this.a = z;
        this.i = (byte) 1;
    }

    public final void e(android.content.Intent intent) {
        if (intent == null) {
            throw new java.lang.NullPointerException("Null notificationSettingsIntent");
        }
        this.b = intent;
    }

    public final void f(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null phoneAccountLabelInfo");
        }
        this.d = optional;
    }

    public final void g(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null sodaBannerModel");
        }
        this.g = optional;
    }

    public final void h(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null vvmAccountInfoModel");
        }
        this.f = optional;
    }

    public final void i(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null vvmPreferenceErrorMessage");
        }
        this.h = optional;
    }

    public vrq() {
        this.d = j$.util.Optional.empty();
        this.f = j$.util.Optional.empty();
        this.g = j$.util.Optional.empty();
        this.h = j$.util.Optional.empty();
    }
}
