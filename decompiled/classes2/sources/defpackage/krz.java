package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class krz implements aonn {
    public final defpackage.kqw a;
    final /* synthetic */ defpackage.ksg b;

    public krz(defpackage.ksg ksgVar, defpackage.kqw kqwVar) {
        aooh.f(kqwVar, "calendarInviteAction");
        this.b = ksgVar;
        this.a = kqwVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        az azVar = (az) obj;
        defpackage.krk krkVar = (defpackage.krk) obj2;
        aooh.f(azVar, "activity");
        aooh.f(krkVar, "callActionEventListener");
        krkVar.a(new defpackage.kre(1));
        defpackage.ksg ksgVar = this.b;
        aoov.an(ksgVar.b, (aolr) null, 0, new defpackage.blv(ksgVar, azVar, this, krkVar, (aoln) null, 9), 3);
        return aojh.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.krz) {
            return aooh.n(this.a, ((defpackage.krz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
