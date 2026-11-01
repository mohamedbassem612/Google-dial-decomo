package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acuc implements dmb {
    public static final defpackage.acuc a = new defpackage.acuc();
    public static final android.graphics.Paint b = new android.graphics.Paint();
    private static final java.util.Map c = new java.util.LinkedHashMap();

    public final android.graphics.Typeface a(android.content.Context context, dmc dmcVar) {
        aooh.f(context, "context");
        aooh.f(dmcVar, "font");
        java.util.Objects.toString(dmcVar);
        throw new java.lang.IllegalStateException("GoogleFont only support async loading: ".concat(java.lang.String.valueOf(dmcVar)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object b(android.content.Context context, dmc dmcVar, aoln aolnVar) throws android.content.pm.PackageManager.NameNotFoundException {
        defpackage.acua acuaVar;
        java.lang.String str;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.acua) {
            acuaVar = (defpackage.acua) aolnVar;
            int i = acuaVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                acuaVar.d = i - Integer.MIN_VALUE;
            } else {
                acuaVar = new defpackage.acua(this, aolnVar);
            }
        } else {
            acuaVar = new defpackage.acua(this, aolnVar);
        }
        defpackage.acua acuaVar2 = acuaVar;
        java.lang.Object objM = acuaVar2.b;
        aolu aoluVar = aolu.a;
        int i2 = acuaVar2.d;
        if (i2 == 0) {
            aooc.af(objM);
            if (!(dmcVar instanceof defpackage.actz)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.");
            }
            java.util.Map map = c;
            defpackage.actz actzVar = (defpackage.actz) dmcVar;
            defpackage.actw actwVar = actzVar.g;
            android.graphics.Typeface typeface = (android.graphics.Typeface) map.get(actwVar);
            if (typeface != null) {
                android.graphics.Paint paint = b;
                paint.setTypeface(typeface);
                paint.setFontVariationSettings(defpackage.acty.a(actzVar.f.a, context));
                map.put(actwVar, paint.getTypeface());
                return paint.getTypeface();
            }
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            aooh.e(packageManager, "getPackageManager(...)");
            defpackage.actv actvVar = actzVar.c;
            android.content.res.Resources resources = context.getResources();
            aooh.e(resources, "getResources(...)");
            aooh.f(packageManager, "packageManager");
            aooh.f(resources, "resources");
            java.lang.String str2 = actvVar.a;
            android.content.pm.ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str2, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new android.content.pm.PackageManager.NameNotFoundException("No package found for authority: ".concat(str2));
            }
            java.lang.String str3 = actvVar.b;
            if (!aooh.n(providerInfoResolveContentProvider.packageName, str3)) {
                throw new android.content.pm.PackageManager.NameNotFoundException(hgb.n(str3, str2, "Found content provider ", ", but package was not "));
            }
            android.content.pm.Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (android.content.pm.Signature signature : signatureArr) {
                byte[] byteArray = signature.toByteArray();
                aooh.e(byteArray, "toByteArray(...)");
                arrayList.add(byteArray);
            }
            java.util.Comparator comparator = actt.a;
            java.util.Collections.sort(arrayList, comparator);
            java.util.List listG = dff.g(resources, 2130903057);
            aooh.c(listG);
            int size = listG.size();
            int i3 = 0;
            loop1: while (true) {
                if (i3 >= size) {
                    providerInfoResolveContentProvider = null;
                    break;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList((java.util.Collection) listG.get(i3));
                java.util.Collections.sort(arrayList2, comparator);
                if (arrayList.size() == arrayList2.size()) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            break loop1;
                        }
                        if (!java.util.Arrays.equals((byte[]) arrayList.get(i4), (byte[]) arrayList2.get(i4))) {
                            break;
                        }
                        i4++;
                    }
                }
                i3++;
            }
            if (providerInfoResolveContentProvider == null || (str = providerInfoResolveContentProvider.authority) == null) {
                throw new java.lang.IllegalArgumentException("Bad certificates");
            }
            defpackage.abos abosVar = new defpackage.abos(context, dmcVar, str, (aoln) null, 4);
            acuaVar2.a = dmcVar;
            acuaVar2.d = 1;
            objM = aosv.m(abosVar, acuaVar2);
            if (objM == aoluVar) {
                return aoluVar;
            }
            obj = dmcVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = acuaVar2.a;
            aooc.af(objM);
        }
        android.graphics.Typeface typeface2 = (android.graphics.Typeface) objM;
        if (typeface2 == null) {
            return typeface2;
        }
        c.put(((defpackage.actz) obj).g, typeface2);
        return typeface2;
    }
}
