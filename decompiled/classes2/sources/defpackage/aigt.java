package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class aigt extends defpackage.aidg implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    public final transient aigf map;
    final transient int size;

    public aigt(aigf aigfVar, int i) {
        this.map = aigfVar;
        this.size = i;
    }

    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ java.util.Collection f(java.lang.Object obj) {
        throw null;
    }

    @Override // 
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public aifo i() {
        return new defpackage.aigr(this);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final aihd p() {
        return this.map.f();
    }

    public final int h() {
        return this.size;
    }

    public final /* synthetic */ java.util.Collection k() {
        return new defpackage.aigs(this);
    }

    public final /* synthetic */ java.util.Iterator l() {
        return new defpackage.aigo(this);
    }

    public /* synthetic */ java.util.Map o() {
        return this.map;
    }

    @java.lang.Deprecated
    public final void q() {
        throw new java.lang.UnsupportedOperationException();
    }

    public final boolean s(java.lang.Object obj) {
        return this.map.containsKey(obj);
    }

    @java.lang.Deprecated
    public final void t(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final boolean v(java.lang.Object obj) {
        return obj != null && super.v(obj);
    }

    @java.lang.Deprecated
    public final boolean x(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final void y(aije aijeVar) {
        throw null;
    }
}
