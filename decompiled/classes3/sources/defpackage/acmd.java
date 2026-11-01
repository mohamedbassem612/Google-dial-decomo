package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acmd {
    public static final aaoo e = new aaoo();
    public defpackage.acmx a;
    public int b = -1;
    public final akzz c;
    public final defpackage.vaa d;
    public final aaoo f;

    public acmd(akzz akzzVar, aaoo aaooVar, defpackage.vaa vaaVar) {
        this.c = akzzVar;
        this.f = aaooVar;
        this.d = vaaVar;
    }

    public final acmi a() {
        return this.c.p();
    }

    public final boolean b() {
        aiwc aiwcVar = this.c.b.d;
        if (aiwcVar == null) {
            aiwcVar = aiwc.a;
        }
        return (aiwcVar.b & 8) != 0;
    }

    public final boolean c() {
        aiwc aiwcVar = this.c.b.d;
        if (aiwcVar == null) {
            aiwcVar = aiwc.a;
        }
        return (aiwcVar.b & 2048) != 0;
    }

    public final int d() {
        return this.a.p();
    }

    public final java.lang.String toString() {
        defpackage.acmx acmxVar = this.a;
        java.lang.String strConcat = acmxVar != null ? ".".concat(java.lang.String.valueOf(acmxVar.getClass().getSimpleName())) : "";
        aiwc aiwcVar = this.c.b.d;
        if (aiwcVar == null) {
            aiwcVar = aiwc.a;
        }
        return "CVE" + strConcat + '#' + aiwcVar.d + " [" + java.lang.Integer.toHexString(hashCode()) + ']';
    }
}
