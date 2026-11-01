package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dff {
    public static final void a(android.view.View view, float f) {
        mp$.ExternalSyntheticApiModelOutline1.m(view, f);
    }

    public static final android.view.View b(dey deyVar, int i) {
        java.lang.Object next;
        java.util.Iterator it = deyVar.b.entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((defpackage.dbk) ((java.util.Map.Entry) next).getKey()).c != i);
        java.util.Map.Entry entry = (java.util.Map.Entry) next;
        if (entry != null) {
            return (dqc) entry.getValue();
        }
        return null;
    }

    public static final dgf c(java.util.List list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((dgf) list.get(i2)).a == i) {
                return (dgf) list.get(i2);
            }
        }
        return null;
    }

    public static final defpackage.dkw d(defpackage.die dieVar) {
        defpackage.aonj aonjVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.dhr dhrVar = (defpackage.dhr) dieVar.g(defpackage.did.a);
        if (dhrVar == null || (aonjVar = (defpackage.aonj) dhrVar.b) == null || !((java.lang.Boolean) aonjVar.a(arrayList)).booleanValue()) {
            return null;
        }
        return (defpackage.dkw) (arrayList.isEmpty() ? null : arrayList.get(0));
    }

    public static final java.lang.String e(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i != 5) {
            return null;
        }
        return "android.widget.ImageView";
    }

    public static final defpackage.dkz f(defpackage.dkz dkzVar, defpackage.dpq dpqVar) {
        int i;
        defpackage.dks dksVar = dkzVar.b;
        defpackage.doy doyVar = dksVar.a;
        long j = defpackage.dkt.a;
        defpackage.doy doyVarE = doyVar.e(new defpackage.cbz(17));
        long j2 = dksVar.b;
        defpackage.dpt[] dptVarArr = defpackage.dps.a;
        if ((j2 & 1095216660480L) == 0) {
            j2 = defpackage.dkt.a;
        }
        defpackage.dnd dndVar = dksVar.c;
        if (dndVar == null) {
            dndVar = defpackage.dnd.e;
        }
        defpackage.dnd dndVar2 = dndVar;
        defpackage.dmw dmwVar = dksVar.d;
        defpackage.dmw dmwVar2 = new defpackage.dmw(dmwVar != null ? dmwVar.a : 0);
        defpackage.dmx dmxVar = dksVar.e;
        defpackage.dmx dmxVar2 = new defpackage.dmx(dmxVar != null ? dmxVar.a : 65535);
        defpackage.dmq dmqVar = dksVar.f;
        if (dmqVar == null) {
            dmqVar = defpackage.dmq.e;
        }
        defpackage.dmq dmqVar2 = dmqVar;
        java.lang.String str = dksVar.g;
        long j3 = dksVar.h;
        if ((j3 & 1095216660480L) == 0) {
            j3 = defpackage.dkt.b;
        }
        long j4 = j3;
        defpackage.dok dokVar = dksVar.i;
        float f = dokVar != null ? dokVar.a : 0.0f;
        defpackage.dok dokVar2 = new defpackage.dok(true != java.lang.Float.isNaN(f) ? f : 0.0f);
        defpackage.doz dozVar = dksVar.j;
        if (dozVar == null) {
            dozVar = defpackage.doz.a;
        }
        defpackage.dnx dnxVar = dksVar.k;
        long j5 = dksVar.l;
        if (j5 == 16) {
            j5 = defpackage.dkt.c;
        }
        long j6 = j5;
        defpackage.dou douVar = dksVar.m;
        if (douVar == null) {
            douVar = defpackage.dou.a;
        }
        defpackage.dou douVar2 = douVar;
        defpackage.crc crcVar = dksVar.n;
        if (crcVar == null) {
            crcVar = defpackage.crc.a;
        }
        defpackage.crc crcVar2 = crcVar;
        defpackage.den denVar = dksVar.p;
        if (denVar == null) {
            denVar = defpackage.csl.a;
        }
        defpackage.dks dksVar2 = new defpackage.dks(doyVarE, j2, dndVar2, dmwVar2, dmxVar2, dmqVar2, str == null ? "" : str, j4, dokVar2, dozVar, dnxVar, j6, douVar2, crcVar2, denVar);
        defpackage.dkd dkdVar = dkzVar.c;
        int i2 = dkdVar.a;
        int i3 = dkdVar.b;
        long j7 = defpackage.dke.a;
        if (i3 == 3) {
            int iOrdinal = dpqVar.ordinal();
            i = 1;
            if (iOrdinal == 0) {
                i3 = 4;
            } else {
                if (iOrdinal != 1) {
                    throw new defpackage.aois();
                }
                i3 = 5;
            }
        } else {
            i = 1;
            if (i3 == 0) {
                int iOrdinal2 = dpqVar.ordinal();
                if (iOrdinal2 == 0) {
                    i3 = 1;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new defpackage.aois();
                    }
                    i3 = 2;
                }
            }
        }
        long j8 = dkdVar.c;
        if ((j8 & 1095216660480L) == 0) {
            j8 = defpackage.dke.a;
        }
        defpackage.dpa dpaVar = dkdVar.d;
        if (dpaVar == null) {
            dpaVar = defpackage.dpa.a;
        }
        defpackage.dkg dkgVar = dkdVar.e;
        defpackage.dos dosVar = dkdVar.f;
        int i4 = dkdVar.g;
        if (i4 == 0) {
            i4 = 66305;
        }
        int i5 = dkdVar.h;
        defpackage.dpc dpcVar = dkdVar.i;
        if (dpcVar == null) {
            dpcVar = defpackage.dpc.a;
        }
        defpackage.dpc dpcVar2 = dpcVar;
        if (i5 == 0) {
            i5 = i;
        }
        return new defpackage.dkz(dksVar2, new defpackage.dkd(i2 == 0 ? 5 : i2, i3, j8, dpaVar, dkgVar, dosVar, i4, i5, dpcVar2), dkzVar.d);
    }

    public static java.util.List g(android.content.res.Resources resources, int i) {
        if (i == 0) {
            return java.util.Collections.EMPTY_LIST;
        }
        android.content.res.TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return java.util.Collections.EMPTY_LIST;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(n(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(n(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void h(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static int i(android.content.Context context, java.lang.String str, int i, int i2, java.lang.String str2) {
        int iNoteProxyOpNoThrow;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        java.lang.String strPermissionToOp = android.app.AppOpsManager.permissionToOp(str);
        if (strPermissionToOp != null) {
            if (str2 == null) {
                java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                str2 = packagesForUid[0];
            }
            int iMyUid = android.os.Process.myUid();
            java.lang.String packageName = context.getPackageName();
            if (iMyUid == i2 && j$.util.Objects.equals(packageName, str2)) {
                android.app.AppOpsManager appOpsManager = (android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class);
                iNoteProxyOpNoThrow = dux.f(appOpsManager, strPermissionToOp, android.os.Binder.getCallingUid(), str2);
                if (iNoteProxyOpNoThrow == 0) {
                    iNoteProxyOpNoThrow = dux.f(appOpsManager, strPermissionToOp, i2, fn$.ExternalSyntheticApiModelOutline0.m(context));
                }
            } else {
                iNoteProxyOpNoThrow = ((android.app.AppOpsManager) context.getSystemService(android.app.AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, str2);
            }
            if (iNoteProxyOpNoThrow != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.content.Intent] */
    public static android.content.Intent j(android.app.Activity activity) {
        android.content.Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            java.lang.String strL = l(activity, activity.getComponentName());
            if (strL != 0) {
                android.content.ComponentName componentName = new android.content.ComponentName(activity, (java.lang.String) strL);
                try {
                    strL = l(activity, componentName) == null ? android.content.Intent.makeMainActivity(componentName) : new android.content.Intent().setComponent(componentName);
                    return strL;
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    android.util.Log.e("NavUtils", defpackage.a.bk(strL, "getParentActivityIntent: bad parentActivityName '", "' in manifest"));
                }
            }
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static android.content.Intent k(android.content.Context context, android.content.ComponentName componentName) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String strL = l(context, componentName);
        if (strL == null) {
            return null;
        }
        android.content.ComponentName componentName2 = new android.content.ComponentName(componentName.getPackageName(), strL);
        return l(context, componentName2) == null ? android.content.Intent.makeMainActivity(componentName2) : new android.content.Intent().setComponent(componentName2);
    }

    public static java.lang.String l(android.content.Context context, android.content.ComponentName componentName) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String string;
        android.content.pm.ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        java.lang.String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        return string.charAt(0) == '.' ? java.lang.String.valueOf(context.getPackageName()).concat(string) : string;
    }

    public static defpackage.ajcq m(defpackage.dsf dsfVar) {
        defpackage.dsd dsdVar = new defpackage.dsd();
        defpackage.dsh dshVar = new defpackage.dsh(dsdVar);
        dsdVar.b = dshVar;
        dsdVar.a = dsfVar.getClass();
        try {
            java.lang.Object objA = dsfVar.a(dsdVar);
            if (objA != null) {
                dsdVar.a = objA;
            }
        } catch (java.lang.Exception e) {
            dshVar.a(e);
        }
        return dshVar;
    }

    private static java.util.List n(java.lang.String[] strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            arrayList.add(android.util.Base64.decode(str, 0));
        }
        return arrayList;
    }
}
