package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class airh {
    private airh() {
    }

    public static /* synthetic */ uzx A(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static /* synthetic */ uzx B(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static /* synthetic */ vaa C(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static /* synthetic */ zoe D(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new zoe(akzxVar);
    }

    public static /* synthetic */ zoe E(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new zoe(akzxVar);
    }

    public static /* synthetic */ vaa F(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static /* synthetic */ vaa G(akzz akzzVar) {
        aooh.f(akzzVar, "builder");
        return new vaa(akzzVar);
    }

    public static /* synthetic */ zoe H(akzz akzzVar) {
        aooh.f(akzzVar, "builder");
        return new zoe(akzzVar);
    }

    public static /* synthetic */ ajyi I(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new ajyi(akzxVar);
    }

    public static /* synthetic */ ajyi J(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new ajyi(akzxVar);
    }

    private static aify K(java.util.List list, int i) {
        return (aify) j$.util.Collection.-EL.stream(list).map(new exw(i, 8)).collect(aido.a);
    }

    public static void a(java.lang.String str, java.lang.Object... objArr) {
        java.lang.System.err.println(defpackage.airh.class.toString() + ": " + java.lang.String.format(str, objArr));
    }

    public static j$.util.stream.Stream b(java.util.function.Supplier supplier) {
        return j$.util.stream.StreamSupport.stream(new defpackage.aiss(supplier), false);
    }

    public static java.lang.Object c(java.util.Deque deque) {
        java.util.Iterator it = (java.util.Iterator) deque.getFirst();
        if (!it.hasNext()) {
            deque.removeFirst();
            return null;
        }
        java.lang.Object next = it.next();
        ahvr.ci(next);
        return next;
    }

    @java.lang.SafeVarargs
    public static j$.util.stream.Stream d(j$.util.stream.Stream... streamArr) {
        aift aiftVar = new aift(3);
        boolean zIsParallel = false;
        long jAi = 0;
        int iCharacteristics = 336;
        for (int i = 0; i < 3; i++) {
            j$.util.stream.Stream stream = streamArr[i];
            zIsParallel |= stream.isParallel();
            j$.util.Spliterator spliterator = stream.spliterator();
            aiftVar.i(spliterator);
            iCharacteristics &= spliterator.characteristics();
            jAi = aiql.ai(jAi, spliterator.estimateSize());
        }
        j$.util.Spliterator spliterator2 = j$.util.Spliterators.spliterator(aiftVar.h(), 1296);
        ailg ailgVar = new ailg(0);
        ahvr.bN(true, "flatMap does not support SORTED characteristic");
        ahvr.ci(spliterator2);
        return j$.util.stream.StreamSupport.stream(new defpackage.aidq(null, spliterator2, ailgVar, iCharacteristics, jAi), zIsParallel).onClose(new ahts(streamArr, 4));
    }

    public static boolean e(java.util.Comparator comparator, java.lang.Iterable iterable) {
        aiju aijuVarComparator;
        ahvr.ci(comparator);
        ahvr.ci(iterable);
        if (iterable instanceof java.util.SortedSet) {
            aijuVarComparator = ((java.util.SortedSet) iterable).comparator();
            if (aijuVarComparator == null) {
                aijuVarComparator = aiju.a;
            }
        } else {
            if (!(iterable instanceof ailf)) {
                return false;
            }
            aijuVarComparator = ((ailf) iterable).comparator();
        }
        return comparator.equals(aijuVarComparator);
    }

    public static void f(aije aijeVar, java.io.ObjectInputStream objectInputStream, int i) throws java.io.IOException {
        for (int i2 = 0; i2 < i; i2++) {
            java.util.Collection collectionC = aijeVar.c(objectInputStream.readObject());
            int i3 = objectInputStream.readInt();
            for (int i4 = 0; i4 < i3; i4++) {
                collectionC.add(objectInputStream.readObject());
            }
        }
    }

    public static void g(aije aijeVar, java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.writeInt(aijeVar.o().size());
        for (java.util.Map.Entry entry : aijeVar.o().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((java.util.Collection) entry.getValue()).size());
            java.util.Iterator it = ((java.util.Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static boolean h(aijo aijoVar, java.lang.Object obj) {
        if (obj == aijoVar) {
            return true;
        }
        if (obj instanceof aijo) {
            aijo aijoVar2 = (aijo) obj;
            if (aijoVar.size() == aijoVar2.size() && aijoVar.j().size() == aijoVar2.j().size()) {
                for (defpackage.aijp aijpVar : aijoVar2.j()) {
                    if (aijoVar.b(aijpVar.a) != aijpVar.a()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static int i(int i) {
        return i == 1 ? alau.a() : i - 2;
    }

    public static int j(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        switch (i) {
            case 100:
                return 102;
            case androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return 103;
            case 102:
                return 104;
            case 103:
                return 105;
            case 104:
                return 106;
            case 105:
                return 107;
            case 106:
                return 108;
            case 107:
                return 109;
            case 108:
                return 110;
            case 109:
                return 111;
            case 110:
                return 112;
            case 111:
                return 113;
            default:
                switch (i) {
                    case 200:
                        return 202;
                    case 300:
                        return 302;
                    case 301:
                        return 303;
                    case 302:
                        return 304;
                    case 303:
                        return 305;
                    case 304:
                        return 306;
                    case 305:
                        return 307;
                    case 306:
                        return 308;
                    case 307:
                        return 309;
                    case 308:
                        return 310;
                    case 309:
                        return 311;
                    case 310:
                        return 312;
                    case 311:
                        return 313;
                    case 312:
                        return 314;
                    case 313:
                        return 315;
                    case 314:
                        return 316;
                    case 315:
                        return 317;
                    case 316:
                        return 318;
                    case 317:
                        return 319;
                    case 318:
                        return 320;
                    case 319:
                        return 321;
                    case 320:
                        return 322;
                    case 321:
                        return 323;
                    case 322:
                        return 324;
                    case 323:
                        return 325;
                    case 324:
                        return 326;
                    case 325:
                        return 327;
                    case 326:
                        return 328;
                    case 327:
                        return 329;
                    case 328:
                        return 330;
                    case 329:
                        return 331;
                    case 330:
                        return 332;
                    case 331:
                        return 333;
                    case 350:
                        return 352;
                    default:
                        switch (i) {
                            case 400:
                                return 402;
                            case 401:
                                return 403;
                            case 402:
                                return 404;
                            case 403:
                                return 405;
                            case 404:
                                return 406;
                            default:
                                switch (i) {
                                    case 500:
                                        return 502;
                                    case 501:
                                        return 503;
                                    case 502:
                                        return 504;
                                    case 503:
                                        return 505;
                                    case 504:
                                        return 506;
                                    case 505:
                                        return 507;
                                    case 506:
                                        return 508;
                                    default:
                                        switch (i) {
                                            case 1000:
                                                return 1002;
                                            case 1001:
                                                return 1003;
                                            case 1002:
                                                return 1004;
                                            case 1003:
                                                return 1005;
                                            case 1004:
                                                return 1006;
                                            case 1005:
                                                return 1007;
                                            case 1006:
                                                return 1008;
                                            case 1007:
                                                return 1009;
                                            case 1008:
                                                return 1010;
                                            case 1009:
                                                return 1011;
                                            case 1010:
                                                return 1012;
                                            case 1011:
                                                return 1013;
                                            default:
                                                switch (i) {
                                                    case 2000:
                                                        return 2002;
                                                    case 2001:
                                                        return 2003;
                                                    case 2002:
                                                        return 2004;
                                                    case 2003:
                                                        return 2005;
                                                    case 2004:
                                                        return 2006;
                                                    case 2005:
                                                        return 2007;
                                                    case 2006:
                                                        return 2008;
                                                    case 2007:
                                                        return 2009;
                                                    case 2008:
                                                        return 2010;
                                                    case 2009:
                                                        return 2011;
                                                    case 2010:
                                                        return 2012;
                                                    case 2011:
                                                        return 2013;
                                                    case 2012:
                                                        return 2014;
                                                    case 2013:
                                                        return 2015;
                                                    case 2014:
                                                        return 2016;
                                                    default:
                                                        switch (i) {
                                                            case 3000:
                                                                return 3002;
                                                            case 3001:
                                                                return 3003;
                                                            case 3002:
                                                                return 3004;
                                                            case 3003:
                                                                return 3005;
                                                            case 3004:
                                                                return 3006;
                                                            default:
                                                                switch (i) {
                                                                    case 4000:
                                                                        return 4002;
                                                                    case 4001:
                                                                        return 4003;
                                                                    case 4002:
                                                                        return 4004;
                                                                    case 4003:
                                                                        return 4005;
                                                                    case 4004:
                                                                        return 4006;
                                                                    case 4005:
                                                                        return 4007;
                                                                    default:
                                                                        switch (i) {
                                                                            case 4100:
                                                                                return 4102;
                                                                            case 4101:
                                                                                return 4103;
                                                                            case 4102:
                                                                                return 4104;
                                                                            case 4103:
                                                                                return 4105;
                                                                            case 4104:
                                                                                return 4106;
                                                                            case 4105:
                                                                                return 4107;
                                                                            case 4106:
                                                                                return 4108;
                                                                            default:
                                                                                return 0;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static int k(int i) {
        return i == 1 ? alau.a() : i - 2;
    }

    public static /* synthetic */ int l(java.lang.Object obj) {
        j$.util.Objects.checkIndex(0, 3);
        if (obj == null) {
            return -1;
        }
        if (obj instanceof defpackage.aium) {
            return 0;
        }
        return obj instanceof aiur ? 1 : -2;
    }

    public static boolean m(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2 && i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new java.lang.RuntimeException(null, null);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ java.lang.String n(java.lang.CharSequence charSequence, java.lang.CharSequence[] charSequenceArr) {
        if (charSequence == null) {
            throw new java.lang.NullPointerException("delimiter");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(charSequenceArr[0]);
        for (int i = 1; i < charSequenceArr.length; i++) {
            sb.append(charSequence);
            sb.append(charSequenceArr[i]);
        }
        return sb.toString();
    }

    public static /* synthetic */ java.util.Map.Entry o(java.lang.Object obj, java.lang.Object obj2) {
        return new java.util.AbstractMap.SimpleImmutableEntry(j$.util.Objects.requireNonNull(obj), j$.util.Objects.requireNonNull(obj2));
    }

    public static /* synthetic */ boolean p(java.lang.Object obj) {
        int i = alza.h;
        alsy alsyVarB = alsy.b(((alxf) obj).f);
        if (alsyVarB == null) {
            alsyVarB = alsy.a;
        }
        return !alsyVarB.equals(alsy.h);
    }

    public static int q(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 4 ? 0 : 5;
        }
        return 3;
    }

    public static int r(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static alxe s(defpackage.alwo alwoVar) {
        aooh.f(alwoVar, "<this>");
        if (alwoVar.aU()) {
            return alwoVar.aT();
        }
        return null;
    }

    public static alxd t(alwa alwaVar) {
        alvz alvzVar = (alvz) alwaVar;
        if ((alvzVar.b & 1) == 0) {
            return null;
        }
        alxd alxdVar = alvzVar.c;
        return alxdVar == null ? alxd.a : alxdVar;
    }

    public static alwf u(alwf alwfVar) {
        if (alwfVar.c.isEmpty()) {
            return alwfVar;
        }
        aify aifyVarK = K(alwfVar.d, 1);
        akzx akzxVarP = alwfVar.p();
        java.lang.String str = "\"" + alwfVar.c + '\"';
        akzxVarP.u();
        alwf alwfVar2 = akzxVarP.b;
        j$.util.Objects.requireNonNull(str);
        alwfVar2.b |= 1;
        alwfVar2.c = str;
        akzxVarP.u();
        akzxVarP.b.d = albq.a;
        akzxVarP.aR(aifyVarK);
        return akzxVarP.p();
    }

    public static alwf v(aify aifyVar, java.lang.String str) {
        java.lang.String str2 = (java.lang.String) j$.util.Collection.-EL.stream(aifyVar).map(new alpp(7)).collect(j$.util.stream.Collectors.joining(str));
        akzx akzxVarM = alwf.a.m();
        akzxVarM.u();
        alwf alwfVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        alwfVar.b |= 1;
        alwfVar.c = str2;
        int size = aifyVar.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            int length2 = str.length();
            alwf alwfVar2 = (alwf) aifyVar.get(i);
            akzxVarM.aR(K(alwfVar2.d, length));
            length += alwfVar2.c.length() + length2;
        }
        return akzxVarM.p();
    }

    public static alwf w(alwf alwfVar) {
        aify aifyVar = (aify) j$.util.Collection.-EL.stream(alwfVar.d).filter(new altw(4)).collect(aido.a);
        akzx akzxVarM = alwf.a.m();
        java.lang.String str = alwfVar.c;
        java.lang.String strSubstring = str.substring(0, java.lang.Math.min(str.length(), 250));
        akzxVarM.u();
        alwf alwfVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(strSubstring);
        alwfVar2.b |= 1;
        alwfVar2.c = strSubstring;
        akzxVarM.aR(aifyVar);
        return akzxVarM.p();
    }

    public static alwf x(aify aifyVar) {
        alwf alwfVarW = w(v(aifyVar, "... "));
        if (alwfVarW.c.isEmpty()) {
            return alwfVarW;
        }
        java.lang.String upperCase = alwfVarW.c.substring(0, 1).toUpperCase(java.util.Locale.getDefault());
        java.lang.String strSubstring = alwfVarW.c.substring(1);
        java.lang.String strValueOf = java.lang.String.valueOf(upperCase);
        java.lang.String strValueOf2 = java.lang.String.valueOf(strSubstring);
        akzx akzxVarP = alwfVarW.p();
        akzxVarP.u();
        alwf alwfVar = akzxVarP.b;
        java.lang.String strConcat = strValueOf.concat(strValueOf2);
        j$.util.Objects.requireNonNull(strConcat);
        alwfVar.b |= 1;
        alwfVar.c = strConcat;
        return akzxVarP.p();
    }

    public static /* synthetic */ uzx y(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static /* synthetic */ uzx z(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public airh(byte[] bArr) {
    }
}
