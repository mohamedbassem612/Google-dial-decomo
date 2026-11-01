package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xmz implements defpackage.xpa, defpackage.xib {
    public static final defpackage.xer d = new defpackage.xer(14);
    public final defpackage.xib a;
    public final android.os.PersistableBundle b;

    public xmz(defpackage.xib xibVar, android.os.PersistableBundle persistableBundle) {
        this.a = xibVar;
        this.b = persistableBundle;
    }

    @Override // defpackage.xhu
    public final defpackage.xhs asComponentRef() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [xhz, xib] */
    @Override // defpackage.xib
    public final defpackage.xhz asNodeRef() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xmz) {
            defpackage.xmz xmzVar = (defpackage.xmz) obj;
            if (aooh.n(this.a, xmzVar.a) && aooh.n(this.b, xmzVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return ((defpackage.xia) this.a).a;
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        return ((defpackage.xia) this.a).b;
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodePackage() {
        return defpackage.xhp.e(this.a);
    }

    @Override // defpackage.xhu
    public final java.lang.String getSubcomponent() {
        throw null;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.xib, defpackage.xhu
    public final java.lang.String identity() {
        return defpackage.xfc.b(this.a);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        android.os.PersistableBundle persistableBundleH = defpackage.xhy.h(this.a);
        persistableBundleH.putPersistableBundle("INPUT", this.b);
        return persistableBundleH;
    }

    public final java.lang.String toString() {
        return "Request(node=" + this.a + ", input=" + this.b + ')';
    }
}
