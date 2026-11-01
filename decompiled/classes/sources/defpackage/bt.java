package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bt {
    public final defpackage.aw a;
    private final defpackage.bu c;
    private final defpackage.nf e;
    private boolean d = false;
    public int b = -1;

    public bt(defpackage.nf nfVar, defpackage.bu buVar, java.lang.ClassLoader classLoader, defpackage.bc bcVar, android.os.Bundle bundle) {
        this.e = nfVar;
        this.c = buVar;
        android.support.v4.app.FragmentState fragmentState = (android.support.v4.app.FragmentState) bundle.getParcelable("state");
        defpackage.aw awVarB = bcVar.b(fragmentState.a);
        awVarB.l = fragmentState.b;
        awVarB.v = fragmentState.c;
        awVarB.x = fragmentState.d;
        awVarB.y = true;
        awVarB.F = fragmentState.e;
        awVarB.G = fragmentState.f;
        awVarB.H = fragmentState.g;
        awVarB.K = fragmentState.h;
        awVarB.s = fragmentState.i;
        awVarB.J = fragmentState.j;
        awVarB.I = fragmentState.k;
        awVarB.aa = defpackage.emq.values()[fragmentState.l];
        awVarB.o = fragmentState.m;
        awVarB.p = fragmentState.n;
        awVarB.S = fragmentState.o;
        this.a = awVarB;
        awVarB.h = bundle;
        android.os.Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        awVarB.au(bundle2);
        if (defpackage.bo.Z(2)) {
            java.util.Objects.toString(awVarB);
            android.util.Log.v("FragmentManager", "Instantiated fragment ".concat(java.lang.String.valueOf(awVarB)));
        }
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = new android.os.Bundle();
        defpackage.aw awVar = this.a;
        if (awVar.g == -1 && (bundle = awVar.h) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new android.support.v4.app.FragmentState(awVar));
        if (awVar.g > 0) {
            android.os.Bundle bundle3 = new android.os.Bundle();
            defpackage.ad adVar = new defpackage.ad(awVar, bundle3, 5);
            defpackage.den denVar = awVar.aj;
            defpackage.den.bW(adVar);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.e.C(awVar, bundle3);
            android.os.Bundle bundle4 = new android.os.Bundle();
            awVar.ai.af(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            android.os.Bundle bundleB = awVar.D.b();
            if (!bundleB.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleB);
            }
            if (awVar.Q != null) {
                g();
            }
            android.util.SparseArray<? extends android.os.Parcelable> sparseArray = awVar.i;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            android.os.Bundle bundle5 = awVar.j;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        android.os.Bundle bundle6 = awVar.m;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    final void b() {
        android.view.View view;
        android.view.View view2;
        defpackage.aw awVar = this.a;
        defpackage.aw awVarF = defpackage.bo.f(awVar.P);
        defpackage.aw awVar2 = awVar.E;
        if (awVarF != null && !awVarF.equals(awVar2)) {
            int i = awVar.G;
            int i2 = eku.a;
            if (awVar == null) {
                defpackage.aooh.i("fragment");
            }
            ele eleVar = new ele(awVar, awVarF, i);
            eku.d(eleVar);
            ekt ektVarB = eku.b(awVar);
            if (ektVarB.b.contains(eks.e) && eku.e(ektVarB, awVar.getClass(), eleVar.getClass())) {
                eku.c(ektVarB, eleVar);
            }
        }
        defpackage.bu buVar = this.c;
        android.view.ViewGroup viewGroup = awVar.P;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            java.util.ArrayList arrayList = buVar.a;
            int iIndexOf = arrayList.indexOf(awVar);
            for (int i3 = iIndexOf - 1; i3 >= 0; i3--) {
                defpackage.aw awVar3 = (defpackage.aw) arrayList.get(i3);
                if (awVar3.P == viewGroup && (view2 = awVar3.Q) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                defpackage.aw awVar4 = (defpackage.aw) arrayList.get(iIndexOf);
                if (awVar4.P == viewGroup && (view = awVar4.Q) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        awVar.P.addView(awVar.Q, iIndexOfChild);
    }

    final void c() {
        java.lang.String resourceName;
        defpackage.aw awVar = this.a;
        if (awVar.v) {
            return;
        }
        if (defpackage.bo.Z(3)) {
            java.util.Objects.toString(awVar);
            android.util.Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(java.lang.String.valueOf(awVar)));
        }
        android.os.Bundle bundle = awVar.h;
        android.view.ViewGroup viewGroup = null;
        android.os.Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        android.view.LayoutInflater layoutInflaterL = awVar.L(bundle2);
        android.view.ViewGroup viewGroup2 = awVar.P;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = awVar.G;
            if (i != 0) {
                if (i == -1) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bg(awVar, "Cannot create fragment ", " for a container view with no id"));
                }
                viewGroup = (android.view.ViewGroup) awVar.B.o.a(i);
                if (viewGroup == null) {
                    if (!awVar.y && !awVar.x) {
                        try {
                            resourceName = awVar.dX().getResourceName(awVar.G);
                        } catch (android.content.res.Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("No view found for id 0x");
                        defpackage.aw awVar2 = this.a;
                        sb.append(java.lang.Integer.toHexString(awVar2.G));
                        sb.append(" (");
                        sb.append(resourceName);
                        sb.append(") for fragment ");
                        sb.append(awVar2);
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                } else if (!(viewGroup instanceof android.support.v4.app.FragmentContainerView)) {
                    defpackage.aw awVar3 = this.a;
                    int i2 = eku.a;
                    if (awVar3 == null) {
                        defpackage.aooh.i("fragment");
                    }
                    eld eldVar = new eld(awVar3, viewGroup);
                    eku.d(eldVar);
                    ekt ektVarB = eku.b(awVar3);
                    if (ektVarB.b.contains(eks.i) && eku.e(ektVarB, awVar3.getClass(), eldVar.getClass())) {
                        eku.c(ektVarB, eldVar);
                    }
                }
            }
        }
        defpackage.aw awVar4 = this.a;
        awVar4.P = viewGroup;
        awVar4.o(layoutInflaterL, viewGroup, bundle2);
        if (awVar4.Q != null) {
            if (defpackage.bo.Z(3)) {
                java.util.Objects.toString(awVar4);
                android.util.Log.d("FragmentManager", "moveto VIEW_CREATED: ".concat(java.lang.String.valueOf(awVar4)));
            }
            awVar4.Q.setSaveFromParentEnabled(false);
            awVar4.Q.setTag(2131428300, awVar4);
            if (viewGroup != null) {
                b();
            }
            if (awVar4.I) {
                awVar4.Q.setVisibility(8);
            }
            if (awVar4.Q.isAttachedToWindow()) {
                android.view.View view = awVar4.Q;
                int i3 = defpackage.dzs.a;
                view.requestApplyInsets();
            } else {
                android.view.View view2 = awVar4.Q;
                view2.addOnAttachStateChangeListener(new defpackage.cpt(view2, 1));
            }
            awVar4.ap();
            this.e.F(awVar4, awVar4.Q, bundle2);
            int visibility = awVar4.Q.getVisibility();
            awVar4.D().n = awVar4.Q.getAlpha();
            if (awVar4.P != null && visibility == 0) {
                android.view.View viewFindFocus = awVar4.Q.findFocus();
                if (viewFindFocus != null) {
                    awVar4.ax(viewFindFocus);
                    if (defpackage.bo.Z(2)) {
                        android.util.Log.v("FragmentManager", defpackage.a.bi(awVar4, viewFindFocus, "requestFocus: Saved focused view ", " for Fragment "));
                    }
                }
                awVar4.Q.setAlpha(0.0f);
            }
        }
        awVar4.g = 2;
    }

    final void d() {
        defpackage.aw awVar = this.a;
        if (awVar.v && awVar.w && !awVar.z) {
            if (defpackage.bo.Z(3)) {
                java.util.Objects.toString(awVar);
                android.util.Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(java.lang.String.valueOf(awVar)));
            }
            android.os.Bundle bundle = awVar.h;
            android.os.Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            awVar.o(awVar.L(bundle2), null, bundle2);
            android.view.View view = awVar.Q;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                awVar.Q.setTag(2131428300, awVar);
                if (awVar.I) {
                    awVar.Q.setVisibility(8);
                }
                awVar.ap();
                this.e.F(awVar, awVar.Q, bundle2);
                awVar.g = 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x016b A[Catch: all -> 0x0888, TryCatch #0 {all -> 0x0888, blocks: (B:9:0x0024, B:10:0x0027, B:12:0x0032, B:78:0x0119, B:86:0x012e, B:88:0x0134, B:89:0x0144, B:94:0x014e, B:96:0x0152, B:98:0x0158, B:100:0x015c, B:101:0x0161, B:103:0x016b, B:106:0x0184, B:107:0x01a4, B:109:0x01c3, B:111:0x01cf, B:112:0x01d7, B:113:0x01f0, B:114:0x01fb, B:92:0x014a, B:115:0x01fc, B:116:0x0200, B:118:0x0206, B:119:0x0216, B:121:0x0232, B:123:0x023e, B:124:0x0246, B:125:0x0252, B:126:0x025d, B:127:0x025e, B:129:0x0262, B:131:0x0266, B:133:0x027e, B:134:0x028e, B:135:0x0291, B:136:0x0295, B:138:0x029b, B:139:0x02ab, B:141:0x02af, B:143:0x02b5, B:145:0x02cc, B:147:0x02d2, B:148:0x02e2, B:150:0x02e6, B:152:0x02ea, B:154:0x02f0, B:156:0x02f4, B:157:0x02fb, B:159:0x0309, B:161:0x030d, B:162:0x0318, B:163:0x0323, B:164:0x0324, B:165:0x0332, B:166:0x033d, B:167:0x033e, B:168:0x0346, B:170:0x034c, B:171:0x035c, B:173:0x0360, B:175:0x0366, B:177:0x036a, B:179:0x0392, B:180:0x03a1, B:181:0x03ac, B:182:0x03ad, B:183:0x03b4, B:185:0x03ba, B:186:0x03ca, B:189:0x03d2, B:191:0x03dc, B:201:0x0434, B:202:0x0437, B:204:0x044f, B:205:0x045b, B:207:0x047b, B:208:0x0483, B:210:0x0489, B:211:0x0493, B:212:0x04a5, B:213:0x04b0, B:192:0x03e6, B:193:0x0405, B:194:0x0406, B:196:0x040a, B:198:0x0412, B:199:0x0431, B:214:0x04b1, B:215:0x04b3, B:217:0x04b8, B:219:0x04be, B:220:0x04ce, B:222:0x04d7, B:223:0x04e3, B:225:0x0501, B:226:0x0508, B:227:0x0513, B:228:0x0514, B:229:0x0518, B:231:0x051e, B:232:0x052e, B:234:0x0537, B:235:0x0541, B:237:0x055d, B:238:0x0564, B:239:0x056f, B:240:0x0570, B:242:0x0576, B:243:0x058a, B:245:0x0590, B:247:0x0594, B:248:0x0597, B:250:0x059b, B:252:0x059f, B:254:0x05ad, B:255:0x05bd, B:256:0x05c0, B:257:0x05c4, B:258:0x05ca, B:260:0x05d0, B:261:0x05e0, B:263:0x05e4, B:265:0x05e8, B:266:0x05eb, B:268:0x05f4, B:270:0x0606, B:271:0x0610, B:273:0x0622, B:275:0x0633, B:276:0x063f, B:277:0x0657, B:278:0x0662, B:279:0x0663, B:281:0x066b, B:282:0x067b, B:284:0x067f, B:289:0x068a, B:292:0x069e, B:294:0x06a4, B:297:0x06b6, B:299:0x06bb, B:300:0x06c2, B:302:0x06e7, B:303:0x06f6, B:305:0x06fc, B:307:0x0704, B:309:0x0710, B:310:0x0715, B:312:0x0719, B:313:0x071f, B:314:0x0724, B:315:0x072f, B:295:0x06ab, B:290:0x0694, B:316:0x0730, B:318:0x0734, B:320:0x073a, B:322:0x073e, B:323:0x0740, B:324:0x0744, B:326:0x074a, B:327:0x075a, B:329:0x0771, B:331:0x0777, B:332:0x0781, B:334:0x0798, B:338:0x07a8, B:340:0x07ae, B:341:0x07bc, B:336:0x079e, B:343:0x07c2, B:344:0x07cd, B:348:0x07d3, B:350:0x07d7, B:352:0x07dd, B:354:0x07e5, B:355:0x07f9, B:357:0x0809, B:358:0x081b, B:359:0x081e, B:361:0x0822, B:363:0x0826, B:365:0x082a, B:367:0x0836, B:369:0x083c, B:370:0x084c, B:371:0x0850, B:373:0x0856, B:374:0x0866, B:375:0x0869, B:377:0x086d, B:379:0x0871, B:381:0x0877, B:382:0x0879, B:13:0x0036, B:18:0x0046, B:22:0x0059, B:24:0x005d, B:26:0x0063, B:28:0x006b, B:32:0x0075, B:33:0x007c, B:34:0x0080, B:36:0x0084, B:38:0x0088, B:39:0x008c, B:41:0x0090, B:42:0x0094, B:44:0x0098, B:46:0x00ab, B:48:0x00af, B:50:0x00b5, B:53:0x00bb, B:58:0x00c4, B:67:0x00e3, B:69:0x00e7, B:71:0x00eb, B:72:0x00ef, B:74:0x00f3, B:75:0x00f7, B:77:0x00fd, B:60:0x00cb, B:61:0x00d0, B:63:0x00d4, B:65:0x00da, B:66:0x00df, B:19:0x004b, B:20:0x0050, B:21:0x0055), top: B:388:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0183  */
    /* JADX WARN: Code duplicated, block: B:302:0x06e7 A[Catch: all -> 0x0888, TryCatch #0 {all -> 0x0888, blocks: (B:9:0x0024, B:10:0x0027, B:12:0x0032, B:78:0x0119, B:86:0x012e, B:88:0x0134, B:89:0x0144, B:94:0x014e, B:96:0x0152, B:98:0x0158, B:100:0x015c, B:101:0x0161, B:103:0x016b, B:106:0x0184, B:107:0x01a4, B:109:0x01c3, B:111:0x01cf, B:112:0x01d7, B:113:0x01f0, B:114:0x01fb, B:92:0x014a, B:115:0x01fc, B:116:0x0200, B:118:0x0206, B:119:0x0216, B:121:0x0232, B:123:0x023e, B:124:0x0246, B:125:0x0252, B:126:0x025d, B:127:0x025e, B:129:0x0262, B:131:0x0266, B:133:0x027e, B:134:0x028e, B:135:0x0291, B:136:0x0295, B:138:0x029b, B:139:0x02ab, B:141:0x02af, B:143:0x02b5, B:145:0x02cc, B:147:0x02d2, B:148:0x02e2, B:150:0x02e6, B:152:0x02ea, B:154:0x02f0, B:156:0x02f4, B:157:0x02fb, B:159:0x0309, B:161:0x030d, B:162:0x0318, B:163:0x0323, B:164:0x0324, B:165:0x0332, B:166:0x033d, B:167:0x033e, B:168:0x0346, B:170:0x034c, B:171:0x035c, B:173:0x0360, B:175:0x0366, B:177:0x036a, B:179:0x0392, B:180:0x03a1, B:181:0x03ac, B:182:0x03ad, B:183:0x03b4, B:185:0x03ba, B:186:0x03ca, B:189:0x03d2, B:191:0x03dc, B:201:0x0434, B:202:0x0437, B:204:0x044f, B:205:0x045b, B:207:0x047b, B:208:0x0483, B:210:0x0489, B:211:0x0493, B:212:0x04a5, B:213:0x04b0, B:192:0x03e6, B:193:0x0405, B:194:0x0406, B:196:0x040a, B:198:0x0412, B:199:0x0431, B:214:0x04b1, B:215:0x04b3, B:217:0x04b8, B:219:0x04be, B:220:0x04ce, B:222:0x04d7, B:223:0x04e3, B:225:0x0501, B:226:0x0508, B:227:0x0513, B:228:0x0514, B:229:0x0518, B:231:0x051e, B:232:0x052e, B:234:0x0537, B:235:0x0541, B:237:0x055d, B:238:0x0564, B:239:0x056f, B:240:0x0570, B:242:0x0576, B:243:0x058a, B:245:0x0590, B:247:0x0594, B:248:0x0597, B:250:0x059b, B:252:0x059f, B:254:0x05ad, B:255:0x05bd, B:256:0x05c0, B:257:0x05c4, B:258:0x05ca, B:260:0x05d0, B:261:0x05e0, B:263:0x05e4, B:265:0x05e8, B:266:0x05eb, B:268:0x05f4, B:270:0x0606, B:271:0x0610, B:273:0x0622, B:275:0x0633, B:276:0x063f, B:277:0x0657, B:278:0x0662, B:279:0x0663, B:281:0x066b, B:282:0x067b, B:284:0x067f, B:289:0x068a, B:292:0x069e, B:294:0x06a4, B:297:0x06b6, B:299:0x06bb, B:300:0x06c2, B:302:0x06e7, B:303:0x06f6, B:305:0x06fc, B:307:0x0704, B:309:0x0710, B:310:0x0715, B:312:0x0719, B:313:0x071f, B:314:0x0724, B:315:0x072f, B:295:0x06ab, B:290:0x0694, B:316:0x0730, B:318:0x0734, B:320:0x073a, B:322:0x073e, B:323:0x0740, B:324:0x0744, B:326:0x074a, B:327:0x075a, B:329:0x0771, B:331:0x0777, B:332:0x0781, B:334:0x0798, B:338:0x07a8, B:340:0x07ae, B:341:0x07bc, B:336:0x079e, B:343:0x07c2, B:344:0x07cd, B:348:0x07d3, B:350:0x07d7, B:352:0x07dd, B:354:0x07e5, B:355:0x07f9, B:357:0x0809, B:358:0x081b, B:359:0x081e, B:361:0x0822, B:363:0x0826, B:365:0x082a, B:367:0x0836, B:369:0x083c, B:370:0x084c, B:371:0x0850, B:373:0x0856, B:374:0x0866, B:375:0x0869, B:377:0x086d, B:379:0x0871, B:381:0x0877, B:382:0x0879, B:13:0x0036, B:18:0x0046, B:22:0x0059, B:24:0x005d, B:26:0x0063, B:28:0x006b, B:32:0x0075, B:33:0x007c, B:34:0x0080, B:36:0x0084, B:38:0x0088, B:39:0x008c, B:41:0x0090, B:42:0x0094, B:44:0x0098, B:46:0x00ab, B:48:0x00af, B:50:0x00b5, B:53:0x00bb, B:58:0x00c4, B:67:0x00e3, B:69:0x00e7, B:71:0x00eb, B:72:0x00ef, B:74:0x00f3, B:75:0x00f7, B:77:0x00fd, B:60:0x00cb, B:61:0x00d0, B:63:0x00d4, B:65:0x00da, B:66:0x00df, B:19:0x004b, B:20:0x0050, B:21:0x0055), top: B:388:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x06fc A[Catch: all -> 0x0888, TryCatch #0 {all -> 0x0888, blocks: (B:9:0x0024, B:10:0x0027, B:12:0x0032, B:78:0x0119, B:86:0x012e, B:88:0x0134, B:89:0x0144, B:94:0x014e, B:96:0x0152, B:98:0x0158, B:100:0x015c, B:101:0x0161, B:103:0x016b, B:106:0x0184, B:107:0x01a4, B:109:0x01c3, B:111:0x01cf, B:112:0x01d7, B:113:0x01f0, B:114:0x01fb, B:92:0x014a, B:115:0x01fc, B:116:0x0200, B:118:0x0206, B:119:0x0216, B:121:0x0232, B:123:0x023e, B:124:0x0246, B:125:0x0252, B:126:0x025d, B:127:0x025e, B:129:0x0262, B:131:0x0266, B:133:0x027e, B:134:0x028e, B:135:0x0291, B:136:0x0295, B:138:0x029b, B:139:0x02ab, B:141:0x02af, B:143:0x02b5, B:145:0x02cc, B:147:0x02d2, B:148:0x02e2, B:150:0x02e6, B:152:0x02ea, B:154:0x02f0, B:156:0x02f4, B:157:0x02fb, B:159:0x0309, B:161:0x030d, B:162:0x0318, B:163:0x0323, B:164:0x0324, B:165:0x0332, B:166:0x033d, B:167:0x033e, B:168:0x0346, B:170:0x034c, B:171:0x035c, B:173:0x0360, B:175:0x0366, B:177:0x036a, B:179:0x0392, B:180:0x03a1, B:181:0x03ac, B:182:0x03ad, B:183:0x03b4, B:185:0x03ba, B:186:0x03ca, B:189:0x03d2, B:191:0x03dc, B:201:0x0434, B:202:0x0437, B:204:0x044f, B:205:0x045b, B:207:0x047b, B:208:0x0483, B:210:0x0489, B:211:0x0493, B:212:0x04a5, B:213:0x04b0, B:192:0x03e6, B:193:0x0405, B:194:0x0406, B:196:0x040a, B:198:0x0412, B:199:0x0431, B:214:0x04b1, B:215:0x04b3, B:217:0x04b8, B:219:0x04be, B:220:0x04ce, B:222:0x04d7, B:223:0x04e3, B:225:0x0501, B:226:0x0508, B:227:0x0513, B:228:0x0514, B:229:0x0518, B:231:0x051e, B:232:0x052e, B:234:0x0537, B:235:0x0541, B:237:0x055d, B:238:0x0564, B:239:0x056f, B:240:0x0570, B:242:0x0576, B:243:0x058a, B:245:0x0590, B:247:0x0594, B:248:0x0597, B:250:0x059b, B:252:0x059f, B:254:0x05ad, B:255:0x05bd, B:256:0x05c0, B:257:0x05c4, B:258:0x05ca, B:260:0x05d0, B:261:0x05e0, B:263:0x05e4, B:265:0x05e8, B:266:0x05eb, B:268:0x05f4, B:270:0x0606, B:271:0x0610, B:273:0x0622, B:275:0x0633, B:276:0x063f, B:277:0x0657, B:278:0x0662, B:279:0x0663, B:281:0x066b, B:282:0x067b, B:284:0x067f, B:289:0x068a, B:292:0x069e, B:294:0x06a4, B:297:0x06b6, B:299:0x06bb, B:300:0x06c2, B:302:0x06e7, B:303:0x06f6, B:305:0x06fc, B:307:0x0704, B:309:0x0710, B:310:0x0715, B:312:0x0719, B:313:0x071f, B:314:0x0724, B:315:0x072f, B:295:0x06ab, B:290:0x0694, B:316:0x0730, B:318:0x0734, B:320:0x073a, B:322:0x073e, B:323:0x0740, B:324:0x0744, B:326:0x074a, B:327:0x075a, B:329:0x0771, B:331:0x0777, B:332:0x0781, B:334:0x0798, B:338:0x07a8, B:340:0x07ae, B:341:0x07bc, B:336:0x079e, B:343:0x07c2, B:344:0x07cd, B:348:0x07d3, B:350:0x07d7, B:352:0x07dd, B:354:0x07e5, B:355:0x07f9, B:357:0x0809, B:358:0x081b, B:359:0x081e, B:361:0x0822, B:363:0x0826, B:365:0x082a, B:367:0x0836, B:369:0x083c, B:370:0x084c, B:371:0x0850, B:373:0x0856, B:374:0x0866, B:375:0x0869, B:377:0x086d, B:379:0x0871, B:381:0x0877, B:382:0x0879, B:13:0x0036, B:18:0x0046, B:22:0x0059, B:24:0x005d, B:26:0x0063, B:28:0x006b, B:32:0x0075, B:33:0x007c, B:34:0x0080, B:36:0x0084, B:38:0x0088, B:39:0x008c, B:41:0x0090, B:42:0x0094, B:44:0x0098, B:46:0x00ab, B:48:0x00af, B:50:0x00b5, B:53:0x00bb, B:58:0x00c4, B:67:0x00e3, B:69:0x00e7, B:71:0x00eb, B:72:0x00ef, B:74:0x00f3, B:75:0x00f7, B:77:0x00fd, B:60:0x00cb, B:61:0x00d0, B:63:0x00d4, B:65:0x00da, B:66:0x00df, B:19:0x004b, B:20:0x0050, B:21:0x0055), top: B:388:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:312:0x0719 A[Catch: all -> 0x0888, TryCatch #0 {all -> 0x0888, blocks: (B:9:0x0024, B:10:0x0027, B:12:0x0032, B:78:0x0119, B:86:0x012e, B:88:0x0134, B:89:0x0144, B:94:0x014e, B:96:0x0152, B:98:0x0158, B:100:0x015c, B:101:0x0161, B:103:0x016b, B:106:0x0184, B:107:0x01a4, B:109:0x01c3, B:111:0x01cf, B:112:0x01d7, B:113:0x01f0, B:114:0x01fb, B:92:0x014a, B:115:0x01fc, B:116:0x0200, B:118:0x0206, B:119:0x0216, B:121:0x0232, B:123:0x023e, B:124:0x0246, B:125:0x0252, B:126:0x025d, B:127:0x025e, B:129:0x0262, B:131:0x0266, B:133:0x027e, B:134:0x028e, B:135:0x0291, B:136:0x0295, B:138:0x029b, B:139:0x02ab, B:141:0x02af, B:143:0x02b5, B:145:0x02cc, B:147:0x02d2, B:148:0x02e2, B:150:0x02e6, B:152:0x02ea, B:154:0x02f0, B:156:0x02f4, B:157:0x02fb, B:159:0x0309, B:161:0x030d, B:162:0x0318, B:163:0x0323, B:164:0x0324, B:165:0x0332, B:166:0x033d, B:167:0x033e, B:168:0x0346, B:170:0x034c, B:171:0x035c, B:173:0x0360, B:175:0x0366, B:177:0x036a, B:179:0x0392, B:180:0x03a1, B:181:0x03ac, B:182:0x03ad, B:183:0x03b4, B:185:0x03ba, B:186:0x03ca, B:189:0x03d2, B:191:0x03dc, B:201:0x0434, B:202:0x0437, B:204:0x044f, B:205:0x045b, B:207:0x047b, B:208:0x0483, B:210:0x0489, B:211:0x0493, B:212:0x04a5, B:213:0x04b0, B:192:0x03e6, B:193:0x0405, B:194:0x0406, B:196:0x040a, B:198:0x0412, B:199:0x0431, B:214:0x04b1, B:215:0x04b3, B:217:0x04b8, B:219:0x04be, B:220:0x04ce, B:222:0x04d7, B:223:0x04e3, B:225:0x0501, B:226:0x0508, B:227:0x0513, B:228:0x0514, B:229:0x0518, B:231:0x051e, B:232:0x052e, B:234:0x0537, B:235:0x0541, B:237:0x055d, B:238:0x0564, B:239:0x056f, B:240:0x0570, B:242:0x0576, B:243:0x058a, B:245:0x0590, B:247:0x0594, B:248:0x0597, B:250:0x059b, B:252:0x059f, B:254:0x05ad, B:255:0x05bd, B:256:0x05c0, B:257:0x05c4, B:258:0x05ca, B:260:0x05d0, B:261:0x05e0, B:263:0x05e4, B:265:0x05e8, B:266:0x05eb, B:268:0x05f4, B:270:0x0606, B:271:0x0610, B:273:0x0622, B:275:0x0633, B:276:0x063f, B:277:0x0657, B:278:0x0662, B:279:0x0663, B:281:0x066b, B:282:0x067b, B:284:0x067f, B:289:0x068a, B:292:0x069e, B:294:0x06a4, B:297:0x06b6, B:299:0x06bb, B:300:0x06c2, B:302:0x06e7, B:303:0x06f6, B:305:0x06fc, B:307:0x0704, B:309:0x0710, B:310:0x0715, B:312:0x0719, B:313:0x071f, B:314:0x0724, B:315:0x072f, B:295:0x06ab, B:290:0x0694, B:316:0x0730, B:318:0x0734, B:320:0x073a, B:322:0x073e, B:323:0x0740, B:324:0x0744, B:326:0x074a, B:327:0x075a, B:329:0x0771, B:331:0x0777, B:332:0x0781, B:334:0x0798, B:338:0x07a8, B:340:0x07ae, B:341:0x07bc, B:336:0x079e, B:343:0x07c2, B:344:0x07cd, B:348:0x07d3, B:350:0x07d7, B:352:0x07dd, B:354:0x07e5, B:355:0x07f9, B:357:0x0809, B:358:0x081b, B:359:0x081e, B:361:0x0822, B:363:0x0826, B:365:0x082a, B:367:0x0836, B:369:0x083c, B:370:0x084c, B:371:0x0850, B:373:0x0856, B:374:0x0866, B:375:0x0869, B:377:0x086d, B:379:0x0871, B:381:0x0877, B:382:0x0879, B:13:0x0036, B:18:0x0046, B:22:0x0059, B:24:0x005d, B:26:0x0063, B:28:0x006b, B:32:0x0075, B:33:0x007c, B:34:0x0080, B:36:0x0084, B:38:0x0088, B:39:0x008c, B:41:0x0090, B:42:0x0094, B:44:0x0098, B:46:0x00ab, B:48:0x00af, B:50:0x00b5, B:53:0x00bb, B:58:0x00c4, B:67:0x00e3, B:69:0x00e7, B:71:0x00eb, B:72:0x00ef, B:74:0x00f3, B:75:0x00f7, B:77:0x00fd, B:60:0x00cb, B:61:0x00d0, B:63:0x00d4, B:65:0x00da, B:66:0x00df, B:19:0x004b, B:20:0x0050, B:21:0x0055), top: B:388:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:401:0x0724 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x0704 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x0710 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x06f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x06f6 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:103:0x016b, please report this as an issue */
    public final void e() {
        int iMin;
        int i;
        android.view.ViewGroup viewGroup;
        defpackage.aw awVarB;
        defpackage.bu buVar;
        java.lang.String str;
        defpackage.aw awVar;
        android.view.View view;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        boolean zRequestFocus;
        int i2 = 2;
        if (this.d) {
            if (defpackage.bo.Z(2)) {
                defpackage.aw awVar2 = this.a;
                java.util.Objects.toString(awVar2);
                android.util.Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for ".concat(java.lang.String.valueOf(awVar2)));
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = 1;
        try {
            this.d = true;
            boolean z = false;
            while (true) {
                defpackage.aw awVar3 = this.a;
                int i5 = 6;
                int i6 = 5;
                int i7 = 4;
                int i8 = 3;
                if (awVar3.B == null) {
                    iMin = awVar3.g;
                } else {
                    iMin = this.b;
                    int iOrdinal = awVar3.aa.ordinal();
                    if (iOrdinal == 1) {
                        iMin = java.lang.Math.min(iMin, 0);
                    } else if (iOrdinal == 2) {
                        iMin = java.lang.Math.min(iMin, 1);
                    } else if (iOrdinal == 3) {
                        iMin = java.lang.Math.min(iMin, 5);
                    } else if (iOrdinal != 4) {
                        iMin = java.lang.Math.min(iMin, -1);
                    }
                    if (awVar3.v) {
                        boolean z2 = awVar3.w;
                        int i9 = this.b;
                        if (z2) {
                            iMin = java.lang.Math.max(i9, 2);
                            android.view.View view2 = awVar3.Q;
                            if (view2 != null && view2.getParent() == null) {
                                iMin = 2;
                            }
                        } else {
                            iMin = i9 < 4 ? java.lang.Math.min(iMin, awVar3.g) : java.lang.Math.min(iMin, 1);
                        }
                    }
                    if (awVar3.x && awVar3.P == null) {
                        iMin = java.lang.Math.min(iMin, 4);
                    }
                    if (!awVar3.r) {
                        iMin = java.lang.Math.min(iMin, 1);
                    }
                    android.view.ViewGroup viewGroup4 = awVar3.P;
                    if (viewGroup4 != null) {
                        defpackage.ck ckVarBV = defpackage.den.bV(viewGroup4, awVar3.J());
                        defpackage.aooh.e(awVar3, "getFragment(...)");
                        defpackage.cj cjVarA = ckVarBV.a(awVar3);
                        i = cjVarA != null ? cjVarA.i : 0;
                        defpackage.cj cjVarB = ckVarBV.b(awVar3);
                        int i10 = cjVarB != null ? cjVarB.i : 0;
                        if (i == 0 || i - 1 == 0) {
                            i = i10;
                        }
                    } else {
                        i = 0;
                    }
                    if (i == 2) {
                        iMin = java.lang.Math.min(iMin, 6);
                    } else if (i == 3) {
                        iMin = java.lang.Math.max(iMin, 3);
                    } else if (awVar3.s) {
                        iMin = awVar3.aI() ? java.lang.Math.min(iMin, 1) : java.lang.Math.min(iMin, -1);
                    }
                    if (awVar3.R && awVar3.g < 5) {
                        iMin = java.lang.Math.min(iMin, 4);
                    }
                    if (awVar3.t) {
                        iMin = java.lang.Math.max(iMin, 3);
                    }
                    if (defpackage.bo.Z(2)) {
                        android.util.Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + awVar3);
                    }
                }
                int i11 = awVar3.g;
                if (iMin == i11) {
                    if (!z && i11 == -1 && awVar3.s && !awVar3.aI()) {
                        boolean z3 = awVar3.u;
                        if (defpackage.bo.Z(3)) {
                            android.util.Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + awVar3);
                        }
                        defpackage.bu buVar2 = this.c;
                        buVar2.d.b(awVar3, true);
                        buVar2.k(this);
                        if (defpackage.bo.Z(3)) {
                            android.util.Log.d("FragmentManager", "initState called for fragment: " + awVar3);
                        }
                        awVar3.ae();
                    }
                    if (awVar3.W) {
                        if (awVar3.Q != null && (viewGroup = awVar3.P) != null) {
                            defpackage.ck ckVarBV2 = defpackage.den.bV(viewGroup, awVar3.J());
                            if (awVar3.I) {
                                if (defpackage.bo.Z(2)) {
                                    java.util.Objects.toString(awVar3);
                                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment ".concat(java.lang.String.valueOf(awVar3)));
                                }
                                ckVarBV2.i(3, 1, this);
                            } else {
                                if (defpackage.bo.Z(2)) {
                                    java.util.Objects.toString(awVar3);
                                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment ".concat(java.lang.String.valueOf(awVar3)));
                                }
                                ckVarBV2.i(2, 1, this);
                            }
                        }
                        defpackage.bo boVar = awVar3.B;
                        if (boVar != null && awVar3.r && defpackage.bo.ah(awVar3)) {
                            boVar.v = true;
                        }
                        awVar3.W = false;
                        awVar3.aj(awVar3.I);
                        awVar3.D.x();
                    }
                    this.d = false;
                    return;
                }
                int i12 = 7;
                defpackage.bt btVarD = null;
                if (iMin <= i11) {
                    switch (i11 - 1) {
                        case -1:
                            if (defpackage.bo.Z(3)) {
                                java.util.Objects.toString(awVar3);
                                android.util.Log.d("FragmentManager", "movefrom ATTACHED: ".concat(java.lang.String.valueOf(awVar3)));
                            }
                            awVar3.g = -1;
                            awVar3.O = false;
                            defpackage.den denVar = awVar3.aj;
                            defpackage.den.bW(new defpackage.ae(awVar3, 9));
                            awVar3.X = null;
                            if (!awVar3.O) {
                                throw new cl(defpackage.a.bg(awVar3, "Fragment ", " did not call through to super.onDetach()"));
                            }
                            defpackage.bo boVar2 = awVar3.D;
                            if (!boVar2.y) {
                                boVar2.u();
                                awVar3.D = new defpackage.bo();
                            }
                            this.e.x(awVar3);
                            awVar3.g = -1;
                            awVar3.C = null;
                            awVar3.ac.a();
                            awVar3.E = null;
                            awVar3.B = null;
                            if ((awVar3.s && !awVar3.aI()) || this.c.d.f(awVar3)) {
                                if (defpackage.bo.Z(3)) {
                                    java.util.Objects.toString(awVar3);
                                    android.util.Log.d("FragmentManager", "initState called for fragment: ".concat(java.lang.String.valueOf(awVar3)));
                                }
                                awVar3.ae();
                            }
                            break;
                            break;
                        case 0:
                            boolean z4 = awVar3.u;
                            if (defpackage.bo.Z(3)) {
                                java.util.Objects.toString(awVar3);
                                android.util.Log.d("FragmentManager", "movefrom CREATED: ".concat(java.lang.String.valueOf(awVar3)));
                            }
                            boolean z5 = awVar3.s && !awVar3.aI();
                            if (!z5) {
                                defpackage.bu buVar3 = this.c;
                                if (!buVar3.d.f(awVar3)) {
                                    java.lang.String str2 = awVar3.o;
                                    if (str2 != null && (awVarB = buVar3.b(str2)) != null && awVarB.K) {
                                        awVar3.n = awVarB;
                                    }
                                    awVar3.g = 0;
                                    break;
                                }
                            } else {
                                boolean z6 = awVar3.u;
                                this.c.a(awVar3.l, null);
                            }
                            defpackage.bd bdVar = awVar3.C;
                            boolean z7 = bdVar instanceof defpackage.eoi ? this.c.d.f : !((android.app.Activity) bdVar.c).isChangingConfigurations();
                            if (!z5) {
                                if (z7) {
                                }
                                awVar3.D.u();
                                defpackage.den denVar2 = awVar3.aj;
                                defpackage.den.bW(new defpackage.ae(awVar3, 13));
                                awVar3.g = 0;
                                awVar3.O = false;
                                awVar3.Y = false;
                                defpackage.den.bW(new defpackage.ae(awVar3, 14));
                                if (awVar3.O) {
                                    throw new cl(defpackage.a.bg(awVar3, "Fragment ", " did not call through to super.onDestroy()"));
                                }
                                this.e.w(awVar3);
                                buVar = this.c;
                                for (defpackage.bt btVar : buVar.e()) {
                                    if (btVar != null) {
                                        awVar = btVar.a;
                                        if (awVar3.l.equals(awVar.o)) {
                                            awVar.n = awVar3;
                                            awVar.o = null;
                                        }
                                    }
                                }
                                str = awVar3.o;
                                if (str != null) {
                                    awVar3.n = buVar.b(str);
                                }
                                buVar.k(this);
                            } else {
                                boolean z8 = awVar3.u;
                            }
                            this.c.d.b(awVar3, false);
                            awVar3.D.u();
                            defpackage.den denVar3 = awVar3.aj;
                            defpackage.den.bW(new defpackage.ae(awVar3, 13));
                            awVar3.g = 0;
                            awVar3.O = false;
                            awVar3.Y = false;
                            defpackage.den.bW(new defpackage.ae(awVar3, 14));
                            if (awVar3.O) {
                                throw new cl(defpackage.a.bg(awVar3, "Fragment ", " did not call through to super.onDestroy()"));
                            }
                            this.e.w(awVar3);
                            buVar = this.c;
                            while (r8.hasNext()) {
                                if (btVar != null) {
                                    awVar = btVar.a;
                                    if (awVar3.l.equals(awVar.o)) {
                                        awVar.n = awVar3;
                                        awVar.o = null;
                                    }
                                }
                            }
                            str = awVar3.o;
                            if (str != null) {
                                awVar3.n = buVar.b(str);
                            }
                            buVar.k(this);
                            break;
                            break;
                        case 1:
                            if (defpackage.bo.Z(3)) {
                                java.util.Objects.toString(awVar3);
                                android.util.Log.d("FragmentManager", "movefrom CREATE_VIEW: ".concat(java.lang.String.valueOf(awVar3)));
                            }
                            android.view.ViewGroup viewGroup5 = awVar3.P;
                            if (viewGroup5 != null && (view = awVar3.Q) != null) {
                                viewGroup5.removeView(view);
                            }
                            awVar3.D.E(1);
                            if (awVar3.Q != null && ((defpackage.emy) awVar3.ad.P()).d.a(defpackage.emq.c)) {
                                defpackage.den denVar4 = awVar3.aj;
                                defpackage.den.bW(new defpackage.ae(awVar3, i7));
                            }
                            awVar3.g = 1;
                            awVar3.O = false;
                            defpackage.den denVar5 = awVar3.aj;
                            defpackage.den.bW(new defpackage.ae(awVar3, i6));
                            if (!awVar3.O) {
                                throw new cl(defpackage.a.bg(awVar3, "Fragment ", " did not call through to super.onDestroyView()"));
                            }
                            defpackage.aed aedVar = epc.a(awVar3).a.b;
                            int iC = aedVar.c();
                            for (int i13 = 0; i13 < iC; i13++) {
                                ((epd) aedVar.e(i13)).m();
                            }
                            awVar3.z = false;
                            this.e.G(awVar3);
                            awVar3.P = null;
                            awVar3.Q = null;
                            awVar3.ad = null;
                            awVar3.ae.k(null);
                            awVar3.w = false;
                            awVar3.g = 1;
                            break;
                            break;
                        case 2:
                            awVar3.w = false;
                            awVar3.g = 2;
                            break;
                        case 3:
                            if (defpackage.bo.Z(3)) {
                                android.util.Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + awVar3);
                            }
                            boolean z9 = awVar3.u;
                            if (awVar3.Q != null && awVar3.i == null) {
                                g();
                            }
                            if (awVar3.Q != null && (viewGroup2 = awVar3.P) != null) {
                                defpackage.ck ckVarBV3 = defpackage.den.bV(viewGroup2, awVar3.J());
                                if (defpackage.bo.Z(2)) {
                                    java.util.Objects.toString(awVar3);
                                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment ".concat(java.lang.String.valueOf(awVar3)));
                                }
                                ckVarBV3.i(1, 3, this);
                            }
                            awVar3.g = 3;
                            break;
                        case 4:
                            if (defpackage.bo.Z(3)) {
                                java.util.Objects.toString(awVar3);
                                android.util.Log.d("FragmentManager", "movefrom STARTED: ".concat(java.lang.String.valueOf(awVar3)));
                            }
                            awVar3.D.F();
                            if (awVar3.Q != null) {
                                defpackage.den denVar6 = awVar3.aj;
                                defpackage.den.bW(new defpackage.ae(awVar3, i5));
                            }
                            defpackage.den denVar7 = awVar3.aj;
                            defpackage.den.bW(new defpackage.ae(awVar3, i12));
                            awVar3.g = 4;
                            awVar3.O = false;
                            defpackage.den.bW(new defpackage.ae(awVar3, 8));
                            if (!awVar3.O) {
                                throw new cl(defpackage.a.bg(awVar3, "Fragment ", " did not call through to super.onStop()"));
                            }
                            this.e.E(awVar3);
                            break;
                            break;
                        case 5:
                            awVar3.g = 5;
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (defpackage.bo.Z(3)) {
                                java.util.Objects.toString(awVar3);
                                android.util.Log.d("FragmentManager", "movefrom RESUMED: ".concat(java.lang.String.valueOf(awVar3)));
                            }
                            awVar3.D.A();
                            if (awVar3.Q != null) {
                                defpackage.den denVar8 = awVar3.aj;
                                defpackage.den.bW(new defpackage.ae(awVar3, 10));
                            }
                            defpackage.den denVar9 = awVar3.aj;
                            defpackage.den.bW(new defpackage.ae(awVar3, 11));
                            awVar3.g = 6;
                            awVar3.O = false;
                            defpackage.den.bW(new defpackage.ae(awVar3, 12));
                            if (!awVar3.O) {
                                throw new cl(defpackage.a.bg(awVar3, "Fragment ", " did not call through to super.onPause()"));
                            }
                            this.e.y(awVar3);
                            break;
                            break;
                    }
                } else {
                    switch (i11 + 1) {
                        case 0:
                            if (defpackage.bo.Z(3)) {
                                java.util.Objects.toString(awVar3);
                                android.util.Log.d("FragmentManager", "moveto ATTACHED: ".concat(java.lang.String.valueOf(awVar3)));
                            }
                            defpackage.aw awVar4 = awVar3.n;
                            if (awVar4 != null) {
                                defpackage.bt btVarD2 = this.c.d(awVar4.l);
                                if (btVarD2 == null) {
                                    throw new java.lang.IllegalStateException("Fragment " + awVar3 + " declared target fragment " + awVar3.n + " that does not belong to this FragmentManager!");
                                }
                                awVar3.o = awVar3.n.l;
                                awVar3.n = null;
                                btVarD = btVarD2;
                            } else {
                                java.lang.String str3 = awVar3.o;
                                if (str3 != null && (btVarD = this.c.d(str3)) == null) {
                                    throw new java.lang.IllegalStateException("Fragment " + awVar3 + " declared target fragment " + awVar3.o + " that does not belong to this FragmentManager!");
                                }
                            }
                            if (btVarD != null) {
                                btVarD.e();
                            }
                            defpackage.bo boVar3 = awVar3.B;
                            awVar3.C = boVar3.n;
                            awVar3.E = boVar3.p;
                            defpackage.nf nfVar = this.e;
                            nfVar.z(awVar3);
                            java.util.ArrayList arrayList = awVar3.ah;
                            int size = arrayList.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                ((defpackage.av) arrayList.get(i14)).a();
                            }
                            arrayList.clear();
                            awVar3.D.n(awVar3.C, awVar3.d(), awVar3);
                            awVar3.g = 0;
                            awVar3.O = false;
                            defpackage.den denVar10 = awVar3.aj;
                            defpackage.den.bW(new defpackage.am(awVar3, i4));
                            if (!awVar3.O) {
                                throw new cl(defpackage.a.bg(awVar3, "Fragment ", " did not call through to super.onAttach()"));
                            }
                            java.util.Iterator it = awVar3.B.l.iterator();
                            while (it.hasNext()) {
                                ((defpackage.br) it.next()).g();
                            }
                            defpackage.bo boVar4 = awVar3.D;
                            boVar4.w = false;
                            boVar4.x = false;
                            boVar4.z.g = false;
                            boVar4.E(0);
                            nfVar.u(awVar3);
                            break;
                            break;
                        case 1:
                            if (defpackage.bo.Z(3)) {
                                java.util.Objects.toString(awVar3);
                                android.util.Log.d("FragmentManager", "moveto CREATED: ".concat(java.lang.String.valueOf(awVar3)));
                            }
                            android.os.Bundle bundle = awVar3.h;
                            android.os.Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
                            if (!awVar3.Y) {
                                defpackage.nf nfVar2 = this.e;
                                nfVar2.A(awVar3, bundle2);
                                awVar3.D.noteStateNotSaved();
                                awVar3.g = 1;
                                awVar3.O = false;
                                awVar3.ab.c(new defpackage.mm(awVar3, 1, null));
                                defpackage.den denVar11 = awVar3.aj;
                                defpackage.den.bW(new defpackage.an(awVar3, bundle2, i8));
                                awVar3.Y = true;
                                if (!awVar3.O) {
                                    throw new cl(defpackage.a.bg(awVar3, "Fragment ", " did not call through to super.onCreate()"));
                                }
                                defpackage.den.bW(new defpackage.am(awVar3, 9));
                                nfVar2.v(awVar3, bundle2);
                            } else {
                                awVar3.g = 1;
                                awVar3.as();
                            }
                            break;
                        case 2:
                            d();
                            c();
                            break;
                        case 3:
                            if (defpackage.bo.Z(3)) {
                                java.util.Objects.toString(awVar3);
                                android.util.Log.d("FragmentManager", "moveto ACTIVITY_CREATED: ".concat(java.lang.String.valueOf(awVar3)));
                            }
                            android.os.Bundle bundle3 = awVar3.h;
                            android.os.Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
                            awVar3.D.noteStateNotSaved();
                            awVar3.g = 3;
                            awVar3.O = false;
                            defpackage.an anVar = new defpackage.an(awVar3, bundle4, i4);
                            defpackage.den denVar12 = awVar3.aj;
                            defpackage.den.bW(anVar);
                            if (!awVar3.O) {
                                throw new cl(defpackage.a.bg(awVar3, "Fragment ", " did not call through to super.onActivityCreated()"));
                            }
                            if (defpackage.bo.Z(3)) {
                                java.util.Objects.toString(awVar3);
                                android.util.Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: ".concat(awVar3.toString()));
                            }
                            if (awVar3.Q != null) {
                                android.os.Bundle bundle5 = awVar3.h;
                                android.os.Bundle bundle6 = bundle5 != null ? bundle5.getBundle("savedInstanceState") : null;
                                android.util.SparseArray<android.os.Parcelable> sparseArray = awVar3.i;
                                if (sparseArray != null) {
                                    awVar3.Q.restoreHierarchyState(sparseArray);
                                    awVar3.i = null;
                                }
                                awVar3.O = false;
                                defpackage.den.bW(new defpackage.an(awVar3, bundle6, i3));
                                if (!awVar3.O) {
                                    throw new cl(defpackage.a.bg(awVar3, "Fragment ", " did not call through to super.onViewStateRestored()"));
                                }
                                if (awVar3.Q != null) {
                                    defpackage.den.bW(new defpackage.am(awVar3, 8));
                                }
                            }
                            awVar3.h = null;
                            awVar3.D.r();
                            this.e.t(awVar3, bundle4);
                            break;
                            break;
                        case 4:
                            if (awVar3.Q != null && (viewGroup3 = awVar3.P) != null) {
                                defpackage.ck ckVarBV4 = defpackage.den.bV(viewGroup3, awVar3.J());
                                int iBS = defpackage.den.bS(awVar3.Q.getVisibility());
                                if (defpackage.bo.Z(2)) {
                                    java.util.Objects.toString(awVar3);
                                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment ".concat(java.lang.String.valueOf(awVar3)));
                                }
                                ckVarBV4.i(iBS, 2, this);
                            }
                            awVar3.g = 4;
                            break;
                        case 5:
                            if (defpackage.bo.Z(3)) {
                                java.util.Objects.toString(awVar3);
                                android.util.Log.d("FragmentManager", "moveto STARTED: ".concat(java.lang.String.valueOf(awVar3)));
                            }
                            awVar3.D.noteStateNotSaved();
                            awVar3.D.ak(true);
                            awVar3.g = 5;
                            awVar3.O = false;
                            defpackage.den denVar13 = awVar3.aj;
                            defpackage.den.bW(new defpackage.am(awVar3, i3));
                            if (!awVar3.O) {
                                throw new cl(defpackage.a.bg(awVar3, "Fragment ", " did not call through to super.onStart()"));
                            }
                            defpackage.den.bW(new defpackage.am(awVar3, i2));
                            if (awVar3.Q != null) {
                                defpackage.den.bW(new defpackage.am(awVar3, i8));
                            }
                            awVar3.D.D();
                            this.e.D(awVar3);
                            break;
                            break;
                        case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                            awVar3.g = 6;
                            break;
                        case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (defpackage.bo.Z(3)) {
                                java.util.Objects.toString(awVar3);
                                android.util.Log.d("FragmentManager", "moveto RESUMED: ".concat(java.lang.String.valueOf(awVar3)));
                            }
                            defpackage.at atVar = awVar3.T;
                            android.view.View view3 = atVar == null ? null : atVar.o;
                            if (view3 != null) {
                                if (view3 != awVar3.Q) {
                                    android.view.ViewParent parent = view3.getParent();
                                    while (true) {
                                        if (parent != null) {
                                            if (parent != awVar3.Q) {
                                                parent = parent.getParent();
                                            } else {
                                                zRequestFocus = view3.requestFocus();
                                                if (defpackage.bo.Z(2)) {
                                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                    sb.append("requestFocus: Restoring focused view ");
                                                    sb.append(view3);
                                                    sb.append(' ');
                                                    sb.append(true != zRequestFocus ? "failed" : "succeeded");
                                                    sb.append(" on Fragment ");
                                                    sb.append(awVar3);
                                                    sb.append(" resulting in focused view ");
                                                    sb.append(awVar3.Q.findFocus());
                                                    android.util.Log.v("FragmentManager", sb.toString());
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    zRequestFocus = view3.requestFocus();
                                    if (defpackage.bo.Z(2)) {
                                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                        sb2.append("requestFocus: Restoring focused view ");
                                        sb2.append(view3);
                                        sb2.append(' ');
                                        sb2.append(true != zRequestFocus ? "failed" : "succeeded");
                                        sb2.append(" on Fragment ");
                                        sb2.append(awVar3);
                                        sb2.append(" resulting in focused view ");
                                        sb2.append(awVar3.Q.findFocus());
                                        android.util.Log.v("FragmentManager", sb2.toString());
                                    }
                                }
                            }
                            awVar3.ax(null);
                            awVar3.D.noteStateNotSaved();
                            awVar3.D.ak(true);
                            awVar3.g = 7;
                            awVar3.O = false;
                            defpackage.den denVar14 = awVar3.aj;
                            defpackage.den.bW(new defpackage.am(awVar3, i6));
                            if (!awVar3.O) {
                                throw new cl(defpackage.a.bg(awVar3, "Fragment ", " did not call through to super.onResume()"));
                            }
                            defpackage.den.bW(new defpackage.am(awVar3, i5));
                            if (awVar3.Q != null) {
                                defpackage.den.bW(new defpackage.am(awVar3, i12));
                            }
                            awVar3.D.C();
                            this.e.B(awVar3);
                            this.c.a(awVar3.l, null);
                            awVar3.h = null;
                            awVar3.i = null;
                            awVar3.j = null;
                            break;
                            break;
                    }
                }
                z = true;
            }
        } catch (java.lang.Throwable th) {
            this.d = false;
            throw th;
        }
    }

    final void f(java.lang.ClassLoader classLoader) {
        defpackage.aw awVar = this.a;
        android.os.Bundle bundle = awVar.h;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (awVar.h.getBundle("savedInstanceState") == null) {
                awVar.h.putBundle("savedInstanceState", new android.os.Bundle());
            }
            try {
                awVar.i = awVar.h.getSparseParcelableArray("viewState");
                defpackage.aw awVar2 = this.a;
                awVar2.j = awVar2.h.getBundle("viewRegistryState");
                android.support.v4.app.FragmentState fragmentState = (android.support.v4.app.FragmentState) awVar2.h.getParcelable("state");
                if (fragmentState != null) {
                    awVar2.o = fragmentState.m;
                    awVar2.p = fragmentState.n;
                    java.lang.Boolean bool = awVar2.k;
                    if (bool != null) {
                        awVar2.S = bool.booleanValue();
                        awVar2.k = null;
                    } else {
                        awVar2.S = fragmentState.o;
                    }
                }
                if (awVar2.S) {
                    return;
                }
                awVar2.R = true;
            } catch (android.os.BadParcelableException e) {
                defpackage.aw awVar3 = this.a;
                java.util.Objects.toString(awVar3);
                throw new java.lang.IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(java.lang.String.valueOf(awVar3)), e);
            }
        }
    }

    final void g() {
        defpackage.aw awVar = this.a;
        if (awVar.Q != null) {
            if (defpackage.bo.Z(2)) {
                android.util.Log.v("FragmentManager", "Saving view state for fragment " + awVar + " with view " + awVar.Q);
            }
            android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
            awVar.Q.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                awVar.i = sparseArray;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            awVar.ad.b.af(bundle);
            if (bundle.isEmpty()) {
                return;
            }
            awVar.j = bundle;
        }
    }

    public bt(defpackage.nf nfVar, defpackage.bu buVar, defpackage.aw awVar, android.os.Bundle bundle) {
        this.e = nfVar;
        this.c = buVar;
        this.a = awVar;
        awVar.i = null;
        awVar.j = null;
        awVar.A = 0;
        awVar.w = false;
        awVar.r = false;
        defpackage.aw awVar2 = awVar.n;
        awVar.o = awVar2 != null ? awVar2.l : null;
        awVar.n = null;
        awVar.h = bundle;
        awVar.m = bundle.getBundle("arguments");
    }

    public bt(defpackage.nf nfVar, defpackage.bu buVar, defpackage.aw awVar) {
        this.e = nfVar;
        this.c = buVar;
        this.a = awVar;
    }
}
