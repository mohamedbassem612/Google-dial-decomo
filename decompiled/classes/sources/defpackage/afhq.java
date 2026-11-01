package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class afhq implements defpackage.afhz {
    final /* synthetic */ defpackage.afhr d;

    public afhq(defpackage.afhr afhrVar) {
        j$.util.Objects.requireNonNull(afhrVar);
        this.d = afhrVar;
    }

    @Override // defpackage.afhz
    public final void c() {
        android.util.Log.v("ASQLDB", defpackage.adag.l(this.d.a.rawQuery("EXPLAIN QUERY PLAN ".concat(b()), null)));
    }
}
