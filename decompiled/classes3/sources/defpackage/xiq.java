package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class xiq implements defpackage.xiw {
    protected abstract defpackage.xhz a();

    @Override // defpackage.xhu
    public final /* synthetic */ defpackage.xhs asComponentRef() {
        throw null;
    }

    @Override // defpackage.xib
    public final /* synthetic */ defpackage.xhz asNodeRef() {
        return new defpackage.xia(this);
    }

    @Override // defpackage.xiz
    public /* synthetic */ j$.time.Instant c() {
        throw null;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return e((j$.time.Instant) obj);
    }

    @Override // defpackage.xja, defpackage.xhx
    public /* synthetic */ long d() {
        throw null;
    }

    @Override // defpackage.xiz
    public final /* synthetic */ int e(j$.time.Instant instant) {
        return defpackage.xfh.b(this, instant);
    }

    @Override // defpackage.xjz
    public final /* synthetic */ defpackage.xjx f() {
        return new defpackage.xjy(this);
    }

    @Override // defpackage.xiw
    public final /* synthetic */ java.lang.String g() {
        return defpackage.xff.b(this);
    }

    @Override // defpackage.xhu
    public final java.lang.String getNodeComponent() {
        return a().getNodeComponent();
    }

    @Override // defpackage.xja, defpackage.xib
    public final java.lang.String getNodeName() {
        return a().getNodeName();
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getNodePackage() {
        return defpackage.xhp.e(this);
    }

    @Override // defpackage.xhu
    public final /* synthetic */ java.lang.String getSubcomponent() {
        throw null;
    }

    @Override // defpackage.xjz, defpackage.xib, defpackage.xhu
    public final /* synthetic */ java.lang.String identity() {
        return defpackage.xfh.a(this);
    }
}
