package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahpu implements android.app.Application.ActivityLifecycleCallbacks {
    final /* synthetic */ defpackage.ahpz a;
    final /* synthetic */ android.app.Application.ActivityLifecycleCallbacks b;

    public ahpu(defpackage.ahpz ahpzVar, android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.a = ahpzVar;
        this.b = activityLifecycleCallbacks;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) throws java.io.IOException {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        defpackage.ahpz ahpzVar = this.a;
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            activityLifecycleCallbacks.onActivityCreated(activity, bundle);
            return;
        }
        defpackage.ahok ahokVarI = ahpzVar.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityCreated"), 1443);
        try {
            activityLifecycleCallbacks.onActivityCreated(activity, bundle);
            ahokVarI.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ahokVarI.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) throws java.io.IOException {
        defpackage.aooh.f(activity, "activity");
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            activityLifecycleCallbacks.onActivityDestroyed(activity);
            return;
        }
        defpackage.ahok ahokVarI = this.a.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityDestroyed"), 1444);
        try {
            activityLifecycleCallbacks.onActivityDestroyed(activity);
            defpackage.ajsz.ak(ahokVarI, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahokVarI, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) throws java.io.IOException {
        defpackage.aooh.f(activity, "activity");
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            activityLifecycleCallbacks.onActivityPaused(activity);
            return;
        }
        defpackage.ahok ahokVarI = this.a.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityPaused"), 1445);
        try {
            activityLifecycleCallbacks.onActivityPaused(activity);
            defpackage.ajsz.ak(ahokVarI, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahokVarI, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(android.app.Activity activity, android.os.Bundle bundle) throws java.io.IOException {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        defpackage.ahpz ahpzVar = this.a;
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            da$.ExternalSyntheticApiModelOutline0.m$2(activityLifecycleCallbacks, activity, bundle);
            return;
        }
        defpackage.ahok ahokVarI = ahpzVar.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityPostCreated"), 1446);
        try {
            da$.ExternalSyntheticApiModelOutline0.m$2(activityLifecycleCallbacks, activity, bundle);
            ahokVarI.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ahokVarI.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostDestroyed(android.app.Activity activity) throws java.io.IOException {
        defpackage.aooh.f(activity, "activity");
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            da$.ExternalSyntheticApiModelOutline0.m$8(activityLifecycleCallbacks, activity);
            return;
        }
        defpackage.ahok ahokVarI = this.a.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityPostDestroyed"), 1447);
        try {
            da$.ExternalSyntheticApiModelOutline0.m$8(activityLifecycleCallbacks, activity);
            defpackage.ajsz.ak(ahokVarI, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahokVarI, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostPaused(android.app.Activity activity) throws java.io.IOException {
        defpackage.aooh.f(activity, "activity");
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            da$.ExternalSyntheticApiModelOutline0.m$4(activityLifecycleCallbacks, activity);
            return;
        }
        defpackage.ahok ahokVarI = this.a.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityPostPaused"), 1448);
        try {
            da$.ExternalSyntheticApiModelOutline0.m$4(activityLifecycleCallbacks, activity);
            defpackage.ajsz.ak(ahokVarI, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahokVarI, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(android.app.Activity activity) throws java.io.IOException {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        defpackage.ahpz ahpzVar = this.a;
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            da$.ExternalSyntheticApiModelOutline0.m$9(activityLifecycleCallbacks, activity);
            return;
        }
        defpackage.ahok ahokVarI = ahpzVar.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityPostResumed"), 1449);
        try {
            da$.ExternalSyntheticApiModelOutline0.m$9(activityLifecycleCallbacks, activity);
            ahokVarI.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ahokVarI.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) throws java.io.IOException {
        defpackage.aooh.f(activity, "activity");
        defpackage.aooh.f(bundle, "outState");
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            da$.ExternalSyntheticApiModelOutline0.m$3(activityLifecycleCallbacks, activity, bundle);
            return;
        }
        defpackage.ahok ahokVarI = this.a.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityPostSaveInstanceState"), 1450);
        try {
            da$.ExternalSyntheticApiModelOutline0.m$3(activityLifecycleCallbacks, activity, bundle);
            defpackage.ajsz.ak(ahokVarI, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahokVarI, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(android.app.Activity activity) throws java.io.IOException {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        defpackage.ahpz ahpzVar = this.a;
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            da$.ExternalSyntheticApiModelOutline0.m$5(activityLifecycleCallbacks, activity);
            return;
        }
        defpackage.ahok ahokVarI = ahpzVar.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityPostStarted"), 1451);
        try {
            da$.ExternalSyntheticApiModelOutline0.m$5(activityLifecycleCallbacks, activity);
            ahokVarI.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ahokVarI.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(android.app.Activity activity) throws java.io.IOException {
        defpackage.aooh.f(activity, "activity");
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            da$.ExternalSyntheticApiModelOutline0.m$3(activityLifecycleCallbacks, activity);
            return;
        }
        defpackage.ahok ahokVarI = this.a.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityPostStopped"), 1452);
        try {
            da$.ExternalSyntheticApiModelOutline0.m$3(activityLifecycleCallbacks, activity);
            defpackage.ajsz.ak(ahokVarI, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahokVarI, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(android.app.Activity activity, android.os.Bundle bundle) throws java.io.IOException {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        defpackage.ahpz ahpzVar = this.a;
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            da$.ExternalSyntheticApiModelOutline0.m(activityLifecycleCallbacks, activity, bundle);
            return;
        }
        defpackage.ahok ahokVarI = ahpzVar.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityPreCreated"), 1453);
        try {
            da$.ExternalSyntheticApiModelOutline0.m(activityLifecycleCallbacks, activity, bundle);
            ahokVarI.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ahokVarI.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(android.app.Activity activity) throws java.io.IOException {
        defpackage.aooh.f(activity, "activity");
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            da$.ExternalSyntheticApiModelOutline0.m(activityLifecycleCallbacks, activity);
            return;
        }
        defpackage.ahok ahokVarI = this.a.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityPreDestroyed"), 1454);
        try {
            da$.ExternalSyntheticApiModelOutline0.m(activityLifecycleCallbacks, activity);
            defpackage.ajsz.ak(ahokVarI, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahokVarI, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(android.app.Activity activity) throws java.io.IOException {
        defpackage.aooh.f(activity, "activity");
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            da$.ExternalSyntheticApiModelOutline0.m$7(activityLifecycleCallbacks, activity);
            return;
        }
        defpackage.ahok ahokVarI = this.a.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityPrePaused"), 1455);
        try {
            da$.ExternalSyntheticApiModelOutline0.m$7(activityLifecycleCallbacks, activity);
            defpackage.ajsz.ak(ahokVarI, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahokVarI, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(android.app.Activity activity) throws java.io.IOException {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        defpackage.ahpz ahpzVar = this.a;
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            da$.ExternalSyntheticApiModelOutline0.m$6(activityLifecycleCallbacks, activity);
            return;
        }
        defpackage.ahok ahokVarI = ahpzVar.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityPreResumed"), 1456);
        try {
            da$.ExternalSyntheticApiModelOutline0.m$6(activityLifecycleCallbacks, activity);
            ahokVarI.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ahokVarI.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreSaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) throws java.io.IOException {
        defpackage.aooh.f(activity, "activity");
        defpackage.aooh.f(bundle, "outState");
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            da$.ExternalSyntheticApiModelOutline0.m$1(activityLifecycleCallbacks, activity, bundle);
            return;
        }
        defpackage.ahok ahokVarI = this.a.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityPreSaveInstanceState"), 1457);
        try {
            da$.ExternalSyntheticApiModelOutline0.m$1(activityLifecycleCallbacks, activity, bundle);
            defpackage.ajsz.ak(ahokVarI, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahokVarI, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(android.app.Activity activity) throws java.io.IOException {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        defpackage.ahpz ahpzVar = this.a;
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            da$.ExternalSyntheticApiModelOutline0.m$2(activityLifecycleCallbacks, activity);
            return;
        }
        defpackage.ahok ahokVarI = ahpzVar.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityPreStarted"), 1458);
        try {
            da$.ExternalSyntheticApiModelOutline0.m$2(activityLifecycleCallbacks, activity);
            ahokVarI.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ahokVarI.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStopped(android.app.Activity activity) throws java.io.IOException {
        defpackage.aooh.f(activity, "activity");
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            da$.ExternalSyntheticApiModelOutline0.m$1(activityLifecycleCallbacks, activity);
            return;
        }
        defpackage.ahok ahokVarI = this.a.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityPreStopped"), 1459);
        try {
            da$.ExternalSyntheticApiModelOutline0.m$1(activityLifecycleCallbacks, activity);
            defpackage.ajsz.ak(ahokVarI, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahokVarI, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) throws java.io.IOException {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        defpackage.ahpz ahpzVar = this.a;
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            activityLifecycleCallbacks.onActivityResumed(activity);
            return;
        }
        defpackage.ahok ahokVarI = ahpzVar.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityResumed"), 1460);
        try {
            activityLifecycleCallbacks.onActivityResumed(activity);
            ahokVarI.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ahokVarI.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) throws java.io.IOException {
        defpackage.aooh.f(activity, "activity");
        defpackage.aooh.f(bundle, "outState");
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
            return;
        }
        defpackage.ahok ahokVarI = this.a.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivitySaveInstanceState"), 1461);
        try {
            activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
            defpackage.ajsz.ak(ahokVarI, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahokVarI, th);
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) throws java.io.IOException {
        if (activity == null) {
            defpackage.aooh.i("activity");
        }
        defpackage.ahpz ahpzVar = this.a;
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            activityLifecycleCallbacks.onActivityStarted(activity);
            return;
        }
        defpackage.ahok ahokVarI = ahpzVar.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityStarted"), 1462);
        try {
            activityLifecycleCallbacks.onActivityStarted(activity);
            ahokVarI.close();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ahokVarI.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) throws java.io.IOException {
        defpackage.aooh.f(activity, "activity");
        android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.b;
        if (!defpackage.agab.aw()) {
            activityLifecycleCallbacks.onActivityStopped(activity);
            return;
        }
        defpackage.ahok ahokVarI = this.a.i(java.lang.String.valueOf(activity.getClass().getName()).concat("#onActivityStopped"), 1463);
        try {
            activityLifecycleCallbacks.onActivityStopped(activity);
            defpackage.ajsz.ak(ahokVarI, null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ajsz.ak(ahokVarI, th);
                throw th2;
            }
        }
    }
}
