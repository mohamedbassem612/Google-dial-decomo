package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cdj {
    public final defpackage.cbd a;
    public final boolean b;
    public final defpackage.cen c;
    public final defpackage.aonj d;
    public final boolean e;
    public final java.lang.Object f;
    public boolean g = true;

    public cdj(defpackage.cbd cbdVar, java.lang.Object obj, boolean z, defpackage.cen cenVar, defpackage.aonj aonjVar, boolean z2) {
        this.a = cbdVar;
        this.b = z;
        this.c = cenVar;
        this.d = aonjVar;
        this.e = z2;
        this.f = obj;
    }

    public final java.lang.Object a() {
        if (this.b) {
            return null;
        }
        java.lang.Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        defpackage.cax.a("Unexpected form of a provided value");
        throw new defpackage.aoiq();
    }
}
