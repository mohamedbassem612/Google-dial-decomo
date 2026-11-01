package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rok {
    public final boolean a;
    public final boolean b;
    public final defpackage.roc c;
    public final defpackage.ttj d;

    public rok(boolean z, boolean z2, defpackage.ttj ttjVar, defpackage.roc rocVar) {
        if (ttjVar == null) {
            defpackage.aooh.i("searchUiState");
        }
        if (rocVar == null) {
            defpackage.aooh.i("selectedTab");
        }
        this.a = z;
        this.b = z2;
        this.d = ttjVar;
        this.c = rocVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rok) {
            defpackage.rok rokVar = (defpackage.rok) obj;
            if (this.a == rokVar.a && this.b == rokVar.b && defpackage.aooh.n(this.d, rokVar.d) && this.c == rokVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((defpackage.anty.L(this.a) * 31) + defpackage.anty.L(this.b)) * 31) + this.d.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "ActivityRetainedState(showDeviceIncompatibleWarningDialog=" + this.a + ", showDefaultDialerPrompt=" + this.b + ", searchUiState=" + this.d + ", selectedTab=" + this.c + ')';
    }
}
