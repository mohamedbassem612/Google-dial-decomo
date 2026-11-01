package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vzh {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusQuery");
    public static final java.lang.String[] b = {"source_package", "settings_uri", "voicemail_access_uri", "configuration_state", "data_channel_state", "notification_channel_state", "quota_occupied", "quota_total", "phone_account_component_name", "phone_account_id", "source_type"};
    public static final defpackage.aify c = defpackage.aify.p("com.android.phone");
    public static final defpackage.aify d = defpackage.aify.r("vvm_type_omtp", "vvm_type_cvvm", "vvm_type_vvm3");
    public final android.content.Context e;
    public final defpackage.ojo f;
    private final defpackage.ajct g;
    private final defpackage.aoin h;
    private final defpackage.oko i;
    private final defpackage.ajct j;
    private final defpackage.ajct k;

    public vzh(android.content.Context context, defpackage.ajct ajctVar, defpackage.aoin aoinVar, defpackage.oko okoVar, defpackage.ajct ajctVar2, defpackage.ajct ajctVar3, defpackage.ojo ojoVar) {
        this.e = context;
        this.g = ajctVar;
        this.h = aoinVar;
        this.i = okoVar;
        this.j = ajctVar2;
        this.k = ajctVar3;
        this.f = ojoVar;
    }

    public static int a(android.database.Cursor cursor, java.lang.String str, int i) {
        int columnIndex = cursor.getColumnIndex(str);
        return !cursor.isNull(columnIndex) ? cursor.getInt(columnIndex) : i;
    }

    public static j$.util.Optional d(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return j$.util.Optional.empty();
        }
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(android.content.ComponentName.unflattenFromString(str));
        defpackage.okr okrVar = new defpackage.okr(str2, 6);
        if (true != optionalOfNullable.isPresent()) {
            return optionalOfNullable;
        }
        return j$.util.Optional.ofNullable(new android.telecom.PhoneAccountHandle((android.content.ComponentName) optionalOfNullable.get(), (java.lang.String) okrVar.a));
    }

    public static java.lang.String e(android.database.Cursor cursor, java.lang.String str, java.lang.String str2) {
        int columnIndex = cursor.getColumnIndex(str);
        return !cursor.isNull(columnIndex) ? cursor.getString(columnIndex) : str2;
    }

    public final int b(j$.util.Optional optional) {
        if (optional.isPresent()) {
            return ((java.lang.Integer) this.i.i((android.telecom.PhoneAccountHandle) optional.orElseThrow()).p().orElseThrow(new defpackage.kjx(5))).intValue() == 0 ? 0 : 1;
        }
        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusQuery", "getNotificationChannelStateFromTelephony", (char) 299, "VoicemailStatusQuery.java")).v("null PhoneAccountHandle");
        return 1;
    }

    public final defpackage.vzi c(defpackage.vzi vziVar) {
        if (vziVar == null) {
            throw new java.lang.IllegalArgumentException();
        }
        defpackage.akzx akzxVarN = defpackage.vzi.a.n(vziVar);
        j$.util.Optional optionalD = d(vziVar.e, vziVar.f);
        android.content.Context context = this.e;
        int iB = vziVar.c.equals(context.getPackageName()) ? b(optionalD) : vziVar.j;
        if ((vziVar.b & 512) == 0) {
            akzxVarN.u();
            defpackage.vzi vziVar2 = (defpackage.vzi) akzxVarN.b;
            vziVar2.b |= 512;
            vziVar2.l = -1;
        }
        if ((vziVar.b & 256) == 0) {
            akzxVarN.u();
            defpackage.vzi vziVar3 = (defpackage.vzi) akzxVarN.b;
            vziVar3.b |= 256;
            vziVar3.k = -1;
        }
        akzxVarN.u();
        defpackage.vzi vziVar4 = (defpackage.vzi) akzxVarN.b;
        vziVar4.b |= 128;
        vziVar4.j = iB;
        boolean zF = f(vziVar.c, optionalD, vziVar.h);
        akzxVarN.u();
        defpackage.vzi vziVar5 = (defpackage.vzi) akzxVarN.b;
        vziVar5.b |= 4096;
        vziVar5.m = zF;
        boolean z = android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        akzxVarN.u();
        defpackage.vzi vziVar6 = (defpackage.vzi) akzxVarN.b;
        vziVar6.b |= 8192;
        vziVar6.n = z;
        return (defpackage.vzi) akzxVarN.r();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
    public final boolean f(java.lang.String str, j$.util.Optional optional, int i) {
        int i2 = 1;
        if (this.e.getPackageName().equals(str)) {
            if (optional.isPresent()) {
                defpackage.aoin aoinVar = this.h;
                if (((defpackage.ahbv) aoinVar.a()).k()) {
                    defpackage.ahbv ahbvVar = (defpackage.ahbv) aoinVar.a();
                    android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) optional.orElseThrow();
                    if (!((java.lang.Boolean) ((defpackage.aogc) ahbvVar.d).aM(phoneAccountHandle).a(new defpackage.adqp(ahbvVar, phoneAccountHandle, i2)).a(defpackage.mgv.VVM_HAS_CARRIER_SUPPORT).f()).booleanValue()) {
                        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusQuery", "isStatusActive", 329, "VoicemailStatusQuery.java")).v("carrier not supported");
                    } else if (!((defpackage.ahbv) aoinVar.a()).j((android.telecom.PhoneAccountHandle) optional.orElseThrow())) {
                        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusQuery", "isStatusActive", 335, "VoicemailStatusQuery.java")).y("VVM disabled. PhoneAccountHandle: %s", optional);
                    } else if (i != 1) {
                        return true;
                    }
                } else {
                    ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusQuery", "isStatusActive", 323, "VoicemailStatusQuery.java")).v("module disabled");
                }
            }
        } else if (i != 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final defpackage.ajcq g(defpackage.rsr rsrVar) {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(rsrVar);
        defpackage.rsr rsrVar2 = new defpackage.rsr();
        defpackage.jyv jyvVar = new defpackage.jyv(rsrVar2, 17);
        if (true == optionalOfNullable.isPresent()) {
            java.lang.Object obj = optionalOfNullable.get();
            ((defpackage.rsr) jyvVar.a).aC((defpackage.rsr) obj);
        }
        defpackage.oko okoVar = this.i;
        j$.util.Objects.requireNonNull(okoVar);
        defpackage.vcz vczVar = new defpackage.vcz(okoVar, 2);
        defpackage.ajct ajctVar = this.k;
        long j = defpackage.ahqx.a;
        defpackage.ajdk ajdkVar = new defpackage.ajdk(new defpackage.ajav(defpackage.ahns.c(false), vczVar, 1));
        ajctVar.execute(ajdkVar);
        defpackage.vut vutVar = new defpackage.vut(rsrVar2, 4);
        defpackage.ajct ajctVar2 = this.j;
        defpackage.ahqv ahqvVar = new defpackage.ahqv(defpackage.ahns.c(false), vutVar);
        int i = defpackage.ajan.c;
        defpackage.ajam ajamVar = new defpackage.ajam(ajdkVar, ahqvVar);
        ajdkVar.c(ajamVar, defpackage.aiql.t(ajctVar2, ajamVar));
        defpackage.ahyc ahycVar = new defpackage.ahyc() { // from class: vzf
            @Override // defpackage.ahyc
            public final java.lang.Object apply(java.lang.Object obj2) {
                defpackage.rsr rsrVar3 = (defpackage.rsr) obj2;
                char c2 = 4;
                defpackage.aift aiftVar = new defpackage.aift(4);
                defpackage.vzh vzhVar = this.a;
                try {
                    android.database.Cursor cursorB = vzhVar.f.b(android.provider.VoicemailContract.Status.CONTENT_URI, defpackage.vzh.b, (java.lang.String) rsrVar3.b, (java.lang.String[]) rsrVar3.a, null);
                    try {
                        if (cursorB == null) {
                            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vzh.a.d()).i(defpackage.zct.b)).l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusQuery", "startQuery", 132, "VoicemailStatusQuery.java")).v("query failed. Null cursor.");
                            return aiftVar.g();
                        }
                        while (cursorB.moveToNext()) {
                            if (cursorB.getCount() == 0) {
                                throw new java.lang.IllegalArgumentException();
                            }
                            java.lang.String strE = defpackage.vzh.e(cursorB, "source_package", "");
                            java.lang.String strE2 = defpackage.vzh.e(cursorB, "phone_account_component_name", "");
                            java.lang.String strE3 = defpackage.vzh.e(cursorB, "phone_account_id", "");
                            java.lang.String strE4 = defpackage.vzh.e(cursorB, "source_type", "vvm_type_omtp");
                            j$.util.Optional optionalD = defpackage.vzh.d(strE2, strE3);
                            android.content.Context context = vzhVar.e;
                            int iB = strE.equals(context.getPackageName()) ? vzhVar.b(optionalD) : defpackage.vzh.a(cursorB, "notification_channel_state", 1);
                            int iA = defpackage.vzh.a(cursorB, "configuration_state", 1);
                            boolean zF = vzhVar.f(strE, optionalD, iA);
                            defpackage.akzx akzxVarM = defpackage.vzi.a.m();
                            akzxVarM.u();
                            char c3 = c2;
                            defpackage.vzi vziVar = (defpackage.vzi) akzxVarM.b;
                            j$.util.Objects.requireNonNull(strE);
                            vziVar.b |= 1;
                            vziVar.c = strE;
                            akzxVarM.u();
                            defpackage.vzi vziVar2 = (defpackage.vzi) akzxVarM.b;
                            j$.util.Objects.requireNonNull(strE2);
                            vziVar2.b |= 4;
                            vziVar2.e = strE2;
                            akzxVarM.u();
                            defpackage.vzi vziVar3 = (defpackage.vzi) akzxVarM.b;
                            j$.util.Objects.requireNonNull(strE3);
                            vziVar3.b |= 8;
                            vziVar3.f = strE3;
                            akzxVarM.u();
                            defpackage.vzi vziVar4 = (defpackage.vzi) akzxVarM.b;
                            j$.util.Objects.requireNonNull(strE4);
                            vziVar4.b |= 2;
                            vziVar4.d = strE4;
                            akzxVarM.u();
                            defpackage.vzi vziVar5 = (defpackage.vzi) akzxVarM.b;
                            vziVar5.b |= 32;
                            vziVar5.h = iA;
                            akzxVarM.u();
                            defpackage.vzi vziVar6 = (defpackage.vzi) akzxVarM.b;
                            vziVar6.b |= 128;
                            vziVar6.j = iB;
                            int iA2 = defpackage.vzh.a(cursorB, "data_channel_state", 1);
                            akzxVarM.u();
                            defpackage.vzi vziVar7 = (defpackage.vzi) akzxVarM.b;
                            vziVar7.b |= 64;
                            vziVar7.i = iA2;
                            boolean z = android.provider.Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
                            akzxVarM.u();
                            defpackage.vzi vziVar8 = (defpackage.vzi) akzxVarM.b;
                            vziVar8.b |= 8192;
                            vziVar8.n = z;
                            int iA3 = defpackage.vzh.a(cursorB, "quota_occupied", -1);
                            akzxVarM.u();
                            defpackage.vzi vziVar9 = (defpackage.vzi) akzxVarM.b;
                            vziVar9.b |= 256;
                            vziVar9.k = iA3;
                            int iA4 = defpackage.vzh.a(cursorB, "quota_total", -1);
                            akzxVarM.u();
                            defpackage.vzi vziVar10 = (defpackage.vzi) akzxVarM.b;
                            vziVar10.b |= 512;
                            vziVar10.l = iA4;
                            akzxVarM.u();
                            defpackage.vzi vziVar11 = (defpackage.vzi) akzxVarM.b;
                            vziVar11.b |= 4096;
                            vziVar11.m = zF;
                            aiftVar.i((defpackage.vzi) akzxVarM.r());
                            c2 = c3;
                        }
                        cursorB.close();
                        return aiftVar.g();
                    } catch (java.lang.Throwable th) {
                        if (cursorB == null) {
                            throw th;
                        }
                        try {
                            cursorB.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                        return aiftVar.g();
                    }
                } catch (java.lang.RuntimeException e) {
                    ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.vzh.a.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusQuery", "startQuery", (char) 145, "VoicemailStatusQuery.java")).v("failed to fetch voicemail status");
                }
            }
        };
        defpackage.ajct ajctVar3 = this.g;
        defpackage.ajam ajamVar2 = new defpackage.ajam(ajamVar, new defpackage.ahqv(defpackage.ahns.c(false), ahycVar));
        ajamVar.c(ajamVar2, defpackage.aiql.t(ajctVar3, ajamVar2));
        return ajamVar2;
    }
}
