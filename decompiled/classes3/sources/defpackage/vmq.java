package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vmq implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vmq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object, vcg] */
    public final ajcq a(java.lang.Object obj) {
        ajcq ajcqVarI;
        int i = 5;
        int i2 = 4;
        int i3 = 20;
        int i4 = 3;
        int i5 = 2;
        final int i6 = 0;
        switch (this.$cid) {
            case 0:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                defpackage.vdj vdjVar = new defpackage.vdj(this.a, i3);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((vcg) optionalOfNullable.get()).e((android.telecom.PhoneAccountHandle) vdjVar.a));
                }
                return (ajcq) optionalOfNullable.orElse(aiql.z(j$.util.Optional.empty()));
            case 1:
                j$.util.Optional optionalOfNullable2 = (j$.util.Optional) obj;
                defpackage.vdj vdjVar2 = new defpackage.vdj(this.a, 15);
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = j$.util.Optional.ofNullable(((vcc) optionalOfNullable2.get()).b((android.telecom.PhoneAccountHandle) vdjVar2.a));
                }
                return (ajcq) optionalOfNullable2.orElse(aiql.z(java.lang.Boolean.FALSE));
            case 2:
                j$.util.Optional optionalOfNullable3 = (j$.util.Optional) obj;
                defpackage.vdj vdjVar3 = new defpackage.vdj(this.a, 19);
                if (true == optionalOfNullable3.isPresent()) {
                    optionalOfNullable3 = j$.util.Optional.ofNullable(((vcg) optionalOfNullable3.get()).j((android.telecom.PhoneAccountHandle) vdjVar3.a));
                }
                return (ajcq) optionalOfNullable3.orElse(aiql.z(java.lang.Boolean.FALSE));
            case 3:
                j$.util.Optional optionalOfNullable4 = (j$.util.Optional) obj;
                defpackage.vmu vmuVar = new defpackage.vmu(this.a, i2);
                if (true == optionalOfNullable4.isPresent()) {
                    optionalOfNullable4 = j$.util.Optional.ofNullable(((vcc) optionalOfNullable4.get()).h((android.telecom.PhoneAccountHandle) vmuVar.a, true));
                }
                return (ajcq) optionalOfNullable4.orElse(ajcm.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                j$.util.Optional optionalOfNullable5 = (j$.util.Optional) obj;
                defpackage.vmu vmuVar2 = new defpackage.vmu(this.a, i6);
                if (true == optionalOfNullable5.isPresent()) {
                    optionalOfNullable5 = j$.util.Optional.ofNullable(((vcg) optionalOfNullable5.get()).n((android.telecom.PhoneAccountHandle) vmuVar2.a));
                }
                return (ajcq) optionalOfNullable5.orElse(aiql.z(java.lang.Boolean.FALSE));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj2 = this.a;
                defpackage.vmx vmxVar = (defpackage.vmx) obj2;
                ahrv ahrvVarG = ahrv.g(vmxVar.c.e());
                vmv vmvVar = new vmv(obj2, (java.util.List) obj, 1, (byte[]) null);
                ajct ajctVar = vmxVar.b;
                return ahrvVarG.i(vmvVar, ajctVar).h(new defpackage.vmj(9), ajctVar);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return aiql.v((java.lang.Iterable) j$.util.Collection.-EL.stream((aify) obj).map(new thy(this.a, 16)).collect(aido.a));
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                j$.util.Optional optionalOfNullable6 = (j$.util.Optional) obj;
                defpackage.vmu vmuVar3 = new defpackage.vmu(this.a, i5);
                if (true == optionalOfNullable6.isPresent()) {
                    optionalOfNullable6 = j$.util.Optional.ofNullable(((vcc) optionalOfNullable6.get()).h((android.telecom.PhoneAccountHandle) vmuVar3.a, false));
                }
                return (ajcq) optionalOfNullable6.orElse(ajcm.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                j$.util.Optional optionalOfNullable7 = (j$.util.Optional) obj;
                defpackage.vmu vmuVar4 = new defpackage.vmu(this.a, i4);
                if (true == optionalOfNullable7.isPresent()) {
                    optionalOfNullable7 = j$.util.Optional.ofNullable(((vee) optionalOfNullable7.get()).i((android.telecom.PhoneAccountHandle) vmuVar4.a));
                }
                return (ajcq) optionalOfNullable7.orElse(ajcm.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return ((vee) ((j$.util.Optional) obj).orElseThrow()).k((android.telecom.PhoneAccountHandle) this.a, defpackage.vcn.a, 2);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ahvr.aj((aify) obj).o(new defpackage.vnc(0), ((defpackage.vnd) this.a).a);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                j$.util.Optional optionalOfNullable8 = (j$.util.Optional) obj;
                defpackage.vmu vmuVar5 = new defpackage.vmu(this.a, i);
                if (true == optionalOfNullable8.isPresent()) {
                    optionalOfNullable8 = j$.util.Optional.ofNullable(((vcc) optionalOfNullable8.get()).d((android.telecom.PhoneAccountHandle) vmuVar5.a));
                }
                return (ajcq) optionalOfNullable8.orElse(aiql.z(java.lang.Boolean.FALSE));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.voy voyVar = (defpackage.voy) obj;
                defpackage.vol volVar = (defpackage.vol) this.a;
                android.telecom.PhoneAccountHandle phoneAccountHandle = volVar.l;
                aooh.f(phoneAccountHandle, "phoneAccountHandle");
                aooh.f(voyVar, "voicemailGreeting");
                aooh.f(phoneAccountHandle, "phoneAccountHandle");
                aooh.f(voyVar, "voicemailGreeting");
                defpackage.vpz vpzVar = (defpackage.vpz) volVar.q.a;
                return aosv.F(vpzVar.c, 0, new defpackage.vpw(vpzVar, phoneAccountHandle, voyVar, (aoln) null, 0), 3);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                j$.util.Optional optionalOfNullable9 = (j$.util.Optional) obj;
                defpackage.vmu vmuVar6 = new defpackage.vmu(this.a, 6);
                if (true == optionalOfNullable9.isPresent()) {
                    optionalOfNullable9 = j$.util.Optional.ofNullable(((defpackage.abtr) optionalOfNullable9.get()).f.d((android.telecom.PhoneAccountHandle) vmuVar6.a));
                }
                return (ajcq) optionalOfNullable9.orElse(aiql.z(new defpackage.vok()));
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                aify aifyVar = (aify) j$.util.Collection.-EL.stream((aify) obj).map(new defpackage.vga(i3)).collect(aido.a);
                boolean zIsEmpty = aifyVar.isEmpty();
                java.lang.Object obj3 = this.a;
                defpackage.vul vulVar = ((defpackage.vuk) obj3).b;
                if (zIsEmpty) {
                    ajcqVarI = aiql.z(aike.a);
                } else {
                    vva vvaVar = vulVar.c;
                    vva vvaVar2 = vvaVar;
                    ajcqVarI = ahrv.g(vvaVar2.m.a()).i(new vmv(vvaVar, aifyVar, 10, (byte[]) null), vvaVar2.g);
                }
                return ahrv.g(ajcqVarI).i(new vmv(obj3, aifyVar, 5, (byte[]) null), vulVar.d);
            case 15:
                akzx akzxVarM = defpackage.vts.a.m();
                java.lang.Object obj4 = this.a;
                defpackage.vuk vukVar = (defpackage.vuk) obj4;
                defpackage.vul vulVar2 = vukVar.b;
                ajcq ajcqVarA = vulVar2.m.a();
                ahrv ahrvVarG2 = ahrv.g(ajcqVarA);
                defpackage.vmq vmqVar = new defpackage.vmq(obj4, 14);
                ajct ajctVar2 = vulVar2.d;
                ajcq ajcqVarI2 = ahrvVarG2.i(vmqVar, ajctVar2);
                ajcq ajcqVarB = vulVar2.c.b(j$.util.Optional.empty(), true);
                defpackage.vvm vvmVar = vulVar2.b;
                ajcq ajcqVarH = ahrv.g(vvmVar.e.c()).h(new vrx(7), vvmVar.b);
                return ahvr.af(new ajcq[]{ajcqVarA, ajcqVarB, ajcqVarI2, ajcqVarH}).f(new defpackage.vuh(vukVar, ajcqVarI2, ajcqVarH, akzxVarM, ajcqVarB, ajcqVarA, 0), ajctVar2);
            case 16:
                defpackage.vvm.a.b().l("com/android/dialer/voicemail/tab/impl/dataservice/impl/cache/VisualVoicemailFragmentModelCache", "update", 155, "VisualVoicemailFragmentModelCache.java").v("enter");
                vuj vujVar = new vuj((defpackage.vts) obj, 8);
                java.lang.Object obj5 = this.a;
                defpackage.vvm vvmVar2 = (defpackage.vvm) obj5;
                ajct ajctVar3 = vvmVar2.b;
                return ahrv.g(vvmVar2.e.a(vujVar, ajctVar3)).h(new vuj(obj5, 9), ajctVar3);
            case 17:
                rsr rsrVar = (rsr) obj;
                java.lang.Object obj6 = rsrVar.b;
                java.lang.Object obj7 = rsrVar.a;
                vva vvaVar3 = (vva) this.a;
                return vvaVar3.d.d(android.provider.VoicemailContract.Voicemails.CONTENT_URI, new java.lang.String[]{"source_package", "subscription_component_name", "subscription_id"}, (java.lang.String) obj6, (java.lang.String[]) obj7, (java.lang.String) null).c(ahqx.e(new ajbc() { // from class: vur
                    public final java.lang.Object a(ajyk ajykVar, java.lang.Object obj8) {
                        int i7 = i6;
                        if (i7 == 0) {
                            android.database.Cursor cursor = (android.database.Cursor) obj8;
                            java.lang.String[] strArr = vva.a;
                            java.util.ArrayList arrayList = new java.util.ArrayList(cursor.getCount());
                            if (!cursor.moveToFirst()) {
                                return arrayList;
                            }
                            do {
                                java.lang.String string = cursor.getString(cursor.getColumnIndexOrThrow("source_package"));
                                if (string == null) {
                                    string = "";
                                }
                                java.lang.String string2 = cursor.getString(cursor.getColumnIndexOrThrow("subscription_component_name"));
                                if (string2 == null) {
                                    string2 = "";
                                }
                                java.lang.String string3 = cursor.getString(cursor.getColumnIndexOrThrow("subscription_id"));
                                arrayList.add(new defpackage.vuy(string, string2, string3 != null ? string3 : ""));
                            } while (cursor.moveToNext());
                            return arrayList;
                        }
                        if (i7 == 1) {
                            java.lang.String[] strArr2 = vva.a;
                            return java.lang.Boolean.valueOf(((android.database.Cursor) obj8).moveToFirst());
                        }
                        if (i7 == 2) {
                            android.database.Cursor cursor2 = (android.database.Cursor) obj8;
                            if (vva.j(cursor2)) {
                                throw new java.lang.IllegalStateException("unable to retrieve source package");
                            }
                            return cursor2.getString(0);
                        }
                        if (i7 == 3) {
                            android.database.Cursor cursor3 = (android.database.Cursor) obj8;
                            if (vva.j(cursor3)) {
                                return java.lang.Boolean.FALSE;
                            }
                            int columnIndex = cursor3.getColumnIndex("has_content");
                            if (columnIndex == -1) {
                                a.bI(vva.b.c().m(aioa.b), "HAS_CONTENT index is missing or is not in the expected location", "com/android/dialer/voicemail/tab/impl/dataservice/impl/VoicemailDataServiceImpl", "hasContent", (char) 907, "VoicemailDataServiceImpl.java", zct.b);
                                columnIndex = -1;
                            }
                            return java.lang.Boolean.valueOf(cursor3.getInt(columnIndex) == 1);
                        }
                        if (i7 != 4) {
                            if (i7 == 5) {
                                return java.lang.Boolean.valueOf(((android.database.Cursor) obj8).moveToFirst());
                            }
                            android.database.Cursor cursor4 = (android.database.Cursor) obj8;
                            aigb aigbVar = new aigb(4);
                            while (cursor4.moveToNext()) {
                                java.lang.String string4 = cursor4.getString(cursor4.getColumnIndexOrThrow("node_id_path"));
                                int i8 = cursor4.getInt(cursor4.getColumnIndexOrThrow(com.android.onboarding.config.foregroundpriority.ForegroundPriority.KEY_ACTION));
                                int i9 = cursor4.getInt(cursor4.getColumnIndexOrThrow("event_count"));
                                akzx akzxVarM2 = defpackage.akkn.a.m();
                                akkm akkmVarB = akkm.b(i8);
                                akzxVarM2.u();
                                defpackage.akkn akknVar = (defpackage.akkn) akzxVarM2.b;
                                akknVar.d = akkmVarB.e;
                                akknVar.b |= 1;
                                java.lang.String[] strArrSplit = android.text.TextUtils.split(string4, ",");
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                for (java.lang.String str : strArrSplit) {
                                    arrayList2.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                                }
                                akzxVarM2.aw(arrayList2);
                                aigbVar.i((defpackage.akkn) akzxVarM2.p(), java.lang.Integer.valueOf(i9));
                            }
                            return aigbVar.e(true);
                        }
                        android.database.Cursor cursor5 = (android.database.Cursor) obj8;
                        int i10 = achc.a;
                        java.util.HashMap mapAG = ahvr.aG(cursor5.getCount());
                        while (cursor5.moveToNext()) {
                            int i11 = cursor5.getInt(cursor5.getColumnIndexOrThrow("log_source"));
                            int i12 = cursor5.getInt(cursor5.getColumnIndexOrThrow("event_code"));
                            java.lang.String string5 = cursor5.getString(cursor5.getColumnIndexOrThrow("package_name"));
                            int i13 = cursor5.getInt(cursor5.getColumnIndexOrThrow("event_count"));
                            akzx akzxVarM3 = akiq.a.m();
                            akzxVarM3.u();
                            akiq akiqVar = akzxVarM3.b;
                            akiqVar.b |= 1;
                            akiqVar.c = i11;
                            akzxVarM3.u();
                            akiq akiqVar2 = akzxVarM3.b;
                            akiqVar2.b |= 2;
                            akiqVar2.d = i12;
                            akzxVarM3.u();
                            akiq akiqVar3 = akzxVarM3.b;
                            j$.util.Objects.requireNonNull(string5);
                            akiqVar3.b |= 4;
                            akiqVar3.e = string5;
                            mapAG.put(akzxVarM3.p(), java.lang.Integer.valueOf(i13));
                        }
                        return j$.util.DesugarCollections.unmodifiableMap(mapAG);
                    }
                }), vvaVar3.g).h();
            case 18:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return aiql.z(aike.a);
                }
                java.lang.Object obj8 = this.a;
                vva vvaVar4 = (vva) obj8;
                return ahrv.g(vvaVar4.e(j$.util.Optional.empty())).i(new defpackage.vmq(obj8, 17), vvaVar4.g);
            case 19:
                if (((java.lang.Integer) obj).intValue() <= 0) {
                    return ajcm.a;
                }
                vva vvaVar5 = (vva) this.a;
                vvaVar5.i();
                return vvaVar5.c();
            default:
                java.lang.Object obj9 = this.a;
                return ahvr.F(new vms(obj9, (defpackage.vuz) obj, 10), ((vva) obj9).f);
        }
    }
}
