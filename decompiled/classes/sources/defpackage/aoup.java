package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aoup extends defpackage.aosp {
    protected final java.lang.String h() {
        defpackage.aoup aoupVarJ;
        defpackage.aosp aospVar = defpackage.aoth.a;
        defpackage.aoup aoupVar = defpackage.apcg.a;
        if (this == aoupVar) {
            return "Dispatchers.Main";
        }
        try {
            aoupVarJ = aoupVar.j();
        } catch (java.lang.UnsupportedOperationException unused) {
            aoupVarJ = null;
        }
        if (this == aoupVarJ) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract defpackage.aoup j();

    @Override // defpackage.aosp
    public java.lang.String toString() {
        java.lang.String strH = h();
        if (strH != null) {
            return strH;
        }
        return defpackage.aosv.a(this) + '@' + defpackage.aosv.b(this);
    }

    @Override // defpackage.aosp
    public final defpackage.aosp e(int i) {
        return this;
    }
}
