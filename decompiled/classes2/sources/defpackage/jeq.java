package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jeq {
    private static final aimz a = aimz.i("com/android/dialer/beesly/impl/v2/notification/missedcall/BeeslyMissedCallNotifier");
    private final android.content.Context b;
    private final iqm c;
    private final rwj d;
    private final ssq e;
    private final j$.util.Optional f;
    private final aoin g;
    private final ops h;
    private final wct i;
    private final rsr j;
    private final zjm k;
    private final kgl l;
    private final rsr m;
    private final ipc n;

    public jeq(android.content.Context context, iqm iqmVar, rsr rsrVar, rwj rwjVar, rsr rsrVar2, ssq ssqVar, ops opsVar, ipc ipcVar, wct wctVar, j$.util.Optional optional, aoin aoinVar, kgl kglVar, zjm zjmVar) {
        aooh.f(context, "appContext");
        aooh.f(ssqVar, "phoneNumberHelper");
        aooh.f(opsVar, "glidePhotoManager");
        aooh.f(optional, "transcriptAudioFeedbackOptional");
        aooh.f(aoinVar, "enableBeeslyV2WearSyncFix");
        aooh.f(kglVar, "beeslySot");
        this.b = context;
        this.c = iqmVar;
        this.j = rsrVar;
        this.d = rwjVar;
        this.m = rsrVar2;
        this.e = ssqVar;
        this.h = opsVar;
        this.n = ipcVar;
        this.i = wctVar;
        this.f = optional;
        this.g = aoinVar;
        this.l = kglVar;
        this.k = zjmVar;
    }

    private final android.app.PendingIntent e() {
        return afap.b(this.b, 0, this.n.bc(1), 67108864);
    }

    private final android.app.PendingIntent f() {
        aopu[] aopuVarArr = aoou.a;
        java.lang.String strB = new aooa(com.android.dialer.calllog.missedcalls.MissedCallBroadcastReceiver_Receiver.class).b();
        if (strB == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.b;
        intent.setComponent(new android.content.ComponentName(context, strB));
        intent.setAction("com.android.dialer.calllog.ACTION_CANCEL_ALL_MISSED_CALLS");
        return afap.c(context, 0, intent, 67108864);
    }

    private final defpackage.dva g() {
        android.content.Context context = this.b;
        defpackage.dva dvaVar = new defpackage.dva(context, "phone_missed_call");
        dvaVar.o = "MissedCallGroup";
        dvaVar.n(2131232038);
        dvaVar.t = urg.c(context, 2130969018);
        dvaVar.d(16, true);
        dvaVar.d(8, true);
        dvaVar.m();
        dvaVar.i(2);
        return dvaVar;
    }

    private final java.lang.Object h(defpackage.jel jelVar, aoln aolnVar) {
        j$.util.Optional optionalR = this.m.r(jelVar.b);
        abwd abwdVar = jelVar.c;
        if ((abwdVar.b & 1) != 0) {
            return abwdVar.c;
        }
        java.lang.String str = jelVar.a;
        if (str != null) {
            java.lang.Object objA = a(str, aolnVar);
            return objA != aolu.a ? (java.lang.CharSequence) objA : objA;
        }
        if (!optionalR.isPresent()) {
            return this.b.getString(2132020653);
        }
        aooh.c(optionalR);
        return (java.lang.CharSequence) aooh.q(optionalR);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.String str, aoln aolnVar) {
        defpackage.jem jemVar;
        ssq ssqVar;
        if (aolnVar instanceof defpackage.jem) {
            jemVar = (defpackage.jem) aolnVar;
            int i = jemVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jemVar.c = i - Integer.MIN_VALUE;
            } else {
                jemVar = new defpackage.jem(this, aolnVar);
            }
        } else {
            jemVar = new defpackage.jem(this, aolnVar);
        }
        java.lang.Object obj = jemVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jemVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ssq ssqVar2 = this.e;
            rsr rsrVar = this.j;
            jemVar.d = ssqVar2;
            jemVar.e = str;
            jemVar.c = 1;
            java.lang.Object objB = rsrVar.b(jemVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            ssqVar = ssqVar2;
            obj = objB;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = jemVar.e;
            ssqVar = jemVar.d;
            aooc.af(obj);
        }
        java.lang.String strG = ssqVar.g(str, (java.lang.String) obj);
        if (strG != null) {
            return strG;
        }
        java.lang.String string = this.b.getString(2132020653);
        aooh.e(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(abwd abwdVar, aoln aolnVar) {
        defpackage.jen jenVar;
        if (aolnVar instanceof defpackage.jen) {
            jenVar = (defpackage.jen) aolnVar;
            int i = jenVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jenVar.c = i - Integer.MIN_VALUE;
            } else {
                jenVar = new defpackage.jen(this, aolnVar);
            }
        } else {
            jenVar = new defpackage.jen(this, aolnVar);
        }
        java.lang.Object objD = jenVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jenVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ops opsVar = this.h;
            android.content.Context context = this.b;
            ajcq ajcqVarE = opsVar.e(abwdVar, defpackage.oph.a(), context.getResources().getDimensionPixelSize(2131167223), context.getResources().getDimensionPixelSize(2131167222));
            jenVar.c = 1;
            objD = aosv.D(ajcqVarE, jenVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        return aooh.q((j$.util.Optional) objD);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0183  */
    /* JADX WARN: Code duplicated, block: B:41:0x0188 A[PHI: r1 r3 r7
      0x0188: PHI (r1v1 long) = (r1v0 long), (r1v4 long) binds: [B:35:0x016e, B:39:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x0188: PHI (r3v1 jel) = (r3v0 jel), (r3v3 jel) binds: [B:35:0x016e, B:39:0x0181] A[DONT_GENERATE, DONT_INLINE]
      0x0188: PHI (r7v11 dva) = (r7v10 dva), (r7v14 dva) binds: [B:35:0x016e, B:39:0x0181] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e5 A[PHI: r1 r3 r7
      0x01e5: PHI (r1v9 long) = (r1v0 long), (r1v12 long) binds: [B:48:0x01cb, B:52:0x01de] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r3v6 jel) = (r3v0 jel), (r3v8 jel) binds: [B:48:0x01cb, B:52:0x01de] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r7v21 dva) = (r7v10 dva), (r7v24 dva) binds: [B:48:0x01cb, B:52:0x01de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x0208  */
    /* JADX WARN: Code duplicated, block: B:61:0x0239  */
    /* JADX WARN: Code duplicated, block: B:64:0x0253  */
    /* JADX WARN: Code duplicated, block: B:65:0x030a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0317  */
    /* JADX WARN: Code duplicated, block: B:71:0x0337  */
    /* JADX WARN: Code duplicated, block: B:74:0x0356  */
    /* JADX WARN: Code duplicated, block: B:77:0x035c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object c(long j, defpackage.jel jelVar, aoln aolnVar) {
        defpackage.jeo jeoVar;
        android.app.PendingIntent pendingIntentB;
        defpackage.dva dvaVarG;
        int iIntValue;
        defpackage.jel jelVar2;
        defpackage.dva dvaVar;
        long j2;
        int i;
        java.lang.Object obj;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        java.lang.Integer num;
        java.lang.String string;
        int iIntValue2;
        int i2;
        java.lang.Object obj2;
        java.lang.Object[] objArr3;
        java.lang.Object[] objArr4;
        java.lang.Integer num2;
        java.lang.String str;
        long j3;
        defpackage.jel jelVar3;
        defpackage.dva dvaVar2;
        java.lang.Object obj3;
        android.net.Uri uriCx;
        defpackage.dva dvaVar3;
        defpackage.dva dvaVar4;
        java.lang.String str2;
        boolean z;
        long j4;
        aolu aoluVar;
        long j5;
        android.app.Notification notificationA;
        long j6;
        android.app.Notification notification;
        defpackage.itc itcVar;
        defpackage.jeq jeqVar = this;
        long j7 = j;
        defpackage.jel jelVar4 = jelVar;
        if (aolnVar instanceof defpackage.jeo) {
            jeoVar = (defpackage.jeo) aolnVar;
            int i3 = jeoVar.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jeoVar.i = i3 - Integer.MIN_VALUE;
            } else {
                jeoVar = new defpackage.jeo(jeqVar, aolnVar);
            }
        } else {
            jeoVar = new defpackage.jeo(jeqVar, aolnVar);
        }
        java.lang.Object objB = jeoVar.g;
        aolu aoluVar2 = aolu.a;
        java.lang.String str3 = "postMissedCallNotification";
        java.lang.String str4 = "com/android/dialer/beesly/impl/v2/notification/missedcall/BeeslyMissedCallNotifier";
        java.lang.String str5 = "BeeslyMissedCallNotifier.kt";
        switch (jeoVar.i) {
            case 0:
                aooc.af(objB);
                a.b().l("com/android/dialer/beesly/impl/v2/notification/missedcall/BeeslyMissedCallNotifier", "postMissedCallNotification", 85, "BeeslyMissedCallNotifier.kt").v("starting to post missed call notification");
                j$.util.Optional optional = jeqVar.f;
                if (optional.isEmpty() || !jelVar4.f) {
                    pendingIntentB = jeqVar.e();
                } else if (((wsc) aooh.q(optional)) != null) {
                    android.content.Context context = jeqVar.b;
                    vqf vqfVarBy = wsc.by(utu.a.m());
                    vqfVarBy.z(j7);
                    vqfVarBy.C(7);
                    vqfVarBy.A(jelVar4.c);
                    pendingIntentB = afap.b(context, 0, uvd.a(context, vqfVarBy.x()), 67108864);
                } else {
                    pendingIntentB = null;
                }
                dvaVarG = jeqVar.g();
                dvaVarG.r(j7);
                defpackage.dva dvaVarG2 = jeqVar.g();
                dvaVarG2.g = pendingIntentB;
                dvaVarG2.j(jeqVar.f());
                dvaVarG.v = dvaVarG2.a();
                dvaVarG.g = pendingIntentB;
                dvaVarG.j(jeqVar.f());
                boolean zD = jeqVar.c.d();
                zjm zjmVar = jeqVar.k;
                if (!zD) {
                    j$.util.Optional optionalG = zjmVar.g();
                    aooh.e(optionalG, "getFeature(...)");
                    jin jinVar = (jin) aooh.q(optionalG);
                    if (jinVar != null) {
                        jeoVar.b = jelVar4;
                        jeoVar.j = dvaVarG;
                        jeoVar.a = j7;
                        jeoVar.i = 3;
                        objB = jinVar.b();
                        if (objB == aoluVar2) {
                            return aoluVar2;
                        }
                        num2 = (java.lang.Integer) objB;
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = 2132019546;
                        }
                    } else {
                        iIntValue2 = 2132019546;
                    }
                    jelVar2 = jelVar4;
                    dvaVar = dvaVarG;
                    j2 = j7;
                    i2 = iIntValue2;
                    obj2 = jeqVar.b;
                    objArr3 = new java.lang.Object[1];
                    jeoVar.b = jelVar2;
                    jeoVar.j = dvaVar;
                    jeoVar.c = obj2;
                    jeoVar.d = objArr3;
                    jeoVar.e = objArr3;
                    jeoVar.a = j2;
                    jeoVar.f = i2;
                    jeoVar.i = 4;
                    objB = jeqVar.h(jelVar2, jeoVar);
                    if (objB != aoluVar2) {
                        return aoluVar2;
                    }
                    objArr4 = objArr3;
                    objArr3[0] = objB;
                    string = ((android.content.Context) obj2).getString(i2, objArr4);
                    str = string;
                    j3 = j2;
                    jelVar3 = jelVar2;
                    dvaVar2 = dvaVar;
                    aooh.c(str);
                    dvaVar2.h(str);
                    obj3 = jeqVar.b;
                    abwd abwdVar = jelVar3.c;
                    uriCx = afsq.cx(abwdVar);
                    jeoVar.b = jelVar3;
                    jeoVar.j = dvaVar2;
                    jeoVar.c = obj3;
                    jeoVar.d = dvaVar2;
                    jeoVar.e = uriCx;
                    jeoVar.k = str;
                    jeoVar.a = j3;
                    jeoVar.i = 5;
                    objB = jeqVar.b(abwdVar, jeoVar);
                    if (objB != aoluVar2) {
                        return aoluVar2;
                    }
                    dvaVar3 = dvaVar2;
                    dvaVar4 = dvaVar3;
                    android.content.Context context2 = (android.content.Context) obj3;
                    snl.ae(context2, dvaVar4, str, uriCx, (android.graphics.Bitmap) objB, jelVar3.d, j3);
                    str2 = jelVar3.a;
                    if (str2 != null) {
                        android.content.Intent intent = new android.content.Intent();
                        android.content.Context context3 = jeqVar.b;
                        intent.setComponent(new android.content.ComponentName(context3, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
                        intent.setAction("com.android.dialer.calllog.CALL_BACK_FROM_MISSED_CALL_NOTIFICATION".concat("_".concat(str2)));
                        intent.putExtra("android.telecom.extra.NOTIFICATION_PHONE_NUMBER", str2);
                        intent.putExtra("notification_tag", snl.ad(j3));
                        intent.putExtra("notification_id", 1);
                        java.lang.String string2 = context3.getString(2132019543);
                        android.app.PendingIntent pendingIntentB2 = afap.b(context3, 0, intent, 67108864);
                        dvaVar3.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131232043), defpackage.dva.c(string2), pendingIntentB2, new android.os.Bundle()));
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.setComponent(new android.content.ComponentName(context3, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
                        intent2.setAction("com.android.dialer.calllog.SEND_SMS_FROM_MISSED_CALL_NOTIFICATION".concat("_".concat(str2)));
                        intent2.putExtra("MISSED_CALL_NUMBER", str2);
                        intent2.putExtra("notification_tag", snl.ad(j3));
                        intent2.putExtra("notification_id", 1);
                        java.lang.String string3 = context3.getString(2132019544);
                        z = false;
                        android.app.PendingIntent pendingIntentB3 = afap.b(context3, 0, intent2, 67108864);
                        dvaVar3.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131232029), defpackage.dva.c(string3), pendingIntentB3, new android.os.Bundle()));
                    } else {
                        z = false;
                    }
                    if (jelVar3.e == null) {
                        z = true;
                    }
                    jeoVar.b = dvaVar3;
                    jeoVar.j = null;
                    jeoVar.c = null;
                    jeoVar.d = null;
                    jeoVar.e = null;
                    jeoVar.k = null;
                    jeoVar.a = j3;
                    jeoVar.i = 6;
                    jeqVar = this;
                    objB = jeqVar.d(j3, z, jelVar3, jeoVar);
                    j4 = j3;
                    aoluVar = aoluVar2;
                    if (objB != aoluVar) {
                        j5 = j4;
                        ((defpackage.dvc) objB).b(dvaVar3);
                        kgl kglVar = jeqVar.l;
                        notificationA = dvaVar3.a();
                        defpackage.ity ityVar = new defpackage.ity(j5);
                        jeoVar.b = notificationA;
                        jeoVar.a = j5;
                        jeoVar.i = 7;
                        objB = kglVar.p(ityVar, jeoVar);
                        if (objB != aoluVar) {
                            j6 = j5;
                            notification = notificationA;
                            itcVar = (defpackage.itc) objB;
                            if (itcVar != null) {
                            }
                            jeqVar.d.a(snl.ad(j6), notification);
                            android.content.Context context4 = jeqVar.b;
                            aooh.c(notification);
                            snl.af(context4, notification);
                            return aojh.a;
                        }
                    }
                    return aoluVar;
                }
                j$.util.Optional optionalG2 = zjmVar.g();
                aooh.e(optionalG2, "getFeature(...)");
                jin jinVar2 = (jin) aooh.q(optionalG2);
                if (jinVar2 != null) {
                    jeoVar.b = jelVar4;
                    jeoVar.j = dvaVarG;
                    jeoVar.a = j7;
                    jeoVar.i = 1;
                    objB = jinVar2.a();
                    if (objB == aoluVar2) {
                        return aoluVar2;
                    }
                    num = (java.lang.Integer) objB;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 2132019542;
                    }
                } else {
                    iIntValue = 2132019542;
                }
                jelVar2 = jelVar4;
                dvaVar = dvaVarG;
                j2 = j7;
                i = iIntValue;
                obj = jeqVar.b;
                objArr = new java.lang.Object[1];
                jeoVar.b = jelVar2;
                jeoVar.j = dvaVar;
                jeoVar.c = obj;
                jeoVar.d = objArr;
                jeoVar.e = objArr;
                jeoVar.a = j2;
                jeoVar.f = i;
                jeoVar.i = 2;
                objB = jeqVar.h(jelVar2, jeoVar);
                if (objB != aoluVar2) {
                    return aoluVar2;
                }
                objArr2 = objArr;
                objArr[0] = objB;
                string = ((android.content.Context) obj).getString(i, objArr2);
                str = string;
                j3 = j2;
                jelVar3 = jelVar2;
                dvaVar2 = dvaVar;
                aooh.c(str);
                dvaVar2.h(str);
                obj3 = jeqVar.b;
                abwd abwdVar2 = jelVar3.c;
                uriCx = afsq.cx(abwdVar2);
                jeoVar.b = jelVar3;
                jeoVar.j = dvaVar2;
                jeoVar.c = obj3;
                jeoVar.d = dvaVar2;
                jeoVar.e = uriCx;
                jeoVar.k = str;
                jeoVar.a = j3;
                jeoVar.i = 5;
                objB = jeqVar.b(abwdVar2, jeoVar);
                if (objB != aoluVar2) {
                    return aoluVar2;
                }
                dvaVar3 = dvaVar2;
                dvaVar4 = dvaVar3;
                android.content.Context context5 = (android.content.Context) obj3;
                snl.ae(context5, dvaVar4, str, uriCx, (android.graphics.Bitmap) objB, jelVar3.d, j3);
                str2 = jelVar3.a;
                if (str2 != null) {
                    android.content.Intent intent3 = new android.content.Intent();
                    android.content.Context context6 = jeqVar.b;
                    intent3.setComponent(new android.content.ComponentName(context6, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
                    intent3.setAction("com.android.dialer.calllog.CALL_BACK_FROM_MISSED_CALL_NOTIFICATION".concat("_".concat(str2)));
                    intent3.putExtra("android.telecom.extra.NOTIFICATION_PHONE_NUMBER", str2);
                    intent3.putExtra("notification_tag", snl.ad(j3));
                    intent3.putExtra("notification_id", 1);
                    java.lang.String string4 = context6.getString(2132019543);
                    android.app.PendingIntent pendingIntentB4 = afap.b(context6, 0, intent3, 67108864);
                    dvaVar3.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131232043), defpackage.dva.c(string4), pendingIntentB4, new android.os.Bundle()));
                    android.content.Intent intent4 = new android.content.Intent();
                    intent4.setComponent(new android.content.ComponentName(context6, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
                    intent4.setAction("com.android.dialer.calllog.SEND_SMS_FROM_MISSED_CALL_NOTIFICATION".concat("_".concat(str2)));
                    intent4.putExtra("MISSED_CALL_NUMBER", str2);
                    intent4.putExtra("notification_tag", snl.ad(j3));
                    intent4.putExtra("notification_id", 1);
                    java.lang.String string5 = context6.getString(2132019544);
                    z = false;
                    android.app.PendingIntent pendingIntentB5 = afap.b(context6, 0, intent4, 67108864);
                    dvaVar3.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131232029), defpackage.dva.c(string5), pendingIntentB5, new android.os.Bundle()));
                } else {
                    z = false;
                }
                if (jelVar3.e == null) {
                    z = true;
                }
                jeoVar.b = dvaVar3;
                jeoVar.j = null;
                jeoVar.c = null;
                jeoVar.d = null;
                jeoVar.e = null;
                jeoVar.k = null;
                jeoVar.a = j3;
                jeoVar.i = 6;
                jeqVar = this;
                objB = jeqVar.d(j3, z, jelVar3, jeoVar);
                j4 = j3;
                aoluVar = aoluVar2;
                if (objB != aoluVar) {
                    j5 = j4;
                    ((defpackage.dvc) objB).b(dvaVar3);
                    kgl kglVar2 = jeqVar.l;
                    notificationA = dvaVar3.a();
                    defpackage.ity ityVar2 = new defpackage.ity(j5);
                    jeoVar.b = notificationA;
                    jeoVar.a = j5;
                    jeoVar.i = 7;
                    objB = kglVar2.p(ityVar2, jeoVar);
                    if (objB != aoluVar) {
                        j6 = j5;
                        notification = notificationA;
                        itcVar = (defpackage.itc) objB;
                        if (itcVar != null || !defpackage.hgz.m(itcVar)) {
                            jeqVar.d.a(snl.ad(j6), notification);
                            android.content.Context context7 = jeqVar.b;
                            aooh.c(notification);
                            snl.af(context7, notification);
                            return aojh.a;
                        }
                        a.b().l(str4, str3, 154, str5).v("Not posting missed call notification due to late spam/scam verdict detection.");
                        android.content.Context context8 = jeqVar.b;
                        aooh.c(notification);
                        snl.af(context8, notification);
                        return aojh.a;
                    }
                }
                return aoluVar;
            case 1:
                j7 = jeoVar.a;
                defpackage.dva dvaVar5 = jeoVar.j;
                defpackage.jel jelVar5 = (defpackage.jel) jeoVar.b;
                aooc.af(objB);
                dvaVarG = dvaVar5;
                jelVar4 = jelVar5;
                num = (java.lang.Integer) objB;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 2132019542;
                }
                jelVar2 = jelVar4;
                dvaVar = dvaVarG;
                j2 = j7;
                i = iIntValue;
                obj = jeqVar.b;
                objArr = new java.lang.Object[1];
                jeoVar.b = jelVar2;
                jeoVar.j = dvaVar;
                jeoVar.c = obj;
                jeoVar.d = objArr;
                jeoVar.e = objArr;
                jeoVar.a = j2;
                jeoVar.f = i;
                jeoVar.i = 2;
                objB = jeqVar.h(jelVar2, jeoVar);
                if (objB != aoluVar2) {
                    return aoluVar2;
                }
                objArr2 = objArr;
                objArr[0] = objB;
                string = ((android.content.Context) obj).getString(i, objArr2);
                str = string;
                j3 = j2;
                jelVar3 = jelVar2;
                dvaVar2 = dvaVar;
                aooh.c(str);
                dvaVar2.h(str);
                obj3 = jeqVar.b;
                abwd abwdVar3 = jelVar3.c;
                uriCx = afsq.cx(abwdVar3);
                jeoVar.b = jelVar3;
                jeoVar.j = dvaVar2;
                jeoVar.c = obj3;
                jeoVar.d = dvaVar2;
                jeoVar.e = uriCx;
                jeoVar.k = str;
                jeoVar.a = j3;
                jeoVar.i = 5;
                objB = jeqVar.b(abwdVar3, jeoVar);
                if (objB != aoluVar2) {
                    return aoluVar2;
                }
                dvaVar3 = dvaVar2;
                dvaVar4 = dvaVar3;
                android.content.Context context9 = (android.content.Context) obj3;
                snl.ae(context9, dvaVar4, str, uriCx, (android.graphics.Bitmap) objB, jelVar3.d, j3);
                str2 = jelVar3.a;
                if (str2 != null) {
                    android.content.Intent intent5 = new android.content.Intent();
                    android.content.Context context10 = jeqVar.b;
                    intent5.setComponent(new android.content.ComponentName(context10, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
                    intent5.setAction("com.android.dialer.calllog.CALL_BACK_FROM_MISSED_CALL_NOTIFICATION".concat("_".concat(str2)));
                    intent5.putExtra("android.telecom.extra.NOTIFICATION_PHONE_NUMBER", str2);
                    intent5.putExtra("notification_tag", snl.ad(j3));
                    intent5.putExtra("notification_id", 1);
                    java.lang.String string6 = context10.getString(2132019543);
                    android.app.PendingIntent pendingIntentB6 = afap.b(context10, 0, intent5, 67108864);
                    dvaVar3.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131232043), defpackage.dva.c(string6), pendingIntentB6, new android.os.Bundle()));
                    android.content.Intent intent6 = new android.content.Intent();
                    intent6.setComponent(new android.content.ComponentName(context10, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
                    intent6.setAction("com.android.dialer.calllog.SEND_SMS_FROM_MISSED_CALL_NOTIFICATION".concat("_".concat(str2)));
                    intent6.putExtra("MISSED_CALL_NUMBER", str2);
                    intent6.putExtra("notification_tag", snl.ad(j3));
                    intent6.putExtra("notification_id", 1);
                    java.lang.String string7 = context10.getString(2132019544);
                    z = false;
                    android.app.PendingIntent pendingIntentB7 = afap.b(context10, 0, intent6, 67108864);
                    dvaVar3.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131232029), defpackage.dva.c(string7), pendingIntentB7, new android.os.Bundle()));
                } else {
                    z = false;
                }
                if (jelVar3.e == null) {
                    z = true;
                }
                jeoVar.b = dvaVar3;
                jeoVar.j = null;
                jeoVar.c = null;
                jeoVar.d = null;
                jeoVar.e = null;
                jeoVar.k = null;
                jeoVar.a = j3;
                jeoVar.i = 6;
                jeqVar = this;
                objB = jeqVar.d(j3, z, jelVar3, jeoVar);
                j4 = j3;
                aoluVar = aoluVar2;
                if (objB != aoluVar) {
                    j5 = j4;
                    ((defpackage.dvc) objB).b(dvaVar3);
                    kgl kglVar3 = jeqVar.l;
                    notificationA = dvaVar3.a();
                    defpackage.ity ityVar3 = new defpackage.ity(j5);
                    jeoVar.b = notificationA;
                    jeoVar.a = j5;
                    jeoVar.i = 7;
                    objB = kglVar3.p(ityVar3, jeoVar);
                    if (objB != aoluVar) {
                        j6 = j5;
                        notification = notificationA;
                        itcVar = (defpackage.itc) objB;
                        if (itcVar != null) {
                            break;
                        }
                        jeqVar.d.a(snl.ad(j6), notification);
                        android.content.Context context11 = jeqVar.b;
                        aooh.c(notification);
                        snl.af(context11, notification);
                        return aojh.a;
                    }
                }
                return aoluVar;
            case 2:
                i = jeoVar.f;
                j2 = jeoVar.a;
                objArr = (java.lang.Object[]) jeoVar.e;
                objArr2 = (java.lang.Object[]) jeoVar.d;
                obj = jeoVar.c;
                dvaVar = jeoVar.j;
                jelVar2 = (defpackage.jel) jeoVar.b;
                aooc.af(objB);
                objArr[0] = objB;
                string = ((android.content.Context) obj).getString(i, objArr2);
                str = string;
                j3 = j2;
                jelVar3 = jelVar2;
                dvaVar2 = dvaVar;
                aooh.c(str);
                dvaVar2.h(str);
                obj3 = jeqVar.b;
                abwd abwdVar4 = jelVar3.c;
                uriCx = afsq.cx(abwdVar4);
                jeoVar.b = jelVar3;
                jeoVar.j = dvaVar2;
                jeoVar.c = obj3;
                jeoVar.d = dvaVar2;
                jeoVar.e = uriCx;
                jeoVar.k = str;
                jeoVar.a = j3;
                jeoVar.i = 5;
                objB = jeqVar.b(abwdVar4, jeoVar);
                if (objB != aoluVar2) {
                    return aoluVar2;
                }
                dvaVar3 = dvaVar2;
                dvaVar4 = dvaVar3;
                android.content.Context context12 = (android.content.Context) obj3;
                snl.ae(context12, dvaVar4, str, uriCx, (android.graphics.Bitmap) objB, jelVar3.d, j3);
                str2 = jelVar3.a;
                if (str2 != null) {
                    android.content.Intent intent7 = new android.content.Intent();
                    android.content.Context context13 = jeqVar.b;
                    intent7.setComponent(new android.content.ComponentName(context13, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
                    intent7.setAction("com.android.dialer.calllog.CALL_BACK_FROM_MISSED_CALL_NOTIFICATION".concat("_".concat(str2)));
                    intent7.putExtra("android.telecom.extra.NOTIFICATION_PHONE_NUMBER", str2);
                    intent7.putExtra("notification_tag", snl.ad(j3));
                    intent7.putExtra("notification_id", 1);
                    java.lang.String string8 = context13.getString(2132019543);
                    android.app.PendingIntent pendingIntentB8 = afap.b(context13, 0, intent7, 67108864);
                    dvaVar3.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131232043), defpackage.dva.c(string8), pendingIntentB8, new android.os.Bundle()));
                    android.content.Intent intent8 = new android.content.Intent();
                    intent8.setComponent(new android.content.ComponentName(context13, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
                    intent8.setAction("com.android.dialer.calllog.SEND_SMS_FROM_MISSED_CALL_NOTIFICATION".concat("_".concat(str2)));
                    intent8.putExtra("MISSED_CALL_NUMBER", str2);
                    intent8.putExtra("notification_tag", snl.ad(j3));
                    intent8.putExtra("notification_id", 1);
                    java.lang.String string9 = context13.getString(2132019544);
                    z = false;
                    android.app.PendingIntent pendingIntentB9 = afap.b(context13, 0, intent8, 67108864);
                    dvaVar3.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131232029), defpackage.dva.c(string9), pendingIntentB9, new android.os.Bundle()));
                } else {
                    z = false;
                }
                if (jelVar3.e == null) {
                    z = true;
                }
                jeoVar.b = dvaVar3;
                jeoVar.j = null;
                jeoVar.c = null;
                jeoVar.d = null;
                jeoVar.e = null;
                jeoVar.k = null;
                jeoVar.a = j3;
                jeoVar.i = 6;
                jeqVar = this;
                objB = jeqVar.d(j3, z, jelVar3, jeoVar);
                j4 = j3;
                aoluVar = aoluVar2;
                if (objB != aoluVar) {
                    j5 = j4;
                    ((defpackage.dvc) objB).b(dvaVar3);
                    kgl kglVar4 = jeqVar.l;
                    notificationA = dvaVar3.a();
                    defpackage.ity ityVar4 = new defpackage.ity(j5);
                    jeoVar.b = notificationA;
                    jeoVar.a = j5;
                    jeoVar.i = 7;
                    objB = kglVar4.p(ityVar4, jeoVar);
                    if (objB != aoluVar) {
                        j6 = j5;
                        notification = notificationA;
                        itcVar = (defpackage.itc) objB;
                        if (itcVar != null) {
                            break;
                        }
                        jeqVar.d.a(snl.ad(j6), notification);
                        android.content.Context context14 = jeqVar.b;
                        aooh.c(notification);
                        snl.af(context14, notification);
                        return aojh.a;
                    }
                }
                return aoluVar;
            case 3:
                j7 = jeoVar.a;
                defpackage.dva dvaVar6 = jeoVar.j;
                defpackage.jel jelVar6 = (defpackage.jel) jeoVar.b;
                aooc.af(objB);
                dvaVarG = dvaVar6;
                jelVar4 = jelVar6;
                num2 = (java.lang.Integer) objB;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 2132019546;
                }
                jelVar2 = jelVar4;
                dvaVar = dvaVarG;
                j2 = j7;
                i2 = iIntValue2;
                obj2 = jeqVar.b;
                objArr3 = new java.lang.Object[1];
                jeoVar.b = jelVar2;
                jeoVar.j = dvaVar;
                jeoVar.c = obj2;
                jeoVar.d = objArr3;
                jeoVar.e = objArr3;
                jeoVar.a = j2;
                jeoVar.f = i2;
                jeoVar.i = 4;
                objB = jeqVar.h(jelVar2, jeoVar);
                if (objB != aoluVar2) {
                    return aoluVar2;
                }
                objArr4 = objArr3;
                objArr3[0] = objB;
                string = ((android.content.Context) obj2).getString(i2, objArr4);
                str = string;
                j3 = j2;
                jelVar3 = jelVar2;
                dvaVar2 = dvaVar;
                aooh.c(str);
                dvaVar2.h(str);
                obj3 = jeqVar.b;
                abwd abwdVar5 = jelVar3.c;
                uriCx = afsq.cx(abwdVar5);
                jeoVar.b = jelVar3;
                jeoVar.j = dvaVar2;
                jeoVar.c = obj3;
                jeoVar.d = dvaVar2;
                jeoVar.e = uriCx;
                jeoVar.k = str;
                jeoVar.a = j3;
                jeoVar.i = 5;
                objB = jeqVar.b(abwdVar5, jeoVar);
                if (objB != aoluVar2) {
                    return aoluVar2;
                }
                dvaVar3 = dvaVar2;
                dvaVar4 = dvaVar3;
                android.content.Context context15 = (android.content.Context) obj3;
                snl.ae(context15, dvaVar4, str, uriCx, (android.graphics.Bitmap) objB, jelVar3.d, j3);
                str2 = jelVar3.a;
                if (str2 != null) {
                    android.content.Intent intent9 = new android.content.Intent();
                    android.content.Context context16 = jeqVar.b;
                    intent9.setComponent(new android.content.ComponentName(context16, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
                    intent9.setAction("com.android.dialer.calllog.CALL_BACK_FROM_MISSED_CALL_NOTIFICATION".concat("_".concat(str2)));
                    intent9.putExtra("android.telecom.extra.NOTIFICATION_PHONE_NUMBER", str2);
                    intent9.putExtra("notification_tag", snl.ad(j3));
                    intent9.putExtra("notification_id", 1);
                    java.lang.String string10 = context16.getString(2132019543);
                    android.app.PendingIntent pendingIntentB10 = afap.b(context16, 0, intent9, 67108864);
                    dvaVar3.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131232043), defpackage.dva.c(string10), pendingIntentB10, new android.os.Bundle()));
                    android.content.Intent intent10 = new android.content.Intent();
                    intent10.setComponent(new android.content.ComponentName(context16, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
                    intent10.setAction("com.android.dialer.calllog.SEND_SMS_FROM_MISSED_CALL_NOTIFICATION".concat("_".concat(str2)));
                    intent10.putExtra("MISSED_CALL_NUMBER", str2);
                    intent10.putExtra("notification_tag", snl.ad(j3));
                    intent10.putExtra("notification_id", 1);
                    java.lang.String string11 = context16.getString(2132019544);
                    z = false;
                    android.app.PendingIntent pendingIntentB11 = afap.b(context16, 0, intent10, 67108864);
                    dvaVar3.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131232029), defpackage.dva.c(string11), pendingIntentB11, new android.os.Bundle()));
                } else {
                    z = false;
                }
                if (jelVar3.e == null) {
                    z = true;
                }
                jeoVar.b = dvaVar3;
                jeoVar.j = null;
                jeoVar.c = null;
                jeoVar.d = null;
                jeoVar.e = null;
                jeoVar.k = null;
                jeoVar.a = j3;
                jeoVar.i = 6;
                jeqVar = this;
                objB = jeqVar.d(j3, z, jelVar3, jeoVar);
                j4 = j3;
                aoluVar = aoluVar2;
                if (objB != aoluVar) {
                    j5 = j4;
                    ((defpackage.dvc) objB).b(dvaVar3);
                    kgl kglVar5 = jeqVar.l;
                    notificationA = dvaVar3.a();
                    defpackage.ity ityVar5 = new defpackage.ity(j5);
                    jeoVar.b = notificationA;
                    jeoVar.a = j5;
                    jeoVar.i = 7;
                    objB = kglVar5.p(ityVar5, jeoVar);
                    if (objB != aoluVar) {
                        j6 = j5;
                        notification = notificationA;
                        itcVar = (defpackage.itc) objB;
                        if (itcVar != null) {
                            break;
                        }
                        jeqVar.d.a(snl.ad(j6), notification);
                        android.content.Context context17 = jeqVar.b;
                        aooh.c(notification);
                        snl.af(context17, notification);
                        return aojh.a;
                    }
                }
                return aoluVar;
            case 4:
                i2 = jeoVar.f;
                j2 = jeoVar.a;
                objArr3 = (java.lang.Object[]) jeoVar.e;
                objArr4 = (java.lang.Object[]) jeoVar.d;
                obj2 = jeoVar.c;
                dvaVar = jeoVar.j;
                jelVar2 = (defpackage.jel) jeoVar.b;
                aooc.af(objB);
                objArr3[0] = objB;
                string = ((android.content.Context) obj2).getString(i2, objArr4);
                str = string;
                j3 = j2;
                jelVar3 = jelVar2;
                dvaVar2 = dvaVar;
                aooh.c(str);
                dvaVar2.h(str);
                obj3 = jeqVar.b;
                abwd abwdVar6 = jelVar3.c;
                uriCx = afsq.cx(abwdVar6);
                jeoVar.b = jelVar3;
                jeoVar.j = dvaVar2;
                jeoVar.c = obj3;
                jeoVar.d = dvaVar2;
                jeoVar.e = uriCx;
                jeoVar.k = str;
                jeoVar.a = j3;
                jeoVar.i = 5;
                objB = jeqVar.b(abwdVar6, jeoVar);
                if (objB != aoluVar2) {
                    return aoluVar2;
                }
                dvaVar3 = dvaVar2;
                dvaVar4 = dvaVar3;
                android.content.Context context18 = (android.content.Context) obj3;
                snl.ae(context18, dvaVar4, str, uriCx, (android.graphics.Bitmap) objB, jelVar3.d, j3);
                str2 = jelVar3.a;
                if (str2 != null) {
                    android.content.Intent intent11 = new android.content.Intent();
                    android.content.Context context19 = jeqVar.b;
                    intent11.setComponent(new android.content.ComponentName(context19, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
                    intent11.setAction("com.android.dialer.calllog.CALL_BACK_FROM_MISSED_CALL_NOTIFICATION".concat("_".concat(str2)));
                    intent11.putExtra("android.telecom.extra.NOTIFICATION_PHONE_NUMBER", str2);
                    intent11.putExtra("notification_tag", snl.ad(j3));
                    intent11.putExtra("notification_id", 1);
                    java.lang.String string12 = context19.getString(2132019543);
                    android.app.PendingIntent pendingIntentB12 = afap.b(context19, 0, intent11, 67108864);
                    dvaVar3.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131232043), defpackage.dva.c(string12), pendingIntentB12, new android.os.Bundle()));
                    android.content.Intent intent12 = new android.content.Intent();
                    intent12.setComponent(new android.content.ComponentName(context19, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
                    intent12.setAction("com.android.dialer.calllog.SEND_SMS_FROM_MISSED_CALL_NOTIFICATION".concat("_".concat(str2)));
                    intent12.putExtra("MISSED_CALL_NUMBER", str2);
                    intent12.putExtra("notification_tag", snl.ad(j3));
                    intent12.putExtra("notification_id", 1);
                    java.lang.String string13 = context19.getString(2132019544);
                    z = false;
                    android.app.PendingIntent pendingIntentB13 = afap.b(context19, 0, intent12, 67108864);
                    dvaVar3.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131232029), defpackage.dva.c(string13), pendingIntentB13, new android.os.Bundle()));
                } else {
                    z = false;
                }
                if (jelVar3.e == null) {
                    z = true;
                }
                jeoVar.b = dvaVar3;
                jeoVar.j = null;
                jeoVar.c = null;
                jeoVar.d = null;
                jeoVar.e = null;
                jeoVar.k = null;
                jeoVar.a = j3;
                jeoVar.i = 6;
                jeqVar = this;
                objB = jeqVar.d(j3, z, jelVar3, jeoVar);
                j4 = j3;
                aoluVar = aoluVar2;
                if (objB != aoluVar) {
                    j5 = j4;
                    ((defpackage.dvc) objB).b(dvaVar3);
                    kgl kglVar6 = jeqVar.l;
                    notificationA = dvaVar3.a();
                    defpackage.ity ityVar6 = new defpackage.ity(j5);
                    jeoVar.b = notificationA;
                    jeoVar.a = j5;
                    jeoVar.i = 7;
                    objB = kglVar6.p(ityVar6, jeoVar);
                    if (objB != aoluVar) {
                        j6 = j5;
                        notification = notificationA;
                        itcVar = (defpackage.itc) objB;
                        if (itcVar != null) {
                            break;
                        }
                        jeqVar.d.a(snl.ad(j6), notification);
                        android.content.Context context110 = jeqVar.b;
                        aooh.c(notification);
                        snl.af(context110, notification);
                        return aojh.a;
                    }
                }
                return aoluVar;
            case 5:
                j3 = jeoVar.a;
                str = jeoVar.k;
                uriCx = (android.net.Uri) jeoVar.e;
                defpackage.dva dvaVar7 = (defpackage.dva) jeoVar.d;
                obj3 = jeoVar.c;
                dvaVar3 = jeoVar.j;
                jelVar3 = (defpackage.jel) jeoVar.b;
                aooc.af(objB);
                dvaVar4 = dvaVar7;
                android.content.Context context111 = (android.content.Context) obj3;
                snl.ae(context111, dvaVar4, str, uriCx, (android.graphics.Bitmap) objB, jelVar3.d, j3);
                str2 = jelVar3.a;
                if (str2 != null) {
                    android.content.Intent intent13 = new android.content.Intent();
                    android.content.Context context112 = jeqVar.b;
                    intent13.setComponent(new android.content.ComponentName(context112, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
                    intent13.setAction("com.android.dialer.calllog.CALL_BACK_FROM_MISSED_CALL_NOTIFICATION".concat("_".concat(str2)));
                    intent13.putExtra("android.telecom.extra.NOTIFICATION_PHONE_NUMBER", str2);
                    intent13.putExtra("notification_tag", snl.ad(j3));
                    intent13.putExtra("notification_id", 1);
                    java.lang.String string14 = context112.getString(2132019543);
                    android.app.PendingIntent pendingIntentB14 = afap.b(context112, 0, intent13, 67108864);
                    dvaVar3.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131232043), defpackage.dva.c(string14), pendingIntentB14, new android.os.Bundle()));
                    android.content.Intent intent14 = new android.content.Intent();
                    intent14.setComponent(new android.content.ComponentName(context112, "com.android.dialer.app.calllog.CallLogNotificationsActivity"));
                    intent14.setAction("com.android.dialer.calllog.SEND_SMS_FROM_MISSED_CALL_NOTIFICATION".concat("_".concat(str2)));
                    intent14.putExtra("MISSED_CALL_NUMBER", str2);
                    intent14.putExtra("notification_tag", snl.ad(j3));
                    intent14.putExtra("notification_id", 1);
                    java.lang.String string15 = context112.getString(2132019544);
                    z = false;
                    android.app.PendingIntent pendingIntentB15 = afap.b(context112, 0, intent14, 67108864);
                    dvaVar3.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131232029), defpackage.dva.c(string15), pendingIntentB15, new android.os.Bundle()));
                } else {
                    z = false;
                }
                if (jelVar3.e == null) {
                    z = true;
                }
                jeoVar.b = dvaVar3;
                jeoVar.j = null;
                jeoVar.c = null;
                jeoVar.d = null;
                jeoVar.e = null;
                jeoVar.k = null;
                jeoVar.a = j3;
                jeoVar.i = 6;
                jeqVar = this;
                objB = jeqVar.d(j3, z, jelVar3, jeoVar);
                j4 = j3;
                aoluVar = aoluVar2;
                if (objB != aoluVar) {
                    j5 = j4;
                    ((defpackage.dvc) objB).b(dvaVar3);
                    kgl kglVar7 = jeqVar.l;
                    notificationA = dvaVar3.a();
                    defpackage.ity ityVar7 = new defpackage.ity(j5);
                    jeoVar.b = notificationA;
                    jeoVar.a = j5;
                    jeoVar.i = 7;
                    objB = kglVar7.p(ityVar7, jeoVar);
                    if (objB != aoluVar) {
                        j6 = j5;
                        notification = notificationA;
                        itcVar = (defpackage.itc) objB;
                        if (itcVar != null) {
                            break;
                        }
                        jeqVar.d.a(snl.ad(j6), notification);
                        android.content.Context context113 = jeqVar.b;
                        aooh.c(notification);
                        snl.af(context113, notification);
                        return aojh.a;
                    }
                }
                return aoluVar;
            case 6:
                long j8 = jeoVar.a;
                defpackage.dva dvaVar8 = (defpackage.dva) jeoVar.b;
                aooc.af(objB);
                dvaVar3 = dvaVar8;
                str3 = "postMissedCallNotification";
                str4 = "com/android/dialer/beesly/impl/v2/notification/missedcall/BeeslyMissedCallNotifier";
                str5 = "BeeslyMissedCallNotifier.kt";
                j5 = j8;
                aoluVar = aoluVar2;
                ((defpackage.dvc) objB).b(dvaVar3);
                kgl kglVar8 = jeqVar.l;
                notificationA = dvaVar3.a();
                defpackage.ity ityVar8 = new defpackage.ity(j5);
                jeoVar.b = notificationA;
                jeoVar.a = j5;
                jeoVar.i = 7;
                objB = kglVar8.p(ityVar8, jeoVar);
                if (objB != aoluVar) {
                    j6 = j5;
                    notification = notificationA;
                    itcVar = (defpackage.itc) objB;
                    if (itcVar != null) {
                        break;
                    }
                    jeqVar.d.a(snl.ad(j6), notification);
                    android.content.Context context114 = jeqVar.b;
                    aooh.c(notification);
                    snl.af(context114, notification);
                    return aojh.a;
                }
                return aoluVar;
            case 7:
                j6 = jeoVar.a;
                notification = (android.app.Notification) jeoVar.b;
                aooc.af(objB);
                str3 = "postMissedCallNotification";
                str4 = "com/android/dialer/beesly/impl/v2/notification/missedcall/BeeslyMissedCallNotifier";
                str5 = "BeeslyMissedCallNotifier.kt";
                itcVar = (defpackage.itc) objB;
                if (itcVar != null) {
                    break;
                }
                jeqVar.d.a(snl.ad(j6), notification);
                android.content.Context context115 = jeqVar.b;
                aooh.c(notification);
                snl.af(context115, notification);
                return aojh.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(long j, boolean z, defpackage.jel jelVar, aoln aolnVar) {
        defpackage.jep jepVar;
        if (aolnVar instanceof defpackage.jep) {
            jepVar = (defpackage.jep) aolnVar;
            int i = jepVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jepVar.e = i - Integer.MIN_VALUE;
            } else {
                jepVar = new defpackage.jep(this, aolnVar);
            }
        } else {
            jepVar = new defpackage.jep(this, aolnVar);
        }
        java.lang.Object objH = jepVar.c;
        aolu aoluVar = aolu.a;
        int i2 = jepVar.e;
        if (i2 == 0) {
            aooc.af(objH);
            jepVar.f = jelVar;
            jepVar.a = j;
            jepVar.b = z;
            jepVar.e = 1;
            objH = h(jelVar, jepVar);
            if (objH != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objH);
            return objH;
        }
        z = jepVar.b;
        j = jepVar.a;
        jelVar = jepVar.f;
        aooc.af(objH);
        aoin aoinVar = this.g;
        java.lang.String strValueOf = java.lang.String.valueOf(objH);
        java.lang.String str = ((java.lang.Boolean) aoinVar.a()).booleanValue() ? jelVar.d : null;
        java.lang.String str2 = jelVar.a;
        wcq wcqVar = wcq.a;
        zoe zoeVarCp = aehj.cp(zjd.a.m());
        zoeVarCp.o(zjc.b);
        zoe zoeVarCq = aehj.cq(zjb.a.m());
        zoeVarCq.r(j);
        zoeVarCq.q(z);
        zoeVarCp.n(zoeVarCq.p());
        wcr wcrVar = new wcr(str2, strValueOf, str, wcqVar, zoeVarCp.m());
        wct wctVar = this.i;
        jepVar.f = null;
        jepVar.e = 2;
        java.lang.Object objA = wctVar.a(wcrVar, jepVar);
        if (objA != aoluVar) {
            return objA;
        }
        return aoluVar;
    }
}
