package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ud implements emj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public ud(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final void a(emx emxVar) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.ue) this.a).a.f(emp.ON_CREATE);
            return;
        }
        if (i != 1) {
            java.lang.Object obj = this.a;
            ahok ahokVarF = ((defpackage.hmf) obj).d.f(8, "DialerCarSession.onCreate");
            try {
                ((defpackage.hmf) obj).c.o(rmx.qk);
                java.lang.Object objD = ((defpackage.ue) obj).a().d();
                aooh.d(objD, "null cannot be cast to non-null type androidx.car.app.ScreenManager");
                ((defpackage.hmf) obj).f = (defpackage.uc) objD;
                ajsz.ak(ahokVarF, (java.lang.Throwable) null);
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(ahokVarF, th);
                    throw th2;
                }
            }
        }
    }

    public final void b(emx emxVar) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.ue) this.a).a.f(emp.ON_DESTROY);
            emxVar.P().d(this);
            return;
        }
        java.lang.Object obj = this.a;
        if (i == 1) {
            java.util.Deque deque = ((defpackage.uc) obj).a;
            java.util.Iterator it = new java.util.ArrayDeque(deque).iterator();
            while (it.hasNext()) {
                defpackage.uc.f((defpackage.ub) it.next(), true);
            }
            deque.clear();
            emxVar.P().d(this);
            return;
        }
        ahok ahokVarF = ((defpackage.hmf) obj).d.f(9, "DialerCarSession.onDestroy");
        try {
            ((defpackage.hmf) obj).c.o(rmx.ql);
            ((defpackage.hmf) obj).e(mce.ga);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }

    public final void c(emx emxVar) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.ue) this.a).a.f(emp.ON_PAUSE);
            return;
        }
        java.lang.Object obj = this.a;
        if (i == 1) {
            defpackage.ub ubVar = (defpackage.ub) ((defpackage.uc) obj).a.peek();
            if (ubVar == null) {
                android.util.Log.e("CarApp", "Screen stack was empty during lifecycle onPause");
                return;
            } else {
                ubVar.b(emp.ON_PAUSE);
                return;
            }
        }
        ahok ahokVarF = ((defpackage.hmf) obj).d.f(10, "DialerCarSession.onPause");
        try {
            ((defpackage.hmf) obj).c.o(rmx.qp);
            ((defpackage.hmf) obj).e(mce.fZ);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }

    public final void e(emx emxVar) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.ue) this.a).a.f(emp.ON_START);
            return;
        }
        java.lang.Object obj = this.a;
        if (i == 1) {
            defpackage.ub ubVar = (defpackage.ub) ((defpackage.uc) obj).a.peek();
            if (ubVar == null) {
                android.util.Log.e("CarApp", "Screen stack was empty during lifecycle onStart");
                return;
            } else {
                ubVar.b(emp.ON_START);
                return;
            }
        }
        ahok ahokVarF = ((defpackage.hmf) obj).d.f(12, "DialerCarSession.onStart");
        try {
            defpackage.hnm hnmVar = ((defpackage.hmf) obj).e;
            if (hnmVar != null) {
                aimz aimzVar = defpackage.hnm.a;
                aimzVar.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "registerInCallController", 110, "CarInCallController.kt").v("Registering setup screen job.");
                aoss aossVar = hnmVar.c;
                aoub aoubVarJ = afsq.J(aossVar, new dmu(hnmVar, (aoln) null, 16, (byte[]) null));
                apni apniVar = hnmVar.t;
                apniVar.i(aoubVarJ);
                hnmVar.j = aoubVarJ;
                aimzVar.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "registerInCallController", 147, "CarInCallController.kt").v("Registering tear down screen job.");
                aoub aoubVarJ2 = afsq.J(aossVar, new dmu(hnmVar, (aoln) null, 17, (char[]) null));
                apniVar.i(aoubVarJ2);
                hnmVar.k = aoubVarJ2;
                aimzVar.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "registerInCallController", 168, "CarInCallController.kt").v("Registering display call error job.");
                hnmVar.l = afsq.J(aossVar, new dmu(hnmVar, (aoln) null, 18, (short[]) null));
                aimzVar.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "registerInCallController", 180, "CarInCallController.kt").v("Unregistering tear down call error screen job.");
                aoub aoubVar = hnmVar.m;
                if (aoubVar != null) {
                    aoubVar.s(new java.util.concurrent.CancellationException("Car session disconnecting, cancelling display disconnect cause job."));
                }
                hnmVar.i = afsq.J(aossVar, new dmu(hnmVar, (aoln) null, 19, (int[]) null));
            }
            ((defpackage.hmf) obj).c.o(rmx.qm);
            ((defpackage.hmf) obj).e(mce.fX);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }

    public final void f(emx emxVar) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.ue) this.a).a.f(emp.ON_STOP);
            return;
        }
        java.lang.Object obj = this.a;
        if (i == 1) {
            defpackage.ub ubVar = (defpackage.ub) ((defpackage.uc) obj).a.peek();
            if (ubVar == null) {
                android.util.Log.e("CarApp", "Screen stack was empty during lifecycle onStop");
                return;
            } else {
                ubVar.b(emp.ON_STOP);
                return;
            }
        }
        ahok ahokVarF = ((defpackage.hmf) obj).d.f(13, "DialerCarSession.onStop");
        try {
            defpackage.hnm hnmVar = ((defpackage.hmf) obj).e;
            if (hnmVar != null) {
                aimz aimzVar = defpackage.hnm.a;
                aimzVar.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "unregisterInCallController", 203, "CarInCallController.kt").v("Unregistering setup screen job.");
                aoub aoubVar = hnmVar.j;
                if (aoubVar != null) {
                    aoubVar.s(new java.util.concurrent.CancellationException("Car session disconnecting, cancelling In Call Screen setup job."));
                }
                aimzVar.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "unregisterInCallController", 208, "CarInCallController.kt").v("Unregistering tear down screen job.");
                aoub aoubVar2 = hnmVar.k;
                if (aoubVar2 != null) {
                    aoubVar2.s(new java.util.concurrent.CancellationException("Car session disconnecting, cancelling In Call Screen teardown job."));
                }
                aimzVar.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "unregisterInCallController", 213, "CarInCallController.kt").v("Unregistering display call error screen job.");
                aoub aoubVar3 = hnmVar.l;
                if (aoubVar3 != null) {
                    aoubVar3.s(new java.util.concurrent.CancellationException("Car session disconnecting, cancelling display disconnect cause job."));
                }
                aimzVar.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "unregisterInCallController", 217, "CarInCallController.kt").v("Unregistering display account selector screen job.");
                aoub aoubVar4 = hnmVar.i;
                if (aoubVar4 != null) {
                    aoubVar4.s(new java.util.concurrent.CancellationException("Car session disconnecting, cancelling display account selector job."));
                }
                aimzVar.b().l("com/android/dialer/androidauto/impl/incall/CarInCallController", "unregisterInCallController", 221, "CarInCallController.kt").v("Registering tear down call error screen job.");
                aoub aoubVarJ = afsq.J(hnmVar.c, new dmu(hnmVar, (aoln) null, 20, (boolean[]) null));
                hnmVar.t.i(aoubVarJ);
                hnmVar.m = aoubVarJ;
            }
            ((defpackage.hmf) obj).c.o(rmx.qn);
            ((defpackage.hmf) obj).e(mce.gb);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }

    public final void fn(emx emxVar) {
        int i = this.$cid;
        if (i == 0) {
            ((defpackage.ue) this.a).a.f(emp.ON_RESUME);
            return;
        }
        java.lang.Object obj = this.a;
        if (i == 1) {
            defpackage.ub ubVar = (defpackage.ub) ((defpackage.uc) obj).a.peek();
            if (ubVar == null) {
                android.util.Log.e("CarApp", "Screen stack was empty during lifecycle onResume");
                return;
            } else {
                ubVar.b(emp.ON_RESUME);
                return;
            }
        }
        ahok ahokVarF = ((defpackage.hmf) obj).d.f(11, "DialerCarSession.onResume");
        try {
            ((defpackage.hmf) obj).c.o(rmx.qo);
            ((defpackage.hmf) obj).e(mce.fY);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }
}
