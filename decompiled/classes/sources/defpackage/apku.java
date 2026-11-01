package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apku extends defpackage.apjz {
    final /* synthetic */ defpackage.apkv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apku(defpackage.apkv apkvVar, java.lang.String str) {
        super(str, true);
        this.e = apkvVar;
    }

    @Override // defpackage.apjz
    public final long a() {
        defpackage.apkt apktVar;
        long j;
        java.util.Iterator it;
        defpackage.apkv apkvVar = this.e;
        long jNanoTime = java.lang.System.nanoTime();
        long j2 = jNanoTime - apkvVar.a;
        java.util.Iterator it2 = ((j$.util.concurrent.ConcurrentLinkedQueue) apkvVar.d).iterator();
        defpackage.aooh.e(it2, "iterator(...)");
        long j3 = 1 + j2;
        long j4 = Long.MAX_VALUE;
        defpackage.apkt apktVar2 = null;
        int i = 0;
        defpackage.apkt apktVar3 = null;
        int i2 = 0;
        while (it2.hasNext()) {
            defpackage.apkt apktVar4 = (defpackage.apkt) it2.next();
            if (apktVar4 == null) {
                defpackage.aooh.g();
            }
            synchronized (apktVar4) {
                java.util.TimeZone timeZone = defpackage.apjx.a;
                java.util.List list = apktVar4.m;
                j = jNanoTime;
                int i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        java.lang.ref.Reference reference = (java.lang.ref.Reference) list.get(i3);
                        if (reference.get() != null) {
                            i3++;
                        } else {
                            if (reference == null) {
                                defpackage.aooh.h("null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                            }
                            it = it2;
                            java.util.Objects.toString(apktVar4.b.a.i);
                            defpackage.apnn apnnVar = defpackage.apnn.b;
                            java.lang.Object obj = ((defpackage.apkq) reference).a;
                            if (obj == null) {
                                defpackage.aooh.h("null cannot be cast to non-null type android.util.CloseGuard");
                            }
                            baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m(obj));
                            list.remove(i3);
                            if (list.isEmpty()) {
                                apktVar4.n = j2;
                            } else {
                                it2 = it;
                            }
                        }
                    } else {
                        it = it2;
                        if (list.size() > 0) {
                            i2++;
                        }
                    }
                    long j5 = apktVar4.n;
                    if (j5 < j3) {
                        j3 = j5;
                        apktVar2 = apktVar4;
                    }
                    i++;
                    if (j5 < j4) {
                        j4 = j5;
                        apktVar3 = apktVar4;
                    }
                }
            }
            jNanoTime = j;
            it2 = it;
        }
        long j6 = jNanoTime;
        if (apktVar2 != null) {
            apktVar = apktVar2;
        } else if (i > 5) {
            j3 = j4;
            apktVar = apktVar3;
        } else {
            j3 = -1;
            apktVar = null;
        }
        if (apktVar == null) {
            if (apktVar3 != null) {
                return (j4 + apkvVar.a) - j6;
            }
            if (i2 > 0) {
                return apkvVar.a;
            }
            return -1L;
        }
        synchronized (apktVar) {
            if (apktVar.m.isEmpty() && apktVar.n == j3) {
                apktVar.i();
                ((j$.util.concurrent.ConcurrentLinkedQueue) apkvVar.d).remove(apktVar);
                defpackage.apjx.h(apktVar.c);
                if (((j$.util.concurrent.ConcurrentLinkedQueue) apkvVar.d).isEmpty()) {
                    ((defpackage.apkb) apkvVar.c).a();
                }
            }
        }
        return 0L;
    }
}
