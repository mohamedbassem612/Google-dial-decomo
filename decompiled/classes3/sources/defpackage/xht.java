package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xht implements defpackage.xhs {
    public final java.lang.String a;
    public final aoir b;
    private final aoir c;

    public xht(java.lang.String str) {
        aooh.f(str, "nodeComponent");
        this.a = str;
        this.c = aooc.ag(new defpackage.wsn(this, 6));
        this.b = aooc.ag(new defpackage.wsn(this, 7));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.xht) && aooh.n(this.a, ((defpackage.xht) obj).a);
        }
        return true;
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return this.a;
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodePackage() {
        return (java.lang.String) this.c.a();
    }

    @Override // defpackage.xhu
    public final java.lang.String getSubcomponent() {
        throw null;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String identity() {
        throw null;
    }

    @Override // defpackage.xpa
    public final android.os.PersistableBundle toPersistableBundle() {
        return defpackage.xhy.k(this);
    }

    public final java.lang.String toString() {
        return this.a;
    }

    @Override // defpackage.xhu
    public final defpackage.xhs asComponentRef() {
        return this;
    }
}
