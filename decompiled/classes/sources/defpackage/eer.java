package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eer implements defpackage.eco {
    public final defpackage.aomy a;
    public final java.util.concurrent.atomic.AtomicBoolean b;
    public final defpackage.aogc c;
    private final java.io.File d;
    private final defpackage.efa e;
    private final defpackage.apdp f;

    public eer(java.io.File file, defpackage.efa efaVar, defpackage.aogc aogcVar, defpackage.aomy aomyVar) {
        if (file == null) {
            defpackage.aooh.i("file");
        }
        this.d = file;
        this.e = efaVar;
        this.c = aogcVar;
        this.a = aomyVar;
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f = new defpackage.apdp();
    }

    private final void d() {
        if (this.b.get()) {
            throw new java.lang.IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    @Override // defpackage.eco
    public final void a() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[Catch: all -> 0x0070, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:30:0x006f, B:40:0x0083, B:39:0x0080, B:36:0x007b), top: B:45:0x001f, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [aono] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean] */
    public final java.lang.Object b(defpackage.aono aonoVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.eep eepVar;
        ?? C;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        defpackage.eem eemVar;
        ?? r8;
        if (aolnVar instanceof defpackage.eep) {
            eepVar = (defpackage.eep) aolnVar;
            int i = eepVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eepVar.d = i - Integer.MIN_VALUE;
            } else {
                eepVar = new defpackage.eep(this, aolnVar);
            }
        } else {
            eepVar = new defpackage.eep(this, aolnVar);
        }
        java.lang.Object obj = eepVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = eepVar.d;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aonoVar = eepVar.a;
                eemVar = eepVar.e;
                try {
                    defpackage.aooc.af(obj);
                    r8 = aonoVar;
                    try {
                        eemVar.a();
                        th = null;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        this.f.d();
                    }
                    return obj;
                } catch (java.lang.Throwable th4) {
                    th2 = th4;
                    try {
                        eemVar.a();
                    } catch (java.lang.Throwable th5) {
                        aoil.b(th2, th5);
                    }
                    throw th2;
                }
            }
            defpackage.aooc.af(obj);
            d();
            C = this.f.c();
            try {
                defpackage.eem eemVar2 = new defpackage.eem(this.d, this.e);
                try {
                    java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf((boolean) C);
                    eepVar.e = eemVar2;
                    eepVar.a = C;
                    eepVar.d = 1;
                    java.lang.Object objA = aonoVar.a(eemVar2, boolValueOf, eepVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    obj = objA;
                    r8 = C == true ? 1 : 0;
                    eemVar = eemVar2;
                    eemVar.a();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r8 != 0) {
                        this.f.d();
                    }
                    return obj;
                } catch (java.lang.Throwable th6) {
                    th2 = th6;
                    aonoVar = C == true ? 1 : 0;
                    eemVar = eemVar2;
                    eemVar.a();
                    throw th2;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                if (C != 0) {
                    this.f.d();
                }
                throw th;
            }
        } catch (java.lang.Throwable th8) {
            C = aonoVar;
            th = th8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c5 A[Catch: all -> 0x00f9, IOException -> 0x00fc, TRY_ENTER, TryCatch #8 {IOException -> 0x00fc, all -> 0x00f9, blocks: (B:37:0x00c5, B:39:0x00ce, B:41:0x00d4, B:44:0x00db, B:45:0x00de, B:47:0x00ea, B:54:0x00f8, B:53:0x00f5, B:50:0x00f0), top: B:69:0x0023, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ce A[Catch: all -> 0x00f9, IOException -> 0x00fc, TryCatch #8 {IOException -> 0x00fc, all -> 0x00f9, blocks: (B:37:0x00c5, B:39:0x00ce, B:41:0x00d4, B:44:0x00db, B:45:0x00de, B:47:0x00ea, B:54:0x00f8, B:53:0x00f5, B:50:0x00f0), top: B:69:0x0023, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4 A[Catch: all -> 0x00f9, IOException -> 0x00fc, TryCatch #8 {IOException -> 0x00fc, all -> 0x00f9, blocks: (B:37:0x00c5, B:39:0x00ce, B:41:0x00d4, B:44:0x00db, B:45:0x00de, B:47:0x00ea, B:54:0x00f8, B:53:0x00f5, B:50:0x00f0), top: B:69:0x0023, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00db A[Catch: all -> 0x00f9, IOException -> 0x00fc, TryCatch #8 {IOException -> 0x00fc, all -> 0x00f9, blocks: (B:37:0x00c5, B:39:0x00ce, B:41:0x00d4, B:44:0x00db, B:45:0x00de, B:47:0x00ea, B:54:0x00f8, B:53:0x00f5, B:50:0x00f0), top: B:69:0x0023, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea A[Catch: all -> 0x00f9, IOException -> 0x00fc, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x00fc, all -> 0x00f9, blocks: (B:37:0x00c5, B:39:0x00ce, B:41:0x00d4, B:44:0x00db, B:45:0x00de, B:47:0x00ea, B:54:0x00f8, B:53:0x00f5, B:50:0x00f0), top: B:69:0x0023, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x010a A[Catch: all -> 0x0131, TryCatch #0 {all -> 0x0131, blocks: (B:60:0x0101, B:62:0x010a, B:63:0x0110, B:64:0x0130, B:28:0x0088, B:29:0x00a4), top: B:69:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [apdp] */
    /* JADX WARN: Type inference failed for: r10v6, types: [apdp] */
    /* JADX WARN: Type inference failed for: r10v8, types: [apdp] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [apdp] */
    /* JADX WARN: Type inference failed for: r1v15, types: [apdp] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [aoln, eeq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [aolu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v5, types: [aonn] */
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
    public final java.lang.Object c(defpackage.aonn aonnVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        ?? eeqVar;
        ?? file;
        ?? r10;
        ?? r9;
        defpackage.eem eemVar;
        java.lang.Throwable th;
        defpackage.eem eemVar2;
        ?? r1;
        ?? r2;
        java.io.File file2;
        if (aolnVar instanceof defpackage.eeq) {
            defpackage.eeq eeqVar2 = (defpackage.eeq) aolnVar;
            int i = eeqVar2.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eeqVar2.d = i - Integer.MIN_VALUE;
                eeqVar = eeqVar2;
            } else {
                eeqVar = new defpackage.eeq(this, aolnVar);
            }
        } else {
            eeqVar = new defpackage.eeq(this, aolnVar);
        }
        ?? r11 = eeqVar.b;
        ?? r3 = defpackage.aolu.a;
        int i2 = eeqVar.d;
        java.lang.Throwable th2 = null;
        try {
            try {
                try {
                    try {
                        if (i2 == 0) {
                            defpackage.aooc.af(r11);
                            d();
                            java.io.File file3 = this.d;
                            java.io.File parentFile = file3.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    java.util.Objects.toString(file3);
                                    throw new java.io.IOException("Unable to create parent directories of ".concat(java.lang.String.valueOf(file3)));
                                }
                            }
                            ?? r12 = this.f;
                            eeqVar.e = (defpackage.eeh) aonnVar;
                            eeqVar.f = r12;
                            eeqVar.d = 1;
                            java.lang.Object objB = r12.b(eeqVar);
                            r9 = aonnVar;
                            r10 = r12;
                            if (objB == r3) {
                                return r3;
                            }
                        } else {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                eemVar2 = eeqVar.g;
                                r3 = eeqVar.a;
                                eeqVar = eeqVar.f;
                                try {
                                    defpackage.aooc.af(r11);
                                    r1 = eeqVar;
                                    r2 = r3;
                                    try {
                                        eemVar2.a();
                                    } catch (java.lang.Throwable th3) {
                                        th2 = th3;
                                    }
                                    if (th2 == null) {
                                        throw th2;
                                    }
                                    if (((java.io.File) r2).exists()) {
                                        file2 = this.d;
                                        if (r2 == 0) {
                                            defpackage.aooh.i("<this>");
                                        }
                                        if (file2 == null) {
                                            defpackage.aooh.i("toFile");
                                        }
                                        defpackage.ecn.a((java.io.File) r2, file2);
                                    }
                                    r1.d();
                                    return defpackage.aojh.a;
                                } catch (java.lang.Throwable th4) {
                                    th = th4;
                                    try {
                                        eemVar2.a();
                                    } catch (java.lang.Throwable th5) {
                                        aoil.b(th, th5);
                                    }
                                    throw th;
                                }
                            }
                            defpackage.apdp apdpVar = eeqVar.f;
                            defpackage.eeh eehVar = eeqVar.e;
                            defpackage.aooc.af(r11);
                            r10 = apdpVar;
                            r9 = eehVar;
                        }
                        eeqVar.e = null;
                        eeqVar.f = r10;
                        eeqVar.a = file;
                        eeqVar.g = eemVar;
                        eeqVar.d = 2;
                        if (r9.a(eemVar, eeqVar) == r3) {
                            return r3;
                        }
                        r1 = r10;
                        r2 = file;
                        eemVar2 = eemVar;
                        eemVar2.a();
                        if (th2 == null) {
                            throw th2;
                        }
                        if (((java.io.File) r2).exists()) {
                            file2 = this.d;
                            if (r2 == 0) {
                                defpackage.aooh.i("<this>");
                            }
                            if (file2 == null) {
                                defpackage.aooh.i("toFile");
                            }
                            defpackage.ecn.a((java.io.File) r2, file2);
                        }
                        r1.d();
                        return defpackage.aojh.a;
                    } catch (java.lang.Throwable th6) {
                        eeqVar = r10;
                        r3 = file;
                        th = th6;
                        eemVar2 = eemVar;
                        eemVar2.a();
                        throw th;
                    }
                    eemVar = new defpackage.eem(file, this.e);
                } catch (java.io.IOException e) {
                    e = e;
                    if (((java.io.File) file).exists()) {
                        ((java.io.File) file).delete();
                    }
                    throw new java.io.IOException("Unable to rename " + file + " to " + this.d + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.", e);
                }
                file = new java.io.File(this.d.getAbsolutePath() + ".tmp");
            } catch (java.lang.Throwable th7) {
                th = th7;
                r11.d();
                throw th;
            }
        } catch (java.io.IOException e2) {
            e = e2;
            file = r3;
            if (((java.io.File) file).exists()) {
                ((java.io.File) file).delete();
            }
            throw new java.io.IOException("Unable to rename " + file + " to " + this.d + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.", e);
        } catch (java.lang.Throwable th8) {
            th = th8;
            r11 = eeqVar;
            r11.d();
            throw th;
        }
    }
}
