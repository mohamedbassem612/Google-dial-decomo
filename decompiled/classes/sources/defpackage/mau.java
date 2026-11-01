package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mau {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/conversationhistoryutil/ConversationHistoryActionProvider");
    private static final java.util.regex.Pattern p = java.util.regex.Pattern.compile("^[0-9. ();+\\-]+$");
    public final android.content.Context b;
    public final defpackage.rlv c;
    public final defpackage.maw d;
    public final defpackage.aoin e;
    public final defpackage.aoin f;
    public final defpackage.aeqx g;
    public final defpackage.zjm h;
    public final defpackage.zjm i;
    public final defpackage.gpd j;
    public final defpackage.tkl k;
    public final defpackage.acxg l;
    public final defpackage.rsr m;
    public final defpackage.rsr n;
    public final defpackage.ipc o;
    private final defpackage.ajct q;
    private final defpackage.nwu r;
    private final defpackage.ahpz s;
    private final defpackage.aoin t;
    private final defpackage.aoin u;
    private final defpackage.aoin v;
    private final defpackage.lvs w;
    private final defpackage.gpd x;
    private final defpackage.kaw y;

    public mau(android.content.Context context, defpackage.ajct ajctVar, defpackage.zjm zjmVar, defpackage.aeqx aeqxVar, defpackage.lvs lvsVar, defpackage.rsr rsrVar, defpackage.ipc ipcVar, defpackage.nwu nwuVar, defpackage.rlv rlvVar, defpackage.gpd gpdVar, defpackage.acxg acxgVar, defpackage.gpd gpdVar2, defpackage.ahpz ahpzVar, defpackage.kaw kawVar, defpackage.maw mawVar, defpackage.tkl tklVar, defpackage.aoin aoinVar, defpackage.rsr rsrVar2, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.zjm zjmVar2, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5) {
        this.b = context;
        this.q = ajctVar;
        this.h = zjmVar;
        this.g = aeqxVar;
        this.w = lvsVar;
        this.m = rsrVar;
        this.o = ipcVar;
        this.r = nwuVar;
        this.c = rlvVar;
        this.x = gpdVar;
        this.l = acxgVar;
        this.j = gpdVar2;
        this.s = ahpzVar;
        this.y = kawVar;
        this.d = mawVar;
        this.k = tklVar;
        this.t = aoinVar;
        this.n = rsrVar2;
        this.u = aoinVar2;
        this.e = aoinVar3;
        this.i = zjmVar2;
        this.v = aoinVar4;
        this.f = aoinVar5;
    }

    private final mao r(int i, defpackage.kiu kiuVar, boolean z, nwt nwtVar) {
        vua vuaVar = new vua((byte[]) null, (byte[]) null);
        vuaVar.k(i);
        vuaVar.m(this.b.getString(2132018177));
        vuaVar.l(true);
        vuaVar.c = new mas(this, z, kiuVar, nwtVar, 2);
        return vuaVar.i();
    }

    public final mao a(android.app.Activity activity, defpackage.kiu kiuVar, boolean z) {
        if (!kiuVar.h.isEmpty()) {
            kiw kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = kiw.a;
            }
            if (!kiwVar.r && !kiuVar.s) {
                vua vuaVar = new vua((byte[]) null, (byte[]) null);
                vuaVar.k(2131231981);
                vuaVar.m(this.b.getString(2132018163));
                vuaVar.l(true);
                vuaVar.c = new mas(this, activity, kiuVar, z, 0);
                return vuaVar.i();
            }
        }
        vua vuaVar2 = new vua((byte[]) null, (byte[]) null);
        vuaVar2.k(2131231981);
        vuaVar2.m(this.b.getString(2132018163));
        vuaVar2.l(false);
        return vuaVar2.i();
    }

    public final mao b(defpackage.kiu kiuVar, boolean z) {
        vua vuaVar = new vua((byte[]) null, (byte[]) null);
        vuaVar.k(2131231051);
        vuaVar.m(this.b.getString(2132018164));
        vuaVar.l(true);
        vuaVar.c = new maq(this, kiuVar, z, 8);
        return vuaVar.i();
    }

    public final mao c(defpackage.kiu kiuVar, boolean z) {
        vua vuaVar = new vua((byte[]) null, (byte[]) null);
        vuaVar.k(2131231051);
        vuaVar.m(this.b.getString(2132018165));
        vuaVar.l(true);
        vuaVar.c = new maq(this, kiuVar, z, 2);
        return vuaVar.i();
    }

    public final mao d(defpackage.az azVar, defpackage.kiu kiuVar, android.content.Intent intent) {
        vua vuaVar = new vua((byte[]) null, (byte[]) null);
        vuaVar.k(2131231960);
        vuaVar.m(this.b.getString(2132018169));
        vuaVar.l(true);
        vuaVar.c = new mar(this, kiuVar, azVar, intent, 0);
        return vuaVar.i();
    }

    public final mao e(defpackage.kiu kiuVar, boolean z) {
        boolean z2 = false;
        if (kiuVar.i == 1) {
            kiw kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = kiw.a;
            }
            if (!kiwVar.r && !kiuVar.s && !kiuVar.g.isEmpty()) {
                z2 = true;
            }
        }
        vua vuaVar = new vua((byte[]) null, (byte[]) null);
        vuaVar.k(2131231435);
        vuaVar.m(this.b.getString(2132018170));
        vuaVar.l(z2);
        vuaVar.c = z2 ? new maq(this, z, kiuVar, 5) : null;
        return vuaVar.i();
    }

    public final mao f(defpackage.kiu kiuVar, boolean z) {
        vua vuaVar = new vua((byte[]) null, (byte[]) null);
        vuaVar.k(2131231989);
        vuaVar.m(this.b.getString(2132018171));
        vuaVar.l(true);
        vuaVar.c = new maq(this, z, kiuVar, 0);
        return vuaVar.i();
    }

    public final mao g(defpackage.kiu kiuVar, boolean z) {
        vua vuaVar = new vua((byte[]) null, (byte[]) null);
        vuaVar.k(2131231989);
        vuaVar.m(this.b.getString(2132018172));
        vuaVar.l(true);
        vuaVar.c = new maq(this, z, kiuVar, 6);
        return vuaVar.i();
    }

    public final mao h(defpackage.kiu kiuVar) {
        vua vuaVar = new vua((byte[]) null, (byte[]) null);
        vuaVar.k(2131231542);
        vuaVar.m(this.b.getString(2132018173));
        vuaVar.l(true);
        vuaVar.d = j$.util.Optional.of(new defpackage.map(kiuVar));
        vuaVar.f = j$.util.Optional.of("reverse_lookup_action");
        vuaVar.g = j$.util.Optional.of(defpackage.rmu.REVERSE_LOOKUP_ACTION_SHOWN);
        return vuaVar.i();
    }

    public final mao i(defpackage.kiu kiuVar, boolean z) {
        vua vuaVar = new vua((byte[]) null, (byte[]) null);
        vuaVar.k(2131232047);
        vuaVar.m(this.b.getString(2132018174));
        vuaVar.l(!kiuVar.g.isEmpty());
        vuaVar.c = new maq(this, kiuVar, z, 3);
        return vuaVar.i();
    }

    public final mao j(defpackage.kiu kiuVar, boolean z) {
        vua vuaVar = new vua((byte[]) null, (byte[]) null);
        vuaVar.k(2131231077);
        vuaVar.m(this.b.getString(2132018176));
        vuaVar.l(true);
        vuaVar.c = new maq(this, z, kiuVar, 4);
        return vuaVar.i();
    }

    public final mao k(defpackage.kiu kiuVar, boolean z, defpackage.wgi wgiVar, nwt nwtVar) {
        boolean z2;
        kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        if (kiwVar.r || kiuVar.s) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/conversationhistoryutil/ConversationHistoryActionProvider", "createVideoCallAction", 204, "ConversationHistoryActionProvider.java")).v("Emergency or voicemail. Video call button disabled.");
            vua vuaVar = new vua((byte[]) null, (byte[]) null);
            vuaVar.k(2131231080);
            vuaVar.m(this.b.getString(2132018177));
            vuaVar.l(false);
            return vuaVar.i();
        }
        android.content.Context context = this.b;
        int iA = defpackage.uyb.a(context);
        int i = iA & 1;
        int i2 = iA & 2;
        boolean z3 = 1 == i;
        int i3 = kiuVar.p & 1;
        boolean z4 = 1 == i3;
        defpackage.aimz aimzVar = a;
        defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/conversationhistoryutil/ConversationHistoryActionProvider", "canPlaceCarrierVideoCall", 891, "ConversationHistoryActionProvider.java");
        boolean z5 = i2 == 2;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z3);
        java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(z5);
        java.lang.Boolean boolValueOf3 = java.lang.Boolean.valueOf(z4);
        kiw kiwVar2 = kiuVar.r;
        if (kiwVar2 == null) {
            kiwVar2 = kiw.a;
        }
        aimwVar.N("isCarrierVideoCallingEnabled=%b, canRelyOnCarrierVideoPresence=%b, madeVideoCallPreviously=%b, calleeReachable=%b", boolValueOf, boolValueOf2, boolValueOf3, java.lang.Boolean.valueOf(kiwVar2.p));
        if (i == 0) {
            z2 = false;
        } else {
            if (i3 == 0) {
                if (z5) {
                    kiw kiwVar3 = kiuVar.r;
                    if (kiwVar3 == null) {
                        kiwVar3 = kiw.a;
                    }
                    if (kiwVar3.p) {
                    }
                }
                z2 = false;
            }
            z2 = true;
        }
        int i4 = (wgiVar.d && z2) ? 2131231081 : 2131231080;
        if (z2) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/conversationhistoryutil/ConversationHistoryActionProvider", "createVideoCallAction", 217, "ConversationHistoryActionProvider.java")).v("carrier video call button enabled");
            vua vuaVar2 = new vua((byte[]) null, (byte[]) null);
            vuaVar2.k(i4);
            vuaVar2.m(context.getString(2132018177));
            vuaVar2.l(true);
            vuaVar2.c = new ahpp(this.s, 333, "Clicked_videoCall_on_conversationHistoryAction", new mas(this, z, kiuVar, wgiVar, 1), 0);
            if (wgiVar.d) {
                vuaVar2.j(context.getString(2132018166));
            }
            return vuaVar2.i();
        }
        boolean zBooleanValue = ((java.lang.Boolean) this.t.a()).booleanValue();
        defpackage.nwu nwuVar = this.r;
        if (zBooleanValue) {
            if (nwuVar.a().equals(defpackage.nwv.AVAILABLE)) {
                kiw kiwVar4 = kiuVar.r;
                if (kiwVar4 == null) {
                    kiwVar4 = kiw.a;
                }
                nwx nwxVarB = nwx.b(kiwVar4.C);
                if (nwxVarB == null) {
                    nwxVarB = nwx.a;
                }
                if (!nwxVarB.equals(nwx.b)) {
                    ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/conversationhistoryutil/ConversationHistoryActionProvider", "createVideoCallAction", 230, "ConversationHistoryActionProvider.java")).v("meet call button enabled");
                    return r(i4, kiuVar, z, nwtVar);
                }
            }
        } else if (nwuVar.l()) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/conversationhistoryutil/ConversationHistoryActionProvider", "createVideoCallAction", 236, "ConversationHistoryActionProvider.java")).v("duo call button enabled");
            return r(i4, kiuVar, z, nwtVar);
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/conversationhistoryutil/ConversationHistoryActionProvider", "createVideoCallAction", 242, "ConversationHistoryActionProvider.java")).v("video call button disabled");
        vua vuaVar3 = new vua((byte[]) null, (byte[]) null);
        vuaVar3.k(2131231080);
        vuaVar3.m(context.getString(2132018177));
        vuaVar3.l(false);
        return vuaVar3.i();
    }

    public final mao l(defpackage.kiu kiuVar, boolean z, defpackage.wgi wgiVar) {
        boolean z2 = !kiuVar.g.isEmpty();
        vua vuaVar = new vua((byte[]) null, (byte[]) null);
        android.content.Context context = this.b;
        vuaVar.m(context.getString(2132018179));
        vuaVar.k(true != wgiVar.c ? 2131231340 : 2131231083);
        vuaVar.l(z2);
        vuaVar.c = new mas(this, z, kiuVar, wgiVar, 3);
        if (wgiVar.c) {
            vuaVar.j(context.getString(2132018167));
        }
        return vuaVar.i();
    }

    public final defpackage.ajcq m(defpackage.az azVar, defpackage.kiu kiuVar, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        this.c.o(defpackage.rmx.CONVERSATION_HISTORY_REVERSE_LOOKUP_ACTION_BUTTON_CLICKED);
        android.content.Intent intent = new android.content.Intent("android.intent.action.WEB_SEARCH");
        intent.putExtra("query", java.lang.String.format("\"%s\"", kiuVar.h));
        intent.addFlags(268435456);
        return defpackage.ahvr.E(new abb(this, intent, azVar, coordinatorLayout, 5, (byte[]) null), this.q);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    public final void n(android.content.Context context, defpackage.kiu kiuVar, boolean z) {
        android.content.Intent intent;
        try {
            java.util.List listJ = defpackage.ahzf.b('.').j(this.b.getPackageManager().getPackageInfo("com.google.android.contacts", 0).versionName);
            if (listJ.size() >= 2) {
                int i = java.lang.Integer.parseInt((java.lang.String) listJ.get(0));
                int i2 = java.lang.Integer.parseInt((java.lang.String) listJ.get(1));
                if (i != 3 ? i <= 3 : i2 < 5) {
                    intent = new android.content.Intent("android.intent.action.INSERT_OR_EDIT");
                    intent.setType("vnd.android.cursor.item/contact");
                } else if (((java.lang.Boolean) this.v.a()).booleanValue()) {
                    intent = new android.content.Intent("android.intent.action.INSERT");
                    intent.setType("vnd.android.cursor.dir/contact");
                } else {
                    intent = new android.content.Intent("android.intent.action.INSERT", android.provider.ContactsContract.Contacts.CONTENT_URI);
                }
            } else {
                intent = new android.content.Intent("android.intent.action.INSERT_OR_EDIT");
                intent.setType("vnd.android.cursor.item/contact");
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).k(e)).l("com/android/dialer/conversationhistoryutil/ConversationHistoryActionProvider", "isContactsVersionThreePointFiveOrAbove", (char) 925, "ConversationHistoryActionProvider.java")).v("Google Contacts not installed in this device");
        }
        hkd hkdVar = kiuVar.f;
        if (hkdVar == null) {
            hkdVar = hkd.a;
        }
        intent.putExtra("phone", hkdVar.c);
        defpackage.lvs lvsVar = this.w;
        kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        java.lang.String str = kiwVar.c;
        kiw kiwVar2 = kiuVar.r;
        if (kiwVar2 == null) {
            kiwVar2 = kiw.a;
        }
        intent.putExtra("name", lvsVar.c(str, kiwVar2.d));
        if (!((java.lang.Boolean) this.v.a()).booleanValue()) {
            intent.addFlags(1);
        }
        this.c.n(z ? defpackage.rmw.CREATE_NEW_CONTACT_FROM_CALL_DETAILS : defpackage.rmw.CREATE_NEW_CONTACT_FROM_CALL_LOG);
        uxw.b(context, intent, 2132017288);
    }

    public final void o(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        this.c.o(defpackage.rmx.CONVERSATION_HISTORY_REVERSE_LOOKUP_NO_WEB_SEARCH_APP_ERROR);
        agby agbyVarO = agby.o(coordinatorLayout, 2132018193, 0);
        agbyVarO.r(3);
        agbyVarO.h();
    }

    public final boolean p(defpackage.kiu kiuVar) {
        if (((java.lang.Boolean) this.u.a()).booleanValue() && kiuVar.g.isEmpty()) {
            return false;
        }
        kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        if (kiwVar.i && kiuVar.q != 2) {
            return true;
        }
        defpackage.kaw kawVar = this.y;
        kiw kiwVar2 = kiuVar.r;
        if (kiwVar2 == null) {
            kiwVar2 = kiw.a;
        }
        java.lang.String strA = kawVar.a(kiwVar2);
        boolean zIsEmpty = android.text.TextUtils.isEmpty(strA);
        if (!zIsEmpty) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/conversationhistoryutil/ConversationHistoryActionProvider", "isContactSourceValidForEnablingReverseLookup", 397, "ConversationHistoryActionProvider.java")).v("Display name is not empty. Don't show Reverse lookup button");
            if (p.matcher(strA).matches()) {
                this.c.o(defpackage.rmx.CONVERSATION_HISTORY_REVERSE_LOOKUP_DISPLAY_NAME_IS_A_NUMBER);
                return false;
            }
        }
        return zIsEmpty;
    }

    public final amdx q(defpackage.kiu kiuVar, boolean z, boolean z2, boolean z3) {
        int i = z ? 11 : 8;
        amdx amdxVar = new amdx((char[]) null, (byte[]) null, (byte[]) null);
        amdxVar.s(kiuVar.g);
        amdxVar.v(i);
        kiw kiwVar = kiuVar.r;
        if (kiwVar == null) {
            kiwVar = kiw.a;
        }
        amdxVar.u(true != kiwVar.j ? 5 : 4);
        kiw kiwVar2 = kiuVar.r;
        if (kiwVar2 == null) {
            kiwVar2 = kiw.a;
        }
        amdxVar.l(!kiwVar2.g.isEmpty());
        defpackage.akzx akzxVarM = jxb.b.m();
        akzxVarM.u();
        jxb jxbVar = akzxVarM.b;
        jxbVar.d = i - 1;
        jxbVar.c |= 1;
        int i2 = z ? -1 : kiuVar.y;
        akzxVarM.u();
        jxb jxbVar2 = akzxVarM.b;
        jxbVar2.c |= 65536;
        jxbVar2.r = i2;
        akzxVarM.u();
        jxb jxbVar3 = akzxVarM.b;
        jxbVar3.c |= 131072;
        jxbVar3.s = z3;
        amdxVar.m(akzxVarM.r());
        if (z2) {
            amdxVar.p(true);
        }
        defpackage.akzx akzxVarM2 = abvz.a.m();
        java.lang.String string = this.g.d(kiuVar, true).toString();
        akzxVarM2.u();
        abvz abvzVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(string);
        abvzVar.b |= 1;
        abvzVar.c = string;
        kiw kiwVar3 = kiuVar.r;
        if (kiwVar3 == null) {
            kiwVar3 = kiw.a;
        }
        java.lang.String str = kiwVar3.e;
        akzxVarM2.u();
        abvz abvzVar2 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(str);
        abvzVar2.b |= 4;
        abvzVar2.e = str;
        defpackage.akzx akzxVarA = this.x.a(kiuVar, 2);
        akzxVarM2.u();
        abvz abvzVar3 = akzxVarM2.b;
        abwd abwdVarR = akzxVarA.r();
        j$.util.Objects.requireNonNull(abwdVarR);
        abvzVar3.f = abwdVarR;
        abvzVar3.b |= 8;
        kiw kiwVar4 = kiuVar.r;
        if (kiwVar4 == null) {
            kiwVar4 = kiw.a;
        }
        java.lang.String str2 = kiwVar4.h;
        akzxVarM2.u();
        abvz abvzVar4 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(str2);
        abvzVar4.b |= 2;
        abvzVar4.d = str2;
        kiw kiwVar5 = kiuVar.r;
        if (kiwVar5 == null) {
            kiwVar5 = kiw.a;
        }
        defpackage.rmt rmtVarB = defpackage.rmt.b(kiwVar5.o);
        if (rmtVarB == null) {
            rmtVarB = defpackage.rmt.UNKNOWN_SOURCE_TYPE;
        }
        boolean z4 = rmtVarB != defpackage.rmt.UNKNOWN_SOURCE_TYPE;
        akzxVarM2.u();
        abvz abvzVar5 = akzxVarM2.b;
        abvzVar5.b |= 16;
        abvzVar5.g = z4;
        amdxVar.o(akzxVarM2.r());
        return amdxVar;
    }
}
