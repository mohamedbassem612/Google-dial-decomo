package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xfh {
    public xfh(aonj aonjVar, aono aonoVar, aonj aonjVar2, aonn aonnVar) {
        aooh.f(aonjVar, "getNodeId");
        aooh.f(aonoVar, "setResult");
        aooh.f(aonjVar2, "finish");
        aooh.f(aonnVar, "registerForActivityLaunch");
    }

    private static final void A(android.os.PersistableBundle persistableBundle, java.lang.String str, java.util.Collection collection, android.os.PersistableBundle persistableBundle2, aonn aonnVar, java.lang.String str2) {
        java.lang.Object next;
        if (collection.size() == 0) {
            defpackage.xox.b("BundleExt", a.bD(str, str2, "Dropping empty ", " with key ", " because we can't determine the type"));
            return;
        }
        java.util.Iterator it = collection.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next == null);
        if (next == null) {
            persistableBundle.putStringArray(str, new java.lang.String[collection.size()]);
            return;
        }
        aopu[] aopuVarArr = aoou.a;
        persistableBundle2.putString(str, str2 + '<' + new aooa(next.getClass()).b() + '>');
        j$.util.Objects.checkIndex(0, 5);
        if (next instanceof java.lang.Integer) {
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(collection, 10));
            for (java.lang.Object obj : collection) {
                aooh.d(obj, "null cannot be cast to non-null type kotlin.Int");
                java.lang.Integer num = (java.lang.Integer) obj;
                num.intValue();
                arrayList.add(num);
            }
            persistableBundle.putIntArray(str, ajsz.cm(arrayList));
            return;
        }
        if (next instanceof java.lang.String) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(collection, 10));
            java.util.Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                java.lang.Object next2 = it2.next();
                arrayList2.add(next2 != null ? next2.toString() : null);
            }
            persistableBundle.putStringArray(str, (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]));
            return;
        }
        if (next instanceof java.lang.CharSequence) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(ajsz.bl(collection, 10));
            java.util.Iterator it3 = collection.iterator();
            while (it3.hasNext()) {
                java.lang.Object next3 = it3.next();
                arrayList3.add(next3 != null ? next3.toString() : null);
            }
            persistableBundle.putStringArray(str, (java.lang.String[]) arrayList3.toArray(new java.lang.String[0]));
            return;
        }
        if (next instanceof android.os.Bundle) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(ajsz.bl(collection, 10));
            for (java.lang.Object obj2 : collection) {
                android.os.Bundle bundle = obj2 instanceof android.os.Bundle ? (android.os.Bundle) obj2 : null;
                arrayList4.add(bundle != null ? p(bundle, aonnVar) : null);
            }
            l(persistableBundle, str, arrayList4, defpackage.xpm.a);
            return;
        }
        if (aonnVar == null) {
            defpackage.xox.b("BundleExt", "Dropping " + str2 + " with key " + str + " due to unknown or unpersistable type " + next.getClass());
            return;
        }
        aonnVar.a(str, str2 + " with key " + str + " contains unknown or unpersistable type " + next.getClass());
    }

    public static java.lang.String a(defpackage.xjz xjzVar) {
        return defpackage.xfc.b(xjzVar) + ':' + xjzVar.d();
    }

    public static int b(defpackage.xiz xizVar, j$.time.Instant instant) {
        aooh.f(instant, "other");
        return xizVar.c().compareTo(instant);
    }

    public static java.lang.Object d(defpackage.xpb xpbVar, android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "input");
        return xpbVar.c(persistableBundle);
    }

    public static final int f(android.os.PersistableBundle persistableBundle) {
        aooh.f(persistableBundle, "<this>");
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        aooh.e(parcelObtain, "obtain(...)");
        try {
            parcelObtain.writePersistableBundle(persistableBundle);
            return parcelObtain.dataSize();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static final java.lang.Object g(android.os.PersistableBundle persistableBundle, java.lang.String str, defpackage.xpb xpbVar) {
        aooh.f(persistableBundle, "<this>");
        aooh.f(xpbVar, "deserializer");
        android.os.PersistableBundle persistableBundle2 = persistableBundle.getPersistableBundle(str);
        if (persistableBundle2 != null) {
            return xpbVar.c(persistableBundle2);
        }
        return null;
    }

    public static final java.util.List h(android.os.PersistableBundle persistableBundle, java.lang.String str, defpackage.xpb xpbVar) {
        aooh.f(persistableBundle, "<this>");
        aooh.f(xpbVar, "deserializer");
        android.os.PersistableBundle persistableBundle2 = persistableBundle.getPersistableBundle(str);
        if (persistableBundle2 == null) {
            return null;
        }
        aooh.f(xpbVar, "elementDeserializer");
        return new defpackage.xpq(xpbVar, new defpackage.xgn(18)).d(persistableBundle2);
    }

    public static final void i(android.os.PersistableBundle persistableBundle, java.lang.String str, defpackage.xpa xpaVar) {
        aooh.f(persistableBundle, "<this>");
        j(persistableBundle, str, xpaVar, defpackage.xpa.p);
    }

    public static final void j(android.os.PersistableBundle persistableBundle, java.lang.String str, java.lang.Object obj, defpackage.xoz xozVar) {
        aooh.f(persistableBundle, "<this>");
        persistableBundle.putPersistableBundle(str, obj != null ? xozVar.ew(obj) : null);
    }

    public static final void k(android.os.PersistableBundle persistableBundle, java.lang.String str, java.util.List list) {
        l(persistableBundle, str, list, defpackage.xpa.p);
    }

    public static final void l(android.os.PersistableBundle persistableBundle, java.lang.String str, java.util.List list, defpackage.xoz xozVar) {
        persistableBundle.putPersistableBundle(str, list != null ? new defpackage.xph(xozVar.e()).ew(list) : null);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0345  */
    public static final android.os.Bundle m(android.os.PersistableBundle persistableBundle) {
        android.os.PersistableBundle persistableBundle2;
        android.accounts.Account account;
        boolean[] zArr;
        java.util.ArrayList<? extends android.os.Parcelable> arrayList;
        android.os.PersistableBundle persistableBundle3;
        android.os.Bundle[] bundleArr;
        android.os.PersistableBundle persistableBundle4;
        java.util.List listS;
        java.lang.String str = "<this>";
        aooh.f(persistableBundle, "<this>");
        android.os.Bundle bundle = new android.os.Bundle(persistableBundle);
        android.os.PersistableBundle persistableBundle5 = persistableBundle.getPersistableBundle("_conversion");
        if (persistableBundle5 == null || (persistableBundle2 = persistableBundle5.getPersistableBundle("_original_types")) == null) {
            persistableBundle2 = new android.os.PersistableBundle();
        }
        for (java.lang.String str2 : persistableBundle2.keySet()) {
            java.lang.Object obj = bundle.get(str2);
            if (obj != null) {
                java.lang.String string = persistableBundle2.getString(str2);
                int i = 0;
                java.lang.String str3 = (string == null || (listS = aoov.S(string, new java.lang.String[]{"<"}, 0)) == null) ? null : (java.lang.String) listS.get(0);
                aopu[] aopuVarArr = aoou.a;
                if (aooh.n(new aooa(obj.getClass()).b(), str3)) {
                    continue;
                } else if (aooh.n(str3, new aooa(java.lang.Byte.TYPE).b())) {
                    bundle.putByte(str2, (byte) ((java.lang.Integer) obj).intValue());
                } else if (aooh.n(str3, new aooa(byte[].class).b())) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(length);
                    while (i < length) {
                        arrayList2.add(java.lang.Byte.valueOf((byte) iArr[i]));
                        i++;
                    }
                    bundle.putByteArray(str2, ajsz.ck(arrayList2));
                } else if (aooh.n(str3, new aooa(java.lang.Short.TYPE).b())) {
                    bundle.putShort(str2, (short) ((java.lang.Integer) obj).intValue());
                } else if (aooh.n(str3, new aooa(short[].class).b())) {
                    int[] iArr2 = (int[]) obj;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(iArr2.length);
                    for (int i2 : iArr2) {
                        arrayList3.add(java.lang.Short.valueOf((short) i2));
                    }
                    short[] sArr = new short[arrayList3.size()];
                    java.util.Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        sArr[i] = ((java.lang.Number) it.next()).shortValue();
                        i++;
                    }
                    bundle.putShortArray(str2, sArr);
                } else if (aooh.n(str3, new aooa(java.lang.Character.TYPE).b())) {
                    bundle.putChar(str2, ((java.lang.String) obj).subSequence(0, 1).charAt(0));
                } else if (aooh.n(str3, new aooa(char[].class).b())) {
                    java.lang.String[] strArr = (java.lang.String[]) obj;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList(strArr.length);
                    for (java.lang.String str4 : strArr) {
                        arrayList4.add(java.lang.Character.valueOf(str4.subSequence(0, 1).charAt(0)));
                    }
                    char[] cArr = new char[arrayList4.size()];
                    java.util.Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        cArr[i] = ((java.lang.Character) it2.next()).charValue();
                        i++;
                    }
                    bundle.putCharArray(str2, cArr);
                } else if (aooh.n(str3, new aooa(android.content.ComponentName.class).b())) {
                    bundle.putParcelable(str2, android.content.ComponentName.unflattenFromString((java.lang.String) obj));
                } else if (aooh.n(str3, new aooa(android.accounts.Account.class).b())) {
                    android.os.PersistableBundle persistableBundle6 = (android.os.PersistableBundle) obj;
                    if (persistableBundle6.containsKey("accountType") && persistableBundle6.containsKey("accountName")) {
                        java.lang.String string2 = persistableBundle6.getString("accountName");
                        if (string2 == null) {
                            throw new java.lang.IllegalStateException("Account name not found");
                        }
                        java.lang.String string3 = persistableBundle6.getString("accountType");
                        if (string3 == null) {
                            throw new java.lang.IllegalStateException("Account type not found");
                        }
                        account = new android.accounts.Account(string2, string3);
                    } else {
                        account = null;
                    }
                    if (account != null) {
                        bundle.putParcelable(str2, account);
                    }
                } else if (aooh.n(str3, new aooa(java.util.Locale.class).b())) {
                    bundle.putSerializable(str2, java.util.Locale.forLanguageTag((java.lang.String) obj));
                } else if (aooh.n(str3, new aooa(android.net.Uri.class).b())) {
                    android.net.Uri uri = android.net.Uri.parse((java.lang.String) obj);
                    aooh.e(uri, "parse(...)");
                    bundle.putParcelable(str2, uri);
                } else if (aooh.n(str3, new aooa(java.lang.Float.TYPE).b())) {
                    bundle.putFloat(str2, (float) ((java.lang.Double) obj).doubleValue());
                } else if (aooh.n(str3, new aooa(float[].class).b())) {
                    double[] dArr = (double[]) obj;
                    int length2 = dArr.length;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(length2);
                    while (i < length2) {
                        arrayList5.add(java.lang.Float.valueOf((float) dArr[i]));
                        i++;
                    }
                    bundle.putFloatArray(str2, ajsz.cl(arrayList5));
                } else if (aooh.n(str3, new aooa(android.util.Size.class).b())) {
                    bundle.putSize(str2, android.util.Size.parseSize((java.lang.String) obj));
                } else if (aooh.n(str3, new aooa(android.os.Bundle.class).b())) {
                    bundle.putBundle(str2, m((android.os.PersistableBundle) obj));
                } else if (aooh.n(str3, new aooa(java.lang.Boolean.TYPE).b())) {
                    bundle.putBoolean(str2, wsc.f(persistableBundle, str2));
                } else if (aooh.n(str3, new aooa(boolean[].class).b())) {
                    aooh.f(persistableBundle, str);
                    java.lang.Object obj2 = persistableBundle.get(str2);
                    j$.util.Objects.checkIndex(0, 3);
                    if (obj2 == null) {
                        zArr = null;
                    } else if (obj2 instanceof boolean[]) {
                        zArr = (boolean[]) obj2;
                    } else if (obj2 instanceof int[]) {
                        int[] iArr3 = (int[]) obj2;
                        java.util.ArrayList arrayList6 = new java.util.ArrayList(iArr3.length);
                        for (int i3 : iArr3) {
                            arrayList6.add(java.lang.Boolean.valueOf(i3 == 1));
                        }
                        zArr = new boolean[arrayList6.size()];
                        java.util.Iterator it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            zArr[i] = ((java.lang.Boolean) it3.next()).booleanValue();
                            i++;
                        }
                    } else {
                        zArr = null;
                    }
                    if (zArr == null) {
                        throw new java.lang.IllegalStateException("Missing BoolenArray");
                    }
                    bundle.putBooleanArray(str2, zArr);
                } else if (aooh.n(str3, new aooa(java.util.ArrayList.class).b())) {
                    java.lang.String string4 = persistableBundle2.getString(str2, "");
                    aooh.e(string4, "getString(...)");
                    java.lang.String str5 = (java.lang.String) aoov.S((java.lang.CharSequence) aoov.S(string4, new java.lang.String[]{"<"}, 0).get(1), new java.lang.String[]{">"}, 0).get(0);
                    if (aooh.n(str5, new aooa(java.lang.Integer.TYPE).b())) {
                        bundle.putIntegerArrayList(str2, new java.util.ArrayList<>(ajsz.cS((int[]) obj)));
                    } else if (aooh.n(str5, new aooa(java.lang.String.class).b())) {
                        bundle.putStringArrayList(str2, new java.util.ArrayList<>(ajsz.cU((java.lang.String[]) obj)));
                    } else if (aooh.n(str5, new aooa(java.lang.CharSequence.class).b())) {
                        bundle.putCharSequenceArrayList(str2, new java.util.ArrayList<>(ajsz.cU((java.lang.String[]) obj)));
                    } else if (aooh.n(str5, new aooa(android.os.Bundle.class).b())) {
                        aokv aokvVarH = h(persistableBundle, str2, defpackage.xpm.a);
                        if (aokvVarH != null) {
                            java.util.ArrayList arrayList7 = new java.util.ArrayList(ajsz.bl(aokvVarH, 10));
                            java.util.ListIterator listIterator = aokvVarH.listIterator(0);
                            while (listIterator.hasNext()) {
                                defpackage.xpm xpmVar = (defpackage.xpm) listIterator.next();
                                arrayList7.add((xpmVar == null || (persistableBundle3 = xpmVar.b) == null) ? null : m(persistableBundle3));
                            }
                            arrayList = new java.util.ArrayList<>(arrayList7);
                        } else {
                            arrayList = null;
                        }
                        bundle.putParcelableArrayList(str2, arrayList);
                    }
                } else {
                    java.lang.String str6 = str;
                    if (aooh.n(str3, new aooa(java.lang.Object[].class).b())) {
                        java.lang.String string5 = persistableBundle2.getString(str2, "");
                        aooh.e(string5, "getString(...)");
                        java.lang.String str7 = (java.lang.String) aoov.S((java.lang.CharSequence) aoov.S(string5, new java.lang.String[]{"<"}, 0).get(1), new java.lang.String[]{">"}, 0).get(0);
                        if (aooh.n(str7, new aooa(java.lang.Integer.TYPE).b())) {
                            bundle.putIntArray(str2, (int[]) obj);
                        } else if (aooh.n(str7, new aooa(java.lang.String.class).b())) {
                            bundle.putStringArray(str2, (java.lang.String[]) obj);
                        } else if (aooh.n(str7, new aooa(java.lang.CharSequence.class).b())) {
                            bundle.putCharSequenceArray(str2, (java.lang.String[]) obj);
                        } else if (aooh.n(str7, new aooa(android.os.Bundle.class).b())) {
                            aokv aokvVarH2 = h(persistableBundle, str2, defpackage.xpm.a);
                            if (aokvVarH2 != null) {
                                java.util.ArrayList arrayList8 = new java.util.ArrayList(ajsz.bl(aokvVarH2, 10));
                                java.util.ListIterator listIterator2 = aokvVarH2.listIterator(0);
                                while (listIterator2.hasNext()) {
                                    defpackage.xpm xpmVar2 = (defpackage.xpm) listIterator2.next();
                                    arrayList8.add((xpmVar2 == null || (persistableBundle4 = xpmVar2.b) == null) ? null : m(persistableBundle4));
                                }
                                bundleArr = (android.os.Bundle[]) arrayList8.toArray(new android.os.Bundle[0]);
                            } else {
                                bundleArr = null;
                            }
                            bundle.putParcelableArray(str2, bundleArr);
                        }
                    } else if (aooh.n(str3, new aooa(android.content.Intent.class).b())) {
                        bundle.putParcelable(str2, defpackage.xpg.f((android.os.PersistableBundle) obj).a());
                    }
                    str = str6;
                }
            }
        }
        bundle.remove("_conversion");
        return bundle;
    }

    public static final int n(android.os.BaseBundle baseBundle, java.lang.String str) {
        aooh.f(baseBundle, "<this>");
        java.lang.Integer numValueOf = baseBundle.containsKey(str) ? java.lang.Integer.valueOf(baseBundle.getInt(str)) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        throw new java.util.NoSuchElementException("Key " + str + ": " + java.lang.Integer.class.getName() + " is missing in the " + baseBundle.getClass().getName() + '.');
    }

    public static final java.lang.Long o(android.os.BaseBundle baseBundle, java.lang.String str) {
        aooh.f(baseBundle, "<this>");
        if (baseBundle.containsKey(str)) {
            return java.lang.Long.valueOf(baseBundle.getLong(str));
        }
        return null;
    }

    public static final android.os.PersistableBundle p(android.os.Bundle bundle, aonn aonnVar) {
        java.lang.Object obj;
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        aooh.e(parcelObtain, "obtain(...)");
        try {
            parcelObtain.writeBundle(bundle);
            parcelObtain.setDataPosition(0);
            android.os.Bundle bundle2 = parcelObtain.readBundle(bundle.getClassLoader());
            if (bundle2 == null) {
                throw new java.lang.IllegalStateException("Should never happen... we just wrote a bundle and can't read it back");
            }
            parcelObtain.recycle();
            android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
            android.os.PersistableBundle persistableBundle2 = new android.os.PersistableBundle();
            for (java.lang.String str : bundle2.keySet()) {
                try {
                    obj = bundle2.get(str);
                } catch (java.lang.Exception e) {
                    if (aonnVar == null) {
                        defpackage.xox.b("BundleExt", a.bo(e, str, "Dropping object with key ", " due to error: "));
                    } else {
                        aooh.c(str);
                        aonnVar.a(str, a.bo(e, str, "Dropping object with key ", " due to error: "));
                    }
                    obj = null;
                }
                if (obj != null) {
                    aooh.c(str);
                    aopu[] aopuVarArr = aoou.a;
                    java.lang.String strB = new aooa(obj.getClass()).b();
                    persistableBundle2.putString(str, strB);
                    j$.util.Objects.checkIndex(0, 30);
                    if (obj instanceof java.lang.Integer) {
                        persistableBundle.putInt(str, ((java.lang.Number) obj).intValue());
                    } else if (obj instanceof int[]) {
                        persistableBundle.putIntArray(str, (int[]) obj);
                    } else if (obj instanceof java.lang.Long) {
                        persistableBundle.putLong(str, ((java.lang.Number) obj).longValue());
                    } else if (obj instanceof long[]) {
                        persistableBundle.putLongArray(str, (long[]) obj);
                    } else if (obj instanceof java.lang.Double) {
                        persistableBundle.putDouble(str, ((java.lang.Number) obj).doubleValue());
                    } else if (obj instanceof double[]) {
                        persistableBundle.putDoubleArray(str, (double[]) obj);
                    } else if (obj instanceof java.lang.Boolean) {
                        persistableBundle.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
                    } else if (obj instanceof boolean[]) {
                        persistableBundle.putBooleanArray(str, (boolean[]) obj);
                    } else if (obj instanceof java.lang.String) {
                        persistableBundle.putString(str, (java.lang.String) obj);
                    } else if (obj instanceof android.os.PersistableBundle) {
                        persistableBundle.putPersistableBundle(str, (android.os.PersistableBundle) obj);
                    } else if (obj instanceof defpackage.xpa) {
                        i(persistableBundle, str, (defpackage.xpa) obj);
                    } else if (obj instanceof android.os.Bundle) {
                        persistableBundle.putPersistableBundle(str, p((android.os.Bundle) obj, aonnVar));
                    } else if (obj instanceof java.lang.Byte) {
                        persistableBundle.putInt(str, ((java.lang.Number) obj).byteValue());
                    } else if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        java.util.ArrayList arrayList = new java.util.ArrayList(bArr.length);
                        for (byte b : bArr) {
                            arrayList.add(java.lang.Integer.valueOf(b));
                        }
                        persistableBundle.putIntArray(str, ajsz.cm(arrayList));
                    } else if (obj instanceof java.lang.Short) {
                        persistableBundle.putInt(str, ((java.lang.Number) obj).shortValue());
                    } else if (obj instanceof short[]) {
                        short[] sArr = (short[]) obj;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(sArr.length);
                        for (short s : sArr) {
                            arrayList2.add(java.lang.Integer.valueOf(s));
                        }
                        persistableBundle.putIntArray(str, ajsz.cm(arrayList2));
                    } else if (obj instanceof java.lang.Character) {
                        persistableBundle.putString(str, java.lang.String.valueOf(((java.lang.Character) obj).charValue()));
                    } else if (obj instanceof char[]) {
                        char[] cArr = (char[]) obj;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(cArr.length);
                        for (char c : cArr) {
                            arrayList3.add(java.lang.String.valueOf(c));
                        }
                        persistableBundle.putStringArray(str, (java.lang.String[]) arrayList3.toArray(new java.lang.String[0]));
                    } else if (obj instanceof java.lang.CharSequence) {
                        persistableBundle.putString(str, obj.toString());
                    } else if (obj instanceof java.lang.Float) {
                        persistableBundle.putDouble(str, ((java.lang.Number) obj).floatValue());
                    } else if (obj instanceof float[]) {
                        float[] fArr = (float[]) obj;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList(fArr.length);
                        for (float f : fArr) {
                            arrayList4.add(java.lang.Double.valueOf(f));
                        }
                        double[] dArr = new double[arrayList4.size()];
                        java.util.Iterator it = arrayList4.iterator();
                        int i = 0;
                        while (it.hasNext()) {
                            dArr[i] = ((java.lang.Number) it.next()).doubleValue();
                            i++;
                        }
                        persistableBundle.putDoubleArray(str, dArr);
                    } else if (obj instanceof android.util.Size) {
                        persistableBundle.putString(str, ((android.util.Size) obj).toString());
                    } else if (obj instanceof android.content.ComponentName) {
                        persistableBundle.putString(str, ((android.content.ComponentName) obj).flattenToString());
                    } else if (obj instanceof android.content.Intent) {
                        i(persistableBundle, str, new com.android.onboarding.utils.persistable.PersistableIntent((android.content.Intent) obj));
                    } else if (obj instanceof android.accounts.Account) {
                        android.accounts.Account account = (android.accounts.Account) obj;
                        android.os.PersistableBundle persistableBundle3 = new android.os.PersistableBundle();
                        persistableBundle3.putString("accountName", account.name);
                        persistableBundle3.putString("accountType", account.type);
                        persistableBundle.putPersistableBundle(str, persistableBundle3);
                    } else if (obj instanceof java.util.Locale) {
                        persistableBundle.putString(str, ((java.util.Locale) obj).toLanguageTag());
                    } else if (obj instanceof android.net.Uri) {
                        persistableBundle2.putString(str, new aooa(android.net.Uri.class).b());
                        persistableBundle.putString(str, ((android.net.Uri) obj).toString());
                    } else if (obj instanceof java.util.ArrayList) {
                        A(persistableBundle, str, (java.util.Collection) obj, persistableBundle2, aonnVar, strB);
                    } else {
                        aonn aonnVar2 = aonnVar;
                        if (obj instanceof java.lang.Object[]) {
                            A(persistableBundle, str, ajsz.cw((java.lang.Object[]) obj), persistableBundle2, aonnVar2, strB);
                        } else if (aonnVar2 == null) {
                            defpackage.xox.b("BundleExt", "Dropping object with key " + str + " due to unknown or unpersistable type " + obj.getClass());
                        } else {
                            aonnVar2.a(str, "Dropping object with key " + str + " due to unknown or unpersistable type " + obj.getClass());
                        }
                        aonnVar = aonnVar2;
                    }
                }
            }
            android.os.PersistableBundle persistableBundle4 = new android.os.PersistableBundle();
            persistableBundle4.putPersistableBundle("_original_types", persistableBundle2);
            persistableBundle.putPersistableBundle("_conversion", persistableBundle4);
            return persistableBundle;
        } catch (java.lang.Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public static int q(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return 5;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return 6;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return 7;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return 8;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return 9;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return 10;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return 11;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return 12;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return 13;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return 14;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
            default:
                return 0;
            case 54:
                return 55;
            case 55:
                return 56;
        }
    }

    public static int r(java.lang.String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -678927291) {
            if (iHashCode != 3178) {
                if (iHashCode != 3240) {
                    if (iHashCode != 3251) {
                        if (iHashCode != 3365) {
                            if (iHashCode != 3488) {
                                if (iHashCode != 3571) {
                                    if (iHashCode != 3588) {
                                        if (iHashCode == 3592 && str.equals("px")) {
                                            return 1;
                                        }
                                    } else if (str.equals("pt")) {
                                        return 7;
                                    }
                                } else if (str.equals("pc")) {
                                    return 8;
                                }
                            } else if (str.equals("mm")) {
                                return 6;
                            }
                        } else if (str.equals("in")) {
                            return 4;
                        }
                    } else if (str.equals("ex")) {
                        return 3;
                    }
                } else if (str.equals("em")) {
                    return 2;
                }
            } else if (str.equals("cm")) {
                return 5;
            }
        } else if (str.equals("percent")) {
            return 9;
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static void s(boolean z, java.lang.String str) {
        if (!z) {
            throw new java.lang.IllegalArgumentException(str);
        }
    }

    public static void t(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("Must not be null or empty");
        }
    }

    public static void u(java.util.Collection collection) {
        if (collection.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Must not be empty.");
        }
    }

    public static android.graphics.Bitmap w(byte[] bArr, int i, int i2, android.graphics.BitmapFactory.Options options, defpackage.ybt ybtVar) throws java.lang.Throwable {
        android.graphics.Bitmap.Config config;
        if (android.os.Build.VERSION.SDK_INT != 34 || !defpackage.ybp.a(options) || !z(ybtVar)) {
            return android.graphics.BitmapFactory.decodeByteArray(bArr, i, i2, options);
        }
        s(options.inPreferredConfig == android.graphics.Bitmap.Config.HARDWARE, "");
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        android.graphics.Bitmap bitmapY = null;
        try {
            android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, i, i2, options);
            if (bitmapDecodeByteArray == null) {
                config = android.graphics.Bitmap.Config.HARDWARE;
            } else {
                try {
                    bitmapY = y(bitmapDecodeByteArray);
                    bitmapDecodeByteArray.recycle();
                    config = android.graphics.Bitmap.Config.HARDWARE;
                } catch (java.lang.Throwable th) {
                    th = th;
                    bitmapY = bitmapDecodeByteArray;
                    if (bitmapY != null) {
                        bitmapY.recycle();
                    }
                    options.inPreferredConfig = android.graphics.Bitmap.Config.HARDWARE;
                    throw th;
                }
            }
            options.inPreferredConfig = config;
            return bitmapY;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static android.graphics.Bitmap x(java.io.InputStream inputStream, android.graphics.BitmapFactory.Options options, defpackage.ybt ybtVar) throws java.lang.Throwable {
        android.graphics.Bitmap.Config config;
        android.graphics.Bitmap bitmapY = null;
        if (android.os.Build.VERSION.SDK_INT != 34 || !defpackage.ybp.a(options) || !z(ybtVar)) {
            return android.graphics.BitmapFactory.decodeStream(inputStream, null, options);
        }
        s(options.inPreferredConfig == android.graphics.Bitmap.Config.HARDWARE, "");
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        try {
            android.graphics.Bitmap bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(inputStream, null, options);
            if (bitmapDecodeStream == null) {
                config = android.graphics.Bitmap.Config.HARDWARE;
            } else {
                try {
                    bitmapY = y(bitmapDecodeStream);
                    bitmapDecodeStream.recycle();
                    config = android.graphics.Bitmap.Config.HARDWARE;
                } catch (java.lang.Throwable th) {
                    th = th;
                    bitmapY = bitmapDecodeStream;
                    if (bitmapY != null) {
                        bitmapY.recycle();
                    }
                    options.inPreferredConfig = android.graphics.Bitmap.Config.HARDWARE;
                    throw th;
                }
            }
            options.inPreferredConfig = config;
            return bitmapY;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static android.graphics.Bitmap y(android.graphics.Bitmap bitmap) {
        android.graphics.Gainmap gainmapM = rp$.ExternalSyntheticApiModelOutline0.m(bitmap);
        if (gainmapM != null && rp$.ExternalSyntheticApiModelOutline0.m(gainmapM).getConfig() == android.graphics.Bitmap.Config.ALPHA_8) {
            android.graphics.ColorMatrixColorFilter colorMatrixColorFilter = defpackage.ybn.a;
            android.graphics.Bitmap bitmapM = rp$.ExternalSyntheticApiModelOutline0.m(gainmapM);
            if (bitmapM.getConfig() == android.graphics.Bitmap.Config.ALPHA_8) {
                s(bitmapM.getConfig() == android.graphics.Bitmap.Config.ALPHA_8, "");
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapM.getWidth(), bitmapM.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                android.graphics.Paint paint = new android.graphics.Paint();
                paint.setColorFilter(defpackage.ybn.a);
                canvas.drawBitmap(bitmapM, 0.0f, 0.0f, paint);
                canvas.setBitmap(null);
                android.graphics.Gainmap gainmap = new android.graphics.Gainmap(bitmapCreateBitmap);
                float[] fArrM$1 = rp$.ExternalSyntheticApiModelOutline0.m$1(gainmapM);
                rp$.ExternalSyntheticApiModelOutline0.m$2(gainmap, fArrM$1[0], fArrM$1[1], fArrM$1[2]);
                float[] fArrM$2 = rp$.ExternalSyntheticApiModelOutline0.m$2(gainmapM);
                rp$.ExternalSyntheticApiModelOutline0.m$3(gainmap, fArrM$2[0], fArrM$2[1], fArrM$2[2]);
                float[] fArrM$3 = rp$.ExternalSyntheticApiModelOutline0.m$3(gainmapM);
                rp$.ExternalSyntheticApiModelOutline0.m$4(gainmap, fArrM$3[0], fArrM$3[1], fArrM$3[2]);
                float[] fArrM$4 = rp$.ExternalSyntheticApiModelOutline0.m$4(gainmapM);
                rp$.ExternalSyntheticApiModelOutline0.m(gainmap, fArrM$4[0], fArrM$4[1], fArrM$4[2]);
                float[] fArrM = rp$.ExternalSyntheticApiModelOutline0.m(gainmapM);
                rp$.ExternalSyntheticApiModelOutline0.m$1(gainmap, fArrM[0], fArrM[1], fArrM[2]);
                rp$.ExternalSyntheticApiModelOutline0.m(gainmap, rp$.ExternalSyntheticApiModelOutline0.m(gainmapM));
                rp$.ExternalSyntheticApiModelOutline0.m$1(gainmap, rp$.ExternalSyntheticApiModelOutline0.m$1(gainmapM));
                gainmapM = gainmap;
            }
            rp$.ExternalSyntheticApiModelOutline0.m(bitmap, gainmapM);
        }
        return bitmap.copy(android.graphics.Bitmap.Config.HARDWARE, false);
    }

    public static boolean z(defpackage.ybt ybtVar) {
        try {
            boolean zE = ybtVar.e();
            if (!android.util.Log.isLoggable("GlideBitmapFactory", 2)) {
                return zE;
            }
            android.util.Log.v("GlideBitmapFactory", "isLikelyToContainGainmap=" + zE);
            return zE;
        } catch (java.io.IOException e) {
            if (android.util.Log.isLoggable("GlideBitmapFactory", 2)) {
                android.util.Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e);
            }
            return false;
        }
    }

    public xfh(byte[] bArr) {
    }

    public xfh() {
        new java.text.DecimalFormat("#.0000");
        j$.util.Objects.requireNonNull(this);
        new add(10);
    }
}
