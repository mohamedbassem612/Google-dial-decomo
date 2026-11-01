package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaeo implements defpackage.aadc, defpackage.aadd {
    public final java.util.Queue a;
    public final defpackage.aacv b;
    public final defpackage.aadx c;
    public final java.util.Set d;
    public final java.util.Map e;
    public java.util.Set f;
    public final int g;
    public boolean h;
    public final java.util.List i;
    public com.google.android.gms.common.ConnectionResult j;
    public int k;
    public final /* synthetic */ defpackage.aaet l;
    public final defpackage.acxg m;
    private final aafn n;
    private volatile com.google.android.gms.common.internal.ConnectionThrottlingConfig o;

    /* JADX WARN: Code duplicated, block: B:10:0x005e  */
    /* JADX WARN: Multi-variable type inference failed */
    public aaeo(defpackage.aaet aaetVar, defpackage.aada aadaVar) {
        java.lang.String str;
        j$.util.Objects.requireNonNull(aaetVar);
        this.l = aaetVar;
        this.a = new java.util.LinkedList();
        this.d = new java.util.HashSet();
        this.e = new java.util.HashMap();
        this.i = new java.util.ArrayList();
        this.j = null;
        this.k = 0;
        defpackage.aacv aacvVarA = ((defpackage.aais) aadaVar.k.b).a(aadaVar.b, aaetVar.r.getLooper(), aadaVar.w().a(), aadaVar.e, this, this);
        defpackage.aaix aaixVar = aadaVar.d;
        if (aaixVar == null) {
            str = aadaVar.c;
            if (str != null && (aacvVarA instanceof defpackage.aagf)) {
                ((defpackage.aagf) aacvVarA).j = str;
            }
            if (str != null && (aacvVarA instanceof defpackage.aafh)) {
            }
        } else if (aacvVarA instanceof defpackage.aagf) {
            ((defpackage.aagf) aacvVarA).k = aaixVar;
        } else if (aacvVarA instanceof defpackage.aafh) {
        } else {
            str = aadaVar.c;
            if (str != null) {
                ((defpackage.aagf) aacvVarA).j = str;
            }
            if (str != null) {
            }
        }
        this.b = aacvVarA;
        this.c = aadaVar.f;
        this.m = new defpackage.acxg((char[]) null);
        this.g = aadaVar.h;
        this.n = aacvVarA.i() ? new aafn(aaetVar.g, aaetVar.r, aadaVar.w().a()) : null;
    }

    private final com.google.android.gms.common.Feature r(com.google.android.gms.common.Feature[] featureArr) {
        if (featureArr == null || featureArr.length == 0) {
            return null;
        }
        com.google.android.gms.common.Feature[] featureArrR = this.b.r();
        if (featureArrR == null) {
            featureArrR = new com.google.android.gms.common.Feature[0];
        }
        defpackage.aca acaVar = new defpackage.aca(featureArrR.length);
        for (com.google.android.gms.common.Feature feature : featureArrR) {
            acaVar.put(feature.a, java.lang.Long.valueOf(feature.a()));
        }
        int length = featureArr.length;
        for (int i = 0; i < length; i = 1) {
            com.google.android.gms.common.Feature feature2 = featureArr[0];
            java.lang.Long l = (java.lang.Long) acaVar.get(feature2.a);
            if (l == null || l.longValue() < feature2.a()) {
                return feature2;
            }
        }
        return null;
    }

    private final com.google.android.gms.common.api.Status s(com.google.android.gms.common.ConnectionResult connectionResult) {
        return defpackage.aaet.a(this.c, connectionResult);
    }

    private final void t(com.google.android.gms.common.ConnectionResult connectionResult) {
        java.util.Set set = this.d;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            ((aady) it.next()).a(this.c, connectionResult, j$.util.Objects.equals(connectionResult, com.google.android.gms.common.ConnectionResult.a) ? this.b.j() : null);
        }
        set.clear();
    }

    private final void u(com.google.android.gms.common.api.Status status, java.lang.Exception exc, boolean z) {
        defpackage.aais.al(this.l.r);
        if ((status == null) == (exc == null)) {
            throw new java.lang.IllegalArgumentException("Status XOR exception should be null");
        }
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            defpackage.aadw aadwVar = (defpackage.aadw) it.next();
            if (!z || aadwVar.c == 2) {
                if (status != null) {
                    aadwVar.f(status);
                } else {
                    aadwVar.g(exc);
                }
                it.remove();
            }
        }
    }

    private final void v(defpackage.aadw aadwVar) {
        aadwVar.i(this.m, q());
        try {
            aadwVar.h(this);
        } catch (android.os.DeadObjectException unused) {
            b(1);
            this.b.n("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final boolean w(defpackage.aadw aadwVar) {
        com.google.android.gms.common.internal.ConnectionThrottlingConfig connectionThrottlingConfig;
        int iA;
        int maxInflight;
        if (!(aadwVar instanceof defpackage.aadp)) {
            v(aadwVar);
            return true;
        }
        defpackage.aadp aadpVar = (defpackage.aadp) aadwVar;
        com.google.android.gms.common.Feature featureR = r(aadpVar.d(this));
        if (featureR != null) {
            java.lang.Object obj = this.b;
            java.lang.String name = obj.getClass().getName();
            long jA = featureR.a();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(name);
            sb.append(" could not execute call because it requires feature (");
            java.lang.String str = featureR.a;
            sb.append(str);
            sb.append(", ");
            sb.append(jA);
            sb.append(").");
            android.util.Log.w("GoogleApiManager", sb.toString());
            defpackage.aaet aaetVar = this.l;
            if (!aaetVar.s || !aadpVar.c(this)) {
                aadpVar.g(new defpackage.aado(featureR));
                return true;
            }
            int iA2 = aadpVar.a(this);
            aaep aaepVar = new aaep(this.c, featureR);
            java.util.List list = this.i;
            int iIndexOf = list.indexOf(aaepVar);
            if (iIndexOf >= 0) {
                aaep aaepVar2 = (aaep) list.get(iIndexOf);
                android.os.Handler handler = aaetVar.r;
                handler.removeMessages(15, aaepVar2);
                handler.sendMessageDelayed(android.os.Message.obtain(handler, 15, aaepVar2), 5000L);
            } else {
                list.add(aaepVar);
                android.os.Handler handler2 = aaetVar.r;
                handler2.sendMessageDelayed(android.os.Message.obtain(handler2, 15, aaepVar), 5000L);
                handler2.sendMessageDelayed(android.os.Message.obtain(handler2, 16, aaepVar), 120000L);
                if (obj instanceof defpackage.aagf) {
                    ((defpackage.aagf) obj).y();
                }
                int i = defpackage.aaby.c;
                com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(1, 2, null, null, java.lang.Integer.valueOf(iA2), null);
                if (x(connectionResult)) {
                    android.util.Log.w("GoogleApiManager", "A dialog should be displayed for missing feature: " + str + ", version: " + featureR.a());
                } else if (aaetVar.h(connectionResult, this.g)) {
                    android.util.Log.w("GoogleApiManager", "Notification displayed for missing feature: " + str + ", version: " + featureR.a());
                }
            }
            return false;
        }
        if (!aadpVar.d && !aadpVar.e && (connectionThrottlingConfig = this.o) != null && (aadpVar instanceof defpackage.aadp) && (iA = aadpVar.a(this)) != 0) {
            defpackage.aaet aaetVar2 = this.l;
            android.util.SparseArray sparseArray = connectionThrottlingConfig.a;
            uzx uzxVarJ = aaetVar2.j();
            com.google.android.gms.libs.throttling.ThrottlingLimits throttlingLimits = (com.google.android.gms.libs.throttling.ThrottlingLimits) sparseArray.get(iA, (com.google.android.gms.libs.throttling.ThrottlingLimits) sparseArray.get(0));
            if (throttlingLimits != null) {
                java.lang.Object obj2 = uzxVarJ.a;
                long j = iA;
                int maxInflight2 = throttlingLimits.getMaxInflight();
                if (maxInflight2 > 0) {
                    java.lang.Object obj3 = ((aplv) obj2).b;
                    synchronized (obj3) {
                        long[] jArr = (long[]) ((android.util.LongSparseArray) obj3).get(j);
                        if (jArr != null) {
                            long j2 = jArr[0];
                            long j3 = ((aplv) obj2).a + 1;
                            ((aplv) obj2).a = j3;
                            jArr[1] = j3;
                            if (j2 < maxInflight2) {
                                jArr[0] = j2 + 1;
                            }
                        } else {
                            if (((android.util.LongSparseArray) obj3).size() >= 2000) {
                                int size = ((android.util.LongSparseArray) obj3).size();
                                long j4 = Long.MAX_VALUE;
                                int i2 = 0;
                                for (int i3 = 0; i3 < size; i3++) {
                                    long j5 = ((long[]) ((android.util.LongSparseArray) obj3).valueAt(i3))[1];
                                    if (j5 < j4) {
                                        i2 = i3;
                                        j4 = j5;
                                    }
                                }
                                ((android.util.LongSparseArray) obj3).removeAt(i2);
                            }
                            long j6 = ((aplv) obj2).a + 1;
                            ((aplv) obj2).a = j6;
                            ((android.util.LongSparseArray) obj3).put(j, new long[]{1, j6});
                        }
                        maxInflight = Integer.MIN_VALUE;
                    }
                }
                maxInflight = throttlingLimits.getMaxInflight();
            } else {
                maxInflight = Integer.MIN_VALUE;
            }
            if (maxInflight == Integer.MIN_VALUE) {
                aadpVar.d = true;
                if (this.f == null) {
                    this.f = new java.util.HashSet();
                }
                this.f.add(aadpVar);
                defpackage.aaet aaetVar3 = this.l;
                android.os.Handler handler3 = aaetVar3.r;
                j$.util.Objects.requireNonNull(handler3);
                aadpVar.b(new fbk(handler3, 4), new aaer(this, aaetVar3.j(), aadpVar, iA));
            } else {
                android.util.Log.i("GoogleApiManager", defpackage.a.bf(maxInflight, iA, "Call throttled for method key: ", " with limit: "));
                android.os.Handler handler4 = this.l.r;
                handler4.sendMessage(handler4.obtainMessage(21, iA, maxInflight));
                aadpVar.e = true;
            }
        }
        v(aadwVar);
        return true;
    }

    private final boolean x(com.google.android.gms.common.ConnectionResult connectionResult) {
        synchronized (defpackage.aaet.c) {
            defpackage.aaet aaetVar = this.l;
            if (aaetVar.m == null || !aaetVar.n.contains(this.c)) {
                return false;
            }
            aael aaelVar = aaetVar.m;
            amwp amwpVar = new amwp(connectionResult, this.g);
            if (defpackage.anty.aq(((aaee) aaelVar).b, amwpVar)) {
                ((aaee) aaelVar).c.post(new aaed(aaelVar, amwpVar, 0));
            }
            return true;
        }
    }

    @Override // defpackage.aaei
    public final void a(android.os.Bundle bundle) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        android.os.Handler handler = this.l.r;
        if (looperMyLooper == handler.getLooper()) {
            h(bundle);
        } else {
            handler.post(new wdm(this, bundle, 14));
        }
    }

    @Override // defpackage.aaei
    public final void b(int i) {
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        android.os.Handler handler = this.l.r;
        if (looperMyLooper == handler.getLooper()) {
            k(i);
        } else {
            handler.post(new eyd(this, i, 11));
        }
    }

    public final void c() {
        defpackage.aais.al(this.l.r);
        this.j = null;
    }

    public final void d() {
        int i;
        defpackage.aaet aaetVar = this.l;
        defpackage.aais.al(aaetVar.r);
        defpackage.aacv aacvVar = this.b;
        if (aacvVar.o() || aacvVar.p()) {
            return;
        }
        try {
            defpackage.aaha aahaVar = aaetVar.i;
            android.content.Context context = aaetVar.g;
            if (context == null) {
                throw new java.lang.NullPointerException("null reference");
            }
            if (aacvVar == null) {
                throw new java.lang.NullPointerException("null reference");
            }
            int iL = 0;
            if (aacvVar.q()) {
                int iA = aacvVar.a();
                int iB = aahaVar.b(iA);
                if (iB == -1) {
                    java.lang.Object obj = aahaVar.a;
                    synchronized (obj) {
                        int i2 = 0;
                        while (true) {
                            try {
                                if (i2 >= ((android.util.SparseIntArray) obj).size()) {
                                    iL = -1;
                                    break;
                                }
                                int iKeyAt = ((android.util.SparseIntArray) obj).keyAt(i2);
                                if (iKeyAt > iA && ((android.util.SparseIntArray) obj).get(iKeyAt) == 0) {
                                    break;
                                } else {
                                    i2++;
                                }
                            } catch (java.lang.Throwable th) {
                                throw th;
                            }
                        }
                        if (iL == -1) {
                            iL = ((defpackage.aaby) aahaVar.b).l(context, iA);
                        }
                        ((android.util.SparseIntArray) obj).put(iA, iL);
                    }
                    i = iL;
                } else {
                    i = iB;
                }
            } else {
                i = iL;
            }
            if (i != 0) {
                com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(1, i, null, null, null, null);
                android.util.Log.w("GoogleApiManager", "The service for " + this.b.getClass().getName() + " is not available: " + connectionResult.toString());
                j(connectionResult, null);
                return;
            }
            defpackage.aaet aaetVar2 = this.l;
            defpackage.aacv aacvVar2 = this.b;
            defpackage.aaeq aaeqVar = new defpackage.aaeq(aaetVar2, aacvVar2, this.c);
            if (aacvVar2.i()) {
                aafn aafnVar = this.n;
                if (aafnVar == null) {
                    throw new java.lang.NullPointerException("null reference");
                }
                aatw aatwVar = aafnVar.e;
                if (aatwVar != null) {
                    aatwVar.C();
                }
                defpackage.aagi aagiVar = aafnVar.d;
                aagiVar.h = java.lang.Integer.valueOf(java.lang.System.identityHashCode(aafnVar));
                defpackage.aais aaisVar = aafnVar.g;
                android.content.Context context2 = aafnVar.a;
                android.os.Handler handler = aafnVar.b;
                aafnVar.e = aaisVar.a(context2, handler.getLooper(), aagiVar, aagiVar.g, aafnVar, aafnVar);
                aafnVar.f = aaeqVar;
                java.util.Set set = aafnVar.c;
                if (set == null || set.isEmpty()) {
                    handler.post(new yne(aafnVar, 9));
                } else {
                    aatw aatwVar2 = aafnVar.e;
                    aatwVar2.m(new aagc(aatwVar2));
                }
            }
            try {
                aacvVar2.m(aaeqVar);
            } catch (java.lang.SecurityException e) {
                j(new com.google.android.gms.common.ConnectionResult(1, 10, null, null, null, null), e);
            }
        } catch (java.lang.IllegalStateException e2) {
            j(new com.google.android.gms.common.ConnectionResult(1, 10, null, null, null, null), e2);
        }
    }

    public final void e(defpackage.aadw aadwVar) {
        defpackage.aais.al(this.l.r);
        if (this.b.o()) {
            if (w(aadwVar)) {
                n();
                return;
            } else {
                this.a.add(aadwVar);
                return;
            }
        }
        java.util.Queue queue = this.a;
        if (queue.size() >= 1000) {
            aadwVar.f(new com.google.android.gms.common.api.Status(8, "Pending API call limit exceeded", null, null));
            return;
        }
        queue.add(aadwVar);
        com.google.android.gms.common.ConnectionResult connectionResult = this.j;
        if (connectionResult == null || !connectionResult.c()) {
            d();
        } else {
            j(this.j, null);
        }
    }

    public final void f(com.google.android.gms.common.api.Status status) {
        defpackage.aais.al(this.l.r);
        u(status, null, false);
    }

    public final void g() {
        java.util.Queue queue = this.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(queue);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.aadw aadwVar = (defpackage.aadw) arrayList.get(i);
            if (!this.b.o()) {
                return;
            }
            if (w(aadwVar)) {
                queue.remove(aadwVar);
            }
        }
    }

    public final void h(android.os.Bundle bundle) {
        c();
        t(com.google.android.gms.common.ConnectionResult.a);
        p();
        if (bundle == null || !bundle.containsKey("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG")) {
            this.o = null;
        } else {
            byte[] byteArray = bundle.getByteArray("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG");
            this.o = byteArray != null ? (com.google.android.gms.common.internal.ConnectionThrottlingConfig) defpackage.aehj.bS(byteArray, com.google.android.gms.common.internal.ConnectionThrottlingConfig.CREATOR) : null;
        }
        java.util.Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.aogc) it.next()).b;
            if (r(((defpackage.aafj) obj).b) != null) {
                it.remove();
            } else {
                try {
                    ((defpackage.aafj) obj).b(this.b, new defpackage.zzx((char[]) null));
                } catch (android.os.DeadObjectException unused) {
                    b(3);
                    this.b.n("DeadObjectException thrown while calling register listener method.");
                } catch (android.os.RemoteException e) {
                    e = e;
                    android.util.Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (java.lang.RuntimeException e2) {
                    e = e2;
                    android.util.Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        g();
        n();
    }

    @Override // defpackage.aafi
    public final void i(com.google.android.gms.common.ConnectionResult connectionResult) {
        j(connectionResult, null);
    }

    public final void j(com.google.android.gms.common.ConnectionResult connectionResult, java.lang.Exception exc) {
        aatw aatwVar;
        defpackage.aaet aaetVar = this.l;
        android.os.Handler handler = aaetVar.r;
        defpackage.aais.al(handler);
        aafn aafnVar = this.n;
        if (aafnVar != null && (aatwVar = aafnVar.e) != null) {
            aatwVar.C();
        }
        c();
        aaetVar.i.a();
        t(connectionResult);
        if ((this.b instanceof defpackage.aaie) && connectionResult.c != 24) {
            aaetVar.f = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        int i = connectionResult.c;
        if (i == 4) {
            f(defpackage.aaet.b);
            return;
        }
        if (i == 25) {
            f(s(connectionResult));
            return;
        }
        java.util.Queue queue = this.a;
        if (queue.isEmpty()) {
            this.j = connectionResult;
            return;
        }
        if (exc != null) {
            defpackage.aais.al(handler);
            u(null, exc, false);
            return;
        }
        if (!aaetVar.s) {
            f(s(connectionResult));
            return;
        }
        u(s(connectionResult), null, true);
        if (queue.isEmpty() || x(connectionResult) || aaetVar.h(connectionResult, this.g)) {
            return;
        }
        if (i == 18) {
            this.h = true;
        }
        if (this.h) {
            handler.sendMessageDelayed(android.os.Message.obtain(handler, 9, this.c), 5000L);
        } else {
            f(s(connectionResult));
        }
    }

    public final void k(int i) {
        c();
        this.h = true;
        defpackage.aacv aacvVar = this.b;
        java.lang.String strK = aacvVar.k();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strK != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strK);
        }
        this.m.u(true, new com.google.android.gms.common.api.Status(20, sb.toString(), null, null));
        com.google.android.gms.common.api.Status status = new com.google.android.gms.common.api.Status(20, "Connection suspended: ".concat(java.lang.String.valueOf(aacvVar.k())), null, null);
        java.util.Set set = this.f;
        if (set != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(set);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((defpackage.aadp) arrayList.get(i2)).g(new defpackage.aacw(status));
            }
        }
        defpackage.aaet aaetVar = this.l;
        defpackage.aadx aadxVar = this.c;
        android.os.Handler handler = aaetVar.r;
        handler.sendMessageDelayed(android.os.Message.obtain(handler, 9, aadxVar), 5000L);
        handler.sendMessageDelayed(android.os.Message.obtain(handler, 11, aadxVar), 120000L);
        aaetVar.i.a();
        java.util.Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.aogc) it.next()).a;
        }
    }

    public final void l(com.google.android.gms.common.ConnectionResult connectionResult) {
        defpackage.aais.al(this.l.r);
        defpackage.aacv aacvVar = this.b;
        aacvVar.n("onSignInFailed for " + aacvVar.getClass().getName() + " with " + java.lang.String.valueOf(connectionResult));
        j(connectionResult, null);
    }

    final void m(defpackage.aadp aadpVar) {
        defpackage.aais.al(this.l.r);
        java.util.Set set = this.f;
        if (set != null) {
            set.remove(aadpVar);
            if (this.f.isEmpty()) {
                this.f = null;
            }
        }
    }

    public final void n() {
        defpackage.aaet aaetVar = this.l;
        android.os.Handler handler = aaetVar.r;
        defpackage.aadx aadxVar = this.c;
        handler.removeMessages(12, aadxVar);
        handler.sendMessageDelayed(handler.obtainMessage(12, aadxVar), aaetVar.e);
    }

    public final void o() {
        defpackage.aais.al(this.l.r);
        com.google.android.gms.common.api.Status status = defpackage.aaet.a;
        f(status);
        this.m.u(false, status);
        for (defpackage.aafc aafcVar : (defpackage.aafc[]) this.e.keySet().toArray(new defpackage.aafc[0])) {
            e(new aadv(aafcVar, new defpackage.zzx((char[]) null)));
        }
        t(new com.google.android.gms.common.ConnectionResult(1, 4, null, null, null, null));
        defpackage.aacv aacvVar = this.b;
        if (aacvVar.o()) {
            aacvVar.t(new aprf(this));
        }
    }

    public final void p() {
        if (this.h) {
            defpackage.aaet aaetVar = this.l;
            defpackage.aadx aadxVar = this.c;
            android.os.Handler handler = aaetVar.r;
            handler.removeMessages(11, aadxVar);
            handler.removeMessages(9, aadxVar);
            this.h = false;
        }
    }

    public final boolean q() {
        return this.b.i();
    }
}
