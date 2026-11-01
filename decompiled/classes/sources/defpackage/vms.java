package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vms implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ vms(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v6, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v70, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v35, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r12v70, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v72, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r12v8, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v81, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.io.IOException {
        switch (this.$cid) {
            case 0:
                return java.lang.Boolean.valueOf(((defpackage.ahbv) this.a).j((android.telecom.PhoneAccountHandle) this.b));
            case 1:
                defpackage.vli vliVar = (defpackage.vli) this.a;
                return java.lang.Boolean.valueOf(new jyn(vliVar.a, (android.telecom.PhoneAccountHandle) this.b, vliVar.c.a(), "phone_account_dependent_").k("is_account_activated"));
            case 2:
                return defpackage.afsq.bX(this.b, this.a);
            case 3:
                j$.nio.file.Path path = j$.io.FileRetargetClass.toPath(((defpackage.vpq) this.b).b.getFilesDir());
                boolean zExists = j$.nio.file.Files.exists(j$.nio.file.Files.createDirectories(path, new j$.nio.file.attribute.FileAttribute[0]), new j$.nio.file.LinkOption[0]);
                ?? r12 = this.a;
                if (!zExists) {
                    throw new java.io.IOException("couldn't create directory");
                }
                java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf(java.util.UUID.randomUUID()));
                java.lang.String string = path.toString();
                java.lang.String strConcat = strValueOf.concat(".amr");
                j$.nio.file.Path path2 = j$.nio.file.Paths.get(string, new java.lang.String[]{strConcat});
                if (!j$.nio.file.Files.exists(path2, new j$.nio.file.LinkOption[0])) {
                    j$.nio.file.Files.createFile(path2, new j$.nio.file.attribute.FileAttribute[0]);
                }
                try {
                    java.io.OutputStream outputStreamNewOutputStream = j$.nio.file.Files.newOutputStream(path2, new j$.nio.file.OpenOption[0]);
                    try {
                        outputStreamNewOutputStream.write(ajee.n((java.util.Collection) r12));
                        if (outputStreamNewOutputStream == null) {
                            return strConcat;
                        }
                        outputStreamNewOutputStream.close();
                        return strConcat;
                    } catch (java.lang.Throwable th) {
                        if (outputStreamNewOutputStream != null) {
                            try {
                                outputStreamNewOutputStream.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            break;
                        }
                        throw th;
                    }
                } catch (java.io.IOException e) {
                    throw new java.io.IOException("Insert greeting audio data into local database failed", e);
                }
            case 4:
                return ((vqt) this.a).b((android.telecom.PhoneAccountHandle) this.b);
            case 5:
                return java.lang.Integer.valueOf(((defpackage.okj) this.a).b((android.telecom.PhoneAccountHandle) this.b));
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.zjs) this.a).j((android.telecom.PhoneAccountHandle) this.b);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                j$.util.Optional optionalD = ((defpackage.oko) this.a).D((android.telecom.PhoneAccountHandle) this.b);
                if (optionalD.isPresent()) {
                    return ((defpackage.oko) optionalD.orElseThrow()).c() != 1989 ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
                }
                ((defpackage.aimw) ((defpackage.aimw) vrz.a.b()).l("com/android/dialer/voicemail/settings/service/VoicemailSettingsModelProducerModule", "isFiAccount", 657, "VoicemailSettingsModelProducerModule.java")).v("invalid PhoneAccountHandle");
                return java.lang.Boolean.FALSE;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.Object obj = this.b;
                defpackage.okj okjVar = (defpackage.okj) this.a;
                int iB = okjVar.b((android.telecom.PhoneAccountHandle) obj);
                if (iB == -1) {
                    return java.lang.Boolean.FALSE;
                }
                return java.lang.Boolean.valueOf(okjVar.a() == iB);
            case 9:
                return defpackage.afsq.bW(this.b, this.a);
            case 10:
                java.lang.Object obj2 = this.a;
                android.content.Context context = ((defpackage.vva) obj2).e;
                java.io.File file = new java.io.File(context.getCacheDir(), "my_cache");
                if (!file.exists()) {
                    file.mkdirs();
                }
                java.lang.Object obj3 = this.b;
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("MM-dd-yy_hhmmaa", java.util.Locale.getDefault());
                vuz vuzVar = (vuz) obj3;
                java.lang.String extensionFromMimeType = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(vuzVar.c);
                java.lang.String str = simpleDateFormat.format(new java.util.Date(vuzVar.b));
                java.lang.String strConcat2 = android.text.TextUtils.isEmpty(extensionFromMimeType) ? "" : ".".concat(java.lang.String.valueOf(extensionFromMimeType));
                java.io.File file2 = new java.io.File(file, vuzVar.a + '_' + str + strConcat2);
                try {
                    java.io.InputStream inputStreamC = afax.c(context, ((vuz) obj3).e, afaw.a("com.android.providers.contacts"));
                    try {
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                        try {
                            defpackage.aisk.a(inputStreamC, fileOutputStream);
                            defpackage.akzx akzxVarM = vtr.a.m();
                            java.lang.String string2 = ((defpackage.vva) obj2).s.u(file2).toString();
                            akzxVarM.u();
                            vtr vtrVar = akzxVarM.b;
                            j$.util.Objects.requireNonNull(string2);
                            vtrVar.b |= 1;
                            vtrVar.c = string2;
                            java.lang.String str2 = (java.lang.String) ((vuz) obj3).d.orElse("");
                            akzxVarM.u();
                            vtr vtrVar2 = akzxVarM.b;
                            j$.util.Objects.requireNonNull(str2);
                            vtrVar2.b |= 2;
                            vtrVar2.d = str2;
                            vtr vtrVarR = akzxVarM.r();
                            fileOutputStream.close();
                            if (inputStreamC != null) {
                                inputStreamC.close();
                            }
                            return vtrVarR;
                        } catch (java.lang.Throwable th3) {
                            try {
                                fileOutputStream.close();
                                break;
                            } catch (java.lang.Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (java.lang.Throwable th5) {
                        if (inputStreamC != null) {
                            try {
                                inputStreamC.close();
                            } catch (java.lang.Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            break;
                        }
                        throw th5;
                    }
                } catch (java.io.IOException e2) {
                    throw new java.io.IOException("failed to copy voicemail", e2);
                }
            case 11:
                ?? r0 = this.a;
                ?? r13 = this.b;
                java.lang.String[] strArr = defpackage.vva.a;
                return java.lang.Integer.valueOf((int) j$.util.Collection.-EL.stream((java.util.List) defpackage.aiql.H(r0)).filter(new defpackage.vpl((defpackage.aify) defpackage.aiql.H(r13), 7)).count());
            case 12:
                android.content.Context context2 = ((vvb) this.b).b;
                android.content.Intent launchIntentForPackage = context2.getPackageManager().getLaunchIntentForPackage((java.lang.String) this.a);
                if (launchIntentForPackage == null) {
                    throw new java.lang.IllegalStateException("VVM App is not installed on the device even though we showed the Open Carrier app action, code somewhere is incorrect.");
                }
                defpackage.ahqx.l(context2, launchIntentForPackage);
                return null;
            case 13:
                return java.lang.Boolean.valueOf(((defpackage.vvl) this.b).s((defpackage.vzi) this.a).l("dialer_feature_version_acknowledged") == 1);
            case 14:
                return java.lang.Boolean.valueOf(((defpackage.vvl) this.b).s((defpackage.vzi) this.a).l("dialer_feature_version_acknowledged") >= 2);
            case 15:
                defpackage.vzi vziVar = (defpackage.vzi) this.a;
                boolean zO = defpackage.vvl.o(vziVar);
                java.lang.Object obj4 = this.b;
                if (zO) {
                    return java.lang.Boolean.valueOf(((defpackage.vvl) obj4).s(vziVar).l("vvm3_tos_version_accepted") >= 2);
                }
                return java.lang.Boolean.valueOf(((defpackage.vvl) obj4).s(vziVar).l("dialer_tos_version_accepted") > 0);
            case 16:
                defpackage.aift aiftVar = new defpackage.aift(4);
                aiftVar.k(this.b.entrySet());
                aiftVar.k(this.a.entrySet());
                return aiftVar.g();
            case 17:
                defpackage.aify aifyVar = (defpackage.aify) defpackage.aiql.H(this.b);
                defpackage.aigf aigfVar = (defpackage.aigf) defpackage.aiql.H(this.a);
                int size = aifyVar.size();
                for (int i = 0; i < size; i++) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) aifyVar.get(i);
                    java.lang.Long asLong = ((android.content.ContentValues) entry.getValue()).getAsLong("timestamp");
                    wqp wqpVar = asLong == null ? null : (wqp) aigfVar.get(asLong);
                    if (wqpVar != null) {
                        wqt wqtVar = wqpVar.e;
                        if (wqtVar == null) {
                            wqtVar = wqt.a;
                        }
                        if ((wqtVar.b & 2) != 0) {
                            android.content.ContentValues contentValues = (android.content.ContentValues) entry.getValue();
                            wqt wqtVar2 = wqpVar.e;
                            if (wqtVar2 == null) {
                                wqtVar2 = wqt.a;
                            }
                            wgu wguVar = wqtVar2.d;
                            if (wguVar == null) {
                                wguVar = wgu.a;
                            }
                            contentValues.put("xatu_call_details", wguVar.i());
                        }
                    }
                }
                return null;
            case 18:
                return ((defpackage.akzx) j$.util.Map.-EL.getOrDefault((java.util.Map) ((voc) this.b).a, this.a, amto.a.m())).r();
            case 19:
                ((voc) this.b).a.remove(this.a);
                return null;
            default:
                wsk wskVar = (wsk) this.b;
                ?? r1 = wskVar.c;
                java.lang.Object obj5 = this.a;
                if (!r1.containsKey(obj5)) {
                    return aiys.a;
                }
                defpackage.akzx akzxVar = (defpackage.akzx) r1.get(obj5);
                long jLongValue = ((java.lang.Long) wskVar.a.a()).longValue();
                akzxVar.u();
                aiys aiysVar = akzxVar.b;
                aiys aiysVar2 = aiys.a;
                aiysVar.b |= 1;
                aiysVar.d = jLongValue;
                return akzxVar.r();
        }
    }

    public /* synthetic */ vms(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
