package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aalm {
    private static java.lang.Boolean d = null;
    private static java.lang.String e = null;
    private static boolean f = false;
    private static int g = -1;
    private static java.lang.Boolean h;
    private static aaln l;
    private static aalo m;
    public final android.content.Context c;
    private static final java.lang.ThreadLocal i = new java.lang.ThreadLocal();
    private static final java.lang.ThreadLocal j = new defpackage.aale();
    private static final defpackage.aalj k = new defpackage.aalf();
    public static final defpackage.aall a = new defpackage.aalg(1);
    public static final defpackage.aall b = new defpackage.aalg(0);

    private aalm(android.content.Context context) {
        this.c = context;
    }

    public static int a(android.content.Context context, java.lang.String str) {
        int i2 = 0;
        try {
            java.lang.Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass(defpackage.a.bk(str, "com.google.android.gms.dynamite.descriptors.", ".ModuleDescriptor"));
            java.lang.reflect.Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            java.lang.reflect.Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (j$.util.Objects.equals(declaredField.get(null), str)) {
                i2 = declaredField2.getInt(null);
            } else {
                android.util.Log.e("DynamiteModule", "Module descriptor id '" + java.lang.String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + '\'');
            }
        } catch (java.lang.ClassNotFoundException unused) {
            android.util.Log.w("DynamiteModule", defpackage.a.bk(str, "Local module descriptor class for ", " not found."));
        } catch (java.lang.Exception e2) {
            android.util.Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(java.lang.String.valueOf(e2.getMessage())));
        }
        return i2;
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [android.database.Cursor, java.lang.Object] */
    public static int b(android.content.Context context, java.lang.String str, boolean z) {
        java.lang.Throwable th;
        android.os.RemoteException e2;
        int i2;
        aalb aakzVar;
        ?? r1;
        try {
            synchronized (defpackage.aalm.class) {
                java.lang.Boolean bool = d;
                android.database.Cursor cursor = null;
                if (bool == null) {
                    try {
                        java.lang.reflect.Field declaredField = context.getApplicationContext().getClassLoader().loadClass(com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                java.lang.ClassLoader classLoader = (java.lang.ClassLoader) declaredField.get(null);
                                if (classLoader == java.lang.ClassLoader.getSystemClassLoader()) {
                                    bool = java.lang.Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        g(classLoader);
                                    } catch (defpackage.aali unused) {
                                    }
                                    bool = java.lang.Boolean.TRUE;
                                } else {
                                    if (!i(context)) {
                                        return 0;
                                    }
                                    if (f || java.lang.Boolean.TRUE.equals(null)) {
                                        declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                        bool = java.lang.Boolean.FALSE;
                                    } else {
                                        try {
                                            int iE = e(context, str, z, true);
                                            java.lang.String str2 = e;
                                            if (str2 != null && !str2.isEmpty()) {
                                                java.lang.ClassLoader classLoaderA = aald.a();
                                                if (classLoaderA == null) {
                                                    java.lang.String str3 = e;
                                                    if (str3 == null) {
                                                        throw new java.lang.NullPointerException("null reference");
                                                    }
                                                    classLoaderA = new dalvik.system.DelegateLastClassLoader(str3, java.lang.ClassLoader.getSystemClassLoader());
                                                }
                                                g(classLoaderA);
                                                declaredField.set(null, classLoaderA);
                                                d = java.lang.Boolean.TRUE;
                                            }
                                            return iE;
                                        } catch (defpackage.aali unused2) {
                                            declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                            bool = java.lang.Boolean.FALSE;
                                        }
                                    }
                                }
                                d = bool;
                            } catch (java.lang.Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException e3) {
                        android.util.Log.w("DynamiteModule", defpackage.hgb.k(e3, "Failed to load module via V2: "));
                        bool = java.lang.Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z, false);
                    } catch (defpackage.aali e4) {
                        android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                aaln aalnVarJ = j(context);
                try {
                    if (aalnVarJ == null) {
                        return 0;
                    }
                    try {
                        int iA = aalnVarJ.a();
                        if (iA >= 3) {
                            defpackage.aiyy aiyyVar = (defpackage.aiyy) i.get();
                            if (aiyyVar != null && (r1 = aiyyVar.a) != 0) {
                                return r1.getInt(0);
                            }
                            aala aalaVar = new aala(context);
                            long jLongValue = ((java.lang.Long) j.get()).longValue();
                            android.os.Parcel parcelEP = aalnVarJ.eP();
                            defpackage.yld.f(parcelEP, aalaVar);
                            parcelEP.writeString(str);
                            parcelEP.writeInt(z ? 1 : 0);
                            parcelEP.writeLong(jLongValue);
                            android.os.Parcel parcelEQ = aalnVarJ.eQ(7, parcelEP);
                            android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
                            if (strongBinder == null) {
                                aakzVar = null;
                            } else {
                                aalb aalbVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                aakzVar = aalbVarQueryLocalInterface instanceof aalb ? aalbVarQueryLocalInterface : new aakz(strongBinder);
                            }
                            parcelEQ.recycle();
                            android.database.Cursor cursor2 = (android.database.Cursor) aala.a(aakzVar);
                            if (cursor2 != null) {
                                try {
                                    if (cursor2.moveToFirst()) {
                                        i2 = cursor2.getInt(0);
                                        cursor = (i2 <= 0 || !h(cursor2)) ? cursor2 : null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                    }
                                } catch (android.os.RemoteException e5) {
                                    e2 = e5;
                                    cursor = cursor2;
                                    android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                    if (cursor == null) {
                                        return 0;
                                    }
                                    cursor.close();
                                    return 0;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    cursor = cursor2;
                                    if (cursor == null) {
                                        throw th;
                                    }
                                    cursor.close();
                                    throw th;
                                }
                            }
                            android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor2 == null) {
                                return 0;
                            }
                            cursor2.close();
                            return 0;
                        }
                        if (iA == 2) {
                            android.util.Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            aala aalaVar2 = new aala(context);
                            android.os.Parcel parcelEP2 = aalnVarJ.eP();
                            defpackage.yld.f(parcelEP2, aalaVar2);
                            parcelEP2.writeString(str);
                            parcelEP2.writeInt(z ? 1 : 0);
                            android.os.Parcel parcelEQ2 = aalnVarJ.eQ(5, parcelEP2);
                            i2 = parcelEQ2.readInt();
                            parcelEQ2.recycle();
                        } else {
                            android.util.Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            aala aalaVar3 = new aala(context);
                            android.os.Parcel parcelEP3 = aalnVarJ.eP();
                            defpackage.yld.f(parcelEP3, aalaVar3);
                            parcelEP3.writeString(str);
                            parcelEP3.writeInt(z ? 1 : 0);
                            android.os.Parcel parcelEQ3 = aalnVarJ.eQ(3, parcelEP3);
                            i2 = parcelEQ3.readInt();
                            parcelEQ3.recycle();
                        }
                        return i2;
                    } catch (android.os.RemoteException e6) {
                        e2 = e6;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                }
            }
        } catch (java.lang.Throwable th5) {
            defpackage.aehj.bQ(context);
            throw th5;
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor, java.lang.Object] */
    public static defpackage.aalm c(android.content.Context context, defpackage.aall aallVar, java.lang.String str) throws java.lang.Throwable {
        long j2;
        long j3;
        defpackage.aalm aalmVarF;
        java.lang.Boolean bool;
        aalb aakzVar;
        defpackage.aalm aalmVar;
        aalo aaloVar;
        boolean z;
        java.lang.Boolean boolValueOf;
        aalb aakzVar2;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new defpackage.aali("null application Context");
        }
        java.lang.ThreadLocal threadLocal = i;
        defpackage.aiyy aiyyVar = (defpackage.aiyy) threadLocal.get();
        defpackage.aiyy aiyyVar2 = new defpackage.aiyy();
        threadLocal.set(aiyyVar2);
        java.lang.ThreadLocal threadLocal2 = j;
        java.lang.Long l2 = (java.lang.Long) threadLocal2.get();
        long jLongValue = l2.longValue();
        try {
            threadLocal2.set(java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()));
            defpackage.aalk aalkVarA = aallVar.a(context, str, k);
            j3 = 0;
            try {
                int i2 = aalkVarA.a;
                j2 = jLongValue;
                try {
                    android.util.Log.i("DynamiteModule", "Considering local module " + str + ':' + i2 + " and remote module " + str + ':' + aalkVarA.b);
                    int i3 = aalkVarA.c;
                    if (i3 == 0 || ((i3 == -1 && aalkVarA.a == 0) || (i3 == 1 && aalkVarA.b == 0))) {
                        throw new defpackage.aali("No acceptable module " + str + " found. Local version is " + aalkVarA.a + " and remote version is " + aalkVarA.b + '.');
                    }
                    if (i3 == -1) {
                        defpackage.aalm aalmVarF2 = f(applicationContext, str);
                        if (j2 == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l2);
                        }
                        ?? r1 = aiyyVar2.a;
                        if (r1 != 0) {
                            r1.close();
                        }
                        threadLocal.set(aiyyVar);
                        return aalmVarF2;
                    }
                    if (i3 != 1) {
                        throw new defpackage.aali(defpackage.a.bj(0, "VersionPolicy returned invalid code:"));
                    }
                    try {
                        int i4 = aalkVarA.b;
                        try {
                            synchronized (defpackage.aalm.class) {
                                if (!i(context)) {
                                    throw new defpackage.aali("Remote loading disabled");
                                }
                                bool = d;
                            }
                            if (bool == null) {
                                throw new defpackage.aali("Failed to determine which loading route to use.");
                            }
                            if (bool.booleanValue()) {
                                android.util.Log.i("DynamiteModule", defpackage.a.bu(i4, str, "Selected remote version of ", ", version >= "));
                                synchronized (defpackage.aalm.class) {
                                    try {
                                        aaloVar = m;
                                    } catch (java.lang.Throwable th) {
                                        throw th;
                                    }
                                }
                                if (aaloVar == null) {
                                    throw new defpackage.aali("DynamiteLoaderV2 was not cached.");
                                }
                                defpackage.aiyy aiyyVar3 = (defpackage.aiyy) threadLocal.get();
                                if (aiyyVar3 == null || aiyyVar3.a == null) {
                                    throw new defpackage.aali("No result cursor");
                                }
                                android.content.Context applicationContext2 = context.getApplicationContext();
                                java.lang.Object obj = aiyyVar3.a;
                                new aala((java.lang.Object) null);
                                synchronized (defpackage.aalm.class) {
                                    try {
                                        z = g >= 2;
                                        boolValueOf = java.lang.Boolean.valueOf(z);
                                    } catch (java.lang.Throwable th2) {
                                        throw th2;
                                    }
                                }
                                boolValueOf.getClass();
                                if (z) {
                                    android.util.Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                    aala aalaVar = new aala(applicationContext2);
                                    aala aalaVar2 = new aala(obj);
                                    android.os.Parcel parcelEP = aaloVar.eP();
                                    defpackage.yld.f(parcelEP, aalaVar);
                                    parcelEP.writeString(str);
                                    parcelEP.writeInt(i4);
                                    defpackage.yld.f(parcelEP, aalaVar2);
                                    android.os.Parcel parcelEQ = aaloVar.eQ(3, parcelEP);
                                    android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
                                    if (strongBinder == null) {
                                        aakzVar2 = null;
                                    } else {
                                        aalb aalbVarQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                        aakzVar2 = aalbVarQueryLocalInterface instanceof aalb ? aalbVarQueryLocalInterface : new aakz(strongBinder);
                                    }
                                    parcelEQ.recycle();
                                } else {
                                    android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                    aala aalaVar3 = new aala(applicationContext2);
                                    aala aalaVar4 = new aala(obj);
                                    android.os.Parcel parcelEP2 = aaloVar.eP();
                                    defpackage.yld.f(parcelEP2, aalaVar3);
                                    parcelEP2.writeString(str);
                                    parcelEP2.writeInt(i4);
                                    defpackage.yld.f(parcelEP2, aalaVar4);
                                    android.os.Parcel parcelEQ2 = aaloVar.eQ(2, parcelEP2);
                                    android.os.IBinder strongBinder2 = parcelEQ2.readStrongBinder();
                                    if (strongBinder2 == null) {
                                        aakzVar2 = null;
                                    } else {
                                        aalb aalbVarQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                        aakzVar2 = aalbVarQueryLocalInterface2 instanceof aalb ? aalbVarQueryLocalInterface2 : new aakz(strongBinder2);
                                    }
                                    parcelEQ2.recycle();
                                }
                                android.content.Context context2 = (android.content.Context) aala.a(aakzVar2);
                                if (context2 == null) {
                                    throw new defpackage.aali("Failed to get module context");
                                }
                                aalmVar = new defpackage.aalm(context2);
                            } else {
                                android.util.Log.i("DynamiteModule", defpackage.a.bu(i4, str, "Selected remote version of ", ", version >= "));
                                aaln aalnVarJ = j(context);
                                if (aalnVarJ == null) {
                                    throw new defpackage.aali("Failed to create IDynamiteLoader.");
                                }
                                int iA = aalnVarJ.a();
                                if (iA >= 3) {
                                    defpackage.aiyy aiyyVar4 = (defpackage.aiyy) threadLocal.get();
                                    if (aiyyVar4 == null) {
                                        throw new defpackage.aali("No cached result cursor holder");
                                    }
                                    aala aalaVar5 = new aala(context);
                                    aala aalaVar6 = new aala(aiyyVar4.a);
                                    android.os.Parcel parcelEP3 = aalnVarJ.eP();
                                    defpackage.yld.f(parcelEP3, aalaVar5);
                                    parcelEP3.writeString(str);
                                    parcelEP3.writeInt(i4);
                                    defpackage.yld.f(parcelEP3, aalaVar6);
                                    android.os.Parcel parcelEQ3 = aalnVarJ.eQ(8, parcelEP3);
                                    android.os.IBinder strongBinder3 = parcelEQ3.readStrongBinder();
                                    if (strongBinder3 == null) {
                                        aakzVar = null;
                                    } else {
                                        aalb aalbVarQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                        aakzVar = aalbVarQueryLocalInterface3 instanceof aalb ? aalbVarQueryLocalInterface3 : new aakz(strongBinder3);
                                    }
                                    parcelEQ3.recycle();
                                } else if (iA == 2) {
                                    android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    aala aalaVar7 = new aala(context);
                                    android.os.Parcel parcelEP4 = aalnVarJ.eP();
                                    defpackage.yld.f(parcelEP4, aalaVar7);
                                    parcelEP4.writeString(str);
                                    parcelEP4.writeInt(i4);
                                    android.os.Parcel parcelEQ4 = aalnVarJ.eQ(4, parcelEP4);
                                    android.os.IBinder strongBinder4 = parcelEQ4.readStrongBinder();
                                    if (strongBinder4 == null) {
                                        aakzVar = null;
                                    } else {
                                        aalb aalbVarQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                        aakzVar = aalbVarQueryLocalInterface4 instanceof aalb ? aalbVarQueryLocalInterface4 : new aakz(strongBinder4);
                                    }
                                    parcelEQ4.recycle();
                                } else {
                                    android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    aala aalaVar8 = new aala(context);
                                    android.os.Parcel parcelEP5 = aalnVarJ.eP();
                                    defpackage.yld.f(parcelEP5, aalaVar8);
                                    parcelEP5.writeString(str);
                                    parcelEP5.writeInt(i4);
                                    android.os.Parcel parcelEQ5 = aalnVarJ.eQ(2, parcelEP5);
                                    android.os.IBinder strongBinder5 = parcelEQ5.readStrongBinder();
                                    if (strongBinder5 == null) {
                                        aakzVar = null;
                                    } else {
                                        aalb aalbVarQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                        aakzVar = aalbVarQueryLocalInterface5 instanceof aalb ? aalbVarQueryLocalInterface5 : new aakz(strongBinder5);
                                    }
                                    parcelEQ5.recycle();
                                }
                                java.lang.Object objA = aala.a(aakzVar);
                                if (objA == null) {
                                    throw new defpackage.aali("Failed to load remote module.");
                                }
                                aalmVar = new defpackage.aalm((android.content.Context) objA);
                            }
                            aalmVarF = aalmVar;
                            java.lang.ThreadLocal threadLocal3 = j;
                            if (j2 == 0) {
                                threadLocal3.remove();
                            } else {
                                threadLocal3.set(l2);
                            }
                            ?? r2 = aiyyVar2.a;
                            if (r2 != 0) {
                                r2.close();
                            }
                            i.set(aiyyVar);
                            return aalmVarF;
                        } catch (defpackage.aali e2) {
                            throw e2;
                        } catch (android.os.RemoteException e3) {
                            throw new defpackage.aali("Failed to load remote module.", e3);
                        } catch (java.lang.Throwable th3) {
                            defpackage.aehj.bQ(context);
                            throw new defpackage.aali("Failed to load remote module.", th3);
                        }
                    } catch (defpackage.aali e4) {
                        android.util.Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                        int i5 = aalkVarA.a;
                        if (i5 == 0 || aallVar.a(context, str, new aalh(i5)).c != -1) {
                            throw new defpackage.aali("Remote load failed. No local fallback found.", e4);
                        }
                        aalmVarF = f(applicationContext, str);
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    java.lang.ThreadLocal threadLocal4 = j;
                    if (j2 == j3) {
                        threadLocal4.remove();
                    } else {
                        threadLocal4.set(l2);
                    }
                    ?? r3 = aiyyVar2.a;
                    if (r3 != 0) {
                        r3.close();
                    }
                    i.set(aiyyVar);
                    throw th;
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                j2 = jLongValue;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            j2 = jLongValue;
            j3 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0121 A[PHI: r13
      0x0121: PHI (r13v6 boolean) = (r13v5 boolean), (r13v10 boolean) binds: [B:58:0x00e9, B:72:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    private static int e(android.content.Context context, java.lang.String str, boolean z, boolean z2) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.lang.Exception exc;
        android.database.MatrixCursor matrixCursor;
        android.database.MatrixCursor matrixCursor2 = null;
        try {
            try {
                android.net.Uri uriBuild = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", java.lang.String.valueOf(((java.lang.Long) j.get()).longValue())).build();
                android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z3 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    try {
                        android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new android.database.MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i2 = 0; i2 < count; i2++) {
                                    if (!cursorQuery.moveToPosition(i2)) {
                                        throw new android.os.RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    java.lang.Object[] objArr = new java.lang.Object[columnCount];
                                    for (int i3 = 0; i3 < columnCount; i3++) {
                                        int type = cursorQuery.getType(i3);
                                        if (type == 0) {
                                            objArr[i3] = null;
                                        } else if (type == 1) {
                                            objArr[i3] = java.lang.Long.valueOf(cursorQuery.getLong(i3));
                                        } else if (type == 2) {
                                            objArr[i3] = java.lang.Double.valueOf(cursorQuery.getDouble(i3));
                                        } else if (type == 3) {
                                            objArr[i3] = cursorQuery.getString(i3);
                                        } else {
                                            if (type != 4) {
                                                throw new android.os.RemoteException("Unknown column type");
                                            }
                                            objArr[i3] = cursorQuery.getBlob(i3);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (java.lang.Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (java.lang.Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } else {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        }
                    } catch (android.os.RemoteException unused) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        matrixCursor = null;
                    } catch (java.lang.Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                } else {
                    matrixCursor = null;
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i4 = matrixCursor.getInt(0);
                            if (i4 > 0) {
                                synchronized (defpackage.aalm.class) {
                                    e = matrixCursor.getString(2);
                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        g = matrixCursor.getInt(columnIndex);
                                    }
                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        boolean z4 = matrixCursor.getInt(columnIndex2) != 0;
                                        f = z4;
                                        z3 = z4;
                                    }
                                }
                                matrixCursor2 = h(matrixCursor) ? null : matrixCursor;
                            }
                            if (z2 && z3) {
                                throw new defpackage.aali("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i4;
                        }
                    } catch (java.lang.Exception e2) {
                        exc = e2;
                        if (exc instanceof defpackage.aali) {
                            throw exc;
                        }
                        throw new defpackage.aali("V2 version check failed: " + exc.getMessage(), exc);
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                synchronized (defpackage.aalm.class) {
                    if (matrixCursor == null) {
                        if (java.lang.Boolean.FALSE.equals(null)) {
                            android.util.Log.w("DynamiteModule", "Play services is unavailable. Will not fall back to container v1 loader.");
                            return 0;
                        }
                    }
                    android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                    throw new defpackage.aali("Failed to connect to dynamite module ContentResolver.");
                }
            } catch (java.lang.Exception e3) {
                exc = e3;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
    }

    private static defpackage.aalm f(android.content.Context context, java.lang.String str) {
        android.util.Log.i("DynamiteModule", "Selected local version of ".concat(str));
        return new defpackage.aalm(context);
    }

    private static void g(java.lang.ClassLoader classLoader) throws defpackage.aali {
        try {
            aalo aaloVar = null;
            android.os.IBinder iBinder = (android.os.IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                aaloVar = iInterfaceQueryLocalInterface instanceof aalo ? (aalo) iInterfaceQueryLocalInterface : new aalo(iBinder);
            }
            m = aaloVar;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e2) {
            throw new defpackage.aali("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean h(android.database.Cursor cursor) {
        defpackage.aiyy aiyyVar = (defpackage.aiyy) i.get();
        if (aiyyVar == null || aiyyVar.a != null) {
            return false;
        }
        aiyyVar.a = cursor;
        return true;
    }

    private static boolean i(android.content.Context context) {
        boolean z = true;
        if (!java.lang.Boolean.TRUE.equals(null) && !java.lang.Boolean.TRUE.equals(h)) {
            boolean z2 = false;
            if (h == null) {
                android.content.pm.ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 268435456);
                if (defpackage.aaby.d.l(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    z2 = true;
                }
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z2);
                h = boolValueOf;
                boolValueOf.getClass();
                if (z2 && providerInfoResolveContentProvider.applicationInfo != null && (providerInfoResolveContentProvider.applicationInfo.flags & 129) == 0) {
                    android.util.Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                    f = true;
                }
            }
            z = z2;
            if (!z) {
                android.util.Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
            }
        }
        return z;
    }

    private static aaln j(android.content.Context context) {
        aaln aalnVar;
        synchronized (defpackage.aalm.class) {
            aaln aalnVar2 = l;
            if (aalnVar2 != null) {
                return aalnVar2;
            }
            try {
                android.os.IBinder iBinder = (android.os.IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    aalnVar = null;
                } else {
                    aaln aalnVarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    aalnVar = aalnVarQueryLocalInterface instanceof aaln ? aalnVarQueryLocalInterface : new aaln(iBinder);
                }
                if (aalnVar != null) {
                    l = aalnVar;
                    return aalnVar;
                }
            } catch (java.lang.Exception e2) {
                android.util.Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final android.os.IBinder d() throws defpackage.aali {
        try {
            return (android.os.IBinder) this.c.getClassLoader().loadClass("com.google.android.gms.common.GoogleCertificatesImpl").newInstance();
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e2) {
            throw new defpackage.aali("Failed to instantiate module class: com.google.android.gms.common.GoogleCertificatesImpl", e2);
        }
    }
}
