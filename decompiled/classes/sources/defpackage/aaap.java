package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaap {
    private static final com.google.android.gms.common.api.Status b = new com.google.android.gms.common.api.Status(8, "Batch event failed.", null, null);
    public final defpackage.apkl a = new defpackage.apkl();
    private volatile android.os.Handler c;

    public static boolean b(java.util.List list) {
        return ((aaam) list.get(0)).d;
    }

    public final android.os.Handler a(defpackage.aaag aaagVar) {
        android.os.Looper looper = aaagVar.c;
        android.os.Handler aanhVar = this.c;
        if (aanhVar == null || aanhVar.getLooper() != looper) {
            synchronized (this) {
                aanhVar = this.c;
                if (aanhVar == null || aanhVar.getLooper() != looper) {
                    aanhVar = new defpackage.aanh(looper);
                    this.c = aanhVar;
                }
            }
        }
        return aanhVar;
    }

    public final void c(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, android.os.Handler handler, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, defpackage.aaag aaagVar) {
        if (atomicBoolean.getAndSet(true)) {
            defpackage.apkl.h(aaagVar.b, str, 1031);
            return;
        }
        java.lang.Runnable runnable = (java.lang.Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        d(aaagVar, str);
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Queue] */
    public final void d(defpackage.aaag aaagVar, java.lang.String str) {
        while (true) {
            defpackage.apkl apklVar = this.a;
            android.content.Context context = aaagVar.b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            long jD = defpackage.andt.a.eZ().d(context);
            synchronized (apklVar.c) {
                ?? r9 = apklVar.b;
                if (r9.isEmpty()) {
                    long length = 0;
                    while (true) {
                        ?? r13 = apklVar.d;
                        if (!r13.isEmpty()) {
                            byte[] bArr = ((aaam) r13.element()).a.b;
                            if (bArr != null) {
                                length += (long) bArr.length;
                                if (!arrayList.isEmpty() && length > jD) {
                                    break;
                                } else {
                                    arrayList.add((aaam) r13.remove());
                                }
                            } else {
                                if (!arrayList.isEmpty()) {
                                    break;
                                }
                                arrayList.add((aaam) r13.remove());
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        apklVar.a = false;
                    }
                } else {
                    aaam aaamVarA = (aaam) r9.remove();
                    if (r9.isEmpty()) {
                        aaal aaalVar = new aaal(aaamVarA);
                        aaalVar.b(true);
                        aaamVarA = aaalVar.a();
                    }
                    arrayList.add(aaamVarA);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            if (b(arrayList)) {
                defpackage.apkl.h(context, defpackage.aehj.cc(((aaam) arrayList.get(0)).a.a), 1034);
            } else {
                defpackage.apkl.h(context, str, 1026);
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    defpackage.apkl.h(context, defpackage.aehj.cc(((aaam) it.next()).a.a), 1027);
                }
            }
            aaan aaanVar = new aaan(this, arrayList, str, aaagVar);
            defpackage.aify aifyVar = (defpackage.aify) j$.util.Collection.-EL.stream(arrayList).map(new yoz(16)).collect(defpackage.aido.a);
            com.google.android.gms.clearcut.internal.BatchedLogErrorParcelable batchedLogErrorParcelableA = defpackage.aaaj.b().a();
            com.google.android.gms.clearcut.BatchedLogEventParcelable batchedLogEventParcelable = new com.google.android.gms.clearcut.BatchedLogEventParcelable(aifyVar, batchedLogErrorParcelableA);
            try {
                defpackage.aaai aaaiVar = (defpackage.aaai) aaagVar.v();
                android.os.Parcel parcelEP = aaaiVar.eP();
                defpackage.yld.f(parcelEP, aaanVar);
                defpackage.yld.d(parcelEP, batchedLogEventParcelable);
                aaaiVar.eS(9, parcelEP);
                aaanVar.f.e(aaanVar.a, aaanVar.e, aaanVar.b, aaanVar.c, aaanVar.d);
                return;
            } catch (java.lang.Throwable th) {
                if (b(arrayList)) {
                    java.lang.String strCc = defpackage.aehj.cc(((aaam) arrayList.get(0)).a.a);
                    android.content.Context context2 = aaagVar.b;
                    defpackage.apkl.h(context2, strCc, 1036);
                    if (th instanceof android.os.TransactionTooLargeException) {
                        android.util.Log.e("BatchingLogger", "Failed retry call to logBatchedEvents with TransactionTooLargeException", th);
                        defpackage.apkl.h(context2, strCc, 1037);
                    } else if (th instanceof android.os.DeadObjectException) {
                        android.util.Log.e("BatchingLogger", "Failed retry call to logBatchedEvents with DeadObjectException", th);
                        defpackage.apkl.h(context2, strCc, 1042);
                    } else {
                        android.util.Log.e("BatchingLogger", "Failed retry call to logBatchedEvents", th);
                    }
                } else {
                    android.content.Context context3 = aaagVar.b;
                    defpackage.apkl.h(context3, str, 1032);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed call to logBatchedEvents");
                    if (arrayList.size() == 1) {
                        sb.append(", single event");
                        defpackage.apkl.h(context3, str, 1043);
                    }
                    if (th instanceof android.os.TransactionTooLargeException) {
                        sb.append(", TransactionTooLargeException");
                        defpackage.apkl.h(context3, str, 1033);
                    } else if (th instanceof android.os.DeadObjectException) {
                        sb.append(", DeadObjectException");
                        defpackage.apkl.h(context3, str, 1041);
                    }
                    android.util.Log.e("BatchingLogger", sb.toString(), th);
                }
                java.util.List list = batchedLogErrorParcelableA.a;
                if (list != null) {
                    java.util.Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        defpackage.aaaj.b().c((com.google.android.gms.clearcut.internal.LogErrorParcelable) it2.next());
                    }
                }
                if (arrayList.size() > 1) {
                    defpackage.apkl apklVar2 = this.a;
                    defpackage.aify aifyVar2 = (defpackage.aify) j$.util.Collection.-EL.stream(arrayList).map(new yoz(15)).collect(defpackage.aido.a);
                    synchronized (apklVar2.c) {
                        apklVar2.b.addAll(aifyVar2);
                        apklVar2.a = true;
                    }
                } else {
                    aaam aaamVar = (aaam) arrayList.get(0);
                    aa$.ExternalSyntheticApiModelOutline1.m(aaamVar.c, b);
                    if (!aaamVar.d || aaamVar.e) {
                        try {
                            defpackage.aaah aaaoVar = new aaao(this, str, aaagVar);
                            ((defpackage.aaai) aaagVar.v()).a(aaaoVar, defpackage.aaaj.b().a());
                            ((aaao) aaaoVar).f.e(((aaao) aaaoVar).a, ((aaao) aaaoVar).e, ((aaao) aaaoVar).b, ((aaao) aaaoVar).c, ((aaao) aaaoVar).d);
                            return;
                        } catch (java.lang.Throwable th2) {
                            android.util.Log.e("BatchingLogger", "Failed to deliver funnel logs in separate logError IPC.", th2);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    public final void e(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, android.os.Handler handler, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, defpackage.aaag aaagVar) {
        if (atomicBoolean.get()) {
            return;
        }
        abb abbVar = new abb(this, atomicBoolean, str, aaagVar, 8, (char[]) null);
        handler.postDelayed(abbVar, defpackage.andt.a.eZ().a(aaagVar.b));
        defpackage.ahvr.bZ(atomicReference.getAndSet(abbVar) == null, "Timeout should only be started once.");
        if (atomicBoolean.get()) {
            handler.removeCallbacks(abbVar);
            atomicReference.set(null);
        }
    }
}
