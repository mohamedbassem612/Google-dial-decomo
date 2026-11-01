package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xjy implements defpackage.xjx {
    public final java.lang.String a;
    public final java.lang.String b;
    public final long d;

    public xjy(java.lang.String str, java.lang.String str2, long j) {
        aooh.f(str, "nodeComponent");
        aooh.f(str2, "nodeName");
        this.a = str;
        this.b = str2;
        this.d = j;
    }

    @Override // defpackage.xhu
    public final /* synthetic */ defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final /* synthetic */ defpackage.xhz asNodeRef() {
        return new defpackage.xia(this);
    }

    @Override // defpackage.xhx
    public final long d() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.xjy) {
            defpackage.xjy xjyVar = (defpackage.xjy) obj;
            if (aooh.n(this.a, xjyVar.a) && aooh.n(this.b, xjyVar.b) && this.d == xjyVar.d) {
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
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.M(this.d);
    }

    @Override // defpackage.xjz, defpackage.xib, defpackage.xhu
    public final /* synthetic */ java.lang.String identity() {
        return defpackage.xfh.a(this);
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        return defpackage.xhy.n(this);
    }

    public final java.lang.String toString() {
        return defpackage.xfh.a(this);
    }

    @Override // defpackage.xjz
    public final defpackage.xjx f() {
        return this;
    }

    public xjy(defpackage.xjz xjzVar) {
        this(xjzVar.getNodeComponent(), xjzVar.getNodeName(), xjzVar.d());
    }
}
