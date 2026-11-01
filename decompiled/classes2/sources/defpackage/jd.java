package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jd implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public jd(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0135  */
    /* JADX WARN: Code duplicated, block: B:75:0x017a  */
    /* JADX WARN: Type inference failed for: r0v35, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [aomy, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int iD;
        int iD2;
        int i = 0;
        switch (this.$cid) {
            case 0:
                defpackage.je jeVar = (defpackage.je) this.a;
                jeVar.b = null;
                jeVar.drawableStateChanged();
                return;
            case 1:
                android.support.v7.widget.ActionBarOverlayLayout actionBarOverlayLayout = (android.support.v7.widget.ActionBarOverlayLayout) this.a;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.i = actionBarOverlayLayout.c.animate().translationY(-actionBarOverlayLayout.c.getHeight()).setListener(actionBarOverlayLayout.j);
                return;
            case 2:
                defpackage.jh jhVar = (defpackage.jh) this.a;
                int i2 = jhVar.q;
                if (i2 == 1) {
                    jhVar.p.cancel();
                } else if (i2 != 2) {
                    return;
                }
                jhVar.q = 3;
                android.animation.ValueAnimator valueAnimator = jhVar.p;
                valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 3:
                android.view.ViewParent parent = ((ji) this.a).c.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            case 4:
                ji jiVar = (ji) this.a;
                jiVar.d();
                android.view.View view = jiVar.c;
                if (view.isEnabled() && !view.isLongClickable() && jiVar.b()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                    android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    jiVar.d = true;
                    return;
                }
                return;
            case 5:
                ((defpackage.jv) this.a).q();
                return;
            case 6:
                defpackage.jv jvVar = (defpackage.jv) this.a;
                defpackage.je jeVar2 = jvVar.e;
                if (jeVar2 == null || !jeVar2.isAttachedToWindow() || jvVar.e.getCount() <= jvVar.e.getChildCount()) {
                    return;
                }
                jvVar.e.getChildCount();
                jvVar.p.setInputMethodMode(2);
                jvVar.v();
                return;
            case 7:
                ((android.support.v7.widget.StaggeredGridLayoutManager) this.a).L();
                return;
            case 8:
                ((android.support.v7.widget.Toolbar) this.a).k();
                return;
            case 9:
                defpackage.mj mjVar = (defpackage.mj) this.a;
                if (mjVar.b != null) {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    long j = mjVar.w;
                    long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
                    kp kpVar = mjVar.p.n;
                    if (mjVar.v == null) {
                        mjVar.v = new android.graphics.Rect();
                    }
                    kpVar.aH(mjVar.b.a, mjVar.v);
                    if (kpVar.ah()) {
                        int i3 = (int) (mjVar.i + mjVar.g);
                        int paddingLeft = (i3 - mjVar.v.left) - mjVar.p.getPaddingLeft();
                        float f = mjVar.g;
                        if ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((i3 + mjVar.b.a.getWidth()) + mjVar.v.right) - (mjVar.p.getWidth() - mjVar.p.getPaddingRight())) <= 0)) {
                            iD = 0;
                        } else {
                            iD = paddingLeft;
                        }
                    } else {
                        iD = 0;
                    }
                    if (kpVar.ai()) {
                        int i4 = (int) (mjVar.j + mjVar.h);
                        iD2 = (i4 - mjVar.v.top) - mjVar.p.getPaddingTop();
                        float f2 = mjVar.h;
                        if ((f2 >= 0.0f || iD2 >= 0) && (f2 <= 0.0f || (iD2 = ((i4 + mjVar.b.a.getHeight()) + mjVar.v.bottom) - (mjVar.p.getHeight() - mjVar.p.getPaddingBottom())) <= 0)) {
                            iD2 = 0;
                        }
                    } else {
                        iD2 = 0;
                    }
                    if (iD != 0) {
                        defpackage.mf mfVar = mjVar.l;
                        android.support.v7.widget.RecyclerView recyclerView = mjVar.p;
                        int width = mjVar.b.a.getWidth();
                        mjVar.p.getWidth();
                        iD = mfVar.d(recyclerView, width, iD, j2);
                    }
                    int i5 = iD;
                    if (iD2 != 0) {
                        defpackage.mf mfVar2 = mjVar.l;
                        android.support.v7.widget.RecyclerView recyclerView2 = mjVar.p;
                        int height = mjVar.b.a.getHeight();
                        mjVar.p.getHeight();
                        iD2 = mfVar2.d(recyclerView2, height, iD2, j2);
                    }
                    if (i5 != 0) {
                        i = i5;
                    } else if (iD2 == 0) {
                        mjVar.w = Long.MIN_VALUE;
                        return;
                    }
                    if (mjVar.w == Long.MIN_VALUE) {
                        mjVar.w = jCurrentTimeMillis;
                    }
                    mjVar.p.scrollBy(i, iD2);
                    if (mjVar.b != null) {
                        mjVar.j();
                    }
                    mjVar.p.removeCallbacks(mjVar.q);
                    android.support.v7.widget.RecyclerView recyclerView3 = mjVar.p;
                    int i6 = dzs.a;
                    recyclerView3.postOnAnimation(this);
                    return;
                }
                return;
            case 10:
                mn mnVar = (mn) this.a;
                java.lang.Runnable runnable = mnVar.a;
                if (runnable != null) {
                    runnable.run();
                    mnVar.a = null;
                    return;
                }
                return;
            case 11:
                defpackage.mr.i((defpackage.mr) this.a);
                return;
            case 12:
                java.util.Map map = ((defpackage.tp) this.a).a;
                synchronized (map) {
                    for (androidx.car.app.CarAppBinder carAppBinder : map.values()) {
                        if (android.util.Log.isLoggable("CarApp", 3)) {
                            android.util.Log.d("CarApp", "Executing onAutoDriveEnabled for " + carAppBinder.getCurrentSessionInfo());
                        }
                        carAppBinder.onAutoDriveEnabled();
                    }
                    break;
                }
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                ((defpackage.uc) ((defpackage.tt) this.a).a(defpackage.uc.class)).c();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                this.a.a();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                android.view.ActionMode actionMode = ((defpackage.bhq) this.a).f;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 16:
                defpackage.bzg bzgVar = (defpackage.bzg) this.a;
                defpackage.bzy bzyVar = bzgVar.b;
                if (bzyVar != null) {
                    bzyVar.setState(defpackage.bzg.a);
                }
                bzgVar.d = null;
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((ddl) this.a).e();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.Class cls = deg.a;
                this.a.a();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                deg degVar = (deg) this.a;
                degVar.ag(degVar.n);
                return;
            default:
                this.a.a();
                return;
        }
    }

    public /* synthetic */ jd(java.lang.Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
