package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fkh implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public fkh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v29, types: [dxw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v32, types: [java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v49, types: [hzk, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.Semaphore semaphore;
        int i = 11;
        int i2 = 1;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                java.lang.String str = eum.a;
                defpackage.ezv ezvVar = ((defpackage.exy) ((defpackage.kvt) this.a).a).a.z;
                ezvVar.F(ezvVar.E(), 1015, new defpackage.ezt(i2));
                return;
            case 1:
                java.lang.String str2 = eum.a;
                defpackage.ezv ezvVar2 = ((defpackage.exy) ((defpackage.kvt) this.a).a).a.z;
                ezvVar2.F(ezvVar2.E(), 1030, new defpackage.exv(i));
                return;
            case 2:
                java.lang.String str3 = eum.a;
                defpackage.ezv ezvVar3 = ((defpackage.exy) ((defpackage.kvt) this.a).a).a.z;
                ezvVar3.F(ezvVar3.E(), 1017, new defpackage.ezp(14));
                return;
            case 3:
                defpackage.gea geaVar = (defpackage.gea) this.a;
                if (geaVar.am == -1 || android.os.SystemClock.currentThreadTimeMillis() >= 1000) {
                    return;
                }
                android.widget.EditText editText = geaVar.ak;
                if (editText == null || !editText.isFocused()) {
                    geaVar.aX();
                    return;
                }
                if (((android.view.inputmethod.InputMethodManager) geaVar.ak.getContext().getSystemService("input_method")).showSoftInput(geaVar.ak, 0)) {
                    geaVar.aX();
                    return;
                }
                android.widget.EditText editText2 = geaVar.ak;
                java.lang.Runnable runnable = geaVar.al;
                editText2.removeCallbacks(runnable);
                geaVar.ak.postDelayed(runnable, 50L);
                return;
            case 4:
                android.support.v7.widget.RecyclerView recyclerView = ((defpackage.ger) this.a).b;
                recyclerView.focusableViewAvailable(recyclerView);
                return;
            case 5:
                synchronized (this) {
                    ((androidx.preference.PreferenceGroup) this.a).a.clear();
                    break;
                }
                return;
            case 6:
                ((defpackage.geu) this.a).x();
                return;
            case 7:
                androidx.viewpager.widget.ViewPager viewPager = (androidx.viewpager.widget.ViewPager) this.a;
                viewPager.p(0);
                viewPager.j();
                return;
            case 8:
                this.a.accept(new defpackage.gqd(aokc.a));
                return;
            case 9:
                ((java.util.concurrent.atomic.AtomicBoolean) this.a).set(true);
                return;
            case 10:
                java.util.Map map = defpackage.gzl.a;
                ?? r10 = this.a;
                java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
                mni.bg((java.io.Closeable) r10);
                return;
            case 11:
                java.lang.Object obj = this.a;
                defpackage.gzs gzsVar = (defpackage.gzs) obj;
                defpackage.heg hegVar = gzsVar.j;
                if (hegVar != null) {
                    try {
                        ((defpackage.gzs) obj).o.acquire();
                        hegVar.m(((defpackage.gzs) obj).c.c());
                        semaphore = gzsVar.o;
                    } catch (java.lang.InterruptedException unused) {
                        semaphore = gzsVar.o;
                    } catch (java.lang.Throwable th) {
                        gzsVar.o.release();
                        throw th;
                    }
                    semaphore.release();
                    return;
                }
                return;
            case 12:
                ((haa) this.a).a();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                throw new java.lang.AssertionError(this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                ((defpackage.hzk) ((defpackage.hzp) this.a).e.orElseThrow()).b();
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                this.a.a();
                return;
            case 16:
                lpb.b();
                defpackage.hzp hzpVar = (defpackage.hzp) this.a;
                if (!hzpVar.e.isPresent()) {
                    a.bI(defpackage.hzp.a.c().m(aioa.b), "source not started", "com/android/dialer/audio/impl/audiocontroller/RecordingAudioSource", "read", (char) 132, "RecordingAudioSource.java", zct.b);
                    hzpVar.f.cancel(true);
                    return;
                } else {
                    defpackage.hzk hzkVar = (defpackage.hzk) hzpVar.e.orElseThrow();
                    byte[] bArr = hzpVar.d;
                    hzpVar.g.d(akzc.H(hzpVar.d, hzkVar.d(bArr, bArr.length)));
                    return;
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aimz aimzVar = defpackage.hzp.a;
                throw new java.lang.AssertionError(this.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((defpackage.iao) this.a).a(new defpackage.fch(i));
                return;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((defpackage.iao) this.a).a(new defpackage.fch(10));
                return;
            default:
                java.lang.Object obj2 = this.a;
                ajas ajasVarB = ahqx.b(new defpackage.ibg(obj2, i3));
                defpackage.ibk ibkVar = (defpackage.ibk) obj2;
                agsm.i(102, ibkVar.l.e(ajasVarB, ibkVar.d), "failed on completion", new java.lang.Object[0]);
                return;
        }
    }

    public /* synthetic */ fkh(java.lang.Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
