package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aeoc implements java.lang.Runnable {
    public final /* synthetic */ aeod a;
    public final /* synthetic */ defpackage.aeob b;

    public /* synthetic */ aeoc(aeod aeodVar, defpackage.aeob aeobVar) {
        this.a = aeodVar;
        this.b = aeobVar;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x015a  */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.Object, java.util.Set] */
    @Override // java.lang.Runnable
    public final void run() {
        aeod aeodVar = this.a;
        if (aeodVar.c == null) {
            akzx akzxVarM = defpackage.aenz.a.m();
            long jMyPid = android.os.Process.myPid();
            akzxVarM.u();
            defpackage.aenz aenzVar = (defpackage.aenz) akzxVarM.b;
            aenzVar.b |= 1;
            aenzVar.c = jMyPid;
            alcf alcfVarE = aldi.e(j$.time.Instant.now().toEpochMilli());
            akzxVarM.u();
            defpackage.aenz aenzVar2 = (defpackage.aenz) akzxVarM.b;
            j$.util.Objects.requireNonNull(alcfVarE);
            aenzVar2.d = alcfVarE;
            aenzVar2.b |= 2;
            aeodVar.c = akzxVarM;
        }
        if (this.b.a(aeodVar.c)) {
            aevd aevdVar = aeodVar.d;
            defpackage.aenz aenzVar3 = (defpackage.aenz) aeodVar.c.p();
            int i = aenzVar3.b;
            if ((i & 1) == 0 || (i & 2) == 0 || aenzVar3.c < 0) {
                defpackage.aenr.a.d().l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 45, "FlightRecordWriterImpl.java").v("Invalid FlightRecord");
            } else {
                alcf alcfVar = aenzVar3.d;
                if (alcfVar == null) {
                    alcfVar = alcf.a;
                }
                if (alcfVar.b >= 0) {
                    java.io.File file = new java.io.File(((android.content.Context) aevdVar.a).getFilesDir(), "flight_records");
                    long epochSecond = j$.time.Instant.now().getEpochSecond();
                    aevd.a(file, epochSecond);
                    alcf alcfVar2 = aenzVar3.d;
                    if (alcfVar2 == null) {
                        alcfVar2 = alcf.a;
                    }
                    if (alcfVar2.b >= epochSecond - 172800) {
                        if (file.exists() || file.mkdirs()) {
                            java.util.Locale locale = java.util.Locale.US;
                            java.lang.Long lValueOf = java.lang.Long.valueOf(aenzVar3.c);
                            alcf alcfVar3 = aenzVar3.d;
                            if (alcfVar3 == null) {
                                alcfVar3 = alcf.a;
                            }
                            java.io.File file2 = new java.io.File(file, java.lang.String.format(locale, "%d_%s", lValueOf, java.lang.Long.valueOf(alcfVar3.b)));
                            try {
                                ?? r14 = aevdVar.b;
                                if (!r14.contains(file2) && file2.exists()) {
                                    aimw aimwVarL = defpackage.aenr.a.d().l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 67, "FlightRecordWriterImpl.java");
                                    defpackage.aepb aepbVar = new defpackage.aepb(aenzVar3.c);
                                    alcf alcfVar4 = aenzVar3.d;
                                    if (alcfVar4 == null) {
                                        alcfVar4 = alcf.a;
                                    }
                                    aimwVarL.I("File with pid %s and start time %s already exists, overwriting the previous record", aepbVar, new defpackage.aepb(alcfVar4.b));
                                }
                                if (!file2.exists()) {
                                    file2.createNewFile();
                                    r14.add(file2);
                                }
                                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                                try {
                                    aenzVar3.h(fileOutputStream);
                                    fileOutputStream.close();
                                    return;
                                } catch (java.lang.Throwable th) {
                                    try {
                                        fileOutputStream.close();
                                        throw th;
                                    } catch (java.lang.Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } catch (java.io.IOException e) {
                                a.by(defpackage.aenr.a.d(), "Failed to write FlightRecord to file", "com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 'V', "FlightRecordWriterImpl.java", e);
                            }
                        } else {
                            defpackage.aenr.a.d().l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 58, "FlightRecordWriterImpl.java").v("Failed to create flight records directory");
                        }
                    }
                } else {
                    defpackage.aenr.a.d().l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordWriterImpl", "write", 45, "FlightRecordWriterImpl.java").v("Invalid FlightRecord");
                }
            }
            defpackage.aenr.a.d().l("com/google/android/libraries/performance/primes/flightrecorder/FlightRecorderImpl", "submitMutation", 86, "FlightRecorderImpl.java").v("Failed to write flight record to disk");
        }
    }
}
