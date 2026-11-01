package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qsw implements odm {
    final /* synthetic */ defpackage.qtd a;

    public qsw(defpackage.qtd qtdVar) {
        j$.util.Objects.requireNonNull(qtdVar);
        this.a = qtdVar;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:166:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:167:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:171:0x0704  */
    /* JADX WARN: Code duplicated, block: B:173:0x0717  */
    /* JADX WARN: Code duplicated, block: B:174:0x0724  */
    /* JADX WARN: Code duplicated, block: B:176:0x072c  */
    /* JADX WARN: Code duplicated, block: B:177:0x073a  */
    /* JADX WARN: Code duplicated, block: B:179:0x0751  */
    /* JADX WARN: Code duplicated, block: B:181:0x0775  */
    /* JADX WARN: Code duplicated, block: B:186:0x07c8  */
    /* JADX WARN: Code duplicated, block: B:188:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:189:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:193:0x0801  */
    /* JADX WARN: Code duplicated, block: B:194:0x0808  */
    /* JADX WARN: Code duplicated, block: B:197:0x0829  */
    /* JADX WARN: Code duplicated, block: B:208:0x0886  */
    /* JADX WARN: Code duplicated, block: B:211:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:222:0x0907  */
    /* JADX WARN: Code duplicated, block: B:229:0x094b  */
    /* JADX WARN: Code duplicated, block: B:231:0x0954 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:232:0x0956  */
    /* JADX WARN: Code duplicated, block: B:234:0x096c  */
    /* JADX WARN: Code duplicated, block: B:235:0x0978  */
    /* JADX WARN: Code duplicated, block: B:237:0x098e  */
    /* JADX WARN: Code duplicated, block: B:248:0x09e2  */
    /* JADX WARN: Type inference failed for: r7v120, types: [aonj, java.lang.Object] */
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
    public final /* synthetic */ void a(java.lang.Object obj) {
        int i;
        boolean z;
        j$.util.Optional optionalL;
        char c;
        defpackage.qsr qsrVar;
        int i2;
        defpackage.qqr qqrVar;
        defpackage.qso qsoVar;
        boolean z2;
        android.view.View viewF;
        defpackage.qqr qqrVar2;
        android.widget.ImageView imageViewH;
        j$.util.Optional optional;
        j$.util.Optional optionalL2;
        mie mieVar;
        j$.util.Optional optionalD;
        mie mieVar2;
        boolean z3;
        defpackage.qso qsoVar2;
        android.view.View viewF2;
        boolean z4;
        android.view.View viewFindViewById;
        int i3;
        j$.util.Optional optional2;
        defpackage.pmv pmvVar;
        defpackage.qqr qqrVar3;
        defpackage.qqr qqrVar4;
        defpackage.qqr qqrVar5;
        int iOrdinal;
        j$.util.Optional optionalL3;
        j$.util.Optional optionalL4;
        defpackage.qqr qqrVar6;
        defpackage.qqr qqrVar7;
        j$.util.Optional optionalAe;
        j$.util.Optional optionalAe2;
        j$.util.Optional optionalL5;
        boolean z5;
        j$.util.Optional optionalAe3;
        j$.util.Optional optionalL6;
        int dimensionPixelSize;
        int dimensionPixelSize2;
        j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
        int i4 = 4;
        if (optionalOfNullable.isPresent()) {
            defpackage.qtd qtdVar = this.a;
            defpackage.qth qthVarC = qtdVar.r.c(defpackage.qtg.a((defpackage.qqr) optionalOfNullable.orElseThrow()));
            defpackage.qtg qtgVar = qthVarC.e;
            android.view.TextureView textureViewE = qtdVar.e();
            android.view.TextureView textureViewD = qtdVar.d();
            j$.util.Optional optionalEmpty = qtgVar.a ? j$.util.Optional.empty() : j$.util.Optional.of(qtgVar.d.a);
            if (!optionalEmpty.equals(j$.util.Optional.ofNullable(textureViewE.getSurfaceTexture()))) {
                defpackage.qtd.b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "updateTextures", 861, "VideoScreenFragmentPeer.java").y("replacing preview surface texture. isPresent: %b", java.lang.Boolean.valueOf(optionalEmpty.isPresent()));
                defpackage.qtd.o(textureViewE, optionalEmpty);
            }
            if (!qthVarC.b().equals(textureViewD.getSurfaceTexture())) {
                defpackage.qtd.b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "updateTextures", 869, "VideoScreenFragmentPeer.java").v("replacing background surface texture.");
                defpackage.qtd.o(textureViewD, j$.util.Optional.of(qthVarC.b()));
            }
            j$.util.Optional optionalD2 = qthVarC.d(qtdVar.c());
            defpackage.qst qstVar = new defpackage.qst(textureViewE, i4);
            if (true == optionalD2.isPresent()) {
                ((defpackage.qtq) optionalD2.get()).e((android.view.TextureView) qstVar.a);
            }
            mgu mguVar = qthVarC.d;
            j$.util.Optional optionalOfNullable2 = qtgVar.c;
            defpackage.qkv qkvVar = new defpackage.qkv(qthVarC, 6);
            if (true == optionalOfNullable2.isPresent()) {
                android.util.Size size = (android.util.Size) optionalOfNullable2.get();
                j$.util.Optional optional3 = ((defpackage.qth) qkvVar.a).e.b;
                if (optional3.isPresent() && ((defpackage.pus) optional3.orElseThrow()).a()) {
                    defpackage.qth.a.b().l("com/android/dialer/incall/video/ui/VideoSelector", "convertLocalDimensionsWithRotation", 407, "VideoSelector.java").z("localDimensionsWithRotation: height: %d, width: %d", size.getHeight(), size.getWidth());
                    size = new android.util.Size(size.getHeight(), size.getWidth());
                }
                optionalOfNullable2 = j$.util.Optional.ofNullable(size);
            } else {
                i4 = 4;
            }
            defpackage.qkv qkvVar2 = new defpackage.qkv(qthVarC, 7);
            if (true == optionalOfNullable2.isPresent()) {
                java.lang.Object obj2 = optionalOfNullable2.get();
                java.lang.Object obj3 = qkvVar2.a;
                android.util.Size size2 = (android.util.Size) obj2;
                double height = size2.getHeight();
                double width = size2.getWidth();
                aimz aimzVar = defpackage.qth.a;
                double d = height / width;
                aimzVar.b().l("com/android/dialer/incall/video/ui/VideoSelector", "computePreviewSize", 115, "VideoSelector.java").y("localVideoAspectRatio: %f", java.lang.Double.valueOf(d));
                defpackage.pxs pxsVar = new defpackage.pxs(obj3, 6);
                defpackage.qth qthVar = (defpackage.qth) obj3;
                if (((java.lang.Boolean) qthVar.d.a(pxsVar).a(mgv.u).f()).booleanValue()) {
                    dimensionPixelSize2 = qthVar.b.getResources().getDimensionPixelSize(2131167947);
                    dimensionPixelSize = (int) (((double) dimensionPixelSize2) * d);
                } else {
                    dimensionPixelSize = qthVar.b.getResources().getDimensionPixelSize(2131167959);
                    dimensionPixelSize2 = (int) (((double) dimensionPixelSize) * d);
                }
                aimzVar.b().l("com/android/dialer/incall/video/ui/VideoSelector", "computePreviewSize", 139, "VideoSelector.java").z("preview size: height: %d, width: %d", dimensionPixelSize2, dimensionPixelSize);
                optionalOfNullable2 = j$.util.Optional.ofNullable(new android.util.Size(dimensionPixelSize, dimensionPixelSize2));
            }
            j$.util.Optional optional4 = (j$.util.Optional) new mgr(mguVar, optionalOfNullable2).a(mgv.v).h(new defpackage.pvu(16));
            defpackage.qst qstVar2 = new defpackage.qst(qtdVar, 5);
            if (true == optional4.isPresent()) {
                java.lang.Object obj4 = optional4.get();
                java.lang.Object obj5 = qstVar2.a;
                android.util.Size size3 = (android.util.Size) obj4;
                int width2 = size3.getWidth();
                int height2 = size3.getHeight();
                defpackage.qtd qtdVar2 = (defpackage.qtd) obj5;
                if (qtdVar2.z()) {
                    height2 = (int) (height2 * 0.6f);
                    width2 = (int) (width2 * 0.6f);
                }
                defpackage.qtd.u(qtdVar2.e(), width2, height2);
                defpackage.qtd.u(qtdVar2.h(), width2, height2);
            }
            j$.util.Optional optionalC = qthVarC.c(qtdVar.b());
            defpackage.qst qstVar3 = new defpackage.qst(textureViewD, 6);
            if (true == optionalC.isPresent()) {
                ((defpackage.qtq) optionalC.get()).e((android.view.TextureView) qstVar3.a);
            }
            aify aifyVarB = ((defpackage.qqr) optionalOfNullable.orElseThrow()).b;
            boolean z6 = qtdVar.z();
            if (z6) {
                aifyVarB = (aify) j$.util.Collection.-EL.stream(aifyVarB).filter(new mif(13)).collect(aido.a);
            }
            if (aifyVarB.size() > 9) {
                defpackage.qtd.b.c().m(aioa.b).i(zct.b).l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "updateButtons", 905, "VideoScreenFragmentPeer.java").z("number of buttons for video call is %d, more than %d", aifyVarB.size(), 9);
                c = 0;
                aifyVarB = aifyVarB.b(0, 9);
            } else {
                c = 0;
            }
            com.android.dialer.incall.video.ui.VideoCheckableLabeledButton[] videoCheckableLabeledButtonArr = new com.android.dialer.incall.video.ui.VideoCheckableLabeledButton[9];
            defpackage.qsr qsrVar2 = qtdVar.d;
            videoCheckableLabeledButtonArr[c] = (com.android.dialer.incall.video.ui.VideoCheckableLabeledButton) qsrVar2.N().findViewById(2131429390);
            videoCheckableLabeledButtonArr[1] = (com.android.dialer.incall.video.ui.VideoCheckableLabeledButton) qsrVar2.N().findViewById(2131429396);
            videoCheckableLabeledButtonArr[2] = (com.android.dialer.incall.video.ui.VideoCheckableLabeledButton) qsrVar2.N().findViewById(2131429399);
            videoCheckableLabeledButtonArr[3] = (com.android.dialer.incall.video.ui.VideoCheckableLabeledButton) qsrVar2.N().findViewById(2131429391);
            videoCheckableLabeledButtonArr[i4] = (com.android.dialer.incall.video.ui.VideoCheckableLabeledButton) qsrVar2.N().findViewById(2131429389);
            videoCheckableLabeledButtonArr[5] = (com.android.dialer.incall.video.ui.VideoCheckableLabeledButton) qsrVar2.N().findViewById(2131429398);
            videoCheckableLabeledButtonArr[6] = (com.android.dialer.incall.video.ui.VideoCheckableLabeledButton) qsrVar2.N().findViewById(2131429397);
            videoCheckableLabeledButtonArr[r7] = (com.android.dialer.incall.video.ui.VideoCheckableLabeledButton) qsrVar2.N().findViewById(2131429388);
            videoCheckableLabeledButtonArr[8] = (com.android.dialer.incall.video.ui.VideoCheckableLabeledButton) qsrVar2.N().findViewById(2131429395);
            int i5 = 0;
            while (i5 < aifyVarB.size()) {
                defpackage.qtd.b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "updateButtons", 927, "VideoScreenFragmentPeer.java").z("Setting grid button views[%s] to button %s", i5, i5);
                defpackage.qmy qmyVar = (defpackage.qmy) aifyVarB.get(i5);
                com.android.dialer.incall.video.ui.VideoCheckableLabeledButton videoCheckableLabeledButton = videoCheckableLabeledButtonArr[i5];
                videoCheckableLabeledButton.b.setText(qmyVar.c);
                if (!videoCheckableLabeledButton.f.isPresent() || ((defpackage.qmy) videoCheckableLabeledButton.f.orElseThrow()).b != qmyVar.b) {
                    videoCheckableLabeledButton.a.setImageResource(qmyVar.b);
                }
                videoCheckableLabeledButton.setVisibility(0);
                videoCheckableLabeledButton.setContentDescription(qmyVar.d);
                defpackage.qmw qmwVar = qmyVar.e;
                videoCheckableLabeledButton.setEnabled(qmwVar.a);
                boolean z7 = qmwVar.b;
                aify aifyVar = aifyVarB;
                if (videoCheckableLabeledButton.e != z7) {
                    videoCheckableLabeledButton.e = z7;
                    videoCheckableLabeledButton.refreshDrawableState();
                }
                videoCheckableLabeledButton.a.setBackground(qmwVar.c ? videoCheckableLabeledButton.d : videoCheckableLabeledButton.c);
                videoCheckableLabeledButton.f = j$.util.Optional.of(qmyVar);
                videoCheckableLabeledButtonArr[i5].b.setVisibility(true != z6 ? 0 : 8);
                com.android.dialer.incall.video.ui.VideoCheckableLabeledButton videoCheckableLabeledButton2 = videoCheckableLabeledButtonArr[i5];
                switch (qmyVar.a.ordinal()) {
                    case 1:
                        qtdVar.t(videoCheckableLabeledButton2, qmyVar, "Clicked Video Call Mute");
                        break;
                    case 2:
                        qtdVar.t(videoCheckableLabeledButton2, qmyVar, "Clicked Video Call Camera Off");
                        break;
                    case 3:
                        qtdVar.t(videoCheckableLabeledButton2, qmyVar, "Clicked Video Call Flip camera");
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        qtdVar.t(videoCheckableLabeledButton2, qmyVar, "Clicked Video Call Hold");
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        qtdVar.t(videoCheckableLabeledButton2, qmyVar, "Clicked Video Call Add Person");
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        qtdVar.t(videoCheckableLabeledButton2, qmyVar, "Clicked Video Call Audio-only");
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        qtdVar.t(videoCheckableLabeledButton2, qmyVar, "Clicked Video Call Audio Route, it can be speaker, bluetooth, phone or wired headset.");
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        qtdVar.t(videoCheckableLabeledButton2, qmyVar, "Clicked Video Call Manage");
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        qtdVar.t(videoCheckableLabeledButton2, qmyVar, "Clicked Video Call Swap");
                        break;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        qtdVar.t(videoCheckableLabeledButton2, qmyVar, "Clicked Video Call Merge");
                        break;
                    default:
                        qtdVar.s.g(videoCheckableLabeledButton2, new defpackage.qtc(qmyVar));
                        break;
                }
                i5++;
                aifyVarB = aifyVar;
            }
            while (i5 < 9) {
                com.android.dialer.incall.video.ui.VideoCheckableLabeledButton videoCheckableLabeledButton3 = videoCheckableLabeledButtonArr[i5];
                videoCheckableLabeledButton3.setVisibility(true != z6 ? i4 : 8);
                videoCheckableLabeledButton3.setContentDescription(null);
                videoCheckableLabeledButton3.f = j$.util.Optional.empty();
                i5++;
            }
            boolean z8 = ((defpackage.qqr) optionalOfNullable.orElseThrow()).c;
            if (!qtdVar.l.isPresent() || ((defpackage.qqr) qtdVar.l.orElseThrow()).c != z8) {
                if (z8) {
                    qtdVar.m();
                } else {
                    qtdVar.n();
                }
            }
            defpackage.qqr qqrVar8 = (defpackage.qqr) optionalOfNullable.orElseThrow();
            android.widget.TextView textViewI = qtdVar.i();
            if (qqrVar8.d) {
                textViewI.setVisibility(8);
                j$.util.Optional optional5 = qtdVar.n;
                if (true == optional5.isPresent()) {
                    ((android.view.ViewPropertyAnimator) optional5.get()).cancel();
                }
                qtdVar.n = j$.util.Optional.empty();
            } else {
                j$.util.Optional optionalOfNullable3 = qtdVar.l;
                if (true == optionalOfNullable3.isPresent()) {
                    optionalOfNullable3 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.qqr) optionalOfNullable3.get()).d));
                }
                if (((java.lang.Boolean) optionalOfNullable3.orElse(java.lang.Boolean.FALSE)).booleanValue() && qqrVar8.f) {
                    textViewI.setVisibility(8);
                    j$.util.Optional optional6 = qtdVar.n;
                    if (true == optional6.isPresent()) {
                        ((android.view.ViewPropertyAnimator) optional6.get()).cancel();
                    }
                    qtdVar.n = j$.util.Optional.empty();
                } else {
                    if (qqrVar8.f) {
                        j$.util.Optional optionalOfNullable4 = qtdVar.l;
                        if (true == optionalOfNullable4.isPresent()) {
                            optionalOfNullable4 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.qqr) optionalOfNullable4.get()).f));
                        }
                        if (!((java.lang.Boolean) optionalOfNullable4.orElse(java.lang.Boolean.TRUE)).booleanValue()) {
                            defpackage.qtd.b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "updateRemoteOffView", 1111, "VideoScreenFragmentPeer.java").v("remote is turned on.");
                            textViewI.setCompoundDrawablesWithIntrinsicBounds(0, 2131231774, 0, 0);
                            textViewI.setText(true != ((defpackage.qqr) qtdVar.l.orElseThrow()).g ? 2132020797 : 2132020799);
                            textViewI.setVisibility(0);
                            qtdVar.n = j$.util.Optional.of(textViewI.animate().setDuration(2000L).withEndAction(new defpackage.pmw(qtdVar, textViewI, 16)));
                            ((android.view.ViewPropertyAnimator) qtdVar.n.orElseThrow()).start();
                        }
                    } else {
                        if (qtdVar.n.isPresent()) {
                            defpackage.qtd.b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "updateRemoteOffView", 1096, "VideoScreenFragmentPeer.java").v("remote resumed view is still shown. overwrite it to remote off view");
                            ((android.view.ViewPropertyAnimator) qtdVar.n.orElseThrow()).cancel();
                            qtdVar.n = j$.util.Optional.empty();
                        }
                        textViewI.setCompoundDrawablesWithIntrinsicBounds(0, 2131231773, 0, 0);
                        textViewI.setText(true != qqrVar8.g ? 2132020796 : 2132020798);
                        textViewI.setVisibility(0);
                    }
                    if (!qqrVar8.c) {
                        textViewI.setVisibility(8);
                    } else if (qtdVar.n.isPresent()) {
                        textViewI.setVisibility(0);
                    }
                }
            }
            defpackage.qqr qqrVar9 = (defpackage.qqr) optionalOfNullable.orElseThrow();
            android.widget.ImageView imageViewG = qtdVar.g();
            if (qqrVar9.d) {
                imageViewG.setVisibility(8);
                j$.util.Optional optionalL7 = qtdVar.l(qqrVar9);
                if (true == optionalL7.isPresent()) {
                    ((defpackage.qrv) optionalL7.get()).d(defpackage.qrt.b);
                }
            } else if (qqrVar9.f) {
                imageViewG.setImageBitmap(null);
                imageViewG.setVisibility(8);
                j$.util.Optional optionalL8 = qtdVar.l(qqrVar9);
                if (true == optionalL8.isPresent()) {
                    ((defpackage.qrv) optionalL8.get()).d(defpackage.qrt.b);
                }
            } else {
                j$.util.Optional optional7 = qqrVar9.s;
                if (optional7.isPresent()) {
                    qtdVar.w(qthVarC);
                    imageViewG.setImageBitmap((android.graphics.Bitmap) optional7.orElseThrow());
                    imageViewG.setVisibility(0);
                } else {
                    qsrVar = qsrVar2;
                    android.util.Size sizeB = qtdVar.b();
                    j$.util.Optional optionalL9 = qtdVar.l(qqrVar9);
                    i2 = 3;
                    mie mieVar3 = new mie(qtdVar, qthVarC, sizeB, 8, (byte[]) null);
                    if (true == optionalL9.isPresent()) {
                        java.lang.Object obj6 = optionalL9.get();
                        java.lang.Object obj7 = mieVar3.b;
                        java.lang.Object obj8 = mieVar3.c;
                        android.util.Size size4 = (android.util.Size) mieVar3.a;
                        j$.util.Optional optionalC2 = ((defpackage.qth) obj8).c(size4);
                        mie mieVar4 = new mie((defpackage.qtd) obj7, size4, (defpackage.qrv) obj6, 7);
                        if (true == optionalC2.isPresent()) {
                            java.lang.Object obj9 = optionalC2.get();
                            java.lang.Object obj10 = mieVar4.c;
                            android.util.Size size5 = (android.util.Size) mieVar4.a;
                            ((defpackage.qrv) mieVar4.b).g(((defpackage.qtd) obj10).d(), 25.0f, 0.25f, defpackage.qrt.b, j$.util.Optional.of(((defpackage.qtq) obj9).a(size5.getWidth(), size5.getHeight())));
                        }
                    }
                }
                qqrVar = (defpackage.qqr) optionalOfNullable.orElseThrow();
                if (qtdVar.l.isPresent() || !((defpackage.qqr) qtdVar.l.orElseThrow()).a.equals(qqrVar.a)) {
                    qsoVar = qtdVar.g;
                    defpackage.qqq qqqVar = qqrVar.h;
                    defpackage.qqp qqpVar = qqqVar.d;
                    z2 = qqqVar.b;
                    qsoVar.g = qqpVar;
                    qsoVar.f = z2;
                    qsoVar.b.N().getWindowVisibleDisplayFrame(qsoVar.c);
                    qsoVar.h();
                    viewF = qsoVar.f();
                    if (z2) {
                        viewF.setOnTouchListener(null);
                    } else {
                        viewF.setOnTouchListener(new klw(qsoVar, i2));
                    }
                    qsoVar.i(viewF, qsoVar.b(viewF));
                    qsoVar.j();
                }
                qtdVar.x(((defpackage.qqr) optionalOfNullable.orElseThrow()).h.a);
                qqrVar2 = (defpackage.qqr) optionalOfNullable.orElseThrow();
                imageViewH = qtdVar.h();
                if (qqrVar2.e) {
                    imageViewH.setImageBitmap(null);
                    imageViewH.setVisibility(8);
                    optionalL6 = qtdVar.l(qqrVar2);
                    if (true == optionalL6.isPresent()) {
                        ((defpackage.qrv) optionalL6.get()).d(defpackage.qrt.a);
                    }
                } else {
                    optional = qqrVar2.r;
                    if (optional.isPresent()) {
                        imageViewH.setImageBitmap((android.graphics.Bitmap) optional.orElseThrow());
                        imageViewH.setVisibility(0);
                    } else {
                        android.util.Size sizeC = qtdVar.c();
                        optionalL2 = qtdVar.l(qqrVar2);
                        mieVar = new mie(qtdVar, qthVarC, sizeC, 9, (byte[]) null);
                        if (true == optionalL2.isPresent()) {
                            java.lang.Object obj11 = optionalL2.get();
                            java.lang.Object obj12 = mieVar.b;
                            java.lang.Object obj13 = mieVar.c;
                            android.util.Size size6 = (android.util.Size) mieVar.a;
                            optionalD = ((defpackage.qth) obj13).d(size6);
                            mieVar2 = new mie((defpackage.qtd) obj12, size6, (defpackage.qrv) obj11, 10);
                            if (true == optionalD.isPresent()) {
                                java.lang.Object obj14 = optionalD.get();
                                java.lang.Object obj15 = mieVar2.c;
                                android.util.Size size7 = (android.util.Size) mieVar2.a;
                                ((defpackage.qrv) mieVar2.b).g(((defpackage.qtd) obj15).e(), 16.0f, 1.0f, defpackage.qrt.a, j$.util.Optional.of(((defpackage.qtq) obj14).a(size7.getWidth(), size7.getHeight())));
                            }
                        }
                    }
                }
                z3 = ((defpackage.qqr) optionalOfNullable.orElseThrow()).h.b;
                if (qtdVar.l.isPresent() || ((defpackage.qqr) qtdVar.l.orElseThrow()).h.b != z3) {
                    qsoVar2 = qtdVar.g;
                    qsoVar2.f = z3;
                    viewF2 = qsoVar2.f();
                    if (z3) {
                        viewF2.setOnTouchListener(null);
                    } else {
                        viewF2.setOnTouchListener(new klw(qsoVar2, i2));
                        qsoVar2.d().setVisibility(i4);
                    }
                    qsoVar2.g();
                }
                z4 = ((defpackage.qqr) optionalOfNullable.orElseThrow()).h.c;
                viewFindViewById = qsrVar.N().findViewById(2131429426);
                if (z4) {
                    i = 0;
                    viewFindViewById.setVisibility(0);
                    i3 = 8;
                } else {
                    i3 = 8;
                    i = 0;
                    viewFindViewById.setVisibility(8);
                }
                defpackage.pnb pnbVar = qtdVar.f;
                optional2 = pnbVar.d().c;
                pmvVar = new defpackage.pmv(new defpackage.pmu(i3), 9);
                if (true == optional2.isPresent()) {
                    pmvVar.a.a(optional2.get());
                }
                pnbVar.n();
                qqrVar3 = (defpackage.qqr) optionalOfNullable.orElseThrow();
                if (qqrVar3.p && (!qtdVar.l.isPresent() || !qqrVar3.a.equals(((defpackage.qqr) qtdVar.l.orElseThrow()).a) || !((defpackage.qqr) qtdVar.l.orElseThrow()).p)) {
                    java.lang.String str = qqrVar3.a;
                    defpackage.qsc qscVar = new defpackage.qsc();
                    amxr.g(qscVar);
                    ahgl.c(qscVar, str);
                    qscVar.r(qsrVar.I(), "charges_alert_dialog");
                    optionalL5 = qtdVar.l(qqrVar3);
                    z5 = true;
                    if (true == optionalL5.isPresent()) {
                        defpackage.qrv qrvVar = (defpackage.qrv) optionalL5.get();
                        defpackage.qrv.a.b().l("com/android/dialer/incall/video/service/VideoScreenController", "onDialogShown", 404, "VideoScreenController.java").v("onDialogShown");
                        z5 = true;
                        qrvVar.f.a(true);
                        qrvVar.e.a();
                    }
                    optionalAe3 = qtdVar.t.ae(qqrVar3);
                    if (z5 == optionalAe3.isPresent()) {
                        ((defpackage.qrv) optionalAe3.get()).j.set(z5);
                    }
                }
                qqrVar4 = (defpackage.qqr) optionalOfNullable.orElseThrow();
                if (qqrVar4.m && (!qtdVar.l.isPresent() || !qqrVar4.a.equals(((defpackage.qqr) qtdVar.l.orElseThrow()).a) || !((defpackage.qqr) qtdVar.l.orElseThrow()).m)) {
                    qtdVar.q();
                    optionalAe2 = qtdVar.t.ae(qqrVar4);
                    if (true == optionalAe2.isPresent()) {
                        defpackage.qrv qrvVar2 = (defpackage.qrv) optionalAe2.get();
                        qrvVar2.i.set(true);
                        qrvVar2.s.a(ajcm.a);
                    }
                }
                qqrVar5 = (defpackage.qqr) optionalOfNullable.orElseThrow();
                if (qtdVar.l.isPresent() || !((defpackage.qqr) qtdVar.l.orElseThrow()).a.equals(qqrVar5.a) || !((defpackage.qqr) qtdVar.l.orElseThrow()).o.equals(qqrVar5.o)) {
                    iOrdinal = qqrVar5.o.ordinal();
                    if (iOrdinal == 0) {
                        android.widget.Toast.makeText(qtdVar.c, 2132020721, 1).show();
                        optionalL3 = qtdVar.l(qqrVar5);
                        if (true == optionalL3.isPresent()) {
                            ((defpackage.qrv) optionalL3.get()).l.set(true);
                        }
                    } else if (iOrdinal == 1) {
                        android.widget.Toast.makeText(qtdVar.c, 2132020720, 1).show();
                        optionalL4 = qtdVar.l(qqrVar5);
                        if (true == optionalL4.isPresent()) {
                            ((defpackage.qrv) optionalL4.get()).l.set(true);
                        }
                    }
                }
                qqrVar6 = (defpackage.qqr) optionalOfNullable.orElseThrow();
                if (qqrVar6.n && (!qtdVar.l.isPresent() || !((defpackage.qqr) qtdVar.l.orElseThrow()).a.equals(qqrVar6.a) || !((defpackage.qqr) qtdVar.l.orElseThrow()).n)) {
                    android.widget.Toast.makeText(qtdVar.c, 2132017985, 1).show();
                    optionalAe = qtdVar.t.ae(qqrVar6);
                    if (true == optionalAe.isPresent()) {
                        ((defpackage.qrv) optionalAe.get()).q.j();
                    }
                }
                qqrVar7 = (defpackage.qqr) optionalOfNullable.orElseThrow();
                if (qqrVar7.q && (!qtdVar.l.isPresent() || !((defpackage.qqr) qtdVar.l.orElseThrow()).a.equals(qqrVar7.a) || !((defpackage.qqr) qtdVar.l.orElseThrow()).q)) {
                    android.widget.Toast.makeText(qtdVar.c, 2132020724, 1).show();
                    ((defpackage.qrv) qtdVar.l(qqrVar7).orElseThrow()).k.set(true);
                }
            }
            qsrVar = qsrVar2;
            i2 = 3;
            qqrVar = (defpackage.qqr) optionalOfNullable.orElseThrow();
            if (qtdVar.l.isPresent()) {
                qsoVar = qtdVar.g;
                defpackage.qqq qqqVar2 = qqrVar.h;
                defpackage.qqp qqpVar2 = qqqVar2.d;
                z2 = qqqVar2.b;
                qsoVar.g = qqpVar2;
                qsoVar.f = z2;
                qsoVar.b.N().getWindowVisibleDisplayFrame(qsoVar.c);
                qsoVar.h();
                viewF = qsoVar.f();
                if (z2) {
                    viewF.setOnTouchListener(null);
                } else {
                    viewF.setOnTouchListener(new klw(qsoVar, i2));
                }
                qsoVar.i(viewF, qsoVar.b(viewF));
                qsoVar.j();
            } else {
                qsoVar = qtdVar.g;
                defpackage.qqq qqqVar3 = qqrVar.h;
                defpackage.qqp qqpVar3 = qqqVar3.d;
                z2 = qqqVar3.b;
                qsoVar.g = qqpVar3;
                qsoVar.f = z2;
                qsoVar.b.N().getWindowVisibleDisplayFrame(qsoVar.c);
                qsoVar.h();
                viewF = qsoVar.f();
                if (z2) {
                    viewF.setOnTouchListener(null);
                } else {
                    viewF.setOnTouchListener(new klw(qsoVar, i2));
                }
                qsoVar.i(viewF, qsoVar.b(viewF));
                qsoVar.j();
            }
            qtdVar.x(((defpackage.qqr) optionalOfNullable.orElseThrow()).h.a);
            qqrVar2 = (defpackage.qqr) optionalOfNullable.orElseThrow();
            imageViewH = qtdVar.h();
            if (qqrVar2.e) {
                imageViewH.setImageBitmap(null);
                imageViewH.setVisibility(8);
                optionalL6 = qtdVar.l(qqrVar2);
                if (true == optionalL6.isPresent()) {
                    ((defpackage.qrv) optionalL6.get()).d(defpackage.qrt.a);
                }
            } else {
                optional = qqrVar2.r;
                if (optional.isPresent()) {
                    imageViewH.setImageBitmap((android.graphics.Bitmap) optional.orElseThrow());
                    imageViewH.setVisibility(0);
                } else {
                    android.util.Size sizeC2 = qtdVar.c();
                    optionalL2 = qtdVar.l(qqrVar2);
                    mieVar = new mie(qtdVar, qthVarC, sizeC2, 9, (byte[]) null);
                    if (true == optionalL2.isPresent()) {
                        java.lang.Object obj16 = optionalL2.get();
                        java.lang.Object obj17 = mieVar.b;
                        java.lang.Object obj18 = mieVar.c;
                        android.util.Size size8 = (android.util.Size) mieVar.a;
                        optionalD = ((defpackage.qth) obj18).d(size8);
                        mieVar2 = new mie((defpackage.qtd) obj17, size8, (defpackage.qrv) obj16, 10);
                        if (true == optionalD.isPresent()) {
                            java.lang.Object obj19 = optionalD.get();
                            java.lang.Object obj110 = mieVar2.c;
                            android.util.Size size9 = (android.util.Size) mieVar2.a;
                            ((defpackage.qrv) mieVar2.b).g(((defpackage.qtd) obj110).e(), 16.0f, 1.0f, defpackage.qrt.a, j$.util.Optional.of(((defpackage.qtq) obj19).a(size9.getWidth(), size9.getHeight())));
                        }
                    }
                }
            }
            z3 = ((defpackage.qqr) optionalOfNullable.orElseThrow()).h.b;
            if (qtdVar.l.isPresent()) {
                qsoVar2 = qtdVar.g;
                qsoVar2.f = z3;
                viewF2 = qsoVar2.f();
                if (z3) {
                    viewF2.setOnTouchListener(null);
                } else {
                    viewF2.setOnTouchListener(new klw(qsoVar2, i2));
                    qsoVar2.d().setVisibility(i4);
                }
                qsoVar2.g();
            } else {
                qsoVar2 = qtdVar.g;
                qsoVar2.f = z3;
                viewF2 = qsoVar2.f();
                if (z3) {
                    viewF2.setOnTouchListener(null);
                } else {
                    viewF2.setOnTouchListener(new klw(qsoVar2, i2));
                    qsoVar2.d().setVisibility(i4);
                }
                qsoVar2.g();
            }
            z4 = ((defpackage.qqr) optionalOfNullable.orElseThrow()).h.c;
            viewFindViewById = qsrVar.N().findViewById(2131429426);
            if (z4) {
                i = 0;
                viewFindViewById.setVisibility(0);
                i3 = 8;
            } else {
                i3 = 8;
                i = 0;
                viewFindViewById.setVisibility(8);
            }
            defpackage.pnb pnbVar2 = qtdVar.f;
            optional2 = pnbVar2.d().c;
            pmvVar = new defpackage.pmv(new defpackage.pmu(i3), 9);
            if (true == optional2.isPresent()) {
                pmvVar.a.a(optional2.get());
            }
            pnbVar2.n();
            qqrVar3 = (defpackage.qqr) optionalOfNullable.orElseThrow();
            if (qqrVar3.p) {
                java.lang.String str2 = qqrVar3.a;
                defpackage.qsc qscVar2 = new defpackage.qsc();
                amxr.g(qscVar2);
                ahgl.c(qscVar2, str2);
                qscVar2.r(qsrVar.I(), "charges_alert_dialog");
                optionalL5 = qtdVar.l(qqrVar3);
                z5 = true;
                if (true == optionalL5.isPresent()) {
                    defpackage.qrv qrvVar3 = (defpackage.qrv) optionalL5.get();
                    defpackage.qrv.a.b().l("com/android/dialer/incall/video/service/VideoScreenController", "onDialogShown", 404, "VideoScreenController.java").v("onDialogShown");
                    z5 = true;
                    qrvVar3.f.a(true);
                    qrvVar3.e.a();
                }
                optionalAe3 = qtdVar.t.ae(qqrVar3);
                if (z5 == optionalAe3.isPresent()) {
                    ((defpackage.qrv) optionalAe3.get()).j.set(z5);
                }
            }
            qqrVar4 = (defpackage.qqr) optionalOfNullable.orElseThrow();
            if (qqrVar4.m) {
                qtdVar.q();
                optionalAe2 = qtdVar.t.ae(qqrVar4);
                if (true == optionalAe2.isPresent()) {
                    defpackage.qrv qrvVar4 = (defpackage.qrv) optionalAe2.get();
                    qrvVar4.i.set(true);
                    qrvVar4.s.a(ajcm.a);
                }
            }
            qqrVar5 = (defpackage.qqr) optionalOfNullable.orElseThrow();
            if (qtdVar.l.isPresent()) {
                iOrdinal = qqrVar5.o.ordinal();
                if (iOrdinal == 0) {
                    android.widget.Toast.makeText(qtdVar.c, 2132020721, 1).show();
                    optionalL3 = qtdVar.l(qqrVar5);
                    if (true == optionalL3.isPresent()) {
                        ((defpackage.qrv) optionalL3.get()).l.set(true);
                    }
                } else if (iOrdinal == 1) {
                    android.widget.Toast.makeText(qtdVar.c, 2132020720, 1).show();
                    optionalL4 = qtdVar.l(qqrVar5);
                    if (true == optionalL4.isPresent()) {
                        ((defpackage.qrv) optionalL4.get()).l.set(true);
                    }
                }
            } else {
                iOrdinal = qqrVar5.o.ordinal();
                if (iOrdinal == 0) {
                    android.widget.Toast.makeText(qtdVar.c, 2132020721, 1).show();
                    optionalL3 = qtdVar.l(qqrVar5);
                    if (true == optionalL3.isPresent()) {
                        ((defpackage.qrv) optionalL3.get()).l.set(true);
                    }
                } else if (iOrdinal == 1) {
                    android.widget.Toast.makeText(qtdVar.c, 2132020720, 1).show();
                    optionalL4 = qtdVar.l(qqrVar5);
                    if (true == optionalL4.isPresent()) {
                        ((defpackage.qrv) optionalL4.get()).l.set(true);
                    }
                }
            }
            qqrVar6 = (defpackage.qqr) optionalOfNullable.orElseThrow();
            if (qqrVar6.n) {
                android.widget.Toast.makeText(qtdVar.c, 2132017985, 1).show();
                optionalAe = qtdVar.t.ae(qqrVar6);
                if (true == optionalAe.isPresent()) {
                    ((defpackage.qrv) optionalAe.get()).q.j();
                }
            }
            qqrVar7 = (defpackage.qqr) optionalOfNullable.orElseThrow();
            if (qqrVar7.q) {
                android.widget.Toast.makeText(qtdVar.c, 2132020724, 1).show();
                ((defpackage.qrv) qtdVar.l(qqrVar7).orElseThrow()).k.set(true);
            }
        } else {
            i = 0;
            a.bI(defpackage.qtd.b.d(), "video model is missing", "com/android/dialer/incall/video/ui/VideoScreenFragmentPeer$1", "onDataLoad", (char) 216, "VideoScreenFragmentPeer.java", zct.b);
        }
        defpackage.qtd qtdVar3 = this.a;
        j$.util.Optional optionalOfNullable5 = qtdVar3.l;
        if (true == optionalOfNullable5.isPresent()) {
            optionalOfNullable5 = j$.util.Optional.ofNullable(((defpackage.qqr) optionalOfNullable5.get()).a);
        }
        boolean zEquals = optionalOfNullable5.equals(true != optionalOfNullable.isPresent() ? optionalOfNullable : j$.util.Optional.ofNullable(((defpackage.qqr) optionalOfNullable.get()).a));
        defpackage.qsr qsrVar3 = qtdVar3.d;
        boolean zA = ((ahfw) qsrVar3).a.d.a(emq.e);
        if (zEquals) {
            z = true;
        } else {
            aimw aimwVarL = defpackage.qtd.b.b().l("com/android/dialer/incall/video/ui/VideoScreenFragmentPeer", "pauseAndResumeVideoIfCallChanged", 1651, "VideoScreenFragmentPeer.java");
            j$.util.Optional optionalOfNullable6 = qtdVar3.l;
            if (true == optionalOfNullable6.isPresent()) {
                optionalOfNullable6 = j$.util.Optional.ofNullable(((defpackage.qqr) optionalOfNullable6.get()).a);
            }
            aimwVarL.I("call in the video model changed, old: %s, new: %s", optionalOfNullable6, true != optionalOfNullable.isPresent() ? optionalOfNullable : j$.util.Optional.ofNullable(((defpackage.qqr) optionalOfNullable.get()).a));
            j$.util.Optional optionalL10 = qtdVar3.l;
            defpackage.qkv qkvVar3 = new defpackage.qkv(qtdVar3, 4);
            z = true;
            if (true == optionalL10.isPresent()) {
                optionalL10 = ((defpackage.qtd) qkvVar3.a).l((defpackage.qqr) optionalL10.get());
                optionalL10.getClass();
            }
            if (true == optionalL10.isPresent()) {
                ((defpackage.qrv) optionalL10.get()).f();
            }
            if (zA) {
                defpackage.qkv qkvVar4 = new defpackage.qkv(qtdVar3, 4);
                if (true != optionalOfNullable.isPresent()) {
                    optionalL = optionalOfNullable;
                } else {
                    optionalL = ((defpackage.qtd) qkvVar4.a).l((defpackage.qqr) optionalOfNullable.get());
                    optionalL.getClass();
                }
                if (true == optionalL.isPresent()) {
                    defpackage.qrv qrvVar5 = (defpackage.qrv) optionalL.get();
                    qrvVar5.h();
                    qrvVar5.i();
                }
            }
        }
        qtdVar3.l = optionalOfNullable;
        if (z == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(defpackage.qtg.a((defpackage.qqr) optionalOfNullable.get()));
        }
        defpackage.rcm rcmVar = qtdVar3.r;
        j$.util.Objects.requireNonNull(rcmVar);
        defpackage.qkv qkvVar5 = new defpackage.qkv(rcmVar, 5);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.rcm) qkvVar5.a).c((defpackage.qtg) optionalOfNullable.get()));
        }
        qtdVar3.m = optionalOfNullable;
        android.view.View viewFindViewById2 = qsrVar3.N().findViewById(2131429427);
        j$.util.Optional optionalOfNullable7 = qtdVar3.l;
        if (true == optionalOfNullable7.isPresent()) {
            optionalOfNullable7 = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.qqr) optionalOfNullable7.get()).e));
        }
        if (true == ((java.lang.Boolean) optionalOfNullable7.orElse(java.lang.Boolean.TRUE)).booleanValue()) {
            i = 8;
        }
        viewFindViewById2.setVisibility(i);
        qtdVar3.p();
        j$.util.Optional optional8 = qtdVar3.m;
        j$.util.Objects.requireNonNull(qtdVar3);
        defpackage.qst qstVar4 = new defpackage.qst(qtdVar3, 8);
        if (true == optional8.isPresent()) {
            ((defpackage.qtd) qstVar4.a).y((defpackage.qth) optional8.get());
        }
    }

    public final void b(java.lang.Throwable th) {
        a.bq(defpackage.qtd.b.c(), "failed to load VideoModel at VideoScreenFragmentPeer", "com/android/dialer/incall/video/ui/VideoScreenFragmentPeer$1", "onDataLoadError", (char) 238, "VideoScreenFragmentPeer.java", th, zct.b);
    }
}
