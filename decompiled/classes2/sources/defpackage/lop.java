package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lop {
    public final java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public lop(defpackage.jyn jynVar) {
        j$.util.Objects.requireNonNull(jynVar);
        this.b = jynVar;
        this.a = jynVar.b.edit();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    public final void a() {
        this.a.apply();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    public final void b(java.lang.String str, boolean z) {
        this.a.putBoolean(((defpackage.jyn) this.b).g(str), z);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    public final void c(java.lang.String str, int i) {
        this.a.putInt(((defpackage.jyn) this.b).g(str), i);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    public final void d(java.lang.String str, java.lang.String str2) {
        this.a.putString(((defpackage.jyn) this.b).g(str), str2);
    }

    public lop(defpackage.ibd ibdVar, dsd dsdVar) {
        j$.util.Objects.requireNonNull(ibdVar);
        this.b = ibdVar;
        this.a = dsdVar;
    }
}
