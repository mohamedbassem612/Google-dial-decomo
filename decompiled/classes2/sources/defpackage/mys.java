package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mys {
    private static final aimz c = aimz.i("com/android/dialer/dobby/impl/notification/missedcall/DobbyMissedCallNotifier");
    public final android.content.Context a;
    public final ssq b;
    private final aolr d;
    private final rwj e;
    private final j$.util.Optional f;
    private final defpackage.iqp g;
    private final aoin h;
    private final aoin i;
    private final ops j;
    private final wct k;
    private final zjm l;
    private final gpd m;
    private final rsr n;
    private final kaw o;
    private final ipc p;
    private final afpl q;

    public mys(android.content.Context context, aolr aolrVar, rwj rwjVar, rsr rsrVar, ssq ssqVar, aais aaisVar, kaw kawVar, ops opsVar, gpd gpdVar, zjm zjmVar, ipc ipcVar, j$.util.Optional optional, defpackage.iqp iqpVar, wct wctVar, afpl afplVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(ssqVar, "phoneNumberHelper");
        aooh.f(aaisVar, "sanitizer");
        aooh.f(opsVar, "glidePhotoManager");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(optional, "transcriptAudioFeedbackOptional");
        aooh.f(aoinVar, "enableWestworldLogging");
        aooh.f(aoinVar2, "enableMissedCallWestworldLogging");
        this.a = context;
        this.d = aolrVar;
        this.e = rwjVar;
        this.n = rsrVar;
        this.b = ssqVar;
        this.o = kawVar;
        this.j = opsVar;
        this.m = gpdVar;
        this.l = zjmVar;
        this.p = ipcVar;
        this.f = optional;
        this.g = iqpVar;
        this.k = wctVar;
        this.q = afplVar;
        this.h = aoinVar;
        this.i = aoinVar2;
    }

    private final android.app.PendingIntent e() {
        aopu[] aopuVarArr = aoou.a;
        java.lang.String strB = new aooa(com.android.dialer.calllog.missedcalls.MissedCallBroadcastReceiver_Receiver.class).b();
        if (strB == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.a;
        intent.setComponent(new android.content.ComponentName(context, strB));
        intent.setAction("com.android.dialer.calllog.ACTION_CANCEL_ALL_MISSED_CALLS");
        return afap.c(context, 0, intent, 67108864);
    }

    private final defpackage.dva f() {
        android.content.Context context = this.a;
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

    private final java.lang.Object g(defpackage.myn mynVar, aoln aolnVar) {
        j$.util.Optional optionalR = this.n.r(mynVar.b);
        abwd abwdVar = mynVar.e;
        if (abwdVar != null && (abwdVar.b & 1) != 0) {
            return abwdVar.c;
        }
        java.lang.String str = mynVar.a;
        if (str == null) {
            return optionalR.isPresent() ? (java.lang.CharSequence) optionalR.orElseThrow() : this.a.getString(2132020653);
        }
        java.lang.Object objA = a(str, aolnVar);
        return objA != aolu.a ? (java.lang.CharSequence) objA : objA;
    }

    private final android.app.PendingIntent h(int i, long j, defpackage.myn mynVar) {
        wsc wscVar = (wsc) aooh.q(this.f);
        if (i != 2 || wscVar == null) {
            return afap.b(this.a, 0, this.p.bc(1), 67108864);
        }
        android.content.Context context = this.a;
        vqf vqfVarBy = wsc.by(utu.a.m());
        vqfVarBy.z(j);
        vqfVarBy.C(7);
        vqfVarBy.A(mynVar.e);
        return afap.b(context, 0, uvd.a(context, vqfVarBy.x()), 67108864);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.String str, aoln aolnVar) {
        defpackage.myo myoVar;
        if (aolnVar instanceof defpackage.myo) {
            myoVar = (defpackage.myo) aolnVar;
            int i = myoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                myoVar.c = i - Integer.MIN_VALUE;
            } else {
                myoVar = new defpackage.myo(this, aolnVar);
            }
        } else {
            myoVar = new defpackage.myo(this, aolnVar);
        }
        java.lang.Object objAj = myoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = myoVar.c;
        if (i2 == 0) {
            aooc.af(objAj);
            aolr aolrVar = this.d;
            defpackage.kdr kdrVar = new defpackage.kdr(this, str, (aoln) null, 13);
            myoVar.c = 1;
            objAj = aoov.aj(aolrVar, kdrVar, myoVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objAj);
        }
        java.lang.String str2 = (java.lang.String) objAj;
        if (str2 != null) {
            return str2;
        }
        java.lang.String string = this.a.getString(2132020653);
        aooh.e(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(abwd abwdVar, aoln aolnVar) {
        defpackage.myp mypVar;
        if (aolnVar instanceof defpackage.myp) {
            mypVar = (defpackage.myp) aolnVar;
            int i = mypVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mypVar.c = i - Integer.MIN_VALUE;
            } else {
                mypVar = new defpackage.myp(this, aolnVar);
            }
        } else {
            mypVar = new defpackage.myp(this, aolnVar);
        }
        java.lang.Object objD = mypVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mypVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ops opsVar = this.j;
            android.content.Context context = this.a;
            ajcq ajcqVarE = opsVar.e(abwdVar, defpackage.oph.a(), context.getResources().getDimensionPixelSize(2131167223), context.getResources().getDimensionPixelSize(2131167222));
            mypVar.c = 1;
            objD = aosv.D(ajcqVarE, mypVar);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.myn mynVar, aoln aolnVar) {
        defpackage.myr myrVar;
        wcq wcqVar;
        if (aolnVar instanceof defpackage.myr) {
            myrVar = (defpackage.myr) aolnVar;
            int i = myrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                myrVar.c = i - Integer.MIN_VALUE;
            } else {
                myrVar = new defpackage.myr(this, aolnVar);
            }
        } else {
            myrVar = new defpackage.myr(this, aolnVar);
        }
        java.lang.Object obj = myrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = myrVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            wcq wcqVar2 = mynVar.g;
            if (wcqVar2 == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            myrVar.d = mynVar;
            myrVar.e = wcqVar2;
            myrVar.c = 1;
            java.lang.Object objG = g(mynVar, myrVar);
            if (objG != aoluVar) {
                wcqVar = wcqVar2;
                obj = objG;
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
            return obj;
        }
        wcq wcqVar3 = myrVar.e;
        defpackage.myn mynVar2 = myrVar.d;
        aooc.af(obj);
        wcqVar = wcqVar3;
        mynVar = mynVar2;
        zjd zjdVar = mynVar.h;
        wcr wcrVar = new wcr(mynVar.a, java.lang.String.valueOf(obj), mynVar.c, wcqVar, zjdVar);
        wct wctVar = this.k;
        myrVar.d = null;
        myrVar.e = null;
        myrVar.c = 2;
        java.lang.Object objA = wctVar.a(wcrVar, myrVar);
        if (objA != aoluVar) {
            return objA;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x018f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0236  */
    /* JADX WARN: Code duplicated, block: B:48:0x0242  */
    /* JADX WARN: Code duplicated, block: B:50:0x0246  */
    /* JADX WARN: Code duplicated, block: B:52:0x0262  */
    /* JADX WARN: Code duplicated, block: B:55:0x026d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0280  */
    /* JADX WARN: Code duplicated, block: B:60:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x02da  */
    /* JADX WARN: Code duplicated, block: B:69:0x030c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x029f, code lost:
    
        if (r5.a(r4, r7, r6) != r8) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02d4, code lost:
    
        if (r5.a(r4, r7, r6) != r8) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02d6, code lost:
    
        r4 = r11;
        r3 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r26, defpackage.myn r28, int r29, aoln r30) {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mys.d(long, myn, int, aoln):java.lang.Object");
    }
}
