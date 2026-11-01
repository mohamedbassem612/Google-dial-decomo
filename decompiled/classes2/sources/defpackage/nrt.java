package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nrt extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ long c;
    final /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrt(boolean z, defpackage.dqc dqcVar, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = z;
        this.d = dqcVar;
        this.c = j;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objR;
        if (this.$cid != 0) {
            aolu aoluVar = aolu.a;
            int i = this.a;
            aooc.af(obj);
            if (i == 0) {
                boolean z = this.b;
                java.lang.Object obj2 = this.d;
                if (z) {
                    long j = this.c;
                    this.a = 2;
                    obj = ((defpackage.dqc) obj2).b.d(j, 0L, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    long j2 = ((defpackage.dpu) obj).a;
                } else {
                    long j3 = this.c;
                    this.a = 1;
                    obj = ((defpackage.dqc) obj2).b.d(0L, j3, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                    long j4 = ((defpackage.dpu) obj).a;
                }
            } else if (i != 1) {
                long j5 = ((defpackage.dpu) obj).a;
            } else {
                long j6 = ((defpackage.dpu) obj).a;
            }
            return aojh.a;
        }
        aolu aoluVar2 = aolu.a;
        int i2 = this.a;
        aooc.af(obj);
        if (i2 == 0) {
            if (this.b) {
                defpackage.nrv.a.b().l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "writeToBeeslyData$<anonymous>", 129, "DobbySessionWriter.kt").v("Duplex mark transcript as spam, no need to generate call actions, skip to write to beesly.");
                return aojh.a;
            }
            defpackage.nrv nrvVar = (defpackage.nrv) this.d;
            defpackage.koy koyVarA = nrvVar.d.a();
            if (aooh.n(koyVarA, defpackage.koy.a)) {
                defpackage.nrv.a.b().l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "writeToBeeslyData$<anonymous>", 138, "DobbySessionWriter.kt").v("returned soda transcription does not contain real transcript, skip to write to beesly.");
                return aojh.a;
            }
            j$.util.Optional optionalG = nrvVar.g.g();
            aooh.e(optionalG, "getFeature(...)");
            defpackage.irl irlVar = (defpackage.irl) aooh.q(optionalG);
            if (irlVar == null || !irlVar.e()) {
                defpackage.nrv.a.b().l("com/android/dialer/dobby/impl/storage/DobbySessionWriter", "writeToBeeslyData$<anonymous>", 145, "DobbySessionWriter.kt").v("beesly feature or call actions is not enabled.");
                return aojh.a;
            }
            long j7 = this.c;
            java.lang.String str = nrvVar.e;
            long epochMilli = j$.time.Instant.now().toEpochMilli();
            this.a = 1;
            if (irlVar.e()) {
                java.io.File filesDir = irlVar.f.getFilesDir();
                java.lang.String str2 = java.lang.String.format(java.util.Locale.US, "beesly_transcripts_%d.data", java.util.Arrays.copyOf(new java.lang.Object[]{new java.lang.Long(j7)}, 1));
                aooh.e(str2, "format(...)");
                java.io.File file = new java.io.File(filesDir, str2);
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                try {
                    koyVarA.h(fileOutputStream);
                    ajsz.ak(fileOutputStream, (java.lang.Throwable) null);
                    kgl kglVar = irlVar.g;
                    defpackage.ity ityVar = new defpackage.ity(j7);
                    java.lang.String path = file.getPath();
                    aooh.e(path, "getPath(...)");
                    objR = kglVar.r(ityVar, str, path, epochMilli, this);
                    if (objR != aolu.a) {
                        objR = aojh.a;
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak(fileOutputStream, th);
                        throw th2;
                    }
                }
            } else {
                defpackage.irl.a.b().l("com/android/dialer/beesly/impl/BeeslyImpl", "putTranscript", 66, "BeeslyImpl.kt").v("Beesly call action is not supported, skip write to beesly data.");
                objR = aojh.a;
            }
            if (objR == aoluVar2) {
                return aoluVar2;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        if (this.$cid != 0) {
            return new defpackage.nrt(this.b, (defpackage.dqc) this.d, this.c, aolnVar, 1);
        }
        return new defpackage.nrt(this.b, (defpackage.nrv) this.d, this.c, aolnVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrt(boolean z, defpackage.nrv nrvVar, long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = z;
        this.d = nrvVar;
        this.c = j;
    }
}
