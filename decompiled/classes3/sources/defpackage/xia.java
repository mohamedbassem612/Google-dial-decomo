package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xia implements defpackage.xhz {
    public final java.lang.String a;
    public final java.lang.String b;

    public xia(java.lang.String str, java.lang.String str2) {
        aooh.f(str, "nodeComponent");
        aooh.f(str2, "nodeName");
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.xhu
    public final /* synthetic */ defpackage.xhs asComponentRef() {
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xia) {
            defpackage.xia xiaVar = (defpackage.xia) obj;
            if (aooh.n(this.a, xiaVar.a) && aooh.n(this.b, xiaVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return this.a;
    }

    @Override // defpackage.xib
    public final java.lang.String getNodeName() {
        return this.b;
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getNodePackage() {
        return defpackage.xhp.e(this);
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getSubcomponent() {
        throw null;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.xib, defpackage.xhu
    public final /* synthetic */ java.lang.String identity() {
        return defpackage.xfc.b(this);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        return defpackage.xhy.h(this);
    }

    public final java.lang.String toString() {
        return defpackage.xfc.b(this);
    }

    public xia(defpackage.xib xibVar) {
        this(xibVar.getNodeComponent(), xibVar.getNodeName());
    }

    @Override // defpackage.xib
    public final defpackage.xhz asNodeRef() {
        return this;
    }
}
