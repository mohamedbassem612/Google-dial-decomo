package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ipz {
    public final ecx b;
    public final rlv c;
    public final java.io.File d;
    public final java.io.File e;
    private final android.content.Context g;
    private final zzx h;
    public static final defpackage.hgu f = new defpackage.hgu();
    public static final aimz a = aimz.i("com/android/dialer/backup/impl/PendingUnboundedRestores");

    public ipz(android.content.Context context, ecx ecxVar, zzx zzxVar, rlv rlvVar) {
        aooh.f(context, "appContext");
        aooh.f(ecxVar, "dataStore");
        aooh.f(rlvVar, "loggingBindings");
        this.g = context;
        this.b = ecxVar;
        this.h = zzxVar;
        this.c = rlvVar;
        this.d = new java.io.File(context.getFilesDir(), "dialer_unbounded_backup_temp.zip");
        this.e = new java.io.File(context.getFilesDir(), "pending_unbounded_restores");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.ipy ipyVar;
        java.util.List listCw;
        java.lang.Object obj;
        ?? r10;
        java.lang.Integer numO;
        defpackage.ipx ipxVar;
        int iIntValue;
        defpackage.ipf ipfVar;
        aoin aoinVar;
        defpackage.iph iphVar;
        if (aolnVar instanceof defpackage.ipy) {
            ipyVar = (defpackage.ipy) aolnVar;
            int i = ipyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ipyVar.d = i - Integer.MIN_VALUE;
            } else {
                ipyVar = new defpackage.ipy(this, aolnVar);
            }
        } else {
            ipyVar = new defpackage.ipy(this, aolnVar);
        }
        java.lang.Object obj2 = ipyVar.b;
        java.util.ArrayList arrayList = aolu.a;
        int i2 = ipyVar.d;
        if (i2 == 0) {
            aooc.af(obj2);
            ipyVar.d = 1;
            java.lang.Object objAj = aoov.aj(aour.a, new icp(this, (aoln) null, 7, (byte[]) null), ipyVar);
            if (objAj != arrayList) {
                objAj = aojh.a;
            }
            if (objAj != arrayList) {
            }
            return arrayList;
        }
        if (i2 == 1) {
            aooc.af(obj2);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj3 = ipyVar.a;
            aooc.af(obj2);
            obj = obj3;
        }
        this.c.o(rmx.rG);
        a.b().l("com/android/dialer/backup/impl/PendingUnboundedRestores", "load", 44, "PendingUnboundedRestores.kt").v("nothing to restore");
        r10 = obj;
        arrayList = new java.util.ArrayList();
        for (java.lang.String str : r10) {
            numO = aoov.o(str);
            if (numO == null) {
                ipxVar = null;
            } else {
                iIntValue = numO.intValue();
                if (iIntValue == 0) {
                    ipfVar = defpackage.ipf.UNBOUNDED_BACKUP_UNSPECIFIED;
                } else if (iIntValue == 1) {
                    ipfVar = defpackage.ipf.TEST;
                } else if (iIntValue == 2) {
                    ipfVar = defpackage.ipf.PHONE_LOOKUP;
                } else if (iIntValue != 3) {
                    ipfVar = null;
                } else {
                    ipfVar = defpackage.ipf.SPEED_DIAL;
                }
                if (ipfVar != null) {
                    aoinVar = (aoin) this.h.k().get(ipfVar);
                    if (aoinVar != null) {
                        iphVar = (defpackage.iph) aoinVar.a();
                    } else {
                        iphVar = null;
                    }
                    ipxVar = new defpackage.ipx(iphVar, new java.io.File(this.e, str));
                } else {
                    ipxVar = null;
                }
            }
            if (ipxVar != null) {
                arrayList.add(ipxVar);
            }
        }
        return arrayList;
        java.io.File file = this.e;
        if (file.exists()) {
            java.lang.String[] list = file.list();
            if (list == null) {
                list = new java.lang.String[0];
            }
            listCw = ajsz.cw(list);
        } else {
            listCw = aokc.a;
        }
        boolean zIsEmpty = listCw.isEmpty();
        r10 = listCw;
        if (zIsEmpty) {
            ecx ecxVar = this.b;
            defpackage.hgu hguVar = f;
            ipyVar.a = listCw;
            ipyVar.d = 2;
            if (hguVar.h(ecxVar, ipyVar) != arrayList) {
                obj = listCw;
                this.c.o(rmx.rG);
                a.b().l("com/android/dialer/backup/impl/PendingUnboundedRestores", "load", 44, "PendingUnboundedRestores.kt").v("nothing to restore");
                r10 = obj;
                arrayList = new java.util.ArrayList();
                while (r10.hasNext()) {
                    numO = aoov.o(str);
                    if (numO == null) {
                        ipxVar = null;
                    } else {
                        iIntValue = numO.intValue();
                        if (iIntValue == 0) {
                            ipfVar = defpackage.ipf.UNBOUNDED_BACKUP_UNSPECIFIED;
                        } else if (iIntValue == 1) {
                            ipfVar = defpackage.ipf.TEST;
                        } else if (iIntValue == 2) {
                            ipfVar = defpackage.ipf.PHONE_LOOKUP;
                        } else if (iIntValue != 3) {
                            ipfVar = null;
                        } else {
                            ipfVar = defpackage.ipf.SPEED_DIAL;
                        }
                        if (ipfVar != null) {
                            aoinVar = (aoin) this.h.k().get(ipfVar);
                            if (aoinVar != null) {
                                iphVar = (defpackage.iph) aoinVar.a();
                            } else {
                                iphVar = null;
                            }
                            ipxVar = new defpackage.ipx(iphVar, new java.io.File(this.e, str));
                        } else {
                            ipxVar = null;
                        }
                    }
                    if (ipxVar != null) {
                        arrayList.add(ipxVar);
                    }
                }
            }
        } else {
            arrayList = new java.util.ArrayList();
            while (r10.hasNext()) {
                numO = aoov.o(str);
                if (numO == null) {
                    ipxVar = null;
                } else {
                    iIntValue = numO.intValue();
                    if (iIntValue == 0) {
                        ipfVar = defpackage.ipf.UNBOUNDED_BACKUP_UNSPECIFIED;
                    } else if (iIntValue == 1) {
                        ipfVar = defpackage.ipf.TEST;
                    } else if (iIntValue == 2) {
                        ipfVar = defpackage.ipf.PHONE_LOOKUP;
                    } else if (iIntValue != 3) {
                        ipfVar = null;
                    } else {
                        ipfVar = defpackage.ipf.SPEED_DIAL;
                    }
                    if (ipfVar != null) {
                        aoinVar = (aoin) this.h.k().get(ipfVar);
                        if (aoinVar != null) {
                            iphVar = (defpackage.iph) aoinVar.a();
                        } else {
                            iphVar = null;
                        }
                        ipxVar = new defpackage.ipx(iphVar, new java.io.File(this.e, str));
                    } else {
                        ipxVar = null;
                    }
                }
                if (ipxVar != null) {
                    arrayList.add(ipxVar);
                }
            }
        }
        return arrayList;
    }
}
