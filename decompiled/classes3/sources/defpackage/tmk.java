package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tmk extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ int a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmk(int i, defpackage.acsl acslVar, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.a = i;
        this.b = acslVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 2) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 3) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aooc.af(obj);
            defpackage.tms tmsVar = (defpackage.tms) this.b;
            j$.util.Optional optionalA = tmsVar.d.a();
            aooh.e(optionalA, "getCallAudioRoute(...)");
            java.lang.Double d = ajsz.cj(ajsz.bb(new defpackage.zmw[]{defpackage.zmw.ROUTE_WIRED_HEADSET, defpackage.zmw.ROUTE_BLUETOOTH}), (defpackage.zmw) aooh.q(optionalA)) ? (java.lang.Double) tmsVar.i.a() : (java.lang.Double) tmsVar.h.a();
            android.media.AudioManager audioManager = tmsVar.f;
            double streamMaxVolume = audioManager.getStreamMaxVolume(0);
            aooh.c(d);
            double dDoubleValue = streamMaxVolume * d.doubleValue();
            int i2 = this.a;
            int iH = aopc.h(dDoubleValue);
            if (i2 <= iH) {
                return java.lang.Boolean.FALSE;
            }
            defpackage.tms.a.b().l("com/android/dialer/sharpie/impl/service/SharpieAudioHapticsPlayer", "adjustStreamVolume$<anonymous>", 133, "SharpieAudioHapticsPlayer.kt").y("setting reduced %f volume", d);
            audioManager.setStreamVolume(0, iH, 0);
            return java.lang.Boolean.TRUE;
        }
        if (i == 1) {
            aooc.af(obj);
            ((defpackage.tlw) this.b).h = new java.lang.Integer(this.a);
            return aojh.a;
        }
        if (i == 2) {
            aooc.af(obj);
            try {
                return ((defpackage.zho) this.b).c.getActiveSubscriptionInfo(this.a);
            } catch (java.lang.SecurityException e) {
                defpackage.zho.a.d().k(e).l("com/google/android/callingshared/telephony/CallingSubscriptionManager", "getActiveSubscriptionInfo$<anonymous>", 92, "CallingSubscriptionManager.kt").v("SubscriptionManager.getActiveSubscriptionInfo called without permission.");
                return null;
            } catch (java.lang.RuntimeException e2) {
                defpackage.zho.a.d().k(e2).l("com/google/android/callingshared/telephony/CallingSubscriptionManager", "getActiveSubscriptionInfo$<anonymous>", 98, "CallingSubscriptionManager.kt").v("SubscriptionManager.getActiveSubscriptionInfo failed due to system error.");
                return null;
            }
        }
        if (i != 3) {
            aooc.af(obj);
            defpackage.acsl acslVar = (defpackage.acsl) this.b;
            if (this.a == acslVar.f) {
                acslVar.f();
            }
            return aojh.a;
        }
        aooc.af(obj);
        try {
            java.lang.String phoneNumber = ((defpackage.zho) this.b).c.getPhoneNumber(this.a);
            if (phoneNumber.length() != 0) {
                return phoneNumber;
            }
            return null;
        } catch (java.lang.SecurityException e3) {
            defpackage.zho.a.d().k(e3).l("com/google/android/callingshared/telephony/CallingSubscriptionManager", "getPhoneNumber$<anonymous>", 47, "CallingSubscriptionManager.kt").v("SubscriptionManager.getPhoneNumber called without permission.");
            return null;
        } catch (java.lang.RuntimeException e4) {
            defpackage.zho.a.d().k(e4).l("com/google/android/callingshared/telephony/CallingSubscriptionManager", "getPhoneNumber$<anonymous>", 53, "CallingSubscriptionManager.kt").v("SubscriptionManager.getPhoneNumber failed due to system error.");
            return null;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.tmk tmkVar;
        int i = this.$cid;
        if (i == 0) {
            tmkVar = new defpackage.tmk((defpackage.tms) this.b, this.a, aolnVar, 0);
        } else if (i == 1) {
            tmkVar = new defpackage.tmk((defpackage.tlw) this.b, this.a, aolnVar, 1);
        } else {
            if (i != 2) {
                if (i != 3) {
                    return new defpackage.tmk(this.a, (defpackage.acsl) this.b, aolnVar, 4);
                }
                return new defpackage.tmk((defpackage.zho) this.b, this.a, aolnVar, 3, null);
            }
            tmkVar = new defpackage.tmk((defpackage.zho) this.b, this.a, aolnVar, 2);
        }
        return tmkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmk(defpackage.tlw tlwVar, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = tlwVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmk(defpackage.tms tmsVar, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = tmsVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmk(defpackage.zho zhoVar, int i, aoln aolnVar, int i2) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = zhoVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmk(defpackage.zho zhoVar, int i, aoln aolnVar, int i2, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i2;
        this.b = zhoVar;
        this.a = i;
    }
}
