package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class aijn extends aicz {
    final aije a;
    public final defpackage.aiiy b;

    public aijn(aije aijeVar, defpackage.aiiy aiiyVar) {
        ahvr.ci(aijeVar);
        this.a = aijeVar;
        this.b = aiiyVar;
    }

    public java.util.Collection a(java.lang.Object obj, java.util.Collection collection) {
        agnx agnxVar = new agnx(this, obj, 11);
        return collection instanceof java.util.List ? ahvr.aO((java.util.List) collection, agnxVar) : new defpackage.aids(collection, agnxVar);
    }

    public java.util.Collection c(java.lang.Object obj) {
        return a(obj, this.a.c(obj));
    }

    public final int h() {
        return this.a.h();
    }

    public final java.util.Collection i() {
        return new aijl(this);
    }

    public final java.util.Collection k() {
        return new defpackage.aids(this.a.i(), new ahds(this, 12));
    }

    public final java.util.Iterator l() {
        return ahvr.bb(this.a.i().iterator(), ahvr.aB(this.b));
    }

    public final java.util.Map o() {
        return new defpackage.aijc(this.a.o(), new defpackage.aijj(this, 2));
    }

    public final java.util.Set p() {
        return this.a.p();
    }

    public final void q() {
        this.a.q();
    }

    public final boolean s(java.lang.Object obj) {
        throw null;
    }

    public final void t(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    public final boolean w() {
        throw null;
    }

    public final boolean x(java.lang.Object obj, java.lang.Object obj2) {
        return c(obj).remove(obj2);
    }

    public final void y(aije aijeVar) {
        throw null;
    }
}
