package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akmr {
    public static volatile anpk a;
    public static volatile anpk b;
    public static volatile anpk c;
    public static volatile anpk d;
    public static volatile anpk e;
    private static volatile anpk f;

    private akmr() {
    }

    public static final /* synthetic */ ajyi A(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new ajyi(akzxVar);
    }

    public static final /* synthetic */ xtq B(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new xtq(akzxVar);
    }

    public static final /* synthetic */ xtq C(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new xtq(akzxVar);
    }

    private static albh D(com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse internalDontUse, albh albhVar, akzq akzqVar) {
        return internalDontUse.b(albhVar.t(), akzqVar);
    }

    private static final int E(int i) {
        int iBinarySearch = java.util.Arrays.binarySearch(albv.a, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    public static anpk a() {
        anpk anpkVarA = f;
        if (anpkVarA == null) {
            synchronized (defpackage.akmr.class) {
                anpkVarA = f;
                if (anpkVarA == null) {
                    aal aalVarD = anpk.d();
                    aalVarD.b = anpj.a;
                    aalVarD.d = anpk.c("google.internal.dialer.v1.DialerCallInfoLookupService", "GetCallInfo");
                    aalVarD.b();
                    defpackage.akmy akmyVar = defpackage.akmy.a;
                    akzq akzqVar = aohd.a;
                    aalVarD.e = new aohc(akmyVar);
                    aalVarD.c = new aohc(defpackage.akmz.a);
                    anpkVarA = aalVarD.a();
                    f = anpkVarA;
                }
            }
        }
        return anpkVarA;
    }

    public static int b(int i) {
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
            case 123:
            default:
                return 0;
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
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case 80:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 86:
                return 87;
            case 87:
                return 88;
            case 88:
                return 89;
            case 89:
                return 90;
            case 90:
                return 91;
            case 91:
                return 92;
            case 92:
                return 93;
            case 93:
                return 94;
            case 94:
                return 95;
            case 95:
                return 96;
            case 96:
                return 97;
            case 97:
                return 98;
            case 98:
                return 99;
            case 99:
                return 100;
            case 100:
                return 101;
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            case 108:
                return 109;
            case 109:
                return 110;
            case 110:
                return 111;
            case 111:
                return 112;
            case 112:
                return 113;
            case 113:
                return 114;
            case 114:
                return 115;
            case 115:
                return 116;
            case 116:
                return 117;
            case 117:
                return 118;
            case 118:
                return 119;
            case 119:
                return 120;
            case 120:
                return 121;
            case 121:
                return 122;
            case 122:
                return 123;
            case 124:
                return 125;
            case 125:
                return 126;
            case 126:
                return 127;
            case 127:
                return 128;
            case 128:
                return 129;
            case 129:
                return 130;
            case 130:
                return 131;
            case 131:
                return 132;
            case 132:
                return 133;
            case 133:
                return 134;
            case 134:
                return 135;
            case 135:
                return 136;
            case 136:
                return 137;
            case 137:
                return 138;
            case 138:
                return 139;
            case 139:
                return 140;
            case 140:
                return 141;
            case 141:
                return 142;
            case 142:
                return 143;
            case 143:
                return 144;
            case 144:
                return 145;
            case 145:
                return 146;
            case 146:
                return 147;
            case 147:
                return 148;
            case 148:
                return 149;
            case 149:
                return 150;
            case 150:
                return 151;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            case 154:
                return 155;
            case 155:
                return 156;
            case 156:
                return 157;
            case 157:
                return 158;
            case 158:
                return 159;
            case 159:
                return 160;
            case 160:
                return 161;
            case 161:
                return 162;
            case 162:
                return 163;
            case 163:
                return 164;
            case 164:
                return 165;
            case 165:
                return 166;
            case 166:
                return 167;
            case 167:
                return 168;
            case 168:
                return 169;
            case 169:
                return 170;
            case 170:
                return 171;
            case 171:
                return 172;
            case 172:
                return 173;
            case 173:
                return 174;
            case 174:
                return 175;
            case 175:
                return 176;
            case 176:
                return 177;
            case 177:
                return 178;
            case 178:
                return 179;
            case 179:
                return 180;
            case 180:
                return 181;
            case 181:
                return 182;
            case 182:
                return 183;
            case 183:
                return 184;
            case 184:
                return 185;
            case 185:
                return 186;
            case 186:
                return 187;
            case 187:
                return 188;
            case 188:
                return 189;
            case 189:
                return 190;
            case 190:
                return 191;
            case 191:
                return 192;
            case 192:
                return 193;
            case 193:
                return 194;
            case 194:
                return 195;
            case 195:
                return 196;
            case 196:
                return 197;
            case 197:
                return 198;
            case 198:
                return 199;
            case 199:
                return 200;
            case 200:
                return 201;
            case 201:
                return 202;
            case 202:
                return 203;
            case 203:
                return 204;
            case 204:
                return 205;
            case 205:
                return 206;
            case 206:
                return 207;
            case 207:
                return 208;
            case 208:
                return 209;
            case 209:
                return 210;
            case 210:
                return 211;
            case 211:
                return 212;
            case 212:
                return 213;
            case 213:
                return 214;
            case 214:
                return 215;
            case 215:
                return 216;
            case 216:
                return 217;
            case 217:
                return 218;
            case 218:
                return 219;
            case 219:
                return 220;
            case 220:
                return 221;
            case 221:
                return 222;
            case 222:
                return 223;
            case 223:
                return 224;
            case 224:
                return 225;
            case 225:
                return 226;
            case 226:
                return 227;
            case 227:
                return 228;
            case 228:
                return 229;
            case 229:
                return 230;
            case 230:
                return 231;
            case 231:
                return 232;
            case 232:
                return 233;
            case 233:
                return 234;
            case 234:
                return 235;
            case 235:
                return 236;
            case 236:
                return 237;
            case 237:
                return 238;
            case 238:
                return 239;
            case 239:
                return 240;
            case 240:
                return 241;
            case 241:
                return 242;
            case 242:
                return 243;
            case 243:
                return 244;
            case 244:
                return 245;
            case 245:
                return 246;
            case 246:
                return 247;
            case 247:
                return 248;
            case 248:
                return 249;
            case 249:
                return 250;
            case 250:
                return 251;
            case 251:
                return 252;
            case 252:
                return 253;
            case 253:
                return 254;
            case 254:
                return 255;
            case 255:
                return 256;
            case 256:
                return 257;
            case 257:
                return 258;
            case 258:
                return 259;
            case 259:
                return 260;
            case 260:
                return 261;
            case 261:
                return 262;
            case 262:
                return 263;
            case 263:
                return 264;
            case 264:
                return 265;
            case 265:
                return 266;
            case 266:
                return 267;
            case 267:
                return 268;
            case 268:
                return 269;
            case 269:
                return 270;
            case 270:
                return 271;
            case 271:
                return 272;
            case 272:
                return 273;
            case 273:
                return 274;
            case 274:
                return 275;
            case 275:
                return 276;
            case 276:
                return 277;
            case 277:
                return 278;
            case 278:
                return 279;
            case 279:
                return 280;
            case 280:
                return 281;
            case 281:
                return 282;
            case 282:
                return 283;
            case 283:
                return 284;
            case 284:
                return 285;
            case 285:
                return 286;
            case 286:
                return 287;
            case 287:
                return 288;
            case 288:
                return 289;
            case 289:
                return 290;
            case 290:
                return 291;
            case 291:
                return 292;
            case 292:
                return 293;
            case 293:
                return 294;
            case 294:
                return 295;
            case 295:
                return 296;
            case 296:
                return 297;
            case 297:
                return 298;
            case 298:
                return 299;
            case 299:
                return 300;
            case 300:
                return 301;
            case 301:
                return 302;
            case 302:
                return 303;
            case 303:
                return 304;
            case 304:
                return 305;
            case 305:
                return 306;
            case 306:
                return 307;
            case 307:
                return 308;
            case 308:
                return 309;
            case 309:
                return 310;
            case 310:
                return 311;
            case 311:
                return 312;
            case 312:
                return 313;
            case 313:
                return 314;
            case 314:
                return 315;
            case 315:
                return 316;
            case 316:
                return 317;
            case 317:
                return 318;
            case 318:
                return 319;
            case 319:
                return 320;
            case 320:
                return 321;
            case 321:
                return 322;
            case 322:
                return 323;
            case 323:
                return 324;
            case 324:
                return 325;
            case 325:
                return 326;
            case 326:
                return 327;
            case 327:
                return 328;
            case 328:
                return 329;
            case 329:
                return 330;
            case 330:
                return 331;
            case 331:
                return 332;
            case 332:
                return 333;
            case 333:
                return 334;
            case 334:
                return 335;
            case 335:
                return 336;
            case 336:
                return 337;
            case 337:
                return 338;
            case 338:
                return 339;
            case 339:
                return 340;
            case 340:
                return 341;
            case 341:
                return 342;
            case 342:
                return 343;
            case 343:
                return 344;
            case 344:
                return 345;
            case 345:
                return 346;
            case 346:
                return 347;
            case 347:
                return 348;
            case 348:
                return 349;
            case 349:
                return 350;
            case 350:
                return 351;
            case 351:
                return 352;
            case 352:
                return 353;
            case 353:
                return 354;
        }
    }

    public static akww c(akxp akxpVar) {
        apdi apdiVar = akws.b;
        akxpVar.c(apdiVar);
        akzs akzsVar = ((alaa) akxpVar).n;
        alac alacVar = (alac) apdiVar.a;
        if (akzsVar.l(alacVar)) {
            akxpVar.c(apdiVar);
            java.lang.Object objJ = ((alaa) akxpVar).n.j(alacVar);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            return (akww) objJ;
        }
        apdi apdiVar2 = akwt.b;
        akxpVar.c(apdiVar2);
        akzs akzsVar2 = ((alaa) akxpVar).n;
        alac alacVar2 = (alac) apdiVar2.a;
        if (!akzsVar2.l(alacVar2)) {
            throw new java.lang.IllegalArgumentException("Malformed pToken: pToken version is not recognized.");
        }
        akzx akzxVarM = akww.a.m();
        akzx akzxVarM2 = defpackage.akwv.a.m();
        akxpVar.c(apdiVar2);
        java.lang.Object objJ2 = ((alaa) akxpVar).n.j(alacVar2);
        if (objJ2 == null) {
            objJ2 = apdiVar2.b;
        } else {
            apdiVar2.c(objJ2);
        }
        akwu akwuVar = (akwu) objJ2;
        akzxVarM2.u();
        defpackage.akwv akwvVar = (defpackage.akwv) akzxVarM2.b;
        j$.util.Objects.requireNonNull(akwuVar);
        akwvVar.c = akwuVar;
        akwvVar.b = 1;
        akzxVarM.u();
        akww akwwVar = akzxVarM.b;
        defpackage.akwv akwvVar2 = (defpackage.akwv) akzxVarM2.p();
        j$.util.Objects.requireNonNull(akwvVar2);
        alat alatVar = akwwVar.b;
        if (!alatVar.c()) {
            akwwVar.b = alad.J(alatVar);
        }
        akwwVar.b.add(akwvVar2);
        return akzxVarM.p();
    }

    public static akxp d(akzz akzzVar) {
        akwu akwuVarP = akzzVar.p();
        akzz akzzVarM = akxp.a.m();
        akzzVarM.bV(akwt.b, akwuVarP);
        return akzzVarM.p();
    }

    public static int e(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 5 : 4;
        }
        return 3;
    }

    public static int f(int i) {
        if (i == 0) {
            return 8;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 5) {
            return 5;
        }
        if (i != 13) {
            return i != 14 ? 0 : 7;
        }
        return 6;
    }

    public static int g(int i) {
        return i == 1 ? alau.a() : i - 2;
    }

    public static /* synthetic */ long h(long j, long j2) {
        int i = ((j ^ j2) > 0L ? 1 : ((j ^ j2) == 0L ? 0 : -1)) ^ (-1);
        long j3 = j - j2;
        if ((i | (((j ^ j3) > 0L ? 1 : ((j ^ j3) == 0L ? 0 : -1)) ^ (-1))) < 0) {
            return j3;
        }
        throw new java.lang.ArithmeticException();
    }

    public static int i(akzm akzmVar, akzm akzmVar2) {
        aldf.g(akzmVar);
        aldf.g(akzmVar2);
        int iCompare = java.lang.Long.compare(akzmVar.b, akzmVar2.b);
        return iCompare == 0 ? java.lang.Integer.compare(akzmVar.c, akzmVar2.c) : iCompare;
    }

    public static final akzc j(java.lang.String str) {
        aooh.f(str, "<this>");
        akzc akzcVarW = akzc.w(str);
        aooh.e(akzcVarW, "copyFromUtf8(...)");
        return akzcVarW;
    }

    public static albh k(android.os.Parcel parcel, albh albhVar, akzq akzqVar) {
        return D((com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse) parcel.readTypedObject(com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse.CREATOR), albhVar, akzqVar);
    }

    public static albh l(android.content.Intent intent, java.lang.String str, albh albhVar, akzq akzqVar) {
        com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse internalDontUse;
        com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse parcelableExtra = intent.getParcelableExtra(str);
        if (parcelableExtra instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) parcelableExtra;
            bundle.setClassLoader(com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse.class.getClassLoader());
            internalDontUse = (com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse) bundle.getParcelable("protoparsers");
        } else {
            internalDontUse = parcelableExtra;
        }
        return D(internalDontUse, albhVar, akzqVar);
    }

    public static albh m(android.os.Bundle bundle, java.lang.String str, albh albhVar, akzq akzqVar) {
        com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse internalDontUse;
        com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse parcelable = bundle.getParcelable(str);
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle2 = (android.os.Bundle) parcelable;
            bundle2.setClassLoader(com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse.class.getClassLoader());
            internalDontUse = (com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse) bundle2.getParcelable("protoparsers");
        } else {
            internalDontUse = parcelable;
        }
        return D(internalDontUse, albhVar, akzqVar);
    }

    public static albh n(enr enrVar, java.lang.String str, albh albhVar, akzq akzqVar) {
        com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse internalDontUse;
        com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse internalDontUse2 = (android.os.Parcelable) enrVar.a(str);
        if (internalDontUse2 instanceof android.os.Bundle) {
            android.os.Bundle bundle = (android.os.Bundle) internalDontUse2;
            bundle.setClassLoader(com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse.class.getClassLoader());
            internalDontUse = (com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse) bundle.getParcelable("protoparsers");
        } else {
            internalDontUse = internalDontUse2;
        }
        return D(internalDontUse, albhVar, akzqVar);
    }

    public static albh o(android.content.Intent intent, java.lang.String str, albh albhVar, akzq akzqVar) {
        try {
            return l(intent, str, albhVar, akzqVar);
        } catch (alaz e2) {
            throw new java.lang.RuntimeException((java.lang.Throwable) e2);
        }
    }

    public static albh p(android.os.Bundle bundle, java.lang.String str, albh albhVar, akzq akzqVar) {
        try {
            return m(bundle, str, albhVar, akzqVar);
        } catch (alaz e2) {
            throw new java.lang.RuntimeException((java.lang.Throwable) e2);
        }
    }

    public static albh q(byte[] bArr, albh albhVar) {
        try {
            return albhVar.L().g(bArr).r();
        } catch (alaz e2) {
            throw new java.lang.RuntimeException((java.lang.Throwable) e2);
        }
    }

    public static java.util.List r(android.os.Bundle bundle, java.lang.String str, albh albhVar, akzq akzqVar) {
        java.util.ArrayList parcelableArrayList;
        java.lang.Object parcelable = bundle.getParcelable(str);
        if (parcelable instanceof android.os.Bundle) {
            android.os.Bundle bundle2 = (android.os.Bundle) parcelable;
            bundle2.setClassLoader(com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse.class.getClassLoader());
            parcelableArrayList = bundle2.getParcelableArrayList("protoparsers");
        } else {
            parcelableArrayList = (java.util.ArrayList) parcelable;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArrayList.size());
        java.util.Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(D((com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse) it.next(), albhVar, akzqVar));
        }
        return arrayList;
    }

    public static void s(android.os.Parcel parcel, albh albhVar) {
        parcel.writeTypedObject(new com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse((byte[]) null, albhVar), 0);
    }

    public static void t(android.content.Intent intent, java.lang.String str, albh albhVar) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("protoparsers", new com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse((byte[]) null, albhVar));
        intent.putExtra(str, bundle);
    }

    public static void u(android.os.Bundle bundle, java.lang.String str, albh albhVar) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable("protoparsers", new com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse((byte[]) null, albhVar));
        bundle.putParcelable(str, bundle2);
    }

    public static void v(android.os.Bundle bundle, java.lang.String str, java.util.List list) {
        android.os.Bundle bundle2 = new android.os.Bundle();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse((byte[]) null, (albh) it.next()));
        }
        bundle2.putParcelableArrayList("protoparsers", arrayList);
        bundle.putParcelable(str, bundle2);
    }

    public static final void w(akzc akzcVar, java.util.ArrayDeque arrayDeque) {
        if (!akzcVar.q()) {
            if (!(akzcVar instanceof albv)) {
                throw new java.lang.IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(java.lang.String.valueOf(java.lang.String.valueOf(akzcVar.getClass()))));
            }
            albv albvVar = (albv) akzcVar;
            int[] iArr = albv.a;
            w(albvVar.c, arrayDeque);
            w(albvVar.f, arrayDeque);
            return;
        }
        int iE = E(akzcVar.c());
        int iO = albv.o(iE + 1);
        if (arrayDeque.isEmpty() || ((akzc) arrayDeque.peek()).c() >= iO) {
            arrayDeque.push(akzcVar);
            return;
        }
        int iO2 = albv.o(iE);
        akzc albvVar2 = (akzc) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((akzc) arrayDeque.peek()).c() < iO2) {
            albvVar2 = new albv((akzc) arrayDeque.pop(), albvVar2);
        }
        albv albvVar3 = new albv(albvVar2, akzcVar);
        while (!arrayDeque.isEmpty()) {
            if (((akzc) arrayDeque.peek()).c() >= albv.o(E(albvVar3.b) + 1)) {
                break;
            } else {
                albvVar3 = new albv((akzc) arrayDeque.pop(), albvVar3);
            }
        }
        arrayDeque.push(albvVar3);
    }

    public static final java.lang.Object x(alab alabVar, apdi apdiVar) {
        aooh.f(alabVar, "<this>");
        aooh.f(apdiVar, "extension");
        java.lang.Object objBT = alabVar.bT(apdiVar);
        aooh.e(objBT, "getExtension(...)");
        return objBT;
    }

    public static final boolean y(alab alabVar, apdi apdiVar) {
        aooh.f(alabVar, "<this>");
        aooh.f(apdiVar, "extension");
        return alabVar.bU(apdiVar);
    }

    public static final /* synthetic */ ajyi z(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new ajyi(akzxVar);
    }
}
