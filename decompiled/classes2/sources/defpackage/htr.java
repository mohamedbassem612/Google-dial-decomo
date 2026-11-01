package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class htr implements kio {
    public static final aimz a = aimz.i("com/android/dialer/app/calllog/MissedCallNotifier");
    private final rxa A;
    private final tuz B;
    private final ops C;
    private final sqi D;
    private final zjm E;
    private final zzx F;
    private final zzx G;
    private final zzx H;
    private final ahbv I;
    private final rsr J;
    private final ipc K;
    private final ipc L;
    private final afpl M;
    public final android.content.Context b;
    public final rwi c;
    public final aonj d;
    public final aonj e;
    public final rsr f;
    public final gpd g;
    public final ipc h;
    public final defpackage.hwv i;
    private final aoin j;
    private final aoin k;
    private final aoin l;
    private final aoin m;
    private final aoin n;
    private final aoin o;
    private final aoin p;
    private final aoin q;
    private final aoss r;
    private final aolr s;
    private final rlv t;
    private final ssq u;
    private final nwu v;
    private final rwx w;
    private final defpackage.hsm x;
    private final defpackage.hsr y;
    private final zjs z;

    public htr(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6, aoin aoinVar7, aoin aoinVar8, android.content.Context context, aoss aossVar, aolr aolrVar, rlv rlvVar, gpd gpdVar, aazc aazcVar, tuz tuzVar, ipc ipcVar, ssq ssqVar, nwu nwuVar, rwi rwiVar, ops opsVar, zjm zjmVar, rwx rwxVar, rsr rsrVar, rsr rsrVar2, defpackage.hwv hwvVar, ahbv ahbvVar, sqi sqiVar, defpackage.hgz hgzVar, defpackage.hsm hsmVar, defpackage.hsr hsrVar, zzx zzxVar, zjs zjsVar, zzx zzxVar2, zzx zzxVar3, ipc ipcVar2, rxa rxaVar, ipc ipcVar3, afpl afplVar) {
        aooh.f(aoinVar, "enableMissedCallLogUpdater");
        aooh.f(aoinVar2, "enablePhoneLookupForMissedCallNotifications");
        aooh.f(aoinVar3, "enableCompanionAppMissedCallReason");
        aooh.f(aoinVar4, "enableSpamAvatarInMissedCallNotifications");
        aooh.f(aoinVar5, "enableCapSingleMissedCallNotifications");
        aooh.f(aoinVar6, "enableLikelySpamMissedCallLabel");
        aooh.f(aoinVar7, "enableWestworldLogging");
        aooh.f(aoinVar8, "enableMissedCallWestworldLogging");
        aooh.f(context, "appContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(aazcVar, "clock");
        aooh.f(ipcVar, "performancePhoneNumberUtils");
        aooh.f(ssqVar, "phoneNumberHelper");
        aooh.f(nwuVar, "meetCallController");
        aooh.f(rwiVar, "dialerNotificationManager");
        aooh.f(opsVar, "glidePhotoManager");
        aooh.f(ahbvVar, "dialerPhoneNumbers");
        aooh.f(hgzVar, "phoneLookupInfoConsolidatorFactory");
        aooh.f(zjsVar, "dialerTelecom");
        aooh.f(ipcVar2, "missedCallNotificationInhibitor");
        this.j = aoinVar;
        this.k = aoinVar2;
        this.l = aoinVar3;
        this.m = aoinVar4;
        this.n = aoinVar5;
        this.o = aoinVar6;
        this.p = aoinVar7;
        this.q = aoinVar8;
        this.b = context;
        this.r = aossVar;
        this.s = aolrVar;
        this.t = rlvVar;
        this.g = gpdVar;
        this.B = tuzVar;
        this.K = ipcVar;
        this.u = ssqVar;
        this.v = nwuVar;
        this.c = rwiVar;
        this.C = opsVar;
        this.E = zjmVar;
        this.w = rwxVar;
        this.J = rsrVar;
        this.f = rsrVar2;
        this.i = hwvVar;
        this.I = ahbvVar;
        this.D = sqiVar;
        this.x = hsmVar;
        this.y = hsrVar;
        this.H = zzxVar;
        this.z = zjsVar;
        this.F = zzxVar2;
        this.G = zzxVar3;
        this.h = ipcVar2;
        this.A = rxaVar;
        this.L = ipcVar3;
        this.M = afplVar;
        this.d = new aiuo(new defpackage.blq(this, (aoln) null, 6));
        this.e = new aiuo(new defpackage.jew(this, (aoln) null, 1));
    }

    private final defpackage.hst A(rwv rwvVar, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3 = rwvVar.i;
        if (str3 != null && str3.length() != 0) {
            return new defpackage.hst(str3, str, null, false, null, null);
        }
        if (str == null || str.length() == 0) {
            java.lang.String string = rwvVar.b;
            if (string.length() <= 0) {
                string = this.b.getResources().getString(2132020648);
                aooh.e(string, "getString(...)");
            }
            str2 = string;
        } else {
            str2 = str;
        }
        return new defpackage.hst(str2, str, null, false, null, null);
    }

    private final void B(mce mceVar) {
        this.g.i((java.lang.String) null).b(mceVar);
    }

    public static final java.lang.String s(rwv rwvVar) {
        return snl.ad(rwvVar.e);
    }

    private final android.app.PendingIntent x(android.net.Uri uri) {
        android.content.Intent intentBc = this.L.bc(1);
        intentBc.setData(uri);
        return afap.b(this.b, 0, intentBc, 201326592);
    }

    private final android.app.PendingIntent y() {
        android.content.Intent intent = new android.content.Intent();
        aopu[] aopuVarArr = aoou.a;
        java.lang.String strB = new aooa(com.android.dialer.calllog.missedcalls.MissedCallBroadcastReceiver_Receiver.class).b();
        if (strB == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        android.content.Context context = this.b;
        intent.setComponent(new android.content.ComponentName(context, strB));
        intent.setAction("com.android.dialer.calllog.ACTION_CANCEL_ALL_MISSED_CALLS");
        return afap.c(context, 0, intent, 67108864);
    }

    private final defpackage.dva z(defpackage.hss hssVar) {
        android.content.Context context = this.b;
        defpackage.dva dvaVar = new defpackage.dva(context, "phone_missed_call");
        dvaVar.o = "MissedCallGroup";
        dvaVar.n(2131231984);
        dvaVar.t = urg.c(context, 2130969018);
        dvaVar.i(2);
        dvaVar.d(16, true);
        dvaVar.d(8, true);
        dvaVar.m();
        long j = hssVar.d;
        dvaVar.r(j);
        dvaVar.h(hssVar.b);
        android.net.Uri uri = hssVar.f;
        dvaVar.g = x(uri);
        dvaVar.j(y());
        defpackage.dva dvaVar2 = new defpackage.dva(context, "phone_missed_call");
        dvaVar2.o = "MissedCallGroup";
        dvaVar2.n(2131231984);
        dvaVar2.t = urg.c(context, 2130969018);
        dvaVar2.i(2);
        dvaVar2.d(16, true);
        dvaVar2.d(8, true);
        dvaVar2.m();
        dvaVar2.r(j);
        dvaVar2.h(hssVar.a);
        dvaVar2.g(hssVar.c);
        dvaVar2.g = x(uri);
        dvaVar2.j(y());
        dvaVar2.v = dvaVar.a();
        android.graphics.Bitmap bitmap = hssVar.e;
        if (bitmap != null) {
            dvaVar2.l(bitmap);
        }
        return dvaVar2;
    }

    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.hsv hsvVar;
        zjs zjsVar;
        if (aolnVar instanceof defpackage.hsv) {
            hsvVar = (defpackage.hsv) aolnVar;
            int i = hsvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hsvVar.c = i - Integer.MIN_VALUE;
            } else {
                hsvVar = new defpackage.hsv(this, aolnVar);
            }
        } else {
            hsvVar = new defpackage.hsv(this, aolnVar);
        }
        java.lang.Object obj = hsvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hsvVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj);
            } else if (i2 == 2) {
                aooc.af(obj);
                this.B.b();
                zjsVar = this.z;
                hsvVar.c = 3;
                if (zjsVar.l(hsvVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        a.b().l("com/android/dialer/app/calllog/MissedCallNotifier", "clearAllMissedCallsNotificationAsync", 200, "MissedCallNotifier.kt").v("clearing all missed call notifications");
        if (((java.lang.Boolean) this.j.a()).booleanValue()) {
            defpackage.hsr hsrVar = this.y;
            hsvVar.c = 1;
            if (hsrVar.a(hsvVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            this.x.a();
        }
        rxa rxaVar = this.A;
        hsvVar.c = 2;
        if (rxaVar.c(hsvVar) == aoluVar) {
            return aoluVar;
        }
        this.B.b();
        zjsVar = this.z;
        hsvVar.c = 3;
        if (zjsVar.l(hsvVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object b(java.util.List list, aoln aolnVar) {
        defpackage.hsw hswVar;
        defpackage.hss hssVar;
        if (aolnVar instanceof defpackage.hsw) {
            hswVar = (defpackage.hsw) aolnVar;
            int i = hswVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hswVar.c = i - Integer.MIN_VALUE;
            } else {
                hswVar = new defpackage.hsw(this, aolnVar);
            }
        } else {
            hswVar = new defpackage.hsw(this, aolnVar);
        }
        java.lang.Object objJ = hswVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hswVar.c;
        if (i2 == 0) {
            aooc.af(objJ);
            if (list.size() == 1) {
                rwv rwvVar = (rwv) list.get(0);
                a.b().l("com/android/dialer/app/calllog/MissedCallNotifier", "createGroupNotificationBuilder", 407, "MissedCallNotifier.kt").v("1 missed call, looking up contact info");
                hswVar.c = 1;
                objJ = j(rwvVar, false, hswVar);
                if (objJ == aoluVar) {
                    return aoluVar;
                }
            } else {
                android.content.Context context = this.b;
                java.lang.CharSequence text = context.getText(2132019537);
                aooh.e(text, "getText(...)");
                java.lang.CharSequence text2 = context.getText(2132019537);
                aooh.e(text2, "getText(...)");
                java.lang.String string = context.getString(2132019536, new java.lang.Integer(list.size()));
                aooh.e(string, "getString(...)");
                hssVar = new defpackage.hss(text, text2, string, ((rwv) list.get(0)).e, (android.graphics.Bitmap) null, (android.net.Uri) null, (android.net.Uri) null, 240);
            }
            defpackage.dva dvaVarZ = z(hssVar);
            dvaVarZ.k();
            return dvaVarZ;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objJ);
        hssVar = (defpackage.hss) objJ;
        defpackage.dva dvaVarZ2 = z(hssVar);
        dvaVarZ2.k();
        return dvaVarZ2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public final java.lang.Object c(rwv rwvVar, ssg ssgVar, boolean z, aoln aolnVar) {
        defpackage.hsx hsxVar;
        java.lang.Object objAp;
        java.lang.String string;
        ssg ssgVar2;
        java.lang.String str;
        java.lang.Object obj;
        boolean z2;
        java.lang.String str2;
        java.lang.Object objI;
        java.lang.Object objBr;
        java.lang.Object objW;
        rwv rwvVar2;
        ?? r3;
        ?? r1;
        if (aolnVar instanceof defpackage.hsx) {
            hsxVar = (defpackage.hsx) aolnVar;
            int i = hsxVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                hsxVar.g = i - Integer.MIN_VALUE;
            } else {
                hsxVar = new defpackage.hsx(this, aolnVar);
            }
        } else {
            hsxVar = new defpackage.hsx(this, aolnVar);
        }
        java.lang.Object obj2 = hsxVar.e;
        aolu aoluVar = aolu.a;
        int i2 = hsxVar.g;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z3 = hsxVar.d;
                java.lang.String str3 = (java.lang.String) hsxVar.b;
                java.lang.Object obj3 = hsxVar.a;
                ssg ssgVar3 = hsxVar.i;
                rwv rwvVar3 = hsxVar.h;
                aooc.af(obj2);
                z = z3;
                rwvVar = rwvVar3;
                objI = obj2;
                objAp = obj3;
                string = str3;
                ssgVar = ssgVar3;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj4 = hsxVar.c;
                java.lang.Object obj5 = hsxVar.b;
                str = (java.lang.String) hsxVar.a;
                ssgVar2 = hsxVar.i;
                rwvVar2 = hsxVar.h;
                aooc.af(obj2);
                r3 = obj4;
                r1 = obj5;
            }
            return new defpackage.hss((java.lang.CharSequence) r1, str, (java.lang.CharSequence) r3, rwvVar2.e, (android.graphics.Bitmap) obj2, rwvVar2.a, ssgVar2.b, 128);
        }
        aooc.af(obj2);
        if (aooh.n(ssgVar.c, ssgVar.h) || aooh.n(ssgVar.c, ssgVar.g)) {
            objAp = this.K.ap(defpackage.dxt.a().d(ssgVar.c, defpackage.dxv.a));
            if (objAp == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
        } else {
            objAp = ssgVar.c;
        }
        string = this.b.getString(ssgVar.n == 1 ? 2132019541 : 2132019530);
        aooh.e(string, "getString(...)");
        java.lang.Long l = rwvVar.h;
        if (l != null) {
            long jLongValue = l.longValue();
            hsxVar.h = rwvVar;
            hsxVar.i = ssgVar;
            hsxVar.a = objAp;
            hsxVar.b = string;
            hsxVar.d = z;
            hsxVar.g = 1;
            objI = i(jLongValue, hsxVar);
            if (objI == aoluVar) {
                return aoluVar;
            }
        } else {
            ssgVar2 = ssgVar;
            str = string;
            obj = objAp;
            z2 = z;
            str2 = null;
        }
        if (z2) {
            aooh.c(obj);
            if (str2 != null) {
                objBr = a.br(str2, str, " • ");
            } else {
                objBr = str;
            }
        } else {
            aooh.c(obj);
            objBr = obj;
            obj = str;
        }
        hsxVar.h = rwvVar;
        hsxVar.i = ssgVar2;
        hsxVar.a = str;
        hsxVar.b = obj;
        hsxVar.c = objBr;
        hsxVar.g = 2;
        objW = w(ssgVar2, null, null, hsxVar);
        if (objW != aoluVar) {
            return aoluVar;
        }
        rwvVar2 = rwvVar;
        r3 = objBr;
        r1 = obj;
        obj2 = objW;
        return new defpackage.hss((java.lang.CharSequence) r1, str, (java.lang.CharSequence) r3, rwvVar2.e, (android.graphics.Bitmap) obj2, rwvVar2.a, ssgVar2.b, 128);
        str2 = (java.lang.String) objI;
        boolean z4 = z;
        ssgVar2 = ssgVar;
        str = string;
        obj = objAp;
        z2 = z4;
        if (z2) {
            aooh.c(obj);
            if (str2 != null) {
                objBr = a.br(str2, str, " • ");
            } else {
                objBr = str;
            }
        } else {
            aooh.c(obj);
            objBr = obj;
            obj = str;
        }
        hsxVar.h = rwvVar;
        hsxVar.i = ssgVar2;
        hsxVar.a = str;
        hsxVar.b = obj;
        hsxVar.c = objBr;
        hsxVar.g = 2;
        objW = w(ssgVar2, null, null, hsxVar);
        if (objW != aoluVar) {
            return aoluVar;
        }
        rwvVar2 = rwvVar;
        r3 = objBr;
        r1 = obj;
        obj2 = objW;
        return new defpackage.hss((java.lang.CharSequence) r1, str, (java.lang.CharSequence) r3, rwvVar2.e, (android.graphics.Bitmap) obj2, rwvVar2.a, ssgVar2.b, 128);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v2 */
    public final java.lang.Object d(rwv rwvVar, boolean z, aoln aolnVar) {
        defpackage.hsy hsyVar;
        boolean z2;
        java.lang.Object objL;
        defpackage.hst hstVar;
        java.lang.CharSequence charSequence;
        boolean z3;
        java.lang.String str;
        java.lang.String str2;
        rwv rwvVar2;
        java.lang.Object obj;
        java.lang.String str3;
        java.lang.Object obj2;
        java.lang.String strBr;
        ?? r11;
        ?? r13;
        java.util.List list;
        rwv rwvVar3 = rwvVar;
        if (aolnVar instanceof defpackage.hsy) {
            hsyVar = (defpackage.hsy) aolnVar;
            int i = hsyVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                hsyVar.e = i - Integer.MIN_VALUE;
            } else {
                hsyVar = new defpackage.hsy(this, aolnVar);
            }
        } else {
            hsyVar = new defpackage.hsy(this, aolnVar);
        }
        java.lang.Object obj3 = hsyVar.c;
        aolu aoluVar = aolu.a;
        int i2 = hsyVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z4 = hsyVar.b;
                rwv rwvVar4 = hsyVar.f;
                aooc.af(obj3);
                z2 = z4;
                rwvVar3 = rwvVar4;
                objL = obj3;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = hsyVar.b;
                str3 = hsyVar.h;
                java.lang.Object obj4 = hsyVar.a;
                hstVar = hsyVar.g;
                rwvVar2 = hsyVar.f;
                aooc.af(obj3);
                obj = obj4;
            }
            str = (java.lang.String) obj3;
            str2 = str3;
            rwvVar3 = rwvVar2;
            obj2 = obj;
            if (str != null) {
                obj2 = charSequence;
                strBr = a.br(str, str2, " • ");
            } else {
                obj2 = charSequence;
                strBr = str2;
            }
            if (z3) {
                r11 = obj2;
            } else {
                r11 = str2;
            }
            if (true == z3) {
                r13 = strBr;
            } else {
                r13 = obj2;
            }
            android.graphics.Bitmap bitmap = hstVar.e;
            long j = rwvVar3.e;
            android.net.Uri uri = rwvVar3.a;
            android.net.Uri uri2 = hstVar.c;
            defpackage.hts htsVar = hstVar.f;
            list = htsVar != null ? htsVar.a : null;
            if (list == null) {
                list = aokc.a;
            }
            return new defpackage.hss((java.lang.CharSequence) r11, str2, (java.lang.CharSequence) r13, j, bitmap, uri, uri2, list);
        }
        aooc.af(obj3);
        hsyVar.f = rwvVar3;
        z2 = z;
        hsyVar.b = z2;
        hsyVar.e = 1;
        objL = l(rwvVar3, hsyVar);
        if (objL == aoluVar) {
            return aoluVar;
        }
        hstVar = (defpackage.hst) objL;
        java.lang.String str4 = hstVar.a;
        if (aooh.n(str4, hstVar.b) || aooh.n(str4, rwvVar3.b)) {
            charSequence = str4;
            java.lang.CharSequence charSequenceAp = this.K.ap(defpackage.dxt.a().d(str4, defpackage.dxv.a));
            charSequence = charSequenceAp;
            if (charSequenceAp == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
        }
        charSequence = str4;
        java.lang.String string = this.b.getString(true != hstVar.d ? 2132019530 : 2132019541);
        aooh.e(string, "getString(...)");
        defpackage.hts htsVar2 = hstVar.f;
        java.lang.Long l = rwvVar3.h;
        if (l != null) {
            long jLongValue = l.longValue();
            hsyVar.f = rwvVar3;
            hsyVar.g = hstVar;
            hsyVar.a = charSequence;
            hsyVar.h = string;
            hsyVar.b = z2;
            hsyVar.e = 2;
            java.lang.Object objI = i(jLongValue, hsyVar);
            if (objI == aoluVar) {
                return aoluVar;
            }
            boolean z5 = z2;
            obj3 = objI;
            z3 = z5;
            rwvVar2 = rwvVar3;
            obj = charSequence;
            str3 = string;
            str = (java.lang.String) obj3;
            str2 = str3;
            rwvVar3 = rwvVar2;
            obj2 = obj;
        } else {
            z3 = z2;
            str = null;
            str2 = string;
        }
        if (str != null) {
            obj2 = charSequence;
            strBr = a.br(str, str2, " • ");
        } else {
            obj2 = charSequence;
            strBr = str2;
        }
        if (z3) {
            r11 = obj2;
        } else {
            r11 = str2;
        }
        if (true == z3) {
            r13 = strBr;
        } else {
            r13 = obj2;
        }
        android.graphics.Bitmap bitmap2 = hstVar.e;
        long j2 = rwvVar3.e;
        android.net.Uri uri3 = rwvVar3.a;
        android.net.Uri uri4 = hstVar.c;
        defpackage.hts htsVar3 = hstVar.f;
        if (htsVar3 != null) {
        }
        if (list == null) {
            list = aokc.a;
        }
        return new defpackage.hss((java.lang.CharSequence) r11, str2, (java.lang.CharSequence) r13, j2, bitmap2, uri3, uri4, list);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final java.lang.Object e(rwv rwvVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.hsz hszVar;
        defpackage.hss hssVar;
        defpackage.dva dvaVarZ;
        android.content.Context context;
        android.os.StrictMode.ThreadPolicy threadPolicy;
        android.os.StrictMode.ThreadPolicy threadPolicy2;
        java.lang.Object next;
        java.lang.String str;
        rwv rwvVar2 = rwvVar;
        if (aolnVar instanceof defpackage.hsz) {
            hszVar = (defpackage.hsz) aolnVar;
            int i = hszVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hszVar.c = i - Integer.MIN_VALUE;
            } else {
                hszVar = new defpackage.hsz(this, aolnVar);
            }
        } else {
            hszVar = new defpackage.hsz(this, aolnVar);
        }
        java.lang.Object objJ = hszVar.a;
        android.app.Notification notificationA = aolu.a;
        int i2 = hszVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objJ);
                hszVar.d = rwvVar2;
                hszVar.c = 1;
                objJ = j(rwvVar2, true, hszVar);
                if (objJ != notificationA) {
                }
                return notificationA;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rwvVar2 = hszVar.d;
            aooc.af(objJ);
            java.util.List list = hssVar.h;
            if (this.H.m()) {
                threadPolicy2 = threadPolicy;
            } else {
                java.lang.String str2 = rwvVar2.b;
                if (str2.length() <= 0 || aooh.n(str2, context.getString(2132018862))) {
                    threadPolicy2 = threadPolicy;
                } else {
                    java.lang.String string = context.getString(2132019532);
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.app.calllog.CallLogNotificationsActivity.class);
                    intent.setAction("com.android.dialer.calllog.CALL_BACK_FROM_MISSED_CALL_NOTIFICATION");
                    intent.putExtra("android.telecom.extra.NOTIFICATION_PHONE_NUMBER", str2);
                    intent.putExtra("notification_tag", s(rwvVar2));
                    intent.putExtra("notification_id", 1);
                    android.net.Uri uri = rwvVar2.a;
                    intent.setData(uri);
                    android.app.PendingIntent pendingIntentB = afap.b(context, 0, intent, 201326592);
                    zzx zzxVar = this.F;
                    java.util.Set setKeySet = zzxVar.k().keySet();
                    rwv rwvVar3 = rwvVar2;
                    aooh.e(setKeySet, "<get-keys>(...)");
                    java.util.Iterator it = setKeySet.iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            int i3 = ((ted) next).d;
                            while (true) {
                                java.lang.Object next2 = it.next();
                                threadPolicy2 = threadPolicy;
                                try {
                                    int i4 = ((ted) next2).d;
                                    if (i3 > i4) {
                                        i3 = i4;
                                        next = next2;
                                    }
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    threadPolicy = threadPolicy2;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    android.os.StrictMode.setThreadPolicy(threadPolicy2);
                                    throw th;
                                }
                            }
                        } else {
                            threadPolicy2 = threadPolicy;
                        }
                    } else {
                        threadPolicy2 = threadPolicy;
                        next = null;
                    }
                    ted tedVar = (ted) next;
                    if (tedVar != null) {
                        str = "Required value was null.";
                        a.b().l("com/android/dialer/app/calllog/MissedCallNotifier", "createCallBackPendingIntent", 888, "MissedCallNotifier.kt").v("apply OEM modification on call log notification intent");
                        rsr rsrVar = (rsr) wsc.D(zzxVar, tedVar);
                        pendingIntentB = rsrVar != null ? rsrVar.n(pendingIntentB, (android.content.Intent) new defpackage.hll(intent, 4).a(), 0) : null;
                        if (pendingIntentB == null) {
                            throw new java.lang.IllegalStateException(str);
                        }
                    } else {
                        if (pendingIntentB == null) {
                            throw new java.lang.IllegalStateException("Required value was null.");
                        }
                        str = "Required value was null.";
                    }
                    dvaVarZ.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131231060), defpackage.dva.c(string), pendingIntentB, new android.os.Bundle()));
                    if (!this.u.f(str2)) {
                        java.lang.String string2 = context.getString(2132019534);
                        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.app.calllog.CallLogNotificationsActivity.class);
                        intent2.setAction("com.android.dialer.calllog.SEND_SMS_FROM_MISSED_CALL_NOTIFICATION");
                        intent2.putExtra("MISSED_CALL_NUMBER", str2);
                        intent2.putExtra("notification_tag", s(rwvVar3));
                        intent2.putExtra("notification_id", 1);
                        intent2.setData(uri);
                        android.app.PendingIntent pendingIntentB2 = afap.b(context, 0, intent2, 201326592);
                        if (pendingIntentB2 == null) {
                            throw new java.lang.IllegalStateException(str);
                        }
                        dvaVarZ.f(defpackage.dux.e(androidx.core.graphics.drawable.IconCompat.h(null, "", 2131231435), defpackage.dva.c(string2), pendingIntentB2, new android.os.Bundle()));
                    }
                }
            }
            notificationA = dvaVarZ.a();
            aooh.e(notificationA, "build(...)");
            android.os.StrictMode.setThreadPolicy(threadPolicy2);
            return notificationA;
        } catch (java.lang.Throwable th2) {
            th = th2;
            threadPolicy2 = threadPolicy;
        }
        hssVar = (defpackage.hss) objJ;
        dvaVarZ = z(hssVar);
        context = this.b;
        snl.ae(context, dvaVarZ, hssVar.a, hssVar.g, hssVar.e, hssVar.c, hssVar.d);
        threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(java.util.List list, aonn aonnVar, aoln aolnVar) {
        defpackage.hta htaVar;
        if (aolnVar instanceof defpackage.hta) {
            htaVar = (defpackage.hta) aolnVar;
            int i = htaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                htaVar.c = i - Integer.MIN_VALUE;
            } else {
                htaVar = new defpackage.hta(this, aolnVar);
            }
        } else {
            htaVar = new defpackage.hta(this, aolnVar);
        }
        java.lang.Object objV = htaVar.a;
        java.util.ArrayList arrayList = aolu.a;
        int i2 = htaVar.c;
        if (i2 == 0) {
            aooc.af(objV);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(aoov.am(this.r, 0, new defpackage.htb(it.next(), aonnVar, (aoln) null, 0), 3));
            }
            htaVar.c = 1;
            objV = aooh.v(arrayList2, htaVar);
            if (objV != arrayList) {
            }
            return arrayList;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objV);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : (java.lang.Iterable) objV) {
            if (((java.lang.Boolean) ((aoiu) obj).b).booleanValue()) {
                arrayList3.add(obj);
            }
        }
        arrayList = new java.util.ArrayList(ajsz.bl(arrayList3, 10));
        java.util.Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList.add(((aoiu) it2.next()).a);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(rwv rwvVar, aoln aolnVar) {
        defpackage.htc htcVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object objA;
        ssg ssgVar;
        ssq ssqVar;
        java.lang.String str3;
        java.lang.Object objAj;
        rwv rwvVar2;
        java.lang.String string;
        ssg ssgVar2;
        ssg ssgVar3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        if (aolnVar instanceof defpackage.htc) {
            htcVar = (defpackage.htc) aolnVar;
            int i = htcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                htcVar.c = i - Integer.MIN_VALUE;
            } else {
                htcVar = new defpackage.htc(this, aolnVar);
            }
        } else {
            htcVar = new defpackage.htc(this, aolnVar);
        }
        java.lang.Object obj = htcVar.a;
        aolu aoluVar = aolu.a;
        int i2 = htcVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.String str7 = htcVar.e;
                rwv rwvVar3 = htcVar.d;
                aooc.af(obj);
                str = str7;
                rwvVar = rwvVar3;
                objA = obj;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ssg ssgVar4 = htcVar.f;
                java.lang.String str8 = htcVar.e;
                rwvVar2 = htcVar.d;
                aooc.af(obj);
                ssgVar2 = ssgVar4;
                string = str8;
            }
            ssgVar3 = (ssg) obj;
            if (ssgVar3 == null && (str6 = ssgVar3.c) != null && str6.length() != 0) {
                return ssgVar3;
            }
            str4 = rwvVar2.i;
            if (str4 == null && str4.length() != 0) {
                ssgVar2.c = str4;
                return ssgVar2;
            }
            str5 = ssgVar2.h;
            if (str5 == null && str5.length() != 0) {
                string = ssgVar2.h;
            } else if (string.length() <= 0) {
                string = this.b.getResources().getString(2132020648);
            }
            ssgVar2.c = string;
            return ssgVar2;
        }
        aooc.af(obj);
        str = rwvVar.b;
        str2 = rwvVar.d;
        if (str2 == null) {
            aonj aonjVar = this.d;
            htcVar.d = rwvVar;
            htcVar.e = str;
            htcVar.c = 1;
            objA = aonjVar.a(htcVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        }
        ssgVar = new ssg();
        ssgVar.g = str;
        ssqVar = this.u;
        ssgVar.h = ssqVar.g(str, str2);
        ssgVar.i = android.telephony.PhoneNumberUtils.formatNumberToE164(str, str2);
        j$.util.Optional optionalR = this.J.r(rwvVar.c);
        aooh.e(optionalR, "getNameForPresentation(...)");
        str3 = (java.lang.String) aooh.q(optionalR);
        if (str3 != null) {
            ssgVar.c = str3;
        } else {
            if (ssqVar.d(str)) {
                aolr aolrVar = this.s;
                defpackage.htd htdVar = new defpackage.htd(this, str, str2, null);
                htcVar.d = rwvVar;
                htcVar.e = str;
                htcVar.f = ssgVar;
                htcVar.c = 2;
                objAj = aoov.aj(aolrVar, htdVar, htcVar);
                if (objAj != aoluVar) {
                    return aoluVar;
                }
                rwvVar2 = rwvVar;
                string = str;
                obj = objAj;
                ssgVar2 = ssgVar;
                ssgVar3 = (ssg) obj;
                if (ssgVar3 == null) {
                }
                str4 = rwvVar2.i;
                if (str4 == null) {
                }
                str5 = ssgVar2.h;
                if (str5 == null) {
                    if (string.length() <= 0) {
                        string = this.b.getResources().getString(2132020648);
                    }
                } else if (string.length() <= 0) {
                    string = this.b.getResources().getString(2132020648);
                }
                ssgVar2.c = string;
                return ssgVar2;
            }
            ssgVar.c = this.b.getResources().getString(2132020648);
        }
        return ssgVar;
        str2 = (java.lang.String) objA;
        ssgVar = new ssg();
        ssgVar.g = str;
        ssqVar = this.u;
        ssgVar.h = ssqVar.g(str, str2);
        ssgVar.i = android.telephony.PhoneNumberUtils.formatNumberToE164(str, str2);
        j$.util.Optional optionalR2 = this.J.r(rwvVar.c);
        aooh.e(optionalR2, "getNameForPresentation(...)");
        str3 = (java.lang.String) aooh.q(optionalR2);
        if (str3 != null) {
            ssgVar.c = str3;
        } else {
            if (ssqVar.d(str)) {
                aolr aolrVar2 = this.s;
                defpackage.htd htdVar2 = new defpackage.htd(this, str, str2, null);
                htcVar.d = rwvVar;
                htcVar.e = str;
                htcVar.f = ssgVar;
                htcVar.c = 2;
                objAj = aoov.aj(aolrVar2, htdVar2, htcVar);
                if (objAj != aoluVar) {
                    return aoluVar;
                }
                rwvVar2 = rwvVar;
                string = str;
                obj = objAj;
                ssgVar2 = ssgVar;
                ssgVar3 = (ssg) obj;
                if (ssgVar3 == null) {
                }
                str4 = rwvVar2.i;
                if (str4 == null) {
                }
                str5 = ssgVar2.h;
                if (str5 == null) {
                    if (string.length() <= 0) {
                        string = this.b.getResources().getString(2132020648);
                    }
                } else if (string.length() <= 0) {
                    string = this.b.getResources().getString(2132020648);
                }
                ssgVar2.c = string;
                return ssgVar2;
            }
            ssgVar.c = this.b.getResources().getString(2132020648);
        }
        return ssgVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005c A[PHI: r8 r9 r10 r11
      0x005c: PHI (r8v2 ??) = (r8v1 ??), (r8v3 ??) binds: [B:14:0x0037, B:23:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r9v2 rwv) = (r9v1 rwv), (r9v4 rwv) binds: [B:14:0x0037, B:23:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r10v2 java.lang.String) = (r10v1 java.lang.String), (r10v3 java.lang.String) binds: [B:14:0x0037, B:23:0x0091] A[DONT_GENERATE, DONT_INLINE]
      0x005c: PHI (r11v8 sql) = (r11v7 sql), (r11v10 sql) binds: [B:14:0x0037, B:23:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091 A[DONT_INVERT, PHI: r4 r8 r9 r10 r11
      0x0091: PHI (r4v4 hts) = (r4v2 hts), (r4v6 hts) binds: [B:18:0x0071, B:22:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r8v3 ??) = (r8v9 ??), (r8v10 ??) binds: [B:18:0x0071, B:22:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r9v4 rwv) = (r9v2 rwv), (r9v6 rwv) binds: [B:18:0x0071, B:22:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r10v3 java.lang.String) = (r10v2 java.lang.String), (r10v4 java.lang.String) binds: [B:18:0x0071, B:22:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r11v10 sql) = (r11v8 sql), (r11v12 sql) binds: [B:18:0x0071, B:22:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0071 -> B:23:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0088 -> B:22:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h(rwv r8, java.lang.String r9, sql r10, aoln r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.htf
            if (r0 == 0) goto L13
            r0 = r11
            htf r0 = (defpackage.htf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            htf r0 = new htf
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.b
            aolu r1 = aolu.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r8 = r0.a
            sql r9 = r0.g
            java.lang.String r10 = r0.f
            rwv r2 = r0.e
            aooc.af(r11)
            goto L8c
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            aooc.af(r11)
            zzx r11 = r7.G
            aigf r11 = r11.k()
            java.util.Set r11 = r11.keySet()
            java.lang.String r2 = "<get-keys>(...)"
            aooh.e(r11, r2)
            hte r2 = new hte
            r4 = 0
            r2.<init>(r4)
            java.util.List r11 = ajsz.bX(r11, r2)
            java.util.Iterator r11 = r11.iterator()
            r6 = r9
            r9 = r8
            r8 = r11
            r11 = r10
            r10 = r6
        L5c:
            boolean r2 = r8.hasNext()
            r4 = 0
            if (r2 == 0) goto L93
            java.lang.Object r2 = r8.next()
            htv r2 = (defpackage.htv) r2
            zzx r5 = r7.G
            java.lang.Object r2 = wsc.D(r5, r2)
            htu r2 = (defpackage.htu) r2
            if (r2 == 0) goto L91
            htt r4 = new htt
            r4.<init>(r9, r10, r11)
            r0.e = r9
            r0.f = r10
            r0.g = r11
            r0.a = r8
            r0.d = r3
            java.lang.Object r2 = r2.a()
            if (r2 == r1) goto L94
            r6 = r2
            r2 = r9
            r9 = r11
            r11 = r6
        L8c:
            r4 = r11
            hts r4 = (defpackage.hts) r4
            r11 = r9
            r9 = r2
        L91:
            if (r4 == 0) goto L5c
        L93:
            r1 = r4
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htr.h(rwv, java.lang.String, sql, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(long j, aoln aolnVar) {
        defpackage.htg htgVar;
        if (aolnVar instanceof defpackage.htg) {
            htgVar = (defpackage.htg) aolnVar;
            int i = htgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                htgVar.c = i - Integer.MIN_VALUE;
            } else {
                htgVar = new defpackage.htg(this, aolnVar);
            }
        } else {
            htgVar = new defpackage.htg(this, aolnVar);
        }
        java.lang.Object objR = htgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = htgVar.c;
        if (i2 == 0) {
            aooc.af(objR);
            a.b().l("com/android/dialer/app/calllog/MissedCallNotifier", "getMissedReasonMessage", 991, "MissedCallNotifier.kt").x("Missed reason: %x", j);
            htgVar.c = 1;
            objR = r(j, htgVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objR);
        }
        int iOrdinal = ((amqs) objR).ordinal();
        if (iOrdinal == 1) {
            return this.b.getString(2132019538);
        }
        if (iOrdinal == 2) {
            return this.b.getString(2132019540);
        }
        if (iOrdinal != 3) {
            return null;
        }
        return this.b.getString(2132019539);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(rwv rwvVar, boolean z, aoln aolnVar) {
        defpackage.hth hthVar;
        if (aolnVar instanceof defpackage.hth) {
            hthVar = (defpackage.hth) aolnVar;
            int i = hthVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hthVar.d = i - Integer.MIN_VALUE;
            } else {
                hthVar = new defpackage.hth(this, aolnVar);
            }
        } else {
            hthVar = new defpackage.hth(this, aolnVar);
        }
        java.lang.Object objG = hthVar.b;
        aolu aoluVar = aolu.a;
        int i2 = hthVar.d;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    z = hthVar.a;
                    rwvVar = hthVar.e;
                    aooc.af(objG);
                } else if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            aooc.af(objG);
            return objG;
        }
        aooc.af(objG);
        if (((java.lang.Boolean) this.k.a()).booleanValue()) {
            hthVar.d = 1;
            java.lang.Object objD = d(rwvVar, z, hthVar);
            if (objD != aoluVar) {
                return objD;
            }
        } else {
            hthVar.e = rwvVar;
            hthVar.a = z;
            hthVar.d = 2;
            objG = g(rwvVar, hthVar);
            if (objG != aoluVar) {
            }
        }
        return aoluVar;
        hthVar.e = null;
        hthVar.d = 3;
        java.lang.Object objC = c(rwvVar, (ssg) objG, z, hthVar);
        if (objC != aoluVar) {
            return objC;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(rwv rwvVar, aoln aolnVar) {
        defpackage.htj htjVar;
        rwv rwvVar2;
        android.telecom.PhoneAccountHandle phoneAccountHandle;
        if (aolnVar instanceof defpackage.htj) {
            htjVar = (defpackage.htj) aolnVar;
            int i = htjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                htjVar.c = i - Integer.MIN_VALUE;
            } else {
                htjVar = new defpackage.htj(this, aolnVar);
            }
        } else {
            htjVar = new defpackage.htj(this, aolnVar);
        }
        java.lang.Object objP = htjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = htjVar.c;
        if (i2 == 0) {
            aooc.af(objP);
            java.lang.String str = rwvVar.f;
            if (str == null) {
                return java.lang.Boolean.FALSE;
            }
            java.lang.String str2 = rwvVar.g;
            if (str2 == null) {
                return java.lang.Boolean.FALSE;
            }
            android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(str);
            if (componentNameUnflattenFromString == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            android.telecom.PhoneAccountHandle phoneAccountHandle2 = new android.telecom.PhoneAccountHandle(componentNameUnflattenFromString, str2);
            zjs zjsVar = this.z;
            htjVar.d = rwvVar;
            htjVar.e = phoneAccountHandle2;
            htjVar.c = 1;
            objP = zjsVar.p(phoneAccountHandle2, htjVar);
            if (objP == aoluVar) {
                return aoluVar;
            }
            rwvVar2 = rwvVar;
            phoneAccountHandle = phoneAccountHandle2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            phoneAccountHandle = htjVar.e;
            rwvVar2 = htjVar.d;
            aooc.af(objP);
        }
        android.telecom.PhoneAccount phoneAccount = (android.telecom.PhoneAccount) objP;
        if (phoneAccount == null) {
            return java.lang.Boolean.FALSE;
        }
        if (this.v.m(phoneAccountHandle.getComponentName().flattenToString(), phoneAccountHandle.getId())) {
            return java.lang.Boolean.TRUE;
        }
        if (!phoneAccount.hasCapabilities(2048)) {
            return java.lang.Boolean.FALSE;
        }
        a.b().l("com/android/dialer/app/calllog/MissedCallNotifier", "isSelfManagedCall", 300, "MissedCallNotifier.kt").y("ignoring self-managed call %s", rwvVar2.a);
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:32:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:38:0x010b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0128  */
    /* JADX WARN: Code duplicated, block: B:42:0x014d  */
    /* JADX WARN: Code duplicated, block: B:48:0x018d  */
    /* JADX WARN: Code duplicated, block: B:50:0x019c  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x0209  */
    /* JADX WARN: Code duplicated, block: B:67:0x0213  */
    /* JADX WARN: Code duplicated, block: B:70:0x022b  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object l(rwv rwvVar, aoln aolnVar) {
        defpackage.htk htkVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object objA;
        ssq ssqVar;
        java.lang.String strG;
        java.lang.String str3;
        rwv rwvVar2;
        java.lang.String str4;
        defpackage.hst hstVar;
        sqi sqiVar;
        defpackage.hkd hkdVar;
        ruc rucVar;
        aenj aenjVar;
        ajcq ajcqVarA;
        java.lang.String str5;
        java.lang.String str6;
        sql sqlVar;
        defpackage.hts htsVar;
        sql sqlVar2;
        java.lang.String str7;
        java.lang.String strH;
        defpackage.hst hstVar2;
        java.lang.String strG2;
        android.net.Uri uri;
        defpackage.hst hstVar3;
        defpackage.hst hstVarA;
        aoin aoinVar;
        defpackage.hst hstVar4;
        rwv rwvVar3 = rwvVar;
        if (aolnVar instanceof defpackage.htk) {
            htkVar = (defpackage.htk) aolnVar;
            int i = htkVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                htkVar.e = i - Integer.MIN_VALUE;
            } else {
                htkVar = new defpackage.htk(this, aolnVar);
            }
        } else {
            htkVar = new defpackage.htk(this, aolnVar);
        }
        java.lang.Object objD = htkVar.c;
        aolu aoluVar = aolu.a;
        switch (htkVar.e) {
            case 0:
                aooc.af(objD);
                str = rwvVar3.b;
                str2 = rwvVar3.d;
                if (str2 == null) {
                    aonj aonjVar = this.d;
                    htkVar.a = rwvVar3;
                    htkVar.f = str;
                    htkVar.e = 1;
                    objA = aonjVar.a(htkVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    str2 = (java.lang.String) objA;
                }
                ssqVar = this.u;
                rsr rsrVar = this.J;
                strG = ssqVar.g(str, str2);
                j$.util.Optional optionalR = rsrVar.r(rwvVar3.c);
                aooh.e(optionalR, "getNameForPresentation(...)");
                str3 = (java.lang.String) aooh.q(optionalR);
                if (str3 != null) {
                    hstVar = new defpackage.hst(str3, strG, null, false, null, null);
                } else {
                    if (ssqVar.d(str)) {
                        if (str.length() == 0) {
                            return A(rwvVar3, strG);
                        }
                        ajcq ajcqVarV = this.I.v(str, str2);
                        htkVar.a = rwvVar3;
                        htkVar.f = str2;
                        htkVar.b = strG;
                        htkVar.e = 2;
                        objD = aosv.D(ajcqVarV, htkVar);
                        if (objD != aoluVar) {
                            return aoluVar;
                        }
                        rwvVar2 = rwvVar3;
                        str4 = strG;
                        sqiVar = this.D;
                        hkdVar = (defpackage.hkd) objD;
                        rucVar = sqiVar.f;
                        aenjVar = sqi.b;
                        rucVar.j(aenjVar);
                        if (aa$.ExternalSyntheticApiModelOutline1.m((android.os.UserManager) sqiVar.d.getSystemService(android.os.UserManager.class))) {
                            ajcqVarA = sqiVar.a(sqiVar.i.o(sqiVar.h.e(), new phd(sqiVar, hkdVar, 13, (byte[]) null)));
                            sqiVar.c(ajcqVarA, aenjVar);
                        } else {
                            sqi.a.b().l("com/android/dialer/phonelookup/composite/CompositePhoneLookup", "lookup", 165, "CompositePhoneLookup.java").v("user is not unlocked");
                            rucVar.m(aenjVar);
                            ajcqVarA = aiql.z(spn.a);
                        }
                        htkVar.a = rwvVar2;
                        htkVar.f = str2;
                        htkVar.b = str4;
                        htkVar.e = 3;
                        objD = aosv.D(ajcqVarA, htkVar);
                        if (objD == aoluVar) {
                            return aoluVar;
                        }
                        str5 = str2;
                        str6 = str4;
                        sqlVar = new sql((spn) objD);
                        if (((java.lang.Boolean) this.o.a()).booleanValue()) {
                            htkVar.a = rwvVar2;
                            htkVar.f = str6;
                            htkVar.b = sqlVar;
                            htkVar.e = 4;
                            objD = h(rwvVar2, str5, sqlVar, htkVar);
                            if (objD != aoluVar) {
                                return aoluVar;
                            }
                            sqlVar2 = sqlVar;
                            htsVar = (defpackage.hts) objD;
                        } else {
                            htsVar = null;
                            sqlVar2 = sqlVar;
                        }
                        str7 = str6;
                        strH = sqlVar2.h();
                        aooh.e(strH, "getName(...)");
                        if (strH.length() == 0) {
                            hstVarA = defpackage.hst.a(A(rwvVar2, str7), null, htsVar, 31);
                            udj udjVarC = sqlVar2.c();
                            aoinVar = this.m;
                            udj udjVar = udj.c;
                            if (((java.lang.Boolean) aoinVar.a()).booleanValue() || udjVarC != udjVar) {
                                return hstVarA;
                            }
                            htkVar.a = hstVarA;
                            htkVar.f = null;
                            htkVar.b = null;
                            htkVar.e = 5;
                            java.lang.Object objW = w(null, sqlVar2, hstVarA, htkVar);
                            if (objW == aoluVar) {
                                return aoluVar;
                            }
                            objD = objW;
                            hstVar4 = hstVarA;
                            return defpackage.hst.a(hstVar4, (android.graphics.Bitmap) objD, null, 47);
                        }
                        java.lang.String strH2 = sqlVar2.h();
                        aooh.e(strH2, "getName(...)");
                        strG2 = sqlVar2.g();
                        aooh.e(strG2, "getLookupUri(...)");
                        if (strG2.length() > 0) {
                            uri = android.net.Uri.parse(sqlVar2.g());
                        } else {
                            uri = null;
                        }
                        hstVar2 = new defpackage.hst(strH2, str7, uri, sqlVar2.s(), null, htsVar);
                        htkVar.a = hstVar2;
                        htkVar.f = null;
                        htkVar.b = null;
                        htkVar.e = 6;
                        objD = w(null, sqlVar2, hstVar2, htkVar);
                        if (objD == aoluVar) {
                            return aoluVar;
                        }
                        hstVar3 = hstVar2;
                        return defpackage.hst.a(hstVar3, (android.graphics.Bitmap) objD, null, 47);
                    }
                    java.lang.String string = this.b.getResources().getString(2132020648);
                    aooh.e(string, "getString(...)");
                    hstVar = new defpackage.hst(string, strG, null, false, null, null);
                }
                return hstVar;
            case 1:
                java.lang.String str8 = htkVar.f;
                rwv rwvVar4 = (rwv) htkVar.a;
                aooc.af(objD);
                str = str8;
                rwvVar3 = rwvVar4;
                objA = objD;
                str2 = (java.lang.String) objA;
                ssqVar = this.u;
                rsr rsrVar2 = this.J;
                strG = ssqVar.g(str, str2);
                j$.util.Optional optionalR2 = rsrVar2.r(rwvVar3.c);
                aooh.e(optionalR2, "getNameForPresentation(...)");
                str3 = (java.lang.String) aooh.q(optionalR2);
                if (str3 != null) {
                    hstVar = new defpackage.hst(str3, strG, null, false, null, null);
                } else {
                    if (ssqVar.d(str)) {
                        if (str.length() == 0) {
                            return A(rwvVar3, strG);
                        }
                        ajcq ajcqVarV2 = this.I.v(str, str2);
                        htkVar.a = rwvVar3;
                        htkVar.f = str2;
                        htkVar.b = strG;
                        htkVar.e = 2;
                        objD = aosv.D(ajcqVarV2, htkVar);
                        if (objD != aoluVar) {
                            return aoluVar;
                        }
                        rwvVar2 = rwvVar3;
                        str4 = strG;
                        sqiVar = this.D;
                        hkdVar = (defpackage.hkd) objD;
                        rucVar = sqiVar.f;
                        aenjVar = sqi.b;
                        rucVar.j(aenjVar);
                        if (aa$.ExternalSyntheticApiModelOutline1.m((android.os.UserManager) sqiVar.d.getSystemService(android.os.UserManager.class))) {
                            sqi.a.b().l("com/android/dialer/phonelookup/composite/CompositePhoneLookup", "lookup", 165, "CompositePhoneLookup.java").v("user is not unlocked");
                            rucVar.m(aenjVar);
                            ajcqVarA = aiql.z(spn.a);
                        } else {
                            ajcqVarA = sqiVar.a(sqiVar.i.o(sqiVar.h.e(), new phd(sqiVar, hkdVar, 13, (byte[]) null)));
                            sqiVar.c(ajcqVarA, aenjVar);
                        }
                        htkVar.a = rwvVar2;
                        htkVar.f = str2;
                        htkVar.b = str4;
                        htkVar.e = 3;
                        objD = aosv.D(ajcqVarA, htkVar);
                        if (objD == aoluVar) {
                            return aoluVar;
                        }
                        str5 = str2;
                        str6 = str4;
                        sqlVar = new sql((spn) objD);
                        if (((java.lang.Boolean) this.o.a()).booleanValue()) {
                            htkVar.a = rwvVar2;
                            htkVar.f = str6;
                            htkVar.b = sqlVar;
                            htkVar.e = 4;
                            objD = h(rwvVar2, str5, sqlVar, htkVar);
                            if (objD != aoluVar) {
                                return aoluVar;
                            }
                            sqlVar2 = sqlVar;
                            htsVar = (defpackage.hts) objD;
                        } else {
                            htsVar = null;
                            sqlVar2 = sqlVar;
                        }
                        str7 = str6;
                        strH = sqlVar2.h();
                        aooh.e(strH, "getName(...)");
                        if (strH.length() == 0) {
                            hstVarA = defpackage.hst.a(A(rwvVar2, str7), null, htsVar, 31);
                            udj udjVarC2 = sqlVar2.c();
                            aoinVar = this.m;
                            udj udjVar2 = udj.c;
                            if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                            }
                            return hstVarA;
                        }
                        java.lang.String strH3 = sqlVar2.h();
                        aooh.e(strH3, "getName(...)");
                        strG2 = sqlVar2.g();
                        aooh.e(strG2, "getLookupUri(...)");
                        if (strG2.length() > 0) {
                            uri = android.net.Uri.parse(sqlVar2.g());
                        } else {
                            uri = null;
                        }
                        hstVar2 = new defpackage.hst(strH3, str7, uri, sqlVar2.s(), null, htsVar);
                        htkVar.a = hstVar2;
                        htkVar.f = null;
                        htkVar.b = null;
                        htkVar.e = 6;
                        objD = w(null, sqlVar2, hstVar2, htkVar);
                        if (objD == aoluVar) {
                            return aoluVar;
                        }
                        hstVar3 = hstVar2;
                        return defpackage.hst.a(hstVar3, (android.graphics.Bitmap) objD, null, 47);
                    }
                    java.lang.String string2 = this.b.getResources().getString(2132020648);
                    aooh.e(string2, "getString(...)");
                    hstVar = new defpackage.hst(string2, strG, null, false, null, null);
                }
                return hstVar;
            case 2:
                str4 = (java.lang.String) htkVar.b;
                str2 = htkVar.f;
                rwvVar2 = (rwv) htkVar.a;
                aooc.af(objD);
                sqiVar = this.D;
                hkdVar = (defpackage.hkd) objD;
                rucVar = sqiVar.f;
                aenjVar = sqi.b;
                rucVar.j(aenjVar);
                if (aa$.ExternalSyntheticApiModelOutline1.m((android.os.UserManager) sqiVar.d.getSystemService(android.os.UserManager.class))) {
                    sqi.a.b().l("com/android/dialer/phonelookup/composite/CompositePhoneLookup", "lookup", 165, "CompositePhoneLookup.java").v("user is not unlocked");
                    rucVar.m(aenjVar);
                    ajcqVarA = aiql.z(spn.a);
                } else {
                    ajcqVarA = sqiVar.a(sqiVar.i.o(sqiVar.h.e(), new phd(sqiVar, hkdVar, 13, (byte[]) null)));
                    sqiVar.c(ajcqVarA, aenjVar);
                }
                htkVar.a = rwvVar2;
                htkVar.f = str2;
                htkVar.b = str4;
                htkVar.e = 3;
                objD = aosv.D(ajcqVarA, htkVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                str5 = str2;
                str6 = str4;
                sqlVar = new sql((spn) objD);
                if (((java.lang.Boolean) this.o.a()).booleanValue()) {
                    htkVar.a = rwvVar2;
                    htkVar.f = str6;
                    htkVar.b = sqlVar;
                    htkVar.e = 4;
                    objD = h(rwvVar2, str5, sqlVar, htkVar);
                    if (objD != aoluVar) {
                        return aoluVar;
                    }
                    sqlVar2 = sqlVar;
                    htsVar = (defpackage.hts) objD;
                } else {
                    htsVar = null;
                    sqlVar2 = sqlVar;
                }
                str7 = str6;
                strH = sqlVar2.h();
                aooh.e(strH, "getName(...)");
                if (strH.length() == 0) {
                    hstVarA = defpackage.hst.a(A(rwvVar2, str7), null, htsVar, 31);
                    udj udjVarC3 = sqlVar2.c();
                    aoinVar = this.m;
                    udj udjVar3 = udj.c;
                    if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                    }
                    return hstVarA;
                }
                java.lang.String strH4 = sqlVar2.h();
                aooh.e(strH4, "getName(...)");
                strG2 = sqlVar2.g();
                aooh.e(strG2, "getLookupUri(...)");
                if (strG2.length() > 0) {
                    uri = android.net.Uri.parse(sqlVar2.g());
                } else {
                    uri = null;
                }
                hstVar2 = new defpackage.hst(strH4, str7, uri, sqlVar2.s(), null, htsVar);
                htkVar.a = hstVar2;
                htkVar.f = null;
                htkVar.b = null;
                htkVar.e = 6;
                objD = w(null, sqlVar2, hstVar2, htkVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                hstVar3 = hstVar2;
                return defpackage.hst.a(hstVar3, (android.graphics.Bitmap) objD, null, 47);
            case 3:
                str4 = (java.lang.String) htkVar.b;
                str2 = htkVar.f;
                rwvVar2 = (rwv) htkVar.a;
                aooc.af(objD);
                str5 = str2;
                str6 = str4;
                sqlVar = new sql((spn) objD);
                if (((java.lang.Boolean) this.o.a()).booleanValue()) {
                    htkVar.a = rwvVar2;
                    htkVar.f = str6;
                    htkVar.b = sqlVar;
                    htkVar.e = 4;
                    objD = h(rwvVar2, str5, sqlVar, htkVar);
                    if (objD != aoluVar) {
                        return aoluVar;
                    }
                    sqlVar2 = sqlVar;
                    htsVar = (defpackage.hts) objD;
                } else {
                    htsVar = null;
                    sqlVar2 = sqlVar;
                }
                str7 = str6;
                strH = sqlVar2.h();
                aooh.e(strH, "getName(...)");
                if (strH.length() == 0) {
                    hstVarA = defpackage.hst.a(A(rwvVar2, str7), null, htsVar, 31);
                    udj udjVarC4 = sqlVar2.c();
                    aoinVar = this.m;
                    udj udjVar4 = udj.c;
                    if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                    }
                    return hstVarA;
                }
                java.lang.String strH5 = sqlVar2.h();
                aooh.e(strH5, "getName(...)");
                strG2 = sqlVar2.g();
                aooh.e(strG2, "getLookupUri(...)");
                if (strG2.length() > 0) {
                    uri = android.net.Uri.parse(sqlVar2.g());
                } else {
                    uri = null;
                }
                hstVar2 = new defpackage.hst(strH5, str7, uri, sqlVar2.s(), null, htsVar);
                htkVar.a = hstVar2;
                htkVar.f = null;
                htkVar.b = null;
                htkVar.e = 6;
                objD = w(null, sqlVar2, hstVar2, htkVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                hstVar3 = hstVar2;
                return defpackage.hst.a(hstVar3, (android.graphics.Bitmap) objD, null, 47);
            case 4:
                sqlVar2 = (sql) htkVar.b;
                str6 = htkVar.f;
                rwvVar2 = (rwv) htkVar.a;
                aooc.af(objD);
                htsVar = (defpackage.hts) objD;
                str7 = str6;
                strH = sqlVar2.h();
                aooh.e(strH, "getName(...)");
                if (strH.length() == 0) {
                    hstVarA = defpackage.hst.a(A(rwvVar2, str7), null, htsVar, 31);
                    udj udjVarC5 = sqlVar2.c();
                    aoinVar = this.m;
                    udj udjVar5 = udj.c;
                    if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                    }
                    return hstVarA;
                }
                java.lang.String strH6 = sqlVar2.h();
                aooh.e(strH6, "getName(...)");
                strG2 = sqlVar2.g();
                aooh.e(strG2, "getLookupUri(...)");
                if (strG2.length() > 0) {
                    uri = android.net.Uri.parse(sqlVar2.g());
                } else {
                    uri = null;
                }
                hstVar2 = new defpackage.hst(strH6, str7, uri, sqlVar2.s(), null, htsVar);
                htkVar.a = hstVar2;
                htkVar.f = null;
                htkVar.b = null;
                htkVar.e = 6;
                objD = w(null, sqlVar2, hstVar2, htkVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
                hstVar3 = hstVar2;
                return defpackage.hst.a(hstVar3, (android.graphics.Bitmap) objD, null, 47);
            case 5:
                hstVar4 = (defpackage.hst) htkVar.a;
                aooc.af(objD);
                return defpackage.hst.a(hstVar4, (android.graphics.Bitmap) objD, null, 47);
            case 6:
                hstVar3 = (defpackage.hst) htkVar.a;
                aooc.af(objD);
                return defpackage.hst.a(hstVar3, (android.graphics.Bitmap) objD, null, 47);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(aoln aolnVar) {
        defpackage.htl htlVar;
        if (aolnVar instanceof defpackage.htl) {
            htlVar = (defpackage.htl) aolnVar;
            int i = htlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                htlVar.c = i - Integer.MIN_VALUE;
            } else {
                htlVar = new defpackage.htl(this, aolnVar);
            }
        } else {
            htlVar = new defpackage.htl(this, aolnVar);
        }
        java.lang.Object obj = htlVar.a;
        aolu aoluVar = aolu.a;
        int i2 = htlVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        B(mce.aw);
        if (((java.lang.Boolean) this.j.a()).booleanValue()) {
            defpackage.hsr hsrVar = this.y;
            htlVar.c = 1;
            if (hsrVar.a(htlVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            this.x.a();
        }
        rxa rxaVar = this.A;
        htlVar.c = 2;
        if (rxaVar.c(htlVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    public final java.lang.Object n(aoln aolnVar) {
        java.lang.Object objA = a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final java.lang.Object o(aoln aolnVar) {
        java.lang.Object objT = t(aolnVar);
        return objT != aolu.a ? aojh.a : objT;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dd A[LOOP:1: B:33:0x00d7->B:35:0x00dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.util.List] */
    public final java.lang.Object p(android.app.Notification notification, java.util.List list, aoln aolnVar) {
        defpackage.htn htnVar;
        java.lang.Object obj;
        ?? r12;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.util.Set setCf;
        ?? BY;
        java.util.ArrayList arrayList2;
        java.util.Iterator it2;
        java.lang.String tag;
        if (aolnVar instanceof defpackage.htn) {
            htnVar = (defpackage.htn) aolnVar;
            int i = htnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                htnVar.d = i - Integer.MIN_VALUE;
            } else {
                htnVar = new defpackage.htn(this, aolnVar);
            }
        } else {
            htnVar = new defpackage.htn(this, aolnVar);
        }
        java.lang.Object objD = htnVar.b;
        aolu aoluVar = aolu.a;
        int i2 = htnVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj2 = htnVar.a;
                aooc.af(objD);
                obj = obj2;
            } else if (i2 == 2) {
                java.lang.Object obj3 = htnVar.a;
                aooc.af(objD);
                r12 = obj3;
                aify aifyVar = (aify) objD;
                aooh.c(aifyVar);
                arrayList = new java.util.ArrayList();
                it = aifyVar.iterator();
                while (it.hasNext()) {
                    tag = ((android.service.notification.StatusBarNotification) it.next()).getTag();
                    if (tag != null) {
                        arrayList.add(tag);
                    }
                }
                aihd aihdVarO = aihd.o(this.c.g);
                aooh.e(aihdVarO, "getThrottledNotificationSet(...)");
                setCf = ajsz.cf(ajsz.bT(arrayList, aihdVarO));
                BY = r12;
                if (((java.lang.Boolean) this.n.a()).booleanValue()) {
                    BY = ajsz.bY((java.lang.Iterable) r12, 8);
                }
                arrayList2 = new java.util.ArrayList();
                it2 = BY.iterator();
                while (it2.hasNext()) {
                    defpackage.htr htrVar = this;
                    arrayList2.add(aoov.am(this.r, 0, new defpackage.jnq(htrVar, (rwv) it2.next(), setCf, (aoln) null, 1), 3));
                    this = htrVar;
                }
                htnVar.a = null;
                htnVar.d = 3;
                if (aooh.v(arrayList2, htnVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return aojh.a;
        }
        aooc.af(objD);
        a.b().l("com/android/dialer/app/calllog/MissedCallNotifier", "sendNotificationToPhone", 508, "MissedCallNotifier.kt").v("adding missed call notification");
        ajcq ajcqVarH = this.c.h("GroupSummary_MissedCall", 1, notification);
        htnVar.a = list;
        htnVar.d = 1;
        if (aosv.D(ajcqVarH, htnVar) == aoluVar) {
            obj = list;
            return aoluVar;
        }
        obj = list;
        ajcq ajcqVarF = this.c.f();
        htnVar.a = obj;
        htnVar.d = 2;
        objD = aosv.D(ajcqVarF, htnVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        r12 = obj;
        aify aifyVar2 = (aify) objD;
        aooh.c(aifyVar2);
        arrayList = new java.util.ArrayList();
        it = aifyVar2.iterator();
        while (it.hasNext()) {
            tag = ((android.service.notification.StatusBarNotification) it.next()).getTag();
            if (tag != null) {
                arrayList.add(tag);
            }
        }
        aihd aihdVarO2 = aihd.o(this.c.g);
        aooh.e(aihdVarO2, "getThrottledNotificationSet(...)");
        setCf = ajsz.cf(ajsz.bT(arrayList, aihdVarO2));
        BY = r12;
        if (((java.lang.Boolean) this.n.a()).booleanValue()) {
            BY = ajsz.bY((java.lang.Iterable) r12, 8);
        }
        arrayList2 = new java.util.ArrayList();
        it2 = BY.iterator();
        while (it2.hasNext()) {
            defpackage.htr htrVar2 = this;
            arrayList2.add(aoov.am(this.r, 0, new defpackage.jnq(htrVar2, (rwv) it2.next(), setCf, (aoln) null, 1), 3));
            this = htrVar2;
        }
        htnVar.a = null;
        htnVar.d = 3;
        if (aooh.v(arrayList2, htnVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object q(long j, aoln aolnVar) {
        defpackage.htp htpVar;
        if (aolnVar instanceof defpackage.htp) {
            htpVar = (defpackage.htp) aolnVar;
            int i = htpVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                htpVar.d = i - Integer.MIN_VALUE;
            } else {
                htpVar = new defpackage.htp(this, aolnVar);
            }
        } else {
            htpVar = new defpackage.htp(this, aolnVar);
        }
        java.lang.Object objR = htpVar.b;
        aolu aoluVar = aolu.a;
        int i2 = htpVar.d;
        if (i2 == 0) {
            aooc.af(objR);
            htpVar.a = j;
            htpVar.d = 1;
            objR = r(j, htpVar);
            if (objR == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = htpVar.a;
            aooc.af(objR);
        }
        amqs amqsVar = (amqs) objR;
        akzx akzxVarM = amqr.a.m();
        aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        amqr amqrVar = akzxVarM.b;
        amqrVar.b |= 1;
        amqrVar.c = j;
        aooh.f(amqsVar, "value");
        akzxVarM.u();
        amqr amqrVar2 = akzxVarM.b;
        amqrVar2.d = amqsVar.e;
        amqrVar2.b |= 2;
        amqr amqrVarP = akzxVarM.p();
        aooh.e(amqrVarP, "build(...)");
        return amqrVarP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object r(long j, aoln aolnVar) {
        defpackage.htq htqVar;
        if (aolnVar instanceof defpackage.htq) {
            htqVar = (defpackage.htq) aolnVar;
            int i = htqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                htqVar.c = i - Integer.MIN_VALUE;
            } else {
                htqVar = new defpackage.htq(this, aolnVar);
            }
        } else {
            htqVar = new defpackage.htq(this, aolnVar);
        }
        java.lang.Object objD = htqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = htqVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            if (!defpackage.hgt.k(j, 262144L)) {
                return (defpackage.hgt.k(j, 524288L) && defpackage.hgt.k(j, 1048576L)) ? amqs.c : amqs.a;
            }
            if (((java.lang.Boolean) this.l.a()).booleanValue()) {
                ajcq ajcqVarG = this.c.g();
                htqVar.c = 1;
                objD = aosv.D(ajcqVarG, htqVar);
                if (objD == aoluVar) {
                    return aoluVar;
                }
            }
            return amqs.b;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objD);
        if (!((java.lang.Boolean) objD).booleanValue()) {
            return amqs.d;
        }
        return amqs.b;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object t(aoln aolnVar) {
        defpackage.htm htmVar;
        long j;
        java.util.List list;
        long j2;
        tuz tuzVar;
        if (aolnVar instanceof defpackage.htm) {
            htmVar = (defpackage.htm) aolnVar;
            int i = htmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                htmVar.d = i - Integer.MIN_VALUE;
            } else {
                htmVar = new defpackage.htm(this, aolnVar);
            }
        } else {
            htmVar = new defpackage.htm(this, aolnVar);
        }
        java.lang.Object objD = htmVar.b;
        aolu aoluVar = aolu.a;
        int i2 = htmVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                j = htmVar.a;
                aooc.af(objD);
            } else if (i2 == 2) {
                j2 = htmVar.a;
                aooc.af(objD);
                list = (java.util.List) objD;
                j = j2;
                tuzVar = this.B;
                if (list == null) {
                    tuzVar.a(0);
                    return aojh.a;
                }
                tuzVar.a(list.size());
                if (list.isEmpty()) {
                    htmVar.d = 3;
                    if (m(htmVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    htmVar.d = 4;
                    if (v(list, j, htmVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else {
                if (i2 != 3 && i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return aojh.a;
        }
        aooc.af(objD);
        a.b().l("com/android/dialer/app/calllog/MissedCallNotifier", "notifyMissedCallsAsync", 237, "MissedCallNotifier.kt").v("enter");
        rwx rwxVar = this.w;
        zrw zrwVar = rwxVar.c;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ahrv ahrvVarI = ahrv.g(zrwVar.a()).i(new qfc(rwxVar, 18), rwxVar.d);
        htmVar.a = jElapsedRealtime;
        htmVar.d = 1;
        objD = aosv.D(ahrvVarI, htmVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        j = jElapsedRealtime;
        aooh.e(objD, "await(...)");
        aify aifyVar = (aify) aooh.q((j$.util.Optional) objD);
        list = null;
        if (aifyVar != null) {
            defpackage.dqx dqxVar = new defpackage.dqx(this, (aoln) null, 5);
            htmVar.a = j;
            htmVar.d = 2;
            objD = f(aifyVar, dqxVar, htmVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            j2 = j;
            list = (java.util.List) objD;
            j = j2;
            tuzVar = this.B;
            if (list == null) {
                tuzVar.a(0);
                return aojh.a;
            }
            tuzVar.a(list.size());
            if (list.isEmpty()) {
                htmVar.d = 3;
                if (m(htmVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                htmVar.d = 4;
                if (v(list, j, htmVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            tuzVar = this.B;
            if (list == null) {
                tuzVar.a(0);
                return aojh.a;
            }
            tuzVar.a(list.size());
            if (list.isEmpty()) {
                htmVar.d = 3;
                if (m(htmVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                htmVar.d = 4;
                if (v(list, j, htmVar) == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object u(java.lang.String str, int i, aoln aolnVar) {
        defpackage.hto htoVar;
        if (aolnVar instanceof defpackage.hto) {
            htoVar = (defpackage.hto) aolnVar;
            int i2 = htoVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                htoVar.c = i2 - Integer.MIN_VALUE;
            } else {
                htoVar = new defpackage.hto(this, aolnVar);
            }
        } else {
            htoVar = new defpackage.hto(this, aolnVar);
        }
        java.lang.Object objD = htoVar.a;
        aolu aoluVar = aolu.a;
        int i3 = htoVar.c;
        try {
            if (i3 == 0) {
                aooc.af(objD);
                j$.util.Optional optionalG = this.E.g();
                aooh.e(optionalG, "getFeature(...)");
                uqz uqzVar = (uqz) aooh.q(optionalG);
                if (uqzVar != null) {
                    ajcq ajcqVarB = uqzVar.b(2, str, 2, i);
                    htoVar.c = 1;
                    objD = aosv.D(ajcqVarB, htoVar);
                    if (objD == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            }
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            zul zulVar = (zul) objD;
            if (zulVar == zul.b) {
                a.b().l("com/android/dialer/app/calllog/MissedCallNotifier", "sendNotificationToWear", 388, "MissedCallNotifier.kt").v("Recipient node offline.");
            } else if (zulVar != zul.a) {
                a.d().l("com/android/dialer/app/calllog/MissedCallNotifier", "sendNotificationToWear", 392, "MissedCallNotifier.kt").y("Failed to sync missed call notification to wear due to : %s", zulVar);
            }
        } catch (java.lang.Throwable th) {
            a.c().k(th).l("com/android/dialer/app/calllog/MissedCallNotifier", "sendNotificationToWear", 397, "MissedCallNotifier.kt").v("Failed to sync missed call notification to wear");
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x0178  */
    /* JADX WARN: Code duplicated, block: B:51:0x019a  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object v(java.util.List list, long j, aoln aolnVar) {
        defpackage.hsu hsuVar;
        long j2;
        java.util.List list2;
        java.lang.String str;
        defpackage.dva dvaVar;
        char c;
        long j3;
        java.util.List list3;
        aosy aosyVarAm;
        android.os.StrictMode.ThreadPolicy threadPolicy;
        java.lang.Object objAm;
        long jElapsedRealtime;
        amqr amqrVar;
        long j4;
        aosy aosyVar;
        long j5;
        akzx akzxVarM;
        amqt amqtVar;
        java.util.List listBc;
        amqt amqtVar2;
        alat alatVar;
        if (aolnVar instanceof defpackage.hsu) {
            hsuVar = (defpackage.hsu) aolnVar;
            int i = hsuVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                hsuVar.g = i - Integer.MIN_VALUE;
            } else {
                hsuVar = new defpackage.hsu(this, aolnVar);
            }
        } else {
            hsuVar = new defpackage.hsu(this, aolnVar);
        }
        defpackage.hsu hsuVar2 = hsuVar;
        java.lang.Object obj = hsuVar2.e;
        aolu aoluVar = aolu.a;
        int i2 = hsuVar2.g;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    long j6 = hsuVar2.c;
                    str = (java.lang.String) hsuVar2.b;
                    java.util.List list4 = (java.util.List) hsuVar2.a;
                    aooc.af(obj);
                    j2 = j6;
                    list2 = list4;
                } else if (i2 == 2) {
                    j4 = hsuVar2.d;
                    j5 = hsuVar2.c;
                    objAm = hsuVar2.b;
                    aosyVar = (aosy) hsuVar2.a;
                    aooc.af(obj);
                    c = 1;
                    amqrVar = (amqr) obj;
                    jElapsedRealtime = j4;
                    aosyVarAm = aosyVar;
                    j3 = j5;
                    akzxVarM = amqt.a.m();
                    aooh.f(akzxVarM, "builder");
                    akzxVarM.u();
                    amqtVar = akzxVarM.b;
                    amqtVar.b |= 1;
                    amqtVar.c = jElapsedRealtime - j3;
                    if (amqrVar != null) {
                        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(amqtVar.d);
                        aooh.e(listUnmodifiableList, "getCallDetailsList(...)");
                        new alct(listUnmodifiableList);
                        akzxVarM.u();
                        amqtVar2 = akzxVarM.b;
                        j$.util.Objects.requireNonNull(amqrVar);
                        alatVar = amqtVar2.d;
                        if (!alatVar.c()) {
                            amqtVar2.d = alad.J(alatVar);
                        }
                        amqtVar2.d.add(amqrVar);
                    }
                    amqt amqtVarP = akzxVarM.p();
                    aooh.e(amqtVarP, "build(...)");
                    this.t.q(amqtVarP);
                    if (((java.lang.Boolean) this.p.a()).booleanValue() && ((java.lang.Boolean) this.q.a()).booleanValue()) {
                        this.M.W();
                    }
                    aosy[] aosyVarArr = new aosy[2];
                    aosyVarArr[0] = aosyVarAm;
                    aosyVarArr[c] = objAm;
                    listBc = ajsz.bc(aosyVarArr);
                    hsuVar2.a = null;
                    hsuVar2.b = null;
                    hsuVar2.g = 3;
                    if (aooh.v(listBc, hsuVar2) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(obj);
                }
                return aojh.a;
            }
            aooc.af(obj);
            hsuVar2.a = list;
            hsuVar2.b = null;
            hsuVar2.c = j;
            hsuVar2.g = 1;
            java.lang.Object objB = b(list, hsuVar2);
            if (objB == aoluVar) {
                return aoluVar;
            }
            j2 = j;
            obj = objB;
            list2 = list;
            str = null;
            android.app.Notification notificationA = dvaVar.a();
            aooh.e(notificationA, "build(...)");
            android.os.StrictMode.setThreadPolicy(threadPolicy);
            defpackage.hgt.j(notificationA);
            java.util.List list5 = list3;
            objAm = aoov.am(this.r, 0, new defpackage.hyq(this, notificationA, list5, (aoln) null, 1), 3);
            B(mce.av);
            jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.lang.Long l = ((rwv) list5.get(0)).h;
            if (l != null) {
                long jLongValue = l.longValue();
                hsuVar2.a = aosyVarAm;
                hsuVar2.b = objAm;
                hsuVar2.c = j3;
                hsuVar2.d = jElapsedRealtime;
                hsuVar2.g = 2;
                java.lang.Object objQ = q(jLongValue, hsuVar2);
                if (objQ == aoluVar) {
                    return aoluVar;
                }
                obj = objQ;
                j4 = jElapsedRealtime;
                aosyVar = aosyVarAm;
                j5 = j3;
                amqrVar = (amqr) obj;
                jElapsedRealtime = j4;
                aosyVarAm = aosyVar;
                j3 = j5;
            } else {
                amqrVar = null;
            }
            akzxVarM = amqt.a.m();
            aooh.f(akzxVarM, "builder");
            akzxVarM.u();
            amqtVar = akzxVarM.b;
            amqtVar.b |= 1;
            amqtVar.c = jElapsedRealtime - j3;
            if (amqrVar != null) {
                java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(amqtVar.d);
                aooh.e(listUnmodifiableList2, "getCallDetailsList(...)");
                new alct(listUnmodifiableList2);
                akzxVarM.u();
                amqtVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(amqrVar);
                alatVar = amqtVar2.d;
                if (!alatVar.c()) {
                    amqtVar2.d = alad.J(alatVar);
                }
                amqtVar2.d.add(amqrVar);
            }
            amqt amqtVarP2 = akzxVarM.p();
            aooh.e(amqtVarP2, "build(...)");
            this.t.q(amqtVarP2);
            if (((java.lang.Boolean) this.p.a()).booleanValue()) {
                this.M.W();
            }
            aosy[] aosyVarArr2 = new aosy[2];
            aosyVarArr2[0] = aosyVarAm;
            aosyVarArr2[c] = objAm;
            listBc = ajsz.bc(aosyVarArr2);
            hsuVar2.a = null;
            hsuVar2.b = null;
            hsuVar2.g = 3;
            if (aooh.v(listBc, hsuVar2) == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        } catch (java.lang.Throwable th) {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
        long j7 = j2;
        dvaVar = (defpackage.dva) obj;
        aoot aootVar = new aoot();
        aootVar.a = str;
        if (aootVar.a != null || list2.isEmpty()) {
            c = 1;
        } else {
            java.lang.String str2 = ((rwv) list2.get(0)).b;
            if (str2.length() > 0) {
                c = 1;
                if (!aooh.n(str2, this.b.getString(2132018862)) && !this.u.f(str2)) {
                    aootVar.a = ((rwv) list2.get(0)).b;
                }
            } else {
                c = 1;
            }
        }
        j$.util.Optional optionalG = this.E.g();
        aooh.e(optionalG, "getFeature(...)");
        uqz uqzVar = (uqz) aooh.q(optionalG);
        if (uqzVar != null) {
            uqzVar.a().b(dvaVar);
            list3 = list2;
            j3 = j7;
            aosyVarAm = aoov.am(this.r, 0, new defpackage.blv(this, dvaVar, aootVar, list3, (aoln) null, 5), 3);
        } else {
            j3 = j7;
            list3 = list2;
            aosyVarAm = null;
        }
        threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(android.os.StrictMode.ThreadPolicy.LAX);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object w(ssg ssgVar, sql sqlVar, defpackage.hst hstVar, aoln aolnVar) {
        defpackage.hti htiVar;
        java.lang.String string;
        abwd abwdVarAd;
        java.lang.String string2;
        java.lang.String str;
        if (aolnVar instanceof defpackage.hti) {
            htiVar = (defpackage.hti) aolnVar;
            int i = htiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                htiVar.c = i - Integer.MIN_VALUE;
            } else {
                htiVar = new defpackage.hti(this, aolnVar);
            }
        } else {
            htiVar = new defpackage.hti(this, aolnVar);
        }
        java.lang.Object objD = htiVar.a;
        aolu aoluVar = aolu.a;
        int i2 = htiVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            java.lang.String str2 = "";
            if (((java.lang.Boolean) this.k.a()).booleanValue()) {
                if (sqlVar == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                vqf vqfVarF = abxl.F(abwd.a.m());
                java.lang.String strJ = sqlVar.j();
                aooh.e(strJ, "getPhotoUri(...)");
                vqfVarF.aj(strJ);
                vqfVarF.ai(sqlVar.a());
                java.lang.String strH = sqlVar.h();
                if (strH.length() != 0 || (hstVar != null && (strH = hstVar.a) != null)) {
                    str2 = strH;
                }
                vqfVarF.ah(str2);
                java.lang.String strG = sqlVar.g();
                aooh.e(strG, "getLookupUri(...)");
                vqfVarF.ag(strG);
                if (hstVar != null && (str = hstVar.b) != null) {
                    vqfVarF.ae(str);
                }
                if (((java.lang.Boolean) this.m.a()).booleanValue()) {
                    vqfVarF.af(sqlVar.c() == udj.c);
                }
                abwdVarAd = vqfVarF.ad();
            } else {
                if (ssgVar == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                vqf vqfVarF2 = abxl.F(abwd.a.m());
                android.net.Uri uri = ssgVar.k;
                if (uri == null || (string = uri.toString()) == null) {
                    string = "";
                }
                vqfVarF2.aj(string);
                vqfVarF2.ai(ssgVar.j);
                java.lang.String str3 = ssgVar.c;
                aooh.e(str3, "name");
                vqfVarF2.ah(str3);
                android.net.Uri uri2 = ssgVar.b;
                if (uri2 != null && (string2 = uri2.toString()) != null) {
                    str2 = string2;
                }
                vqfVarF2.ag(str2);
                java.lang.String str4 = ssgVar.h;
                if (str4 != null) {
                    vqfVarF2.ae(str4);
                }
                abwdVarAd = vqfVarF2.ad();
            }
            ops opsVar = this.C;
            android.content.Context context = this.b;
            ajcq ajcqVarE = opsVar.e(abwdVarAd, defpackage.oph.a(), context.getResources().getDimensionPixelSize(2131167223), context.getResources().getDimensionPixelSize(2131167222));
            htiVar.c = 1;
            objD = aosv.D(ajcqVarE, htiVar);
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
}
