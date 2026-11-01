package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gst extends defpackage.gsz {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gst(java.lang.Class cls, long j, java.util.concurrent.TimeUnit timeUnit) {
        super(cls);
        if (cls == null) {
            defpackage.aooh.i("workerClass");
        }
        if (timeUnit == null) {
            defpackage.aooh.i("repeatIntervalTimeUnit");
        }
        defpackage.gxl gxlVar = this.c;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            defpackage.gsh.a();
            android.util.Log.w(defpackage.gxl.a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j2 = millis < 900000 ? 900000L : millis;
        long j3 = millis < 900000 ? 900000L : millis;
        gxlVar.i = j2;
        if (j3 > j2) {
            defpackage.gsh.a();
            android.util.Log.w(defpackage.gxl.a, defpackage.a.bz(j2, "Flex duration greater than interval duration; Changed to "));
        }
        gxlVar.j = defpackage.aooc.y(j3, 300000L, gxlVar.i);
    }

    @Override // defpackage.gsz
    public final /* bridge */ /* synthetic */ defpackage.aogc a() {
        if (this.a && this.c.k.e) {
            throw new java.lang.IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        defpackage.gxl gxlVar = this.c;
        if (gxlVar.r) {
            throw new java.lang.IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new defpackage.aogc(this.b, gxlVar, this.d);
    }
}
