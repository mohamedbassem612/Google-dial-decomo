package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class drn implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public drn(defpackage.ecd ecdVar, int i) {
        this.$cid = i;
        this.a = ecdVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [aomy, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        int i = 15;
        int i2 = 3;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                this.a.a();
                return;
            case 1:
                this.a.a();
                return;
            case 2:
                android.view.View view = ((defpackage.ecb) this.a).a;
                android.view.ViewParent parent = view.getParent();
                if (parent instanceof android.view.ViewGroup) {
                    ((android.view.ViewGroup) parent).removeView(view);
                    return;
                }
                return;
            case 3:
                defpackage.ecd ecdVar = (defpackage.ecd) this.a;
                if (ecdVar.e) {
                    if (ecdVar.c) {
                        ecdVar.c = false;
                        defpackage.ecc eccVar = ecdVar.a;
                        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                        eccVar.e = jCurrentAnimationTimeMillis;
                        eccVar.g = -1L;
                        eccVar.f = jCurrentAnimationTimeMillis;
                        eccVar.h = 0.5f;
                    }
                    defpackage.ecc eccVar2 = ecdVar.a;
                    if ((eccVar2.g > 0 && android.view.animation.AnimationUtils.currentAnimationTimeMillis() > eccVar2.g + ((long) eccVar2.i)) || !ecdVar.b()) {
                        ecdVar.e = false;
                        return;
                    }
                    if (ecdVar.d) {
                        ecdVar.d = false;
                        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        ecdVar.b.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (eccVar2.f == 0) {
                        throw new java.lang.RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                    float fA = eccVar2.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - eccVar2.f;
                    eccVar2.f = jCurrentAnimationTimeMillis2;
                    ecdVar.f.scrollListBy((int) (j * (((-4.0f) * fA * fA) + (fA * 4.0f)) * eccVar2.d));
                    android.view.View view2 = ecdVar.b;
                    int i4 = dzs.a;
                    view2.postOnAnimation(this);
                    return;
                }
                return;
            case 4:
                ((androidx.drawerlayout.widget.DrawerLayout) this.a).h(false);
                return;
            case 5:
                java.lang.Object obj2 = ((defpackage.ejk) this.a).h.a;
                long jUptimeMillis2 = android.os.SystemClock.uptimeMillis();
                long jUptimeMillis3 = android.os.SystemClock.uptimeMillis();
                int i5 = 0;
                while (true) {
                    defpackage.ejk ejkVar = (defpackage.ejk) obj2;
                    java.util.ArrayList arrayList = ejkVar.b;
                    if (i5 >= arrayList.size()) {
                        if (ejkVar.d) {
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                if (arrayList.get(size) == null) {
                                    arrayList.remove(size);
                                }
                            }
                            if (arrayList.size() == 0 && android.os.Build.VERSION.SDK_INT >= 33) {
                                defpackage.fje fjeVar = ejkVar.f;
                                ae$.ExternalSyntheticApiModelOutline0.m$1((android.animation.ValueAnimator$DurationScaleChangeListener) fjeVar.a);
                                fjeVar.a = null;
                            }
                            ejkVar.d = false;
                        }
                        if (arrayList.size() > 0) {
                            ejkVar.g.u(ejkVar.c);
                            return;
                        }
                        return;
                    }
                    eji ejiVar = (eji) arrayList.get(i5);
                    if (ejiVar != null) {
                        aec aecVar = ejkVar.a;
                        java.lang.Long l = (java.lang.Long) aecVar.get(ejiVar);
                        if (l == null) {
                            ejiVar.a(jUptimeMillis2);
                        } else if (l.longValue() < jUptimeMillis3) {
                            aecVar.remove(ejiVar);
                            ejiVar.a(jUptimeMillis2);
                        }
                    }
                    i5++;
                }
                break;
            case 6:
                defpackage.ett ettVar = (defpackage.ett) this.a;
                rai raiVar = (rai) ((java.lang.ref.WeakReference) ettVar.a).get();
                if (raiVar != null) {
                    ((defpackage.fir) raiVar.a).g(((afpb) ettVar.b).f());
                    return;
                }
                return;
            case 7:
                defpackage.eyc eycVar = (defpackage.eyc) this.a;
                android.content.Context context = eycVar.d;
                java.lang.String str = eum.a;
                int iGenerateAudioSessionId = defpackage.hgt.aH(context).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                android.os.Looper looperMyLooper = android.os.Looper.myLooper();
                defpackage.etb etbVar = eycVar.l;
                if (looperMyLooper == etbVar.b.a()) {
                    obj = etbVar.c;
                } else {
                    ahvr.bY(looperMyLooper == etbVar.a.a());
                    obj = etbVar.d;
                }
                if (((java.lang.Integer) obj).intValue() != iGenerateAudioSessionId) {
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(iGenerateAudioSessionId);
                    etbVar.d = numValueOf;
                    etbVar.b(new defpackage.esz(etbVar, numValueOf, i3));
                    eycVar.g.e(iGenerateAudioSessionId, true);
                    return;
                }
                return;
            case 8:
                defpackage.ezv ezvVar = ((defpackage.eyj) this.a).p;
                ezvVar.F(ezvVar.A(), 1034, new defpackage.ezp(6));
                return;
            case 9:
                try {
                    defpackage.eyj.g((defpackage.ezd) this.a);
                    return;
                } catch (defpackage.exl e) {
                    defpackage.etr.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new java.lang.RuntimeException(e);
                }
            case 10:
                defpackage.ezv ezvVar2 = (defpackage.ezv) this.a;
                ezvVar2.F(ezvVar2.A(), 1028, new defpackage.exv(i2));
                ezvVar2.d.d();
                return;
            case 11:
                ((defpackage.fam) this.a).d();
                return;
            case 12:
                int i6 = defpackage.faj.b;
                ((defpackage.fam) this.a).d();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.lang.String str2 = eum.a;
                defpackage.ezv ezvVar3 = ((defpackage.exy) ((ils) this.a).a).a.z;
                ezvVar3.F(ezvVar3.E(), 1007, new defpackage.exv(4));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.String str3 = eum.a;
                defpackage.ezv ezvVar4 = ((defpackage.exy) ((ils) this.a).a).a.z;
                ezvVar4.F(ezvVar4.E(), 1010, new defpackage.exv(i));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                java.lang.String str4 = eum.a;
                defpackage.ezv ezvVar5 = ((defpackage.exy) ((ils) this.a).a).a.z;
                ezvVar5.F(ezvVar5.E(), 1011, new defpackage.exv(12));
                return;
            case 16:
                java.lang.String str5 = eum.a;
                defpackage.ezv ezvVar6 = ((defpackage.exy) ((ils) this.a).a).a.z;
                ezvVar6.F(ezvVar6.E(), 1031, new defpackage.ezp(i));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                java.lang.String str6 = eum.a;
                defpackage.ezv ezvVar7 = ((defpackage.exy) ((ils) this.a).a).a.z;
                ezvVar7.F(ezvVar7.E(), 1032, new defpackage.ezt(i2));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.String str7 = eum.a;
                defpackage.ezv ezvVar8 = ((defpackage.exy) ((ils) this.a).a).a.z;
                ezvVar8.F(ezvVar8.E(), 1029, new defpackage.ezt(i3));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                java.lang.String str8 = eum.a;
                defpackage.ezv ezvVar9 = ((defpackage.exy) ((ils) this.a).a).a.z;
                ezvVar9.F(ezvVar9.E(), 1014, new defpackage.ezt(5));
                return;
            default:
                java.lang.String str9 = eum.a;
                defpackage.ezv ezvVar10 = ((defpackage.exy) ((ils) this.a).a).a.z;
                ezvVar10.F(ezvVar10.E(), 1009, new defpackage.ezp(19));
                return;
        }
    }

    public /* synthetic */ drn(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
