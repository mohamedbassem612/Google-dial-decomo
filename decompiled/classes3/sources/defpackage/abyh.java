package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abyh extends ylc implements android.os.IInterface {
    final /* synthetic */ com.google.android.libraries.dialer.videocall.impl.VideoCallCheckerService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abyh(com.google.android.libraries.dialer.videocall.impl.VideoCallCheckerService videoCallCheckerService) {
        super("com.google.android.libraries.dialer.videocall.VideoCallCheckerInterface");
        j$.util.Objects.requireNonNull(videoCallCheckerService);
        this.a = videoCallCheckerService;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x012d A[Catch: SecurityException -> 0x01e0, TryCatch #4 {SecurityException -> 0x01e0, blocks: (B:23:0x008b, B:25:0x0097, B:88:0x01d4, B:27:0x00ad, B:29:0x00b3, B:31:0x00bd, B:33:0x00c5, B:35:0x00cb, B:38:0x00d5, B:40:0x00dd, B:42:0x00e5, B:51:0x0118, B:62:0x012c, B:61:0x0129, B:63:0x012d, B:65:0x013d, B:67:0x0145, B:69:0x0182, B:70:0x0186, B:74:0x01b0, B:84:0x01c3, B:83:0x01c0, B:85:0x01c4, B:86:0x01cb, B:87:0x01cc, B:44:0x0102, B:47:0x010c, B:49:0x0112, B:72:0x01a4, B:73:0x01ac, B:58:0x0124, B:80:0x01bb), top: B:102:0x008b, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x013d A[Catch: SecurityException -> 0x01e0, TryCatch #4 {SecurityException -> 0x01e0, blocks: (B:23:0x008b, B:25:0x0097, B:88:0x01d4, B:27:0x00ad, B:29:0x00b3, B:31:0x00bd, B:33:0x00c5, B:35:0x00cb, B:38:0x00d5, B:40:0x00dd, B:42:0x00e5, B:51:0x0118, B:62:0x012c, B:61:0x0129, B:63:0x012d, B:65:0x013d, B:67:0x0145, B:69:0x0182, B:70:0x0186, B:74:0x01b0, B:84:0x01c3, B:83:0x01c0, B:85:0x01c4, B:86:0x01cb, B:87:0x01cc, B:44:0x0102, B:47:0x010c, B:49:0x0112, B:72:0x01a4, B:73:0x01ac, B:58:0x0124, B:80:0x01bb), top: B:102:0x008b, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0145 A[Catch: SecurityException -> 0x01e0, TryCatch #4 {SecurityException -> 0x01e0, blocks: (B:23:0x008b, B:25:0x0097, B:88:0x01d4, B:27:0x00ad, B:29:0x00b3, B:31:0x00bd, B:33:0x00c5, B:35:0x00cb, B:38:0x00d5, B:40:0x00dd, B:42:0x00e5, B:51:0x0118, B:62:0x012c, B:61:0x0129, B:63:0x012d, B:65:0x013d, B:67:0x0145, B:69:0x0182, B:70:0x0186, B:74:0x01b0, B:84:0x01c3, B:83:0x01c0, B:85:0x01c4, B:86:0x01cb, B:87:0x01cc, B:44:0x0102, B:47:0x010c, B:49:0x0112, B:72:0x01a4, B:73:0x01ac, B:58:0x0124, B:80:0x01bb), top: B:102:0x008b, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0182 A[Catch: SecurityException -> 0x01e0, TryCatch #4 {SecurityException -> 0x01e0, blocks: (B:23:0x008b, B:25:0x0097, B:88:0x01d4, B:27:0x00ad, B:29:0x00b3, B:31:0x00bd, B:33:0x00c5, B:35:0x00cb, B:38:0x00d5, B:40:0x00dd, B:42:0x00e5, B:51:0x0118, B:62:0x012c, B:61:0x0129, B:63:0x012d, B:65:0x013d, B:67:0x0145, B:69:0x0182, B:70:0x0186, B:74:0x01b0, B:84:0x01c3, B:83:0x01c0, B:85:0x01c4, B:86:0x01cb, B:87:0x01cc, B:44:0x0102, B:47:0x010c, B:49:0x0112, B:72:0x01a4, B:73:0x01ac, B:58:0x0124, B:80:0x01bb), top: B:102:0x008b, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01a4 A[Catch: all -> 0x01b7, TRY_ENTER, TryCatch #1 {all -> 0x01b7, blocks: (B:72:0x01a4, B:73:0x01ac), top: B:96:0x01a2, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01ac A[Catch: all -> 0x01b7, TRY_LEAVE, TryCatch #1 {all -> 0x01b7, blocks: (B:72:0x01a4, B:73:0x01ac), top: B:96:0x01a2, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b5 A[PHI: r1
      0x01b5: PHI (r1v10 ??) = (r1v14 ??), (r1v15 ??) binds: [B:75:0x01b3, B:53:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c4 A[Catch: SecurityException -> 0x01e0, TryCatch #4 {SecurityException -> 0x01e0, blocks: (B:23:0x008b, B:25:0x0097, B:88:0x01d4, B:27:0x00ad, B:29:0x00b3, B:31:0x00bd, B:33:0x00c5, B:35:0x00cb, B:38:0x00d5, B:40:0x00dd, B:42:0x00e5, B:51:0x0118, B:62:0x012c, B:61:0x0129, B:63:0x012d, B:65:0x013d, B:67:0x0145, B:69:0x0182, B:70:0x0186, B:74:0x01b0, B:84:0x01c3, B:83:0x01c0, B:85:0x01c4, B:86:0x01cb, B:87:0x01cc, B:44:0x0102, B:47:0x010c, B:49:0x0112, B:72:0x01a4, B:73:0x01ac, B:58:0x0124, B:80:0x01bb), top: B:102:0x008b, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        com.google.android.libraries.dialer.videocall.ViLteStatus viLteStatusB;
        com.google.android.libraries.dialer.videocall.impl.VideoCallCheckerService videoCallCheckerService;
        android.database.Cursor cursorQuery;
        int count;
        ?? r1;
        int i2;
        if (i != 1) {
            defpackage.abyg abygVar = null;
            boolean z = false;
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                parcel.readString();
                android.os.IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.libraries.dialer.videocall.ViLteStatusCallback");
                    abygVar = iInterfaceQueryLocalInterface instanceof defpackage.abyg ? (defpackage.abyg) iInterfaceQueryLocalInterface : new defpackage.abyg(strongBinder);
                }
                yld.c(parcel);
                if (!this.a.d(getCallingUid())) {
                    com.google.android.libraries.dialer.videocall.impl.VideoCallCheckerService.a.d().l("com/google/android/libraries/dialer/videocall/impl/VideoCallCheckerService$1", "isViLteCapable", 245, "VideoCallCheckerService.java").v("Unverified calling uid");
                    com.google.android.libraries.dialer.videocall.impl.VideoCallCheckerService.e(abygVar);
                }
                com.google.android.libraries.dialer.videocall.impl.VideoCallCheckerService.e(abygVar);
                parcel2.writeNoException();
                return true;
            }
            android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) yld.a(parcel, android.telecom.PhoneAccountHandle.CREATOR);
            java.lang.String string = parcel.readString();
            yld.c(parcel);
            com.google.android.libraries.dialer.videocall.impl.VideoCallCheckerService videoCallCheckerService2 = this.a;
            if (videoCallCheckerService2.d(getCallingUid())) {
                try {
                    j$.util.Optional optionalG = videoCallCheckerService2.e.g();
                    if ((optionalG.isPresent() && ((tcs) ((aogc) optionalG.orElseThrow()).b).a().equals(tcp.d)) || defpackage.sns.m(videoCallCheckerService2)) {
                        defpackage.aehn aehnVarC = com.google.android.libraries.dialer.videocall.ViLteStatus.c();
                        aehnVarC.c(false);
                        viLteStatusB = aehnVarC.b();
                    } else {
                        defpackage.aehn aehnVarC2 = com.google.android.libraries.dialer.videocall.ViLteStatus.c();
                        android.telecom.PhoneAccount phoneAccountC = videoCallCheckerService2.c(phoneAccountHandle);
                        if (phoneAccountC != null && phoneAccountC.hasCapabilities(8)) {
                            android.telecom.PhoneAccount phoneAccountC2 = videoCallCheckerService2.c(phoneAccountHandle);
                            if (phoneAccountC2 == null || !phoneAccountC2.hasCapabilities(256)) {
                                videoCallCheckerService = this.a;
                                if (!android.text.TextUtils.isEmpty(string)) {
                                    if (dvx.c(videoCallCheckerService, "android.permission.READ_CALL_LOG") != 0) {
                                        throw new java.lang.SecurityException("No call log permission");
                                    }
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                    android.net.Uri uriWithAppendedPath = android.net.Uri.withAppendedPath(android.provider.CallLog.Calls.CONTENT_FILTER_URI, android.net.Uri.encode(string));
                                    sb.append("(type != ?)");
                                    arrayList.add("6");
                                    sb.append(" AND NOT (type = 4) AND (subscription_component_name IS ?)");
                                    arrayList.add(phoneAccountHandle.getComponentName().flattenToString());
                                    sb.append(" AND (subscription_id IS ?)");
                                    arrayList.add(phoneAccountHandle.getId());
                                    sb.append(" AND (features & 1 = 1)");
                                    cursorQuery = videoCallCheckerService.getContentResolver().query(uriWithAppendedPath, new java.lang.String[]{"_id"}, sb.length() > 0 ? sb.toString() : null, (java.lang.String[]) arrayList.toArray(new java.lang.String[0]), null);
                                    try {
                                        if (cursorQuery == 0) {
                                            android.util.Log.e(com.google.android.libraries.dialer.videocall.impl.VideoCallCheckerService.b, "hasPlacedImsVideoCall - Invalid query error");
                                            cursorQuery = cursorQuery;
                                        } else {
                                            count = cursorQuery.getCount();
                                            cursorQuery.close();
                                            r1 = cursorQuery;
                                            cursorQuery = cursorQuery;
                                            if (count > 0) {
                                                z = true;
                                                cursorQuery = r1;
                                            }
                                        }
                                    } catch (java.lang.Throwable th) {
                                        if (cursorQuery == 0) {
                                            throw th;
                                        }
                                        try {
                                            cursorQuery.close();
                                            throw th;
                                        } catch (java.lang.Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                        parcel2.writeNoException();
                                        yld.e(parcel2, viLteStatusB);
                                        return true;
                                    }
                                }
                            } else if (string == null || !(string.contains("@") || string.contains("%40"))) {
                                android.database.Cursor cursorQuery2 = videoCallCheckerService2.getContentResolver().query(android.net.Uri.withAppendedPath(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI, android.net.Uri.encode(string)), new java.lang.String[]{"carrier_presence"}, null, null, null);
                                try {
                                    if (cursorQuery2 == null) {
                                        android.util.Log.e(com.google.android.libraries.dialer.videocall.impl.VideoCallCheckerService.b, "queryCarrierPresenceInfoForNumber - Invalid query error");
                                        i2 = 0;
                                    } else {
                                        i2 = 0;
                                        while (cursorQuery2.moveToNext()) {
                                            i2 |= cursorQuery2.getInt(0);
                                        }
                                        cursorQuery2.close();
                                    }
                                    r1 = phoneAccountHandle;
                                    if ((i2 & 1) != 0) {
                                        z = true;
                                        cursorQuery = r1;
                                    } else {
                                        videoCallCheckerService = this.a;
                                        if (!android.text.TextUtils.isEmpty(string)) {
                                            if (dvx.c(videoCallCheckerService, "android.permission.READ_CALL_LOG") != 0) {
                                                throw new java.lang.SecurityException("No call log permission");
                                            }
                                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                            android.net.Uri uriWithAppendedPath2 = android.net.Uri.withAppendedPath(android.provider.CallLog.Calls.CONTENT_FILTER_URI, android.net.Uri.encode(string));
                                            sb2.append("(type != ?)");
                                            arrayList2.add("6");
                                            sb2.append(" AND NOT (type = 4) AND (subscription_component_name IS ?)");
                                            arrayList2.add(phoneAccountHandle.getComponentName().flattenToString());
                                            sb2.append(" AND (subscription_id IS ?)");
                                            arrayList2.add(phoneAccountHandle.getId());
                                            sb2.append(" AND (features & 1 = 1)");
                                            if (sb2.length() > 0) {
                                            }
                                            cursorQuery = videoCallCheckerService.getContentResolver().query(uriWithAppendedPath2, new java.lang.String[]{"_id"}, sb2.length() > 0 ? sb2.toString() : null, (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]), null);
                                            if (cursorQuery == 0) {
                                                android.util.Log.e(com.google.android.libraries.dialer.videocall.impl.VideoCallCheckerService.b, "hasPlacedImsVideoCall - Invalid query error");
                                                cursorQuery = cursorQuery;
                                            } else {
                                                count = cursorQuery.getCount();
                                                cursorQuery.close();
                                                r1 = cursorQuery;
                                                cursorQuery = cursorQuery;
                                                if (count > 0) {
                                                    z = true;
                                                    cursorQuery = r1;
                                                }
                                            }
                                        }
                                    }
                                } catch (java.lang.Throwable th3) {
                                    if (cursorQuery2 == null) {
                                        throw th3;
                                    }
                                    try {
                                        cursorQuery2.close();
                                        throw th3;
                                    } catch (java.lang.Throwable th4) {
                                        th3.addSuppressed(th4);
                                        throw th3;
                                    }
                                    parcel2.writeNoException();
                                    yld.e(parcel2, viLteStatusB);
                                    return true;
                                }
                            } else {
                                i2 = 0;
                                r1 = phoneAccountHandle;
                                if ((i2 & 1) != 0) {
                                    z = true;
                                    cursorQuery = r1;
                                } else {
                                    videoCallCheckerService = this.a;
                                    if (!android.text.TextUtils.isEmpty(string)) {
                                        if (dvx.c(videoCallCheckerService, "android.permission.READ_CALL_LOG") != 0) {
                                            throw new java.lang.SecurityException("No call log permission");
                                        }
                                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                        android.net.Uri uriWithAppendedPath3 = android.net.Uri.withAppendedPath(android.provider.CallLog.Calls.CONTENT_FILTER_URI, android.net.Uri.encode(string));
                                        sb3.append("(type != ?)");
                                        arrayList3.add("6");
                                        sb3.append(" AND NOT (type = 4) AND (subscription_component_name IS ?)");
                                        arrayList3.add(phoneAccountHandle.getComponentName().flattenToString());
                                        sb3.append(" AND (subscription_id IS ?)");
                                        arrayList3.add(phoneAccountHandle.getId());
                                        sb3.append(" AND (features & 1 = 1)");
                                        if (sb3.length() > 0) {
                                        }
                                        cursorQuery = videoCallCheckerService.getContentResolver().query(uriWithAppendedPath3, new java.lang.String[]{"_id"}, sb3.length() > 0 ? sb3.toString() : null, (java.lang.String[]) arrayList3.toArray(new java.lang.String[0]), null);
                                        if (cursorQuery == 0) {
                                            android.util.Log.e(com.google.android.libraries.dialer.videocall.impl.VideoCallCheckerService.b, "hasPlacedImsVideoCall - Invalid query error");
                                            cursorQuery = cursorQuery;
                                        } else {
                                            count = cursorQuery.getCount();
                                            cursorQuery.close();
                                            r1 = cursorQuery;
                                            cursorQuery = cursorQuery;
                                            if (count > 0) {
                                                z = true;
                                                cursorQuery = r1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        aehnVarC2.c(z);
                        viLteStatusB = aehnVarC2.b();
                    }
                } catch (java.lang.SecurityException unused) {
                    defpackage.aehn aehnVarC3 = com.google.android.libraries.dialer.videocall.ViLteStatus.c();
                    aehnVarC3.c = 2;
                    viLteStatusB = aehnVarC3.b();
                }
            } else {
                defpackage.aehn aehnVarC4 = com.google.android.libraries.dialer.videocall.ViLteStatus.c();
                aehnVarC4.c = 3;
                viLteStatusB = aehnVarC4.b();
            }
            parcel2.writeNoException();
            yld.e(parcel2, viLteStatusB);
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(1);
        }
        return true;
    }
}
