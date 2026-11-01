package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nrk extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ long a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ alad c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrk(defpackage.nrj nrjVar, long j, defpackage.aivr aivrVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = nrjVar;
        this.a = j;
        this.c = aivrVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aooc.af(obj);
            java.io.File filesDir = ((android.content.Context) ((pgi) this.b).a).getFilesDir();
            java.lang.String str = java.lang.String.format(java.util.Locale.US, "dobby_logs_%d.data", java.util.Arrays.copyOf(new java.lang.Object[]{new java.lang.Long(this.a)}, 1));
            aooh.e(str, "format(...)");
            java.io.File file = new java.io.File(filesDir, str);
            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
            try {
                this.c.h(fileOutputStream);
                ajsz.ak(fileOutputStream, (java.lang.Throwable) null);
                defpackage.npw npwVarAv = mni.av(defpackage.nso.a.m());
                java.lang.String absolutePath = file.getAbsolutePath();
                aooh.e(absolutePath, "getAbsolutePath(...)");
                npwVarAv.s(absolutePath);
                return npwVarAv.r();
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(fileOutputStream, th);
                    throw th2;
                }
            }
        }
        if (i == 1) {
            aooc.af(obj);
            defpackage.nrj.a.b().l("com/android/dialer/dobby/impl/storage/DobbyOutOfSessionWriter", "writeSpamReportLogs$<anonymous>", 29, "DobbyOutOfSessionWriter.kt").v("persisting dobby spam session logs");
            long j = this.a;
            java.lang.String strValueOf = java.lang.String.valueOf(j);
            vaa vaaVarCe = wsc.ce(ucu.a.m());
            vaaVarCe.u(j);
            vaaVarCe.v((defpackage.aivr) this.c);
            ((defpackage.nrj) this.b).b.b(strValueOf, vaaVarCe.t());
            return aojh.a;
        }
        aooc.af(obj);
        tlx.a.b().l("com/android/dialer/sharpie/impl/logging/scooby/SharpieScoobySpamReportLogger", "writePersistentSpamReportSessonLogs$<anonymous>", 25, "SharpieScoobySpamReportLogger.kt").v("persistent sharpie spam report session logs");
        long j2 = this.a;
        java.lang.String strValueOf2 = java.lang.String.valueOf(j2);
        vaa vaaVarCe2 = wsc.ce(ucu.a.m());
        vaaVarCe2.u(j2);
        alad aladVar = this.c;
        aooh.f(aladVar, "value");
        akzx akzxVar = (akzx) vaaVarCe2.a;
        akzxVar.u();
        ucu ucuVar = akzxVar.b;
        j$.util.Objects.requireNonNull(aladVar);
        ucuVar.n = (defpackage.aivw) aladVar;
        ucuVar.b |= 4096;
        ((tlx) this.b).c.b(strValueOf2, vaaVarCe2.t());
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.nrk((pgi) this.b, this.a, (defpackage.nsn) this.c, aolnVar, 0);
        }
        java.lang.Object obj2 = this.b;
        if (i != 1) {
            return new defpackage.nrk((tlx) obj2, this.a, (defpackage.aivw) this.c, aolnVar, 2);
        }
        return new defpackage.nrk((defpackage.nrj) obj2, this.a, (defpackage.aivr) this.c, aolnVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrk(pgi pgiVar, long j, defpackage.nsn nsnVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = pgiVar;
        this.a = j;
        this.c = nsnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrk(tlx tlxVar, long j, defpackage.aivw aivwVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = tlxVar;
        this.a = j;
        this.c = aivwVar;
    }
}
