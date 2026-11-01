package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class da extends defpackage.az {
    private defpackage.dc n;

    public da() {
        aT().e("androidx:appcompat", new defpackage.bf(this, 2));
        r(new defpackage.cz(this, 0));
    }

    @Override // defpackage.mp, android.app.Activity
    public final void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        ff();
        j().d(view, layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0195  */
    /* JADX WARN: Code duplicated, block: B:104:0x019f  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:125:0x0211  */
    /* JADX WARN: Code duplicated, block: B:128:0x022d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0245  */
    /* JADX WARN: Code duplicated, block: B:134:0x0258  */
    /* JADX WARN: Code duplicated, block: B:137:0x0267  */
    /* JADX WARN: Code duplicated, block: B:140:0x0271  */
    /* JADX WARN: Code duplicated, block: B:143:0x027b  */
    /* JADX WARN: Code duplicated, block: B:146:0x0285  */
    /* JADX WARN: Code duplicated, block: B:150:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:162:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:73:0x010a  */
    /* JADX WARN: Code duplicated, block: B:75:0x010e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0137  */
    /* JADX WARN: Code duplicated, block: B:79:0x0140  */
    /* JADX WARN: Code duplicated, block: B:83:0x014e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0158  */
    /* JADX WARN: Code duplicated, block: B:89:0x0162  */
    /* JADX WARN: Code duplicated, block: B:92:0x0174  */
    /* JADX WARN: Code duplicated, block: B:95:0x0181  */
    /* JADX WARN: Code duplicated, block: B:98:0x018b  */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(android.content.Context context) {
        android.content.Context context2;
        android.content.res.Configuration configuration;
        android.content.res.Configuration configuration2;
        defpackage.pc pcVar;
        android.content.Context context3;
        android.os.LocaleList localeListM;
        android.os.LocaleList localeListM2;
        defpackage.dq dqVar = (defpackage.dq) j();
        dqVar.D = true;
        int iT = dqVar.t(context, dqVar.s());
        android.content.res.Configuration configuration3 = null;
        if (defpackage.dq.o(context) && defpackage.dc.o(context)) {
            if (android.os.Build.VERSION.SDK_INT < 33) {
                synchronized (defpackage.dc.h) {
                    try {
                        defpackage.dxe dxeVar = defpackage.dc.c;
                        if (dxeVar == null) {
                            if (defpackage.dc.d == null) {
                                defpackage.dc.d = defpackage.dxe.c(dut.a(context));
                            }
                            if (!defpackage.dc.d.g()) {
                                defpackage.dc.c = defpackage.dc.d;
                            }
                        } else if (!dxeVar.equals(defpackage.dc.d)) {
                            defpackage.dxe dxeVar2 = defpackage.dc.c;
                            defpackage.dc.d = dxeVar2;
                            java.lang.String strE = dxeVar2.e();
                            synchronized (dut.a) {
                                try {
                                    if (strE.equals("")) {
                                        context.deleteFile("android.support.v7.app.AppCompatDelegate.application_locales_record_file");
                                    } else {
                                        try {
                                            java.io.FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("android.support.v7.app.AppCompatDelegate.application_locales_record_file", 0);
                                            org.xmlpull.v1.XmlSerializer xmlSerializerNewSerializer = android.util.Xml.newSerializer();
                                            try {
                                                try {
                                                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                                                    xmlSerializerNewSerializer.startDocument("UTF-8", java.lang.Boolean.TRUE);
                                                    xmlSerializerNewSerializer.startTag(null, "locales");
                                                    xmlSerializerNewSerializer.attribute(null, "application_locales", strE);
                                                    xmlSerializerNewSerializer.endTag(null, "locales");
                                                    xmlSerializerNewSerializer.endDocument();
                                                    if (fileOutputStreamOpenFileOutput != null) {
                                                        try {
                                                            fileOutputStreamOpenFileOutput.close();
                                                        } catch (java.io.IOException unused) {
                                                        }
                                                    }
                                                } catch (java.lang.Exception e) {
                                                    android.util.Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);
                                                    if (fileOutputStreamOpenFileOutput != null) {
                                                        fileOutputStreamOpenFileOutput.close();
                                                    }
                                                }
                                            } catch (java.lang.Throwable th) {
                                                if (fileOutputStreamOpenFileOutput == null) {
                                                    throw th;
                                                }
                                                try {
                                                    fileOutputStreamOpenFileOutput.close();
                                                    throw th;
                                                } catch (java.io.IOException unused2) {
                                                    throw th;
                                                }
                                            }
                                        } catch (java.io.FileNotFoundException unused3) {
                                            android.util.Log.w("AppLocalesStorageHelper", java.lang.String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "android.support.v7.app.AppCompatDelegate.application_locales_record_file"));
                                        }
                                    }
                                } catch (java.lang.Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        throw th3;
                    }
                }
            } else if (!defpackage.dc.e) {
                defpackage.dc.a.execute(new defpackage.ae(context, 17));
            }
        }
        defpackage.dxe dxeVarY = dqVar.y(context);
        if (context instanceof android.view.ContextThemeWrapper) {
            context2 = context;
            try {
                ((android.view.ContextThemeWrapper) context2).applyOverrideConfiguration(dqVar.v(context2, iT, dxeVarY, null, false));
            } catch (java.lang.IllegalStateException unused4) {
                if (context2 instanceof defpackage.pc) {
                    try {
                        ((defpackage.pc) context2).a(dqVar.v(context2, iT, dxeVarY, null, false));
                    } catch (java.lang.IllegalStateException unused5) {
                        if (defpackage.dq.i) {
                            android.content.res.Configuration configuration4 = new android.content.res.Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context2.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context2.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new android.content.res.Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration2 != null) {
                                    if (configuration.fontScale != configuration2.fontScale) {
                                        configuration3.fontScale = configuration2.fontScale;
                                    }
                                    if (configuration.mcc != configuration2.mcc) {
                                        configuration3.mcc = configuration2.mcc;
                                    }
                                    if (configuration.mnc != configuration2.mnc) {
                                        configuration3.mnc = configuration2.mnc;
                                    }
                                    localeListM = aa$.ExternalSyntheticApiModelOutline1.m(configuration);
                                    localeListM2 = aa$.ExternalSyntheticApiModelOutline1.m(configuration2);
                                    if (!aa$.ExternalSyntheticApiModelOutline1.m(localeListM, localeListM2)) {
                                        aa$.ExternalSyntheticApiModelOutline1.m(configuration3, localeListM2);
                                        configuration3.locale = configuration2.locale;
                                    }
                                    if (configuration.touchscreen != configuration2.touchscreen) {
                                        configuration3.touchscreen = configuration2.touchscreen;
                                    }
                                    if (configuration.keyboard != configuration2.keyboard) {
                                        configuration3.keyboard = configuration2.keyboard;
                                    }
                                    if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                                        configuration3.keyboardHidden = configuration2.keyboardHidden;
                                    }
                                    if (configuration.navigation != configuration2.navigation) {
                                        configuration3.navigation = configuration2.navigation;
                                    }
                                    if (configuration.navigationHidden != configuration2.navigationHidden) {
                                        configuration3.navigationHidden = configuration2.navigationHidden;
                                    }
                                    if (configuration.orientation != configuration2.orientation) {
                                        configuration3.orientation = configuration2.orientation;
                                    }
                                    if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                                        configuration3.screenLayout |= configuration2.screenLayout & 15;
                                    }
                                    if ((configuration.screenLayout & 192) != (configuration2.screenLayout & 192)) {
                                        configuration3.screenLayout |= configuration2.screenLayout & 192;
                                    }
                                    if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                                        configuration3.screenLayout |= configuration2.screenLayout & 48;
                                    }
                                    if ((configuration.screenLayout & 768) != (configuration2.screenLayout & 768)) {
                                        configuration3.screenLayout |= configuration2.screenLayout & 768;
                                    }
                                    if ((da$.ExternalSyntheticApiModelOutline1.m(configuration) & 3) != (da$.ExternalSyntheticApiModelOutline1.m(configuration2) & 3)) {
                                        da$.ExternalSyntheticApiModelOutline1.m(configuration3, da$.ExternalSyntheticApiModelOutline1.m(configuration3) | (da$.ExternalSyntheticApiModelOutline1.m(configuration2) & 3));
                                    }
                                    if ((da$.ExternalSyntheticApiModelOutline1.m(configuration) & 12) != (da$.ExternalSyntheticApiModelOutline1.m(configuration2) & 12)) {
                                        da$.ExternalSyntheticApiModelOutline1.m(configuration3, da$.ExternalSyntheticApiModelOutline1.m(configuration3) | (da$.ExternalSyntheticApiModelOutline1.m(configuration2) & 12));
                                    }
                                    if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                                        configuration3.uiMode |= configuration2.uiMode & 15;
                                    }
                                    if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                                        configuration3.uiMode |= configuration2.uiMode & 48;
                                    }
                                    if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                                        configuration3.screenWidthDp = configuration2.screenWidthDp;
                                    }
                                    if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                                        configuration3.screenHeightDp = configuration2.screenHeightDp;
                                    }
                                    if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                                        configuration3.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
                                    }
                                    if (configuration.densityDpi != configuration2.densityDpi) {
                                        configuration3.densityDpi = configuration2.densityDpi;
                                    }
                                }
                            }
                            android.content.res.Configuration configurationV = dqVar.v(context2, iT, dxeVarY, configuration3, true);
                            pcVar = new defpackage.pc(context2, 2132084588);
                            pcVar.a(configurationV);
                            try {
                                if (context2.getTheme() != null) {
                                    da$.ExternalSyntheticApiModelOutline0.m(pcVar.getTheme());
                                }
                            } catch (java.lang.NullPointerException unused6) {
                            }
                            context3 = pcVar;
                        }
                        super.attachBaseContext(context3);
                    }
                } else if (defpackage.dq.i) {
                    android.content.res.Configuration configuration5 = new android.content.res.Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context2.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context2.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new android.content.res.Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration2 != null) {
                            if (configuration.fontScale != configuration2.fontScale) {
                                configuration3.fontScale = configuration2.fontScale;
                            }
                            if (configuration.mcc != configuration2.mcc) {
                                configuration3.mcc = configuration2.mcc;
                            }
                            if (configuration.mnc != configuration2.mnc) {
                                configuration3.mnc = configuration2.mnc;
                            }
                            localeListM = aa$.ExternalSyntheticApiModelOutline1.m(configuration);
                            localeListM2 = aa$.ExternalSyntheticApiModelOutline1.m(configuration2);
                            if (!aa$.ExternalSyntheticApiModelOutline1.m(localeListM, localeListM2)) {
                                aa$.ExternalSyntheticApiModelOutline1.m(configuration3, localeListM2);
                                configuration3.locale = configuration2.locale;
                            }
                            if (configuration.touchscreen != configuration2.touchscreen) {
                                configuration3.touchscreen = configuration2.touchscreen;
                            }
                            if (configuration.keyboard != configuration2.keyboard) {
                                configuration3.keyboard = configuration2.keyboard;
                            }
                            if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                                configuration3.keyboardHidden = configuration2.keyboardHidden;
                            }
                            if (configuration.navigation != configuration2.navigation) {
                                configuration3.navigation = configuration2.navigation;
                            }
                            if (configuration.navigationHidden != configuration2.navigationHidden) {
                                configuration3.navigationHidden = configuration2.navigationHidden;
                            }
                            if (configuration.orientation != configuration2.orientation) {
                                configuration3.orientation = configuration2.orientation;
                            }
                            if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                                configuration3.screenLayout |= configuration2.screenLayout & 15;
                            }
                            if ((configuration.screenLayout & 192) != (configuration2.screenLayout & 192)) {
                                configuration3.screenLayout |= configuration2.screenLayout & 192;
                            }
                            if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                                configuration3.screenLayout |= configuration2.screenLayout & 48;
                            }
                            if ((configuration.screenLayout & 768) != (configuration2.screenLayout & 768)) {
                                configuration3.screenLayout |= configuration2.screenLayout & 768;
                            }
                            if ((da$.ExternalSyntheticApiModelOutline1.m(configuration) & 3) != (da$.ExternalSyntheticApiModelOutline1.m(configuration2) & 3)) {
                                da$.ExternalSyntheticApiModelOutline1.m(configuration3, da$.ExternalSyntheticApiModelOutline1.m(configuration3) | (da$.ExternalSyntheticApiModelOutline1.m(configuration2) & 3));
                            }
                            if ((da$.ExternalSyntheticApiModelOutline1.m(configuration) & 12) != (da$.ExternalSyntheticApiModelOutline1.m(configuration2) & 12)) {
                                da$.ExternalSyntheticApiModelOutline1.m(configuration3, da$.ExternalSyntheticApiModelOutline1.m(configuration3) | (da$.ExternalSyntheticApiModelOutline1.m(configuration2) & 12));
                            }
                            if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                                configuration3.uiMode |= configuration2.uiMode & 15;
                            }
                            if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                                configuration3.uiMode |= configuration2.uiMode & 48;
                            }
                            if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                                configuration3.screenWidthDp = configuration2.screenWidthDp;
                            }
                            if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                                configuration3.screenHeightDp = configuration2.screenHeightDp;
                            }
                            if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                                configuration3.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
                            }
                            if (configuration.densityDpi != configuration2.densityDpi) {
                                configuration3.densityDpi = configuration2.densityDpi;
                            }
                        }
                    }
                    android.content.res.Configuration configurationV2 = dqVar.v(context2, iT, dxeVarY, configuration3, true);
                    pcVar = new defpackage.pc(context2, 2132084588);
                    pcVar.a(configurationV2);
                    if (context2.getTheme() != null) {
                        da$.ExternalSyntheticApiModelOutline0.m(pcVar.getTheme());
                    }
                    context3 = pcVar;
                }
                super.attachBaseContext(context3);
            }
            context3 = context2;
            super.attachBaseContext(context3);
        }
        context2 = context;
        if (context2 instanceof defpackage.pc) {
            ((defpackage.pc) context2).a(dqVar.v(context2, iT, dxeVarY, null, false));
            context3 = context2;
        } else if (defpackage.dq.i) {
            android.content.res.Configuration configuration6 = new android.content.res.Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context2.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context2.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new android.content.res.Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration2 != null && configuration.diff(configuration2) != 0) {
                    if (configuration.fontScale != configuration2.fontScale) {
                        configuration3.fontScale = configuration2.fontScale;
                    }
                    if (configuration.mcc != configuration2.mcc) {
                        configuration3.mcc = configuration2.mcc;
                    }
                    if (configuration.mnc != configuration2.mnc) {
                        configuration3.mnc = configuration2.mnc;
                    }
                    localeListM = aa$.ExternalSyntheticApiModelOutline1.m(configuration);
                    localeListM2 = aa$.ExternalSyntheticApiModelOutline1.m(configuration2);
                    if (!aa$.ExternalSyntheticApiModelOutline1.m(localeListM, localeListM2)) {
                        aa$.ExternalSyntheticApiModelOutline1.m(configuration3, localeListM2);
                        configuration3.locale = configuration2.locale;
                    }
                    if (configuration.touchscreen != configuration2.touchscreen) {
                        configuration3.touchscreen = configuration2.touchscreen;
                    }
                    if (configuration.keyboard != configuration2.keyboard) {
                        configuration3.keyboard = configuration2.keyboard;
                    }
                    if (configuration.keyboardHidden != configuration2.keyboardHidden) {
                        configuration3.keyboardHidden = configuration2.keyboardHidden;
                    }
                    if (configuration.navigation != configuration2.navigation) {
                        configuration3.navigation = configuration2.navigation;
                    }
                    if (configuration.navigationHidden != configuration2.navigationHidden) {
                        configuration3.navigationHidden = configuration2.navigationHidden;
                    }
                    if (configuration.orientation != configuration2.orientation) {
                        configuration3.orientation = configuration2.orientation;
                    }
                    if ((configuration.screenLayout & 15) != (configuration2.screenLayout & 15)) {
                        configuration3.screenLayout |= configuration2.screenLayout & 15;
                    }
                    if ((configuration.screenLayout & 192) != (configuration2.screenLayout & 192)) {
                        configuration3.screenLayout |= configuration2.screenLayout & 192;
                    }
                    if ((configuration.screenLayout & 48) != (configuration2.screenLayout & 48)) {
                        configuration3.screenLayout |= configuration2.screenLayout & 48;
                    }
                    if ((configuration.screenLayout & 768) != (configuration2.screenLayout & 768)) {
                        configuration3.screenLayout |= configuration2.screenLayout & 768;
                    }
                    if ((da$.ExternalSyntheticApiModelOutline1.m(configuration) & 3) != (da$.ExternalSyntheticApiModelOutline1.m(configuration2) & 3)) {
                        da$.ExternalSyntheticApiModelOutline1.m(configuration3, da$.ExternalSyntheticApiModelOutline1.m(configuration3) | (da$.ExternalSyntheticApiModelOutline1.m(configuration2) & 3));
                    }
                    if ((da$.ExternalSyntheticApiModelOutline1.m(configuration) & 12) != (da$.ExternalSyntheticApiModelOutline1.m(configuration2) & 12)) {
                        da$.ExternalSyntheticApiModelOutline1.m(configuration3, da$.ExternalSyntheticApiModelOutline1.m(configuration3) | (da$.ExternalSyntheticApiModelOutline1.m(configuration2) & 12));
                    }
                    if ((configuration.uiMode & 15) != (configuration2.uiMode & 15)) {
                        configuration3.uiMode |= configuration2.uiMode & 15;
                    }
                    if ((configuration.uiMode & 48) != (configuration2.uiMode & 48)) {
                        configuration3.uiMode |= configuration2.uiMode & 48;
                    }
                    if (configuration.screenWidthDp != configuration2.screenWidthDp) {
                        configuration3.screenWidthDp = configuration2.screenWidthDp;
                    }
                    if (configuration.screenHeightDp != configuration2.screenHeightDp) {
                        configuration3.screenHeightDp = configuration2.screenHeightDp;
                    }
                    if (configuration.smallestScreenWidthDp != configuration2.smallestScreenWidthDp) {
                        configuration3.smallestScreenWidthDp = configuration2.smallestScreenWidthDp;
                    }
                    if (configuration.densityDpi != configuration2.densityDpi) {
                        configuration3.densityDpi = configuration2.densityDpi;
                    }
                }
            }
            android.content.res.Configuration configurationV3 = dqVar.v(context2, iT, dxeVarY, configuration3, true);
            pcVar = new defpackage.pc(context2, 2132084588);
            pcVar.a(configurationV3);
            if (context2.getTheme() != null) {
                da$.ExternalSyntheticApiModelOutline0.m(pcVar.getTheme());
            }
            context3 = pcVar;
        } else {
            context3 = context2;
        }
        super.attachBaseContext(context3);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        cp cpVarI = i();
        if (getWindow().hasFeature(0)) {
            if (cpVarI == null || !cpVarI.l()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.cm, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        cp cpVarI = i();
        if (keyCode == 82 && cpVarI != null && cpVarI.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final android.view.View findViewById(int i) {
        return j().c(i);
    }

    @Override // android.app.Activity
    public final android.view.MenuInflater getMenuInflater() {
        defpackage.dq dqVar = (defpackage.dq) j();
        if (dqVar.o == null) {
            dqVar.G();
            cp cpVar = dqVar.n;
            dqVar.o = new defpackage.fe(cpVar != null ? cpVar.b() : dqVar.k);
        }
        return dqVar.o;
    }

    public final cp i() {
        return j().b();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        j().f();
    }

    public final defpackage.dc j() {
        if (this.n == null) {
            int i = defpackage.dc.b;
            this.n = new defpackage.dq(this, null, this);
        }
        return this.n;
    }

    public final void k(android.support.v7.widget.Toolbar toolbar) {
        defpackage.dq dqVar = (defpackage.dq) j();
        if (dqVar.j instanceof android.app.Activity) {
            cp cpVarB = dqVar.b();
            if (cpVarB instanceof ee) {
                throw new java.lang.IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            dqVar.o = null;
            if (cpVarB != null) {
                cpVarB.f();
            }
            dqVar.n = null;
            if (toolbar != null) {
                dy dyVar = new dy(toolbar, dqVar.z(), dqVar.m);
                dqVar.n = dyVar;
                dqVar.m.d = dyVar.d;
                if (!toolbar.z) {
                    toolbar.z = true;
                    toolbar.ev();
                }
            } else {
                dqVar.m.d = null;
            }
            dqVar.f();
        }
    }

    public boolean l() {
        android.content.Intent intentJ = defpackage.dff.j(this);
        if (intentJ == null) {
            return false;
        }
        if (shouldUpRecreateTask(intentJ)) {
            dvw dvwVar = new dvw(this);
            android.content.Intent intentJ2 = defpackage.dff.j(this);
            if (intentJ2 == null) {
                intentJ2 = defpackage.dff.j(this);
            }
            if (intentJ2 != null) {
                android.content.ComponentName component = intentJ2.getComponent();
                if (component == null) {
                    component = intentJ2.resolveActivity(dvwVar.b.getPackageManager());
                }
                dvwVar.c(component);
                dvwVar.a(intentJ2);
            }
            dvwVar.d();
            try {
                finishAffinity();
            } catch (java.lang.IllegalStateException unused) {
                finish();
            }
        } else {
            navigateUpTo(intentJ);
        }
        return true;
    }

    @Override // defpackage.mp, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        cp cpVarB;
        super.onConfigurationChanged(configuration);
        defpackage.dq dqVar = (defpackage.dq) j();
        if (dqVar.x && dqVar.v && (cpVarB = dqVar.b()) != null) {
            cpVarB.r();
        }
        android.content.Context context = dqVar.k;
        defpackage.ho.d().e(context);
        dqVar.F = new android.content.res.Configuration(context.getResources().getConfiguration());
        dqVar.R(false, false);
    }

    @Override // defpackage.az, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        j().g();
    }

    @Override // defpackage.az, defpackage.mp, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        cp cpVarI = i();
        if (menuItem.getItemId() != 16908332 || cpVarI == null || (cpVarI.a() & 4) == 0) {
            return false;
        }
        return l();
    }

    @Override // android.app.Activity
    protected void onPostCreate(android.os.Bundle bundle) {
        super.onPostCreate(bundle);
        ((defpackage.dq) j()).F();
    }

    @Override // defpackage.az, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        cp cpVarB = ((defpackage.dq) j()).b();
        if (cpVarB != null) {
            cpVarB.h(true);
        }
    }

    @Override // defpackage.az, android.app.Activity
    protected void onStart() {
        super.onStart();
        ((defpackage.dq) j()).R(true, false);
    }

    @Override // defpackage.az, android.app.Activity
    protected void onStop() {
        super.onStop();
        j().h();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(java.lang.CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        j().n(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        cp cpVarI = i();
        if (getWindow().hasFeature(0)) {
            if (cpVarI == null || !cpVarI.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // defpackage.mp, android.app.Activity
    public final void setContentView(int i) {
        ff();
        j().j(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((defpackage.dq) j()).G = i;
    }

    @Override // defpackage.mp, android.app.Activity
    public final void setContentView(android.view.View view) {
        ff();
        j().k(view);
    }

    @Override // defpackage.mp, android.app.Activity
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        ff();
        j().l(view, layoutParams);
    }

    protected void m() {
    }

    protected void n() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
