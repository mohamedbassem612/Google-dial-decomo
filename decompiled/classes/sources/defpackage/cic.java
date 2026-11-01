package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class cic extends defpackage.aojp implements j$.util.Map, defpackage.cho {
    public static final defpackage.cic a = new defpackage.cic(defpackage.cil.a, 0);
    public final defpackage.cil b;
    public final int c;

    public cic(defpackage.cil cilVar, int i) {
        this.b = cilVar;
        this.c = i;
    }

    @Override // defpackage.aojp
    public final int b() {
        return this.c;
    }

    public final defpackage.cic c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.cik cikVarD = this.b.d(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return cikVarD != null ? new defpackage.cic(cikVarD.a, b() + cikVarD.b) : this;
    }

    @Override // defpackage.aojp, java.util.Map
    public boolean containsKey(java.lang.Object obj) {
        return this.b.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.cho
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public defpackage.cie a() {
        return new defpackage.cie(this);
    }

    @Override // defpackage.aojp
    public final /* synthetic */ java.util.Collection e() {
        return new cij(this);
    }

    @Override // defpackage.aojp
    public final java.util.Set f() {
        return new cii(this, 1);
    }

    @Override // defpackage.aojp
    public final /* synthetic */ java.util.Set g() {
        return new cii(this, 0);
    }

    @Override // defpackage.aojp, java.util.Map
    public java.lang.Object get(java.lang.Object obj) {
        return this.b.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }
}
