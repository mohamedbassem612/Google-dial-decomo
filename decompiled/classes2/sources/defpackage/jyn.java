package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jyn {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public jyn(com.android.dialer.calllog.chips.container.CallLogChipContainerView callLogChipContainerView, ajwr ajwrVar) {
        this.a = callLogChipContainerView;
        this.b = ajwrVar;
        android.content.Context context = callLogChipContainerView.getContext();
        aooh.e(context, "getContext(...)");
        this.d = context;
        com.android.dialer.calllog.chips.container.CallLogChipContainerView.inflate(context, 2131624049, callLogChipContainerView);
        android.view.View viewFindViewById = callLogChipContainerView.findViewById(2131427760);
        aooh.e(viewFindViewById, "findViewById(...)");
        this.c = (android.widget.LinearLayout) viewFindViewById;
    }

    public static boolean d(defpackage.jrz jrzVar) {
        defpackage.kiw kiwVar = jrzVar.d;
        if (kiwVar == null) {
            kiwVar = defpackage.kiw.a;
        }
        rmt rmtVarB = rmt.b(kiwVar.o);
        if (rmtVarB == null) {
            rmtVarB = rmt.a;
        }
        return rmtVarB.equals(rmt.f);
    }

    public final int a() {
        return ((android.widget.LinearLayout) this.c).getChildCount();
    }

    public final com.google.android.material.chip.Chip b(int i) {
        com.google.android.material.chip.Chip childAt = ((android.widget.LinearLayout) this.c).getChildAt(i);
        aooh.d(childAt, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        return childAt;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq c(defpackage.jrz jrzVar, boolean z) {
        defpackage.hkd hkdVar = jrzVar.c;
        if (hkdVar == null) {
            hkdVar = defpackage.hkd.a;
        }
        java.lang.Object obj = this.d;
        java.lang.String str = hkdVar.c;
        akzx akzxVarM = jsm.a.m();
        long j = jrzVar.e;
        akzxVarM.u();
        jsm jsmVar = akzxVarM.b;
        jsmVar.b |= 1;
        jsmVar.c = j;
        jsk jskVar = (jsk) obj;
        return ahrv.g(ahrv.g(jskVar.a(str)).i(new defpackage.jsf(obj, z, akzxVarM.p(), str, 0), jskVar.b)).h(new defpackage.jss(this, 3), (java.util.concurrent.Executor) this.b);
    }

    public final defpackage.lop e() {
        i();
        return new defpackage.lop(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final java.lang.Object f(java.lang.String str, java.lang.Object obj) {
        java.lang.Object obj2;
        return (!j(str) || (obj2 = this.b.getAll().get(g(str))) == null) ? obj : obj2;
    }

    public final java.lang.String g(java.lang.String str) {
        return h(str, ((android.telecom.PhoneAccountHandle) this.d).getId());
    }

    public final java.lang.String h(java.lang.String str, java.lang.String str2) {
        return ((java.lang.String) this.a) + str + '_' + str2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void i() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.SecurityException securityException;
        j$.util.Optional optionalEmpty;
        java.lang.Object obj;
        char c;
        int i = android.os.Build.VERSION.SDK_INT;
        java.lang.Object obj2 = this.c;
        if (i >= 33) {
            ?? r2 = this.b;
            char c2 = 0;
            if (r2.getBoolean("pre_t_phone_account_migration_completed", false)) {
                return;
            }
            aimz aimzVar = defpackage.lor.a;
            java.lang.String str3 = "PerAccountSharedPreferencesTMigrator.java";
            aimzVar.b().l("com/android/dialer/common/PerAccountSharedPreferencesTMigrator", "migrate", 56, "PerAccountSharedPreferencesTMigrator.java").v("migrating");
            android.content.SharedPreferences.Editor editorEdit = r2.edit();
            try {
                java.util.Iterator it = mni.cy((android.content.Context) obj2).dO().s().iterator();
                while (it.hasNext()) {
                    android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) it.next();
                    java.lang.String id = ((android.telecom.PhoneAccountHandle) this.d).getId();
                    j$.util.Optional optionalH = mni.cy((android.content.Context) obj2).bd().h(phoneAccountHandle);
                    if (optionalH.isPresent()) {
                        java.lang.String iccId = ((android.telephony.SubscriptionInfo) optionalH.orElseThrow()).getIccId();
                        c = c2;
                        int i2 = 1;
                        obj = obj2;
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        objArr[c] = this.a;
                        objArr[1] = iccId;
                        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(java.lang.String.format("%s(?:.*)_(%s(?:.*))", objArr));
                        java.util.Iterator<java.lang.String> it2 = r2.getAll().keySet().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                aimzVar.b().l("com/android/dialer/common/PerAccountSharedPreferencesTMigrator", "getFullIccId", 136, "PerAccountSharedPreferencesTMigrator.java").v("preferences with ICCID not found, nothing to migrate.");
                                optionalEmpty = j$.util.Optional.empty();
                                break;
                            } else {
                                java.util.regex.Matcher matcher = patternCompile.matcher(it2.next());
                                if (matcher.matches()) {
                                    optionalEmpty = j$.util.Optional.ofNullable(matcher.group(i2));
                                    break;
                                }
                                i2 = 1;
                            }
                        }
                    } else {
                        try {
                            a.bI(aimzVar.d(), "missing subscription info", "com/android/dialer/common/PerAccountSharedPreferencesTMigrator", "getFullIccId", 'u', "PerAccountSharedPreferencesTMigrator.java", zct.b);
                            optionalEmpty = j$.util.Optional.empty();
                            obj = obj2;
                            c = c2;
                        } catch (java.lang.SecurityException e) {
                            securityException = e;
                            str = str3;
                            java.lang.String str4 = str;
                            a.bq(defpackage.lor.a.c(), "cannot read phone accounts", "com/android/dialer/common/PerAccountSharedPreferencesTMigrator", "migrate", '`', str4, securityException, zct.b);
                            str2 = str4;
                            editorEdit.putBoolean("pre_t_phone_account_migration_completed", true);
                            editorEdit.apply();
                            defpackage.lor.a.b().l("com/android/dialer/common/PerAccountSharedPreferencesTMigrator", "migrate", 102, str2).v("migration completed");
                        }
                    }
                    if (optionalEmpty.isPresent()) {
                        java.lang.String str5 = (java.lang.String) optionalEmpty.orElseThrow();
                        defpackage.lor.a(editorEdit, "legacy_voicemail_dismissed", str5, id, this);
                        defpackage.lor.a(editorEdit, "is_enabled", str5, id, this);
                        defpackage.lor.a(editorEdit, "is_account_activated", str5, id, this);
                        defpackage.lor.a(editorEdit, "voicemail_archive_promo_was_dismissed", str5, id, this);
                        defpackage.lor.a(editorEdit, "voicemail_archive_almost_full_promo_was_dismissed", str5, id, this);
                        defpackage.lor.a(editorEdit, "accept_cellular_data", str5, id, this);
                        defpackage.lor.a(editorEdit, "pre_o_migration_finished", str5, id, this);
                        defpackage.lor.a(editorEdit, "deactivated_by_carrier_application_installed", str5, id, this);
                        defpackage.lor.a(editorEdit, "transcribe_voicemails", str5, id, this);
                        defpackage.lor.a(editorEdit, "donate_voicemails", str5, id, this);
                        defpackage.lor.a(editorEdit, "is_account_activated", str5, id, this);
                        defpackage.lor.b(editorEdit, "vvm3_tos_version_accepted", str5, id, this);
                        defpackage.lor.b(editorEdit, "dialer_tos_version_accepted", str5, id, this);
                        defpackage.lor.b(editorEdit, "dialer_feature_version_acknowledged", str5, id, this);
                        if (r2.contains(h("vvm_last_deactivation_timestamp_millis", str5))) {
                            str = str3;
                            try {
                                editorEdit.putLong(h("vvm_last_deactivation_timestamp_millis", id), r2.getLong(h("vvm_last_deactivation_timestamp_millis", str5), 0L));
                            } catch (java.lang.SecurityException e2) {
                                e = e2;
                                securityException = e;
                                java.lang.String str6 = str;
                                a.bq(defpackage.lor.a.c(), "cannot read phone accounts", "com/android/dialer/common/PerAccountSharedPreferencesTMigrator", "migrate", '`', str6, securityException, zct.b);
                                str2 = str6;
                                editorEdit.putBoolean("pre_t_phone_account_migration_completed", true);
                                editorEdit.apply();
                                defpackage.lor.a.b().l("com/android/dialer/common/PerAccountSharedPreferencesTMigrator", "migrate", 102, str2).v("migration completed");
                            }
                        } else {
                            str = str3;
                        }
                        defpackage.lor.c(editorEdit, "pw_len", str5, id, this);
                        defpackage.lor.c(editorEdit, "u", str5, id, this);
                        defpackage.lor.c(editorEdit, "pw", str5, id, this);
                        defpackage.lor.c(editorEdit, "srv", str5, id, this);
                        defpackage.lor.c(editorEdit, "ipt", str5, id, this);
                        defpackage.lor.c(editorEdit, "default_old_pin", str5, id, this);
                        str3 = str;
                        it = it;
                    }
                    c2 = c;
                    obj2 = obj;
                }
                str2 = str3;
            } catch (java.lang.SecurityException e3) {
                e = e3;
                str = str3;
            }
            editorEdit.putBoolean("pre_t_phone_account_migration_completed", true);
            editorEdit.apply();
            defpackage.lor.a.b().l("com/android/dialer/common/PerAccountSharedPreferencesTMigrator", "migrate", 102, str2).v("migration completed");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean j(java.lang.String str) {
        i();
        return this.b.contains(g(str));
    }

    public final boolean k(java.lang.String str) {
        i();
        return ((java.lang.Boolean) f(str, java.lang.Boolean.FALSE)).booleanValue();
    }

    public final int l(java.lang.String str) {
        i();
        return ((java.lang.Integer) f(str, 0)).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aoin, java.lang.Object] */
    public final defpackage.lhl m() {
        zdl zdlVar = (zdl) this.a.a();
        zdlVar.getClass();
        oju ojuVar = (oju) this.b.a();
        ojuVar.getClass();
        uss ussVar = (uss) this.d.a();
        ussVar.getClass();
        ajct ajctVar = (ajct) this.c.a();
        ajctVar.getClass();
        return new defpackage.lhl(zdlVar, ojuVar, ussVar, ajctVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(int i, java.lang.String str, aoln aolnVar) {
        defpackage.iur iurVar;
        if (aolnVar instanceof defpackage.iur) {
            iurVar = (defpackage.iur) aolnVar;
            int i2 = iurVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iurVar.b = i2 - Integer.MIN_VALUE;
            } else {
                iurVar = new defpackage.iur(this, aolnVar);
            }
        } else {
            iurVar = new defpackage.iur(this, aolnVar);
        }
        java.lang.Object objD = iurVar.a;
        aolu aoluVar = aolu.a;
        int i3 = iurVar.b;
        if (i3 == 0) {
            aooc.af(objD);
            java.io.File file = new java.io.File(((android.content.Context) this.c).getCacheDir().getAbsolutePath(), str);
            if (file.exists()) {
                return file;
            }
            ajcq ajcqVarA = ((uxy) this.a).a(i, str);
            iurVar.b = 1;
            objD = aosv.D(ajcqVarA, iurVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        aooh.e(objD, "await(...)");
        java.io.File file2 = (java.io.File) aooh.q((j$.util.Optional) objD);
        if (file2 == null) {
            throw new java.lang.IllegalStateException("Sound file is not available.");
        }
        return file2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(aoln aolnVar) {
        defpackage.ius iusVar;
        if (aolnVar instanceof defpackage.ius) {
            iusVar = (defpackage.ius) aolnVar;
            int i = iusVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                iusVar.b = i - Integer.MIN_VALUE;
            } else {
                iusVar = new defpackage.ius(this, aolnVar);
            }
        } else {
            iusVar = new defpackage.ius(this, aolnVar);
        }
        java.lang.Object objN = iusVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iusVar.b;
        if (i2 == 0) {
            aooc.af(objN);
            iusVar.b = 1;
            objN = n(2131951719, "vm_beep_mono.ogg", iusVar);
            if (objN != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objN);
            return objN;
        }
        aooc.af(objN);
        ajcq ajcqVarI = ((defpackage.hxv) this.d).i(new defpackage.hxx((java.io.File) objN));
        iusVar.b = 2;
        java.lang.Object objD = aosv.D(ajcqVarI, iusVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p(defpackage.orr orrVar, aoln aolnVar) {
        defpackage.iut iutVar;
        defpackage.ivj ivjVar;
        if (aolnVar instanceof defpackage.iut) {
            iutVar = (defpackage.iut) aolnVar;
            int i = iutVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                iutVar.b = i - Integer.MIN_VALUE;
            } else {
                iutVar = new defpackage.iut(this, aolnVar);
            }
        } else {
            iutVar = new defpackage.iut(this, aolnVar);
        }
        java.lang.Object objB = iutVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iutVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ivjVar = iutVar.c;
                aooc.af(objB);
            }
            return new defpackage.ivk(ivjVar.a, (defpackage.hxf) objB);
        }
        aooc.af(objB);
        java.lang.Object obj = this.b;
        iutVar.b = 1;
        objB = ((defpackage.jkq) obj).b(orrVar, iutVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        java.lang.Object obj2 = this.d;
        defpackage.ivj ivjVar2 = (defpackage.ivj) objB;
        java.lang.Object obj3 = ivjVar2.b;
        aooc.af(obj3);
        ajcq ajcqVarI = ((defpackage.hxv) obj2).i((defpackage.hxw) obj3);
        iutVar.c = ivjVar2;
        iutVar.b = 2;
        objB = aosv.D(ajcqVarI, iutVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        ivjVar = ivjVar2;
        return new defpackage.ivk(ivjVar.a, (defpackage.hxf) objB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object q(defpackage.mne mneVar, aoln aolnVar) {
        defpackage.irp irpVar;
        if (aolnVar instanceof defpackage.irp) {
            irpVar = (defpackage.irp) aolnVar;
            int i = irpVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                irpVar.b = i - Integer.MIN_VALUE;
            } else {
                irpVar = new defpackage.irp(this, aolnVar);
            }
        } else {
            irpVar = new defpackage.irp(this, aolnVar);
        }
        java.lang.Object objA = irpVar.a;
        aolu aoluVar = aolu.a;
        int i2 = irpVar.b;
        if (i2 == 0) {
            aooc.af(objA);
            if (((defpackage.iqp) this.c).c()) {
                defpackage.mnd mndVarB = defpackage.mnd.b(mneVar.c);
                if (mndVarB == null) {
                    mndVarB = defpackage.mnd.UNRECOGNIZED;
                }
                if (mndVarB == defpackage.mnd.BEESLY) {
                    java.lang.Object obj = this.d;
                    java.lang.Object obj2 = this.a;
                    irpVar.b = 1;
                    objA = ((defpackage.iwy) obj).a((java.lang.String) obj2, true, irpVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                }
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aooc.af(objA);
        if (((java.lang.Boolean) objA).booleanValue()) {
            java.lang.Object obj3 = this.b;
            defpackage.hgw hgwVarO = defpackage.hhk.o(defpackage.jhv.a.m());
            hgwVarO.f(3);
            ((zij) obj3).c(hgwVarO.e());
        }
        return aojh.a;
    }

    public final void r() {
        ((defpackage.evi) this.a).b(0);
    }

    public final void s(long j, defpackage.etx etxVar) {
        ((defpackage.evi) this.a).a(j, etxVar);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    public final void t(defpackage.fll fllVar, defpackage.fvb fvbVar) {
        int i = 0;
        while (true) {
            defpackage.fmk[] fmkVarArr = (defpackage.fmk[]) this.c;
            if (i >= fmkVarArr.length) {
                return;
            }
            fvbVar.c();
            defpackage.fmk fmkVarR = fllVar.r(fvbVar.a(), 3);
            defpackage.eqg eqgVar = (defpackage.eqg) this.d.get(i);
            java.lang.String str = eqgVar.p;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            ahvr.bR(z, "Invalid closed caption MIME type provided: %s", str);
            java.lang.String strB = eqgVar.a;
            if (strB == null) {
                strB = fvbVar.b();
            }
            defpackage.eqf eqfVar = new defpackage.eqf();
            eqfVar.a = strB;
            eqfVar.a((java.lang.String) this.b);
            eqfVar.c(str);
            eqfVar.e = eqgVar.e;
            eqfVar.d = eqgVar.d;
            eqfVar.L = eqgVar.N;
            eqfVar.q = eqgVar.s;
            fmkVarR.p(new defpackage.eqg(eqfVar));
            fmkVarArr[i] = fmkVarR;
            i++;
        }
    }

    public final void u() {
        ((defpackage.evi) this.a).b(0);
    }

    public final void v(int i) {
        ((defpackage.evi) this.a).c(i);
    }

    public jyn(ajct ajctVar, kjr kjrVar, defpackage.jtp jtpVar, jsk jskVar) {
        this.b = ajctVar;
        this.c = kjrVar;
        this.a = jtpVar;
        this.d = jskVar;
    }

    @java.lang.Deprecated
    public jyn(android.content.Context context, android.telecom.PhoneAccountHandle phoneAccountHandle, android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        this.c = context;
        this.b = sharedPreferences;
        this.d = phoneAccountHandle;
        this.a = str;
    }

    public jyn(android.content.Context context, aolr aolrVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "backgroundContext");
        this.d = context;
        this.b = aolrVar;
        this.a = aoinVar;
        this.c = aoinVar2;
    }

    public jyn(android.content.Context context, j$.util.Optional optional, j$.util.Optional optional2, huy huyVar) {
        this.c = context;
        this.b = optional;
        this.a = optional2;
        this.d = huyVar;
    }

    public jyn(android.content.Context context, defpackage.jkq jkqVar, defpackage.hxv hxvVar, uxy uxyVar) {
        aooh.f(context, "appContext");
        aooh.f(hxvVar, "audioInjector");
        this.c = context;
        this.b = jkqVar;
        this.d = hxvVar;
        this.a = uxyVar;
    }

    public jyn(defpackage.fvh fvhVar, defpackage.oq oqVar, byte[] bArr, xhk[] xhkVarArr) {
        this.b = fvhVar;
        this.a = oqVar;
        this.d = bArr;
        this.c = xhkVarArr;
    }

    public jyn(zij zijVar, defpackage.iwy iwyVar, defpackage.iqp iqpVar, java.lang.String str) {
        aooh.f(str, "callId");
        this.b = zijVar;
        this.d = iwyVar;
        this.c = iqpVar;
        this.a = str;
    }

    public jyn(ajct ajctVar, zpz zpzVar) {
        this.d = new ajwr();
        this.a = new java.util.concurrent.atomic.AtomicInteger();
        this.b = ajctVar;
        this.c = zpzVar;
    }

    public jyn(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4) {
        aoinVar.getClass();
        this.a = aoinVar;
        aoinVar2.getClass();
        this.b = aoinVar2;
        aoinVar3.getClass();
        this.d = aoinVar3;
        aoinVar4.getClass();
        this.c = aoinVar4;
    }

    public jyn(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, byte[] bArr) {
        aoinVar.getClass();
        this.d = aoinVar;
        aoinVar2.getClass();
        this.a = aoinVar2;
        aoinVar3.getClass();
        this.c = aoinVar3;
        aoinVar4.getClass();
        this.b = aoinVar4;
    }

    public jyn(ajct ajctVar, kjr kjrVar, jsk jskVar, defpackage.jtr jtrVar) {
        this.b = ajctVar;
        this.c = kjrVar;
        this.d = jskVar;
        this.a = jtrVar;
    }

    public jyn(java.util.List list) {
        this.d = list;
        this.b = "video/mp2t";
        this.c = new defpackage.fmk[list.size()];
        this.a = new defpackage.evi(new defpackage.fuu(this, 0));
    }

    public jyn(java.util.List list, ils ilsVar, ils ilsVar2, ils ilsVar3) {
        this.c = list != null ? aify.n(list) : aike.a;
        this.d = ilsVar;
        this.b = ilsVar2;
        this.a = ilsVar3;
    }

    public jyn(kaw kawVar, aolr aolrVar, aoss aossVar, zzx zzxVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        this.c = kawVar;
        this.b = aolrVar;
        this.a = aossVar;
        this.d = aooc.ag(new defpackage.kgq(zzxVar, 12));
    }

    public jyn(android.content.Context context, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        this(context, phoneAccountHandle, android.preference.PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()), "visual_voicemail_");
    }
}
