package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akky {
    public static volatile defpackage.anpk a;

    private akky() {
    }

    static int A(defpackage.ammz ammzVar, int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5 = i - 1;
        if (i5 == 0) {
            int i6 = ammzVar.d;
            int i7 = ammzVar.f;
            int i8 = (i2 << 10) + (i2 << 6) + i2;
            int i9 = (i6 << 5) + i8 + i6;
            int i10 = iArr[i9 + i7];
            int i11 = ammzVar.e;
            int i12 = i10 - iArr[i9 + i11];
            int i13 = ammzVar.c;
            int i14 = i8 + (i13 << 5) + i13;
            i3 = i12 - iArr[i7 + i14];
            i4 = iArr[i14 + i11];
        } else if (i5 != 1) {
            int i15 = ammzVar.b;
            int i16 = ammzVar.d;
            int i17 = i16 << 5;
            int i18 = (i15 << 10) + (i15 << 6) + i15;
            int i19 = iArr[i18 + i17 + i16 + i2];
            int i20 = ammzVar.c;
            int i21 = i20 << 5;
            int i22 = i19 - iArr[((i18 + i21) + i20) + i2];
            int i23 = ammzVar.a;
            int i24 = (i23 << 10) + (i23 << 6) + i23;
            i3 = i22 - iArr[((i17 + i24) + i16) + i2];
            i4 = iArr[i24 + i21 + i20 + i2];
        } else {
            int i25 = ammzVar.b;
            int i26 = ammzVar.f;
            int i27 = i2 << 5;
            int i28 = (i25 << 10) + (i25 << 6) + i25 + i27 + i2;
            int i29 = iArr[i28 + i26];
            int i30 = ammzVar.e;
            int i31 = i29 - iArr[i28 + i30];
            int i32 = ammzVar.a;
            int i33 = (i32 << 10) + (i32 << 6) + i32 + i27 + i2;
            i3 = i31 - iArr[i26 + i33];
            i4 = iArr[i33 + i30];
        }
        return i3 + i4;
    }

    public static final defpackage.amna B(defpackage.ammz ammzVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        defpackage.ammz ammzVar2 = ammzVar;
        int i8 = i;
        int[] iArr5 = iArr;
        int[] iArr6 = iArr2;
        int iZ = z(ammzVar2, i8, iArr6);
        int iZ2 = z(ammzVar2, i8, iArr3);
        int iZ3 = z(ammzVar2, i8, iArr4);
        int iZ4 = z(ammzVar2, i8, iArr5);
        double d = 0.0d;
        int i9 = -1;
        int i10 = i2;
        while (i10 < i3) {
            int iA = A(ammzVar2, i8, i10, iArr6) + iZ;
            int iA2 = iZ2 + A(ammzVar2, i8, i10, iArr3);
            int iA3 = iZ3 + A(ammzVar2, i8, i10, iArr4);
            int iA4 = iZ4 + A(ammzVar2, i8, i10, iArr5);
            if (iA4 != 0) {
                int i11 = iA * iA;
                int i12 = iA2 * iA2;
                int i13 = iA3 * iA3;
                int i14 = i4 - iA;
                int i15 = i5 - iA2;
                int i16 = i6 - iA3;
                int i17 = i7 - iA4;
                if (i17 != 0) {
                    double d2 = (((double) ((i11 + i12) + i13)) / ((double) iA4)) + (((double) (((i14 * i14) + (i15 * i15)) + (i16 * i16))) / ((double) i17));
                    if (d2 > d) {
                        d = d2;
                        i9 = i10;
                    }
                }
            }
            i10++;
            ammzVar2 = ammzVar;
            i8 = i;
            iArr5 = iArr;
            iArr6 = iArr2;
        }
        return new defpackage.amna(i9, d);
    }

    public static final double C(defpackage.ammz ammzVar, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double[] dArr) {
        int iY = y(ammzVar, iArr2);
        int iY2 = y(ammzVar, iArr3);
        int iY3 = y(ammzVar, iArr4);
        int i = ammzVar.b;
        int i2 = (i << 10) + (i << 6) + i;
        int i3 = ammzVar.d;
        int i4 = i3 << 5;
        int i5 = i2 + i4 + i3;
        int i6 = ammzVar.f;
        double d = dArr[i5 + i6];
        int i7 = ammzVar.e;
        double d2 = d - dArr[i5 + i7];
        int i8 = ammzVar.c;
        int i9 = i8 << 5;
        int i10 = i2 + i9 + i8;
        double d3 = (d2 - dArr[i10 + i6]) + dArr[i10 + i7];
        int i11 = ammzVar.a;
        int i12 = (i11 << 10) + (i11 << 6) + i11;
        int i13 = i4 + i12 + i3;
        int i14 = i12 + i9 + i8;
        return ((((d3 - dArr[i13 + i6]) + dArr[i13 + i7]) + dArr[i6 + i14]) - dArr[i14 + i7]) - (((double) (((iY * iY) + (iY2 * iY2)) + (iY3 * iY3))) / ((double) y(ammzVar, iArr)));
    }

    public static final double D(double[] dArr, double[] dArr2) {
        double d = dArr[0] - dArr2[0];
        double d2 = dArr[1] - dArr2[1];
        double d3 = dArr[2] - dArr2[2];
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    public static final double[] E(int i) {
        double dB = amnb.b((i >> 16) & 255);
        double dB2 = amnb.b((i >> 8) & 255);
        double dB3 = amnb.b(i & 255);
        double[][] dArr = amnb.a;
        double[] dArr2 = dArr[0];
        double d = dArr2[0] * dB;
        double d2 = dArr2[1] * dB2;
        double d3 = dArr2[2] * dB3;
        double[] dArr3 = dArr[1];
        double d4 = dArr3[0] * dB;
        double d5 = dArr3[1] * dB2;
        double d6 = dArr3[2] * dB3;
        double[] dArr4 = dArr[2];
        double d7 = dArr4[0] * dB;
        double d8 = dArr4[1] * dB2;
        double d9 = dArr4[2] * dB3;
        double[] dArr5 = amnb.c;
        double d10 = ((d + d2) + d3) / dArr5[0];
        double d11 = ((d4 + d5) + d6) / dArr5[1];
        double d12 = ((d7 + d8) + d9) / dArr5[2];
        double dA = amnb.a(d10);
        double dA2 = amnb.a(d11);
        double[] dArr6 = {(116.0d * dA2) - 16.0d, (dA - dA2) * 500.0d, (dA2 - amnb.a(d12)) * 200.0d};
        return new double[]{dArr6[0], dArr6[1], dArr6[2]};
    }

    public static final /* synthetic */ defpackage.ajyi F(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ajyi(akzxVar);
    }

    public static final /* synthetic */ defpackage.ajyi G(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ajyi(akzxVar);
    }

    public static final /* synthetic */ defpackage.ajyi H(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ajyi(akzxVar);
    }

    public static final /* synthetic */ defpackage.ajyi I(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ajyi(akzxVar);
    }

    public static final /* synthetic */ vqu J(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static final /* synthetic */ vqu K(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static final /* synthetic */ vqu L(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static final /* synthetic */ vqu M(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static final /* synthetic */ vqu N(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static final /* synthetic */ vqu O(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static final /* synthetic */ vaa P(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static final /* synthetic */ vaa Q(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static int a(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 1;
        }
        if (i != 8) {
            return i != 9 ? 0 : 3;
        }
        return 2;
    }

    public static int b(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 3;
        }
        return 2;
    }

    public static int c(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 7:
            default:
                return 0;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 8:
                return 9;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return 10;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return 11;
        }
    }

    public static int d(int i) {
        return i == 1 ? alau.a() : i - 2;
    }

    public static int e(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return 10;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return 11;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
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
            case 108:
            case 279:
            case 317:
            case 373:
            case 413:
            case 423:
            case 425:
            case 462:
            case 533:
            case 534:
            case 544:
            case 545:
            case 577:
            case 614:
            case 625:
            case 630:
            case 642:
            case 704:
            case 706:
            case 756:
            case 757:
            case 758:
            case 798:
            case 839:
            default:
                return 0;
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
            case 123:
                return 124;
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
            case 354:
                return 355;
            case 355:
                return 356;
            case 356:
                return 357;
            case 357:
                return 358;
            case 358:
                return 359;
            case 359:
                return 360;
            case 360:
                return 361;
            case 361:
                return 362;
            case 362:
                return 363;
            case 363:
                return 364;
            case 364:
                return 365;
            case 365:
                return 366;
            case 366:
                return 367;
            case 367:
                return 368;
            case 368:
                return 369;
            case 369:
                return 370;
            case 370:
                return 371;
            case 371:
                return 372;
            case 372:
                return 373;
            case 374:
                return 375;
            case 375:
                return 376;
            case 376:
                return 377;
            case 377:
                return 378;
            case 378:
                return 379;
            case 379:
                return 380;
            case 380:
                return 381;
            case 381:
                return 382;
            case 382:
                return 383;
            case 383:
                return 384;
            case 384:
                return 385;
            case 385:
                return 386;
            case 386:
                return 387;
            case 387:
                return 388;
            case 388:
                return 389;
            case 389:
                return 390;
            case 390:
                return 391;
            case 391:
                return 392;
            case 392:
                return 393;
            case 393:
                return 394;
            case 394:
                return 395;
            case 395:
                return 396;
            case 396:
                return 397;
            case 397:
                return 398;
            case 398:
                return 399;
            case 399:
                return 400;
            case 400:
                return 401;
            case 401:
                return 402;
            case 402:
                return 403;
            case 403:
                return 404;
            case 404:
                return 405;
            case 405:
                return 406;
            case 406:
                return 407;
            case 407:
                return 408;
            case 408:
                return 409;
            case 409:
                return 410;
            case 410:
                return 411;
            case 411:
                return 412;
            case 412:
                return 413;
            case 414:
                return 415;
            case 415:
                return 416;
            case 416:
                return 417;
            case 417:
                return 418;
            case 418:
                return 419;
            case 419:
                return 420;
            case 420:
                return 421;
            case 421:
                return 422;
            case 422:
                return 423;
            case 424:
                return 425;
            case 426:
                return 427;
            case 427:
                return 428;
            case 428:
                return 429;
            case 429:
                return 430;
            case 430:
                return 431;
            case 431:
                return 432;
            case 432:
                return 433;
            case 433:
                return 434;
            case 434:
                return 435;
            case 435:
                return 436;
            case 436:
                return 437;
            case 437:
                return 438;
            case 438:
                return 439;
            case 439:
                return 440;
            case 440:
                return 441;
            case 441:
                return 442;
            case 442:
                return 443;
            case 443:
                return 444;
            case 444:
                return 445;
            case 445:
                return 446;
            case 446:
                return 447;
            case 447:
                return 448;
            case 448:
                return 449;
            case 449:
                return 450;
            case 450:
                return 451;
            case 451:
                return 452;
            case 452:
                return 453;
            case 453:
                return 454;
            case 454:
                return 455;
            case 455:
                return 456;
            case 456:
                return 457;
            case 457:
                return 458;
            case 458:
                return 459;
            case 459:
                return 460;
            case 460:
                return 461;
            case 461:
                return 462;
            case 463:
                return 464;
            case 464:
                return 465;
            case 465:
                return 466;
            case 466:
                return 467;
            case 467:
                return 468;
            case 468:
                return 469;
            case 469:
                return 470;
            case 470:
                return 471;
            case 471:
                return 472;
            case 472:
                return 473;
            case 473:
                return 474;
            case 474:
                return 475;
            case 475:
                return 476;
            case 476:
                return 477;
            case 477:
                return 478;
            case 478:
                return 479;
            case 479:
                return 480;
            case 480:
                return 481;
            case 481:
                return 482;
            case 482:
                return 483;
            case 483:
                return 484;
            case 484:
                return 485;
            case 485:
                return 486;
            case 486:
                return 487;
            case 487:
                return 488;
            case 488:
                return 489;
            case 489:
                return 490;
            case 490:
                return 491;
            case 491:
                return 492;
            case 492:
                return 493;
            case 493:
                return 494;
            case 494:
                return 495;
            case 495:
                return 496;
            case 496:
                return 497;
            case 497:
                return 498;
            case 498:
                return 499;
            case 499:
                return 500;
            case 500:
                return 501;
            case 501:
                return 502;
            case 502:
                return 503;
            case 503:
                return 504;
            case 504:
                return 505;
            case 505:
                return 506;
            case 506:
                return 507;
            case 507:
                return 508;
            case 508:
                return 509;
            case 509:
                return 510;
            case 510:
                return 511;
            case 511:
                return 512;
            case 512:
                return 513;
            case 513:
                return 514;
            case 514:
                return 515;
            case 515:
                return 516;
            case 516:
                return 517;
            case 517:
                return 518;
            case 518:
                return 519;
            case 519:
                return 520;
            case 520:
                return 521;
            case 521:
                return 522;
            case 522:
                return 523;
            case 523:
                return 524;
            case 524:
                return 525;
            case 525:
                return 526;
            case 526:
                return 527;
            case 527:
                return 528;
            case 528:
                return 529;
            case 529:
                return 530;
            case 530:
                return 531;
            case 531:
                return 532;
            case 532:
                return 533;
            case 535:
                return 536;
            case 536:
                return 537;
            case 537:
                return 538;
            case 538:
                return 539;
            case 539:
                return 540;
            case 540:
                return 541;
            case 541:
                return 542;
            case 542:
                return 543;
            case 543:
                return 544;
            case 546:
                return 547;
            case 547:
                return 548;
            case 548:
                return 549;
            case 549:
                return 550;
            case 550:
                return 551;
            case 551:
                return 552;
            case 552:
                return 553;
            case 553:
                return 554;
            case 554:
                return 555;
            case 555:
                return 556;
            case 556:
                return 557;
            case 557:
                return 558;
            case 558:
                return 559;
            case 559:
                return 560;
            case 560:
                return 561;
            case 561:
                return 562;
            case 562:
                return 563;
            case 563:
                return 564;
            case 564:
                return 565;
            case 565:
                return 566;
            case 566:
                return 567;
            case 567:
                return 568;
            case 568:
                return 569;
            case 569:
                return 570;
            case 570:
                return 571;
            case 571:
                return 572;
            case 572:
                return 573;
            case 573:
                return 574;
            case 574:
                return 575;
            case 575:
                return 576;
            case 576:
                return 577;
            case 578:
                return 579;
            case 579:
                return 580;
            case 580:
                return 581;
            case 581:
                return 582;
            case 582:
                return 583;
            case 583:
                return 584;
            case 584:
                return 585;
            case 585:
                return 586;
            case 586:
                return 587;
            case 587:
                return 588;
            case 588:
                return 589;
            case 589:
                return 590;
            case 590:
                return 591;
            case 591:
                return 592;
            case 592:
                return 593;
            case 593:
                return 594;
            case 594:
                return 595;
            case 595:
                return 596;
            case 596:
                return 597;
            case 597:
                return 598;
            case 598:
                return 599;
            case 599:
                return 600;
            case 600:
                return 601;
            case 601:
                return 602;
            case 602:
                return 603;
            case 603:
                return 604;
            case 604:
                return 605;
            case 605:
                return 606;
            case 606:
                return 607;
            case 607:
                return 608;
            case 608:
                return 609;
            case 609:
                return 610;
            case 610:
                return 611;
            case 611:
                return 612;
            case 612:
                return 613;
            case 613:
                return 614;
            case 615:
                return 616;
            case 616:
                return 617;
            case 617:
                return 618;
            case 618:
                return 619;
            case 619:
                return 620;
            case 620:
                return 621;
            case 621:
                return 622;
            case 622:
                return 623;
            case 623:
                return 624;
            case 624:
                return 625;
            case 626:
                return 627;
            case 627:
                return 628;
            case 628:
                return 629;
            case 629:
                return 630;
            case 631:
                return 632;
            case 632:
                return 633;
            case 633:
                return 634;
            case 634:
                return 635;
            case 635:
                return 636;
            case 636:
                return 637;
            case 637:
                return 638;
            case 638:
                return 639;
            case 639:
                return 640;
            case 640:
                return 641;
            case 641:
                return 642;
            case 643:
                return 644;
            case 644:
                return 645;
            case 645:
                return 646;
            case 646:
                return 647;
            case 647:
                return 648;
            case 648:
                return 649;
            case 649:
                return 650;
            case 650:
                return 651;
            case 651:
                return 652;
            case 652:
                return 653;
            case 653:
                return 654;
            case 654:
                return 655;
            case 655:
                return 656;
            case 656:
                return 657;
            case 657:
                return 658;
            case 658:
                return 659;
            case 659:
                return 660;
            case 660:
                return 661;
            case 661:
                return 662;
            case 662:
                return 663;
            case 663:
                return 664;
            case 664:
                return 665;
            case 665:
                return 666;
            case 666:
                return 667;
            case 667:
                return 668;
            case 668:
                return 669;
            case 669:
                return 670;
            case 670:
                return 671;
            case 671:
                return 672;
            case 672:
                return 673;
            case 673:
                return 674;
            case 674:
                return 675;
            case 675:
                return 676;
            case 676:
                return 677;
            case 677:
                return 678;
            case 678:
                return 679;
            case 679:
                return 680;
            case 680:
                return 681;
            case 681:
                return 682;
            case 682:
                return 683;
            case 683:
                return 684;
            case 684:
                return 685;
            case 685:
                return 686;
            case 686:
                return 687;
            case 687:
                return 688;
            case 688:
                return 689;
            case 689:
                return 690;
            case 690:
                return 691;
            case 691:
                return 692;
            case 692:
                return 693;
            case 693:
                return 694;
            case 694:
                return 695;
            case 695:
                return 696;
            case 696:
                return 697;
            case 697:
                return 698;
            case 698:
                return 699;
            case 699:
                return 700;
            case 700:
                return 701;
            case 701:
                return 702;
            case 702:
                return 703;
            case 703:
                return 704;
            case 705:
                return 706;
            case 707:
                return 708;
            case 708:
                return 709;
            case 709:
                return 710;
            case 710:
                return 711;
            case 711:
                return 712;
            case 712:
                return 713;
            case 713:
                return 714;
            case 714:
                return 715;
            case 715:
                return 716;
            case 716:
                return 717;
            case 717:
                return 718;
            case 718:
                return 719;
            case 719:
                return 720;
            case 720:
                return 721;
            case 721:
                return 722;
            case 722:
                return 723;
            case 723:
                return 724;
            case 724:
                return 725;
            case 725:
                return 726;
            case 726:
                return 727;
            case 727:
                return 728;
            case 728:
                return 729;
            case 729:
                return 730;
            case 730:
                return 731;
            case 731:
                return 732;
            case 732:
                return 733;
            case 733:
                return 734;
            case 734:
                return 735;
            case 735:
                return 736;
            case 736:
                return 737;
            case 737:
                return 738;
            case 738:
                return 739;
            case 739:
                return 740;
            case 740:
                return 741;
            case 741:
                return 742;
            case 742:
                return 743;
            case 743:
                return 744;
            case 744:
                return 745;
            case 745:
                return 746;
            case 746:
                return 747;
            case 747:
                return 748;
            case 748:
                return 749;
            case 749:
                return 750;
            case 750:
                return 751;
            case 751:
                return 752;
            case 752:
                return 753;
            case 753:
                return 754;
            case 754:
                return 755;
            case 755:
                return 756;
            case 759:
                return 760;
            case 760:
                return 761;
            case 761:
                return 762;
            case 762:
                return 763;
            case 763:
                return 764;
            case 764:
                return 765;
            case 765:
                return 766;
            case 766:
                return 767;
            case 767:
                return 768;
            case 768:
                return 769;
            case 769:
                return 770;
            case 770:
                return 771;
            case 771:
                return 772;
            case 772:
                return 773;
            case 773:
                return 774;
            case 774:
                return 775;
            case 775:
                return 776;
            case 776:
                return 777;
            case 777:
                return 778;
            case 778:
                return 779;
            case 779:
                return 780;
            case 780:
                return 781;
            case 781:
                return 782;
            case 782:
                return 783;
            case 783:
                return 784;
            case 784:
                return 785;
            case 785:
                return 786;
            case 786:
                return 787;
            case 787:
                return 788;
            case 788:
                return 789;
            case 789:
                return 790;
            case 790:
                return 791;
            case 791:
                return 792;
            case 792:
                return 793;
            case 793:
                return 794;
            case 794:
                return 795;
            case 795:
                return 796;
            case 796:
                return 797;
            case 797:
                return 798;
            case 799:
                return 800;
            case 800:
                return 801;
            case 801:
                return 802;
            case 802:
                return 803;
            case 803:
                return 804;
            case 804:
                return 805;
            case 805:
                return 806;
            case 806:
                return 807;
            case 807:
                return 808;
            case 808:
                return 809;
            case 809:
                return 810;
            case 810:
                return 811;
            case 811:
                return 812;
            case 812:
                return 813;
            case 813:
                return 814;
            case 814:
                return 815;
            case 815:
                return 816;
            case 816:
                return 817;
            case 817:
                return 818;
            case 818:
                return 819;
            case 819:
                return 820;
            case 820:
                return 821;
            case 821:
                return 822;
            case 822:
                return 823;
            case 823:
                return 824;
            case 824:
                return 825;
            case 825:
                return 826;
            case 826:
                return 827;
            case 827:
                return 828;
            case 828:
                return 829;
            case 829:
                return 830;
            case 830:
                return 831;
            case 831:
                return 832;
            case 832:
                return 833;
            case 833:
                return 834;
            case 834:
                return 835;
            case 835:
                return 836;
            case 836:
                return 837;
            case 837:
                return 838;
            case 838:
                return 839;
            case 840:
                return 841;
            case 841:
                return 842;
            case 842:
                return 843;
            case 843:
                return 844;
            case 844:
                return 845;
            case 845:
                return 846;
            case 846:
                return 847;
            case 847:
                return 848;
            case 848:
                return 849;
            case 849:
                return 850;
            case 850:
                return 851;
            case 851:
                return 852;
            case 852:
                return 853;
            case 853:
                return 854;
            case 854:
                return 855;
            case 855:
                return 856;
            case 856:
                return 857;
            case 857:
                return 858;
            case 858:
                return 859;
            case 859:
                return 860;
            case 860:
                return 861;
            case 861:
                return 862;
            case 862:
                return 863;
            case 863:
                return 864;
            case 864:
                return 865;
            case 865:
                return 866;
            case 866:
                return 867;
            case 867:
                return 868;
            case 868:
                return 869;
            case 869:
                return 870;
            case 870:
                return 871;
            case 871:
                return 872;
            case 872:
                return 873;
            case 873:
                return 874;
            case 874:
                return 875;
        }
    }

    public static int f(int i) {
        int i2;
        int i3;
        int iG = g(i);
        if (iG != 0) {
            return iG;
        }
        if (i != 1) {
            if (i == 2) {
                i3 = 4;
            } else if (i == 3) {
                i3 = 5;
            } else if (i == 95) {
                i3 = 97;
            } else if (i != 96) {
                switch (i) {
                    case 6:
                        i3 = 8;
                        break;
                    case 45:
                        i3 = 47;
                        break;
                    case 55:
                        i3 = 57;
                        break;
                    case 65:
                        i3 = 67;
                        break;
                    case 68:
                        i3 = 70;
                        break;
                    case 69:
                        i3 = 71;
                        break;
                    case 70:
                        i3 = 72;
                        break;
                    case 71:
                        i3 = 73;
                        break;
                    case 72:
                        i3 = 74;
                        break;
                    case 73:
                        i3 = 75;
                        break;
                    case 74:
                        i3 = 76;
                        break;
                    case 75:
                        i3 = 77;
                        break;
                    case 76:
                        i3 = 78;
                        break;
                    case 77:
                        i3 = 79;
                        break;
                    case 78:
                        i3 = 80;
                        break;
                    case 79:
                        i3 = 81;
                        break;
                    case 80:
                        i3 = 82;
                        break;
                    case 81:
                        i3 = 83;
                        break;
                    case 82:
                        i3 = 84;
                        break;
                    case 83:
                        i3 = 85;
                        break;
                    case 84:
                        i3 = 86;
                        break;
                    case 85:
                        i3 = 87;
                        break;
                    case 86:
                        i3 = 88;
                        break;
                    case 87:
                        i3 = 89;
                        break;
                    case 88:
                        i3 = 90;
                        break;
                    case 126:
                        i3 = 128;
                        break;
                    case 172:
                        i3 = 174;
                        break;
                    case 179:
                        i3 = 181;
                        break;
                    case 180:
                        i3 = 182;
                        break;
                    case 181:
                        i3 = 183;
                        break;
                    case 182:
                        i3 = 184;
                        break;
                    case 183:
                        i3 = 185;
                        break;
                    case 191:
                        i3 = 193;
                        break;
                    case 198:
                        i3 = 200;
                        break;
                    case 199:
                        i3 = 201;
                        break;
                    case 200:
                        i3 = 202;
                        break;
                    case 201:
                        i3 = 203;
                        break;
                    case 204:
                        i3 = 206;
                        break;
                    case 208:
                        i3 = 210;
                        break;
                    case 209:
                        i3 = 211;
                        break;
                    case 210:
                        i3 = 212;
                        break;
                    case 211:
                        i3 = 213;
                        break;
                    case 212:
                        i3 = 214;
                        break;
                    case 213:
                        i3 = 215;
                        break;
                    case 214:
                        i3 = 216;
                        break;
                    case 215:
                        i3 = 217;
                        break;
                    case 216:
                        i3 = 218;
                        break;
                    case 217:
                        i3 = 219;
                        break;
                    case 219:
                        i3 = 221;
                        break;
                    case 232:
                        i3 = 234;
                        break;
                    case 244:
                        i3 = 246;
                        break;
                    case 245:
                        i3 = 247;
                        break;
                    case 248:
                        i3 = 250;
                        break;
                    case 249:
                        i3 = 251;
                        break;
                    case 265:
                        i3 = 267;
                        break;
                    case 276:
                        i3 = 278;
                        break;
                    case 277:
                        i3 = 279;
                        break;
                    case 278:
                        i3 = 280;
                        break;
                    case 279:
                        i3 = 281;
                        break;
                    case 280:
                        i3 = 282;
                        break;
                    case 281:
                        i3 = 283;
                        break;
                    case 282:
                        i3 = 284;
                        break;
                    case 283:
                        i3 = 285;
                        break;
                    case 290:
                        i3 = 292;
                        break;
                    case 291:
                        i3 = 293;
                        break;
                    case 292:
                        i3 = 294;
                        break;
                    case 298:
                        i3 = 300;
                        break;
                    case 308:
                        i3 = 310;
                        break;
                    case 309:
                        i3 = 311;
                        break;
                    case 310:
                        i3 = 312;
                        break;
                    case 314:
                        i3 = 316;
                        break;
                    case 315:
                        i3 = 317;
                        break;
                    case 317:
                        i3 = 319;
                        break;
                    case 325:
                        i3 = 327;
                        break;
                    case 326:
                        i3 = 328;
                        break;
                    case 329:
                        i3 = 331;
                        break;
                    case 330:
                        i3 = 332;
                        break;
                    case 331:
                        i3 = 333;
                        break;
                    case 337:
                        i3 = 339;
                        break;
                    case 338:
                        i3 = 340;
                        break;
                    case 339:
                        i3 = 341;
                        break;
                    case 340:
                        i3 = 342;
                        break;
                    case 341:
                        i3 = 343;
                        break;
                    case 342:
                        i3 = 344;
                        break;
                    case 343:
                        i3 = 345;
                        break;
                    case 347:
                        i3 = 349;
                        break;
                    case 356:
                        i3 = 358;
                        break;
                    case 360:
                        i3 = 362;
                        break;
                    case 364:
                        i3 = 366;
                        break;
                    case 389:
                        i3 = 391;
                        break;
                    case 390:
                        i3 = 392;
                        break;
                    case 391:
                        i3 = 393;
                        break;
                    case 392:
                        i3 = 394;
                        break;
                    case 394:
                        i3 = 396;
                        break;
                    case 395:
                        i3 = 397;
                        break;
                    case 396:
                        i3 = 398;
                        break;
                    case 397:
                        i3 = 399;
                        break;
                    case 404:
                        i3 = 406;
                        break;
                    case 405:
                        i3 = 407;
                        break;
                    case 406:
                        i3 = 408;
                        break;
                    case 407:
                        i3 = 409;
                        break;
                    case 408:
                        i3 = 410;
                        break;
                    case 409:
                        i3 = 411;
                        break;
                    case 410:
                        i3 = 412;
                        break;
                    case 411:
                        i3 = 413;
                        break;
                    case 412:
                        i3 = 414;
                        break;
                    case 413:
                        i3 = 415;
                        break;
                    case 424:
                        i3 = 426;
                        break;
                    case 433:
                        i3 = 435;
                        break;
                    case 439:
                        i3 = 441;
                        break;
                    case 440:
                        i3 = 442;
                        break;
                    case 442:
                        i3 = 444;
                        break;
                    case 444:
                        i3 = 446;
                        break;
                    case 446:
                        i3 = 448;
                        break;
                    case 447:
                        i3 = 449;
                        break;
                    case 461:
                        i3 = 463;
                        break;
                    case 468:
                        i3 = 470;
                        break;
                    case 469:
                        i3 = 471;
                        break;
                    case 482:
                        i3 = 484;
                        break;
                    case 488:
                        i3 = 490;
                        break;
                    case 492:
                        i3 = 494;
                        break;
                    case 502:
                        i3 = 504;
                        break;
                    case 503:
                        i3 = 505;
                        break;
                    case 507:
                        i3 = 509;
                        break;
                    case 508:
                        i3 = 510;
                        break;
                    case 510:
                        i3 = 512;
                        break;
                    case 511:
                        i3 = 513;
                        break;
                    case 512:
                        i3 = 514;
                        break;
                    case 517:
                        i3 = 519;
                        break;
                    case 518:
                        i3 = 520;
                        break;
                    case 526:
                        i3 = 528;
                        break;
                    case 527:
                        i3 = 529;
                        break;
                    case 538:
                        i3 = 540;
                        break;
                    case 539:
                        i3 = 541;
                        break;
                    case 540:
                        i3 = 542;
                        break;
                    case 541:
                        i3 = 543;
                        break;
                    case 542:
                        i3 = 544;
                        break;
                    case 543:
                        i3 = 545;
                        break;
                    case 544:
                        i3 = 546;
                        break;
                    case 546:
                        i3 = 548;
                        break;
                    case 555:
                        i3 = 557;
                        break;
                    case 563:
                        i3 = 565;
                        break;
                    case 564:
                        i3 = 566;
                        break;
                    case 565:
                        i3 = 567;
                        break;
                    case 576:
                        i3 = 578;
                        break;
                    case 577:
                        i3 = 579;
                        break;
                    case 578:
                        i3 = 580;
                        break;
                    case 595:
                        i3 = 597;
                        break;
                    case 601:
                        i3 = 603;
                        break;
                    case 602:
                        i3 = 604;
                        break;
                    case 603:
                        i3 = 605;
                        break;
                    case 604:
                        i3 = 606;
                        break;
                    case 605:
                        i3 = 607;
                        break;
                    case 614:
                        i3 = 616;
                        break;
                    case 615:
                        i3 = 617;
                        break;
                    case 616:
                        i3 = 618;
                        break;
                    case 617:
                        i3 = 619;
                        break;
                    case 618:
                        i3 = 620;
                        break;
                    case 619:
                        i3 = 621;
                        break;
                    case 620:
                        i3 = 622;
                        break;
                    case 621:
                        i3 = 623;
                        break;
                    case 622:
                        i3 = 624;
                        break;
                    case 629:
                        i3 = 631;
                        break;
                    case 637:
                        i3 = 639;
                        break;
                    case 662:
                        i3 = 664;
                        break;
                    case 663:
                        i3 = 665;
                        break;
                    case 664:
                        i3 = 666;
                        break;
                    case 667:
                        i3 = 669;
                        break;
                    case 668:
                        i3 = 670;
                        break;
                    case 669:
                        i3 = 671;
                        break;
                    case 675:
                        i3 = 677;
                        break;
                    case 680:
                        i3 = 682;
                        break;
                    case 681:
                        i3 = 683;
                        break;
                    case 682:
                        i3 = 684;
                        break;
                    case 683:
                        i3 = 685;
                        break;
                    case 693:
                        i3 = 695;
                        break;
                    case 696:
                        i3 = 698;
                        break;
                    case 697:
                        i3 = 699;
                        break;
                    case 703:
                        i3 = 705;
                        break;
                    case 705:
                        i3 = 707;
                        break;
                    case 711:
                        i3 = 713;
                        break;
                    case 732:
                        i3 = 734;
                        break;
                    case 733:
                        i3 = 735;
                        break;
                    case 734:
                        i3 = 736;
                        break;
                    case 735:
                        i3 = 737;
                        break;
                    case 736:
                        i3 = 738;
                        break;
                    case 737:
                        i3 = 739;
                        break;
                    case 738:
                        i3 = 740;
                        break;
                    case 747:
                        i3 = 749;
                        break;
                    case 748:
                        i3 = 750;
                        break;
                    case 749:
                        i3 = 751;
                        break;
                    case 757:
                        i3 = 759;
                        break;
                    case 777:
                        i3 = 779;
                        break;
                    case 778:
                        i3 = 780;
                        break;
                    case 779:
                        i3 = 781;
                        break;
                    case 782:
                        i3 = 784;
                        break;
                    case 788:
                        i3 = 790;
                        break;
                    case 789:
                        i3 = 791;
                        break;
                    case 790:
                        i3 = 792;
                        break;
                    case 793:
                        i3 = 795;
                        break;
                    case 804:
                        i3 = 806;
                        break;
                    case 812:
                        i3 = 814;
                        break;
                    case 825:
                        i3 = 827;
                        break;
                    case 826:
                        i3 = 828;
                        break;
                    case 833:
                        i3 = 835;
                        break;
                    case 834:
                        i3 = 836;
                        break;
                    case 835:
                        i3 = 837;
                        break;
                    case 836:
                        i3 = 838;
                        break;
                    case 838:
                        i3 = 840;
                        break;
                    case 848:
                        i3 = 850;
                        break;
                    case 849:
                        i3 = 851;
                        break;
                    case 850:
                        i3 = 852;
                        break;
                    case 855:
                        i3 = 857;
                        break;
                    case 856:
                        i3 = 858;
                        break;
                    case 860:
                        i3 = 862;
                        break;
                    case 861:
                        i3 = 863;
                        break;
                    case 862:
                        i3 = 864;
                        break;
                    case 863:
                        i3 = 865;
                        break;
                    case 864:
                        i3 = 866;
                        break;
                    case 865:
                        i3 = 867;
                        break;
                    case 866:
                        i3 = 868;
                        break;
                    case 912:
                        i3 = 914;
                        break;
                    case 913:
                        i3 = 915;
                        break;
                    case 914:
                        i3 = 916;
                        break;
                    case 915:
                        i3 = 917;
                        break;
                    case 920:
                        i3 = 922;
                        break;
                    case 921:
                        i3 = 923;
                        break;
                    case 922:
                        i3 = 924;
                        break;
                    case 923:
                        i3 = 925;
                        break;
                    case 924:
                        i3 = 926;
                        break;
                    case 925:
                        i3 = 927;
                        break;
                    case 934:
                        i3 = 936;
                        break;
                    case 941:
                        i3 = 943;
                        break;
                    case 942:
                        i3 = 944;
                        break;
                    case 945:
                        i3 = 947;
                        break;
                    case 946:
                        i3 = 948;
                        break;
                    case 947:
                        i3 = 949;
                        break;
                    case 948:
                        i3 = 950;
                        break;
                    case 950:
                        i3 = 952;
                        break;
                    case 951:
                        i3 = 953;
                        break;
                    case 952:
                        i3 = 954;
                        break;
                    case 967:
                        i3 = 969;
                        break;
                    case 968:
                        i3 = 970;
                        break;
                    case 970:
                        i3 = 972;
                        break;
                    case 975:
                        i3 = 977;
                        break;
                    case 977:
                        i3 = 979;
                        break;
                    case 978:
                        i3 = 980;
                        break;
                    case 979:
                        i3 = 981;
                        break;
                    case 980:
                        i3 = 982;
                        break;
                    case 981:
                        i3 = 983;
                        break;
                    case 982:
                        i3 = 984;
                        break;
                    case 983:
                        i3 = 985;
                        break;
                    case 984:
                        i3 = 986;
                        break;
                    case 985:
                        i3 = 987;
                        break;
                    case 986:
                        i3 = 988;
                        break;
                    case 987:
                        i3 = 989;
                        break;
                    case 994:
                        i3 = 996;
                        break;
                    case 997:
                        i3 = 999;
                        break;
                    case 999:
                        i3 = 1001;
                        break;
                    case 1014:
                        i3 = 1016;
                        break;
                    case 1036:
                        i3 = 1038;
                        break;
                    case 1037:
                        i3 = 1039;
                        break;
                    case 1039:
                        i3 = 1041;
                        break;
                    case 1040:
                        i3 = 1042;
                        break;
                    case 1041:
                        i3 = 1043;
                        break;
                    case 1042:
                        i3 = 1044;
                        break;
                    case 1043:
                        i3 = 1045;
                        break;
                    case 1044:
                        i3 = 1046;
                        break;
                    case 1045:
                        i3 = 1047;
                        break;
                    case 1046:
                        i3 = 1048;
                        break;
                    case 1047:
                        i3 = 1049;
                        break;
                    case 1052:
                        i3 = 1054;
                        break;
                    case 1064:
                        i3 = 1066;
                        break;
                    case 1065:
                        i3 = 1067;
                        break;
                    case 1066:
                        i3 = 1068;
                        break;
                    case 1067:
                        i3 = 1069;
                        break;
                    case 1068:
                        i3 = 1070;
                        break;
                    case 1069:
                        i3 = 1071;
                        break;
                    case 1073:
                        i3 = 1075;
                        break;
                    case 1074:
                        i3 = 1076;
                        break;
                    case 1075:
                        i3 = 1077;
                        break;
                    case 1076:
                        i3 = 1078;
                        break;
                    case 1077:
                        i3 = 1079;
                        break;
                    case 1081:
                        i3 = 1083;
                        break;
                    case 1082:
                        i3 = 1084;
                        break;
                    case 1083:
                        i3 = 1085;
                        break;
                    case 1091:
                        i3 = 1093;
                        break;
                    case 1110:
                        i3 = 1112;
                        break;
                    case 1113:
                        i3 = 1115;
                        break;
                    case 1114:
                        i3 = 1116;
                        break;
                    case 1115:
                        i3 = 1117;
                        break;
                    case 1116:
                        i3 = 1118;
                        break;
                    case 1130:
                        i3 = 1132;
                        break;
                    case 1141:
                        i3 = 1143;
                        break;
                    case 1144:
                        i3 = 1146;
                        break;
                    case 1146:
                        i3 = 1148;
                        break;
                    case 1149:
                        i3 = 1151;
                        break;
                    case 1156:
                        i3 = 1158;
                        break;
                    case 1157:
                        i3 = 1159;
                        break;
                    case 1158:
                        i3 = 1160;
                        break;
                    case 1159:
                        i3 = 1161;
                        break;
                    case 1160:
                        i3 = 1162;
                        break;
                    case 1161:
                        i3 = 1163;
                        break;
                    case 1176:
                        i3 = 1178;
                        break;
                    case 1180:
                        i3 = 1182;
                        break;
                    case 1181:
                        i3 = 1183;
                        break;
                    case 1186:
                        i3 = 1188;
                        break;
                    case 1197:
                        i3 = 1199;
                        break;
                    case 1198:
                        i3 = 1200;
                        break;
                    case 1199:
                        i3 = 1201;
                        break;
                    case 1200:
                        i3 = 1202;
                        break;
                    case 1201:
                        i3 = 1203;
                        break;
                    case 1202:
                        i3 = 1204;
                        break;
                    case 1203:
                        i3 = 1205;
                        break;
                    case 1209:
                        i3 = 1211;
                        break;
                    case 1213:
                        i3 = 1215;
                        break;
                    case 1216:
                        i3 = 1218;
                        break;
                    case 1217:
                        i3 = 1219;
                        break;
                    case 1221:
                        i3 = 1223;
                        break;
                    case 1229:
                        i3 = 1231;
                        break;
                    case 1239:
                        i3 = 1241;
                        break;
                    case 1240:
                        i3 = 1242;
                        break;
                    case 1241:
                        i3 = 1243;
                        break;
                    case 1242:
                        i3 = 1244;
                        break;
                    case 1243:
                        i3 = 1245;
                        break;
                    case 1248:
                        i3 = 1250;
                        break;
                    case 1256:
                        i3 = 1258;
                        break;
                    case 1257:
                        i3 = 1259;
                        break;
                    case 1258:
                        i3 = 1260;
                        break;
                    case 1259:
                        i3 = 1261;
                        break;
                    case 1260:
                        i3 = 1262;
                        break;
                    case 1263:
                        i3 = 1265;
                        break;
                    case 1264:
                        i3 = 1266;
                        break;
                    case 1280:
                        i3 = 1282;
                        break;
                    case 1281:
                        i3 = 1283;
                        break;
                    case 1282:
                        i3 = 1284;
                        break;
                    case 1283:
                        i3 = 1285;
                        break;
                    case 1284:
                        i3 = 1286;
                        break;
                    case 1285:
                        i3 = 1287;
                        break;
                    case 1286:
                        i3 = 1288;
                        break;
                    case 1287:
                        i3 = 1289;
                        break;
                    case 1288:
                        i3 = 1290;
                        break;
                    case 1289:
                        i3 = 1291;
                        break;
                    case 1290:
                        i3 = 1292;
                        break;
                    case 1303:
                        i3 = 1305;
                        break;
                    case 1305:
                        i3 = 1307;
                        break;
                    case 1306:
                        i3 = 1308;
                        break;
                    case 1309:
                        i3 = 1311;
                        break;
                    case 1310:
                        i3 = 1312;
                        break;
                    case 1315:
                        i3 = 1317;
                        break;
                    case 1320:
                        i3 = 1322;
                        break;
                    case 1335:
                        i3 = 1337;
                        break;
                    case 1336:
                        i3 = 1338;
                        break;
                    case 1338:
                        i3 = 1340;
                        break;
                    case 1344:
                        i3 = 1346;
                        break;
                    case 1360:
                        i3 = 1362;
                        break;
                    case 1361:
                        i3 = 1363;
                        break;
                    case 1364:
                        i3 = 1366;
                        break;
                    case 1365:
                        i3 = 1367;
                        break;
                    case 1387:
                        i3 = 1389;
                        break;
                    case 1388:
                        i3 = 1390;
                        break;
                    case 1399:
                        i3 = 1401;
                        break;
                    case 1400:
                        i3 = 1402;
                        break;
                    case 1412:
                        i3 = 1414;
                        break;
                    case 1415:
                        i3 = 1417;
                        break;
                    case 1416:
                        i3 = 1418;
                        break;
                    case 1423:
                        i3 = 1425;
                        break;
                    case 1433:
                        i3 = 1435;
                        break;
                    case 1440:
                        i3 = 1442;
                        break;
                    default:
                        switch (i) {
                            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                                i3 = 11;
                                break;
                            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                                i3 = 12;
                                break;
                            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                                i3 = 13;
                                break;
                            case 12:
                                i3 = 14;
                                break;
                            default:
                                switch (i) {
                                    case 25:
                                        i3 = 27;
                                        break;
                                    case 26:
                                        i3 = 28;
                                        break;
                                    case 27:
                                        i3 = 29;
                                        break;
                                    case 28:
                                        i3 = 30;
                                        break;
                                    case 29:
                                        i3 = 31;
                                        break;
                                    case 30:
                                        i3 = 32;
                                        break;
                                    case 31:
                                        i3 = 33;
                                        break;
                                    default:
                                        switch (i) {
                                            case 33:
                                                i3 = 35;
                                                break;
                                            case 34:
                                                i3 = 36;
                                                break;
                                            case 35:
                                                i3 = 37;
                                                break;
                                            case 36:
                                                i3 = 38;
                                                break;
                                            case 37:
                                                i3 = 39;
                                                break;
                                            case 38:
                                                i3 = 40;
                                                break;
                                            case 39:
                                                i3 = 41;
                                                break;
                                            case 40:
                                                i3 = 42;
                                                break;
                                            case 41:
                                                i3 = 43;
                                                break;
                                            default:
                                                switch (i) {
                                                    case 47:
                                                        i3 = 49;
                                                        break;
                                                    case 48:
                                                        i3 = 50;
                                                        break;
                                                    case 49:
                                                        i3 = 51;
                                                        break;
                                                    case 50:
                                                        i3 = 52;
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 119:
                                                                i3 = 121;
                                                                break;
                                                            case 120:
                                                                i3 = 122;
                                                                break;
                                                            case 121:
                                                                i3 = 123;
                                                                break;
                                                            case 122:
                                                                i3 = 124;
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 136:
                                                                        i3 = 138;
                                                                        break;
                                                                    case 137:
                                                                        i3 = 139;
                                                                        break;
                                                                    case 138:
                                                                        i3 = 140;
                                                                        break;
                                                                    case 139:
                                                                        i3 = 141;
                                                                        break;
                                                                    case 140:
                                                                        i3 = 142;
                                                                        break;
                                                                    case 141:
                                                                        i3 = 143;
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case 145:
                                                                                i3 = 147;
                                                                                break;
                                                                            case 146:
                                                                                i3 = 148;
                                                                                break;
                                                                            case 147:
                                                                                i3 = 149;
                                                                                break;
                                                                            case 148:
                                                                                i3 = 150;
                                                                                break;
                                                                            default:
                                                                                i2 = 0;
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                i3 = 98;
            }
            i2 = i3;
        } else {
            i2 = 3;
        }
        if (i2 == 0) {
            return 0;
        }
        return i2;
    }

    public static int g(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case 2:
            case 3:
            case 6:
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
            case 12:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 55:
            case 65:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 95:
            case 96:
            case 119:
            case 120:
            case 121:
            case 122:
            case 126:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 172:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 191:
            case 193:
            case 194:
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
            case 200:
            case 201:
            case 204:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 219:
            case 232:
            case 244:
            case 245:
            case 248:
            case 249:
            case 265:
            case 276:
            case 277:
            case 278:
            case 279:
            case 280:
            case 281:
            case 282:
            case 283:
            case 290:
            case 291:
            case 292:
            case 298:
            case 308:
            case 309:
            case 310:
            case 314:
            case 315:
            case 317:
            case 325:
            case 326:
            case 329:
            case 330:
            case 331:
            case 337:
            case 338:
            case 339:
            case 340:
            case 341:
            case 342:
            case 343:
            case 347:
            case 356:
            case 360:
            case 364:
            case 389:
            case 390:
            case 391:
            case 392:
            case 393:
            case 394:
            case 395:
            case 396:
            case 397:
            case 404:
            case 405:
            case 406:
            case 407:
            case 408:
            case 409:
            case 410:
            case 411:
            case 412:
            case 413:
            case 424:
            case 433:
            case 439:
            case 440:
            case 442:
            case 444:
            case 446:
            case 447:
            case 461:
            case 468:
            case 469:
            case 482:
            case 488:
            case 492:
            case 502:
            case 503:
            case 507:
            case 508:
            case 510:
            case 511:
            case 512:
            case 517:
            case 518:
            case 526:
            case 527:
            case 538:
            case 539:
            case 540:
            case 541:
            case 542:
            case 543:
            case 544:
            case 546:
            case 555:
            case 563:
            case 564:
            case 565:
            case 576:
            case 577:
            case 578:
            case 595:
            case 601:
            case 602:
            case 603:
            case 604:
            case 605:
            case 613:
            case 614:
            case 615:
            case 616:
            case 617:
            case 618:
            case 619:
            case 620:
            case 621:
            case 622:
            case 629:
            case 637:
            case 662:
            case 663:
            case 664:
            case 667:
            case 668:
            case 669:
            case 675:
            case 680:
            case 681:
            case 682:
            case 683:
            case 693:
            case 696:
            case 697:
            case 703:
            case 705:
            case 708:
            case 711:
            case 719:
            case 732:
            case 733:
            case 734:
            case 735:
            case 736:
            case 737:
            case 738:
            case 742:
            case 747:
            case 748:
            case 749:
            case 757:
            case 777:
            case 778:
            case 779:
            case 782:
            case 786:
            case 788:
            case 789:
            case 790:
            case 793:
            case 804:
            case 812:
            case 825:
            case 826:
            case 833:
            case 834:
            case 835:
            case 836:
            case 838:
            case 848:
            case 849:
            case 850:
            case 855:
            case 856:
            case 860:
            case 861:
            case 862:
            case 863:
            case 864:
            case 865:
            case 866:
            case 912:
            case 913:
            case 914:
            case 915:
            case 920:
            case 921:
            case 922:
            case 923:
            case 924:
            case 925:
            case 934:
            case 941:
            case 942:
            case 945:
            case 946:
            case 947:
            case 948:
            case 950:
            case 951:
            case 952:
            case 957:
            case 967:
            case 968:
            case 970:
            case 975:
            case 977:
            case 978:
            case 979:
            case 980:
            case 981:
            case 982:
            case 983:
            case 984:
            case 985:
            case 986:
            case 987:
            case 994:
            case 997:
            case 999:
            case 1014:
            case 1036:
            case 1037:
            case 1039:
            case 1040:
            case 1041:
            case 1042:
            case 1043:
            case 1044:
            case 1045:
            case 1046:
            case 1047:
            case 1052:
            case 1064:
            case 1065:
            case 1066:
            case 1067:
            case 1068:
            case 1069:
            case 1073:
            case 1074:
            case 1075:
            case 1076:
            case 1077:
            case 1081:
            case 1082:
            case 1083:
            case 1091:
            case 1110:
            case 1112:
            case 1113:
            case 1114:
            case 1115:
            case 1116:
            case 1130:
            case 1134:
            case 1141:
            case 1144:
            case 1146:
            case 1149:
            case 1156:
            case 1157:
            case 1158:
            case 1159:
            case 1160:
            case 1161:
            case 1176:
            case 1180:
            case 1181:
            case 1186:
            case 1197:
            case 1198:
            case 1199:
            case 1200:
            case 1201:
            case 1202:
            case 1203:
            case 1209:
            case 1213:
            case 1216:
            case 1217:
            case 1221:
            case 1229:
            case 1239:
            case 1240:
            case 1241:
            case 1242:
            case 1243:
            case 1248:
            case 1256:
            case 1257:
            case 1258:
            case 1259:
            case 1260:
            case 1263:
            case 1264:
            case 1267:
            case 1268:
            case 1269:
            case 1270:
            case 1271:
            case 1280:
            case 1281:
            case 1282:
            case 1283:
            case 1284:
            case 1285:
            case 1286:
            case 1287:
            case 1288:
            case 1289:
            case 1290:
            case 1303:
            case 1305:
            case 1306:
            case 1309:
            case 1310:
            case 1315:
            case 1320:
            case 1335:
            case 1336:
            case 1338:
            case 1344:
            case 1360:
            case 1361:
            case 1364:
            case 1365:
            case 1387:
            case 1388:
            case 1396:
            case 1397:
            case 1398:
            case 1399:
            case 1400:
            case 1412:
            case 1415:
            case 1416:
            case 1423:
            case 1433:
            case 1440:
            default:
                return 0;
            case 4:
                return 6;
            case 5:
                return 7;
            case 7:
                return 9;
            case 8:
                return 10;
            case 13:
                return 15;
            case 14:
                return 16;
            case 15:
                return 17;
            case 16:
                return 18;
            case 17:
                return 19;
            case 18:
                return 20;
            case 19:
                return 21;
            case 20:
                return 22;
            case 21:
                return 23;
            case 22:
                return 24;
            case 23:
                return 25;
            case 24:
                return 26;
            case 32:
                return 34;
            case 42:
                return 44;
            case 43:
                return 45;
            case 44:
                return 46;
            case 46:
                return 48;
            case 51:
                return 53;
            case 52:
                return 54;
            case 53:
                return 55;
            case 54:
                return 56;
            case 56:
                return 58;
            case 57:
                return 59;
            case 58:
                return 60;
            case 59:
                return 61;
            case 60:
                return 62;
            case 61:
                return 63;
            case 62:
                return 64;
            case 63:
                return 65;
            case 64:
                return 66;
            case 66:
                return 68;
            case 67:
                return 69;
            case 89:
                return 91;
            case 90:
                return 92;
            case 91:
                return 93;
            case 92:
                return 94;
            case 93:
                return 95;
            case 94:
                return 96;
            case 97:
                return 99;
            case 98:
                return 100;
            case 99:
                return 101;
            case 100:
                return 102;
            case 101:
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
            case 112:
                return 114;
            case 113:
                return 115;
            case 114:
                return 116;
            case 115:
                return 117;
            case 116:
                return 118;
            case 117:
                return 119;
            case 118:
                return 120;
            case 123:
                return 125;
            case 124:
                return 126;
            case 125:
                return 127;
            case 127:
                return 129;
            case 128:
                return 130;
            case 129:
                return 131;
            case 149:
                return 151;
            case 150:
                return 152;
            case 151:
                return 153;
            case 152:
                return 154;
            case 153:
                return 155;
            case 154:
                return 156;
            case 155:
                return 157;
            case 156:
                return 158;
            case 157:
                return 159;
            case 158:
                return 160;
            case 159:
                return 161;
            case 160:
                return 162;
            case 161:
                return 163;
            case 162:
                return 164;
            case 163:
                return 165;
            case 164:
                return 166;
            case 165:
                return 167;
            case 166:
                return 168;
            case 167:
                return 169;
            case 168:
                return 170;
            case 169:
                return 171;
            case 170:
                return 172;
            case 171:
                return 173;
            case 173:
                return 175;
            case 174:
                return 176;
            case 175:
                return 177;
            case 176:
                return 178;
            case 177:
                return 179;
            case 178:
                return 180;
            case 184:
                return 186;
            case 185:
                return 187;
            case 186:
                return 188;
            case 187:
                return 189;
            case 188:
                return 190;
            case 189:
                return 191;
            case 190:
                return 192;
            case 192:
                return 194;
            case 202:
                return 204;
            case 203:
                return 205;
            case 205:
                return 207;
            case 206:
                return 208;
            case 207:
                return 209;
            case 218:
                return 220;
            case 220:
                return 222;
            case 221:
                return 223;
            case 222:
                return 224;
            case 223:
                return 225;
            case 224:
                return 226;
            case 225:
                return 227;
            case 226:
                return 228;
            case 227:
                return 229;
            case 228:
                return 230;
            case 229:
                return 231;
            case 230:
                return 232;
            case 231:
                return 233;
            case 233:
                return 235;
            case 234:
                return 236;
            case 235:
                return 237;
            case 236:
                return 238;
            case 237:
                return 239;
            case 238:
                return 240;
            case 239:
                return 241;
            case 240:
                return 242;
            case 241:
                return 243;
            case 242:
                return 244;
            case 243:
                return 245;
            case 246:
                return 248;
            case 247:
                return 249;
            case 250:
                return 252;
            case 251:
                return 253;
            case 252:
                return 254;
            case 253:
                return 255;
            case 254:
                return 256;
            case 255:
                return 257;
            case 256:
                return 258;
            case 257:
                return 259;
            case 258:
                return 260;
            case 259:
                return 261;
            case 260:
                return 262;
            case 261:
                return 263;
            case 262:
                return 264;
            case 263:
                return 265;
            case 264:
                return 266;
            case 266:
                return 268;
            case 267:
                return 269;
            case 268:
                return 270;
            case 269:
                return 271;
            case 270:
                return 272;
            case 271:
                return 273;
            case 272:
                return 274;
            case 273:
                return 275;
            case 274:
                return 276;
            case 275:
                return 277;
            case 284:
                return 286;
            case 285:
                return 287;
            case 286:
                return 288;
            case 287:
                return 289;
            case 288:
                return 290;
            case 289:
                return 291;
            case 293:
                return 295;
            case 294:
                return 296;
            case 295:
                return 297;
            case 296:
                return 298;
            case 297:
                return 299;
            case 299:
                return 301;
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
            case 311:
                return 313;
            case 312:
                return 314;
            case 313:
                return 315;
            case 316:
                return 318;
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
            case 327:
                return 329;
            case 328:
                return 330;
            case 332:
                return 334;
            case 333:
                return 335;
            case 334:
                return 336;
            case 335:
                return 337;
            case 336:
                return 338;
            case 344:
                return 346;
            case 345:
                return 347;
            case 346:
                return 348;
            case 348:
                return 350;
            case 349:
                return 351;
            case 350:
                return 352;
            case 351:
                return 353;
            case 352:
                return 354;
            case 353:
                return 355;
            case 354:
                return 356;
            case 355:
                return 357;
            case 357:
                return 359;
            case 358:
                return 360;
            case 359:
                return 361;
            case 361:
                return 363;
            case 362:
                return 364;
            case 363:
                return 365;
            case 365:
                return 367;
            case 366:
                return 368;
            case 367:
                return 369;
            case 368:
                return 370;
            case 369:
                return 371;
            case 370:
                return 372;
            case 371:
                return 373;
            case 372:
                return 374;
            case 373:
                return 375;
            case 374:
                return 376;
            case 375:
                return 377;
            case 376:
                return 378;
            case 377:
                return 379;
            case 378:
                return 380;
            case 379:
                return 381;
            case 380:
                return 382;
            case 381:
                return 383;
            case 382:
                return 384;
            case 383:
                return 385;
            case 384:
                return 386;
            case 385:
                return 387;
            case 386:
                return 388;
            case 387:
                return 389;
            case 388:
                return 390;
            case 398:
                return 400;
            case 399:
                return 401;
            case 400:
                return 402;
            case 401:
                return 403;
            case 402:
                return 404;
            case 403:
                return 405;
            case 414:
                return 416;
            case 415:
                return 417;
            case 416:
                return 418;
            case 417:
                return 419;
            case 418:
                return 420;
            case 419:
                return 421;
            case 420:
                return 422;
            case 421:
                return 423;
            case 422:
                return 424;
            case 423:
                return 425;
            case 425:
                return 427;
            case 426:
                return 428;
            case 427:
                return 429;
            case 428:
                return 430;
            case 429:
                return 431;
            case 430:
                return 432;
            case 431:
                return 433;
            case 432:
                return 434;
            case 434:
                return 436;
            case 435:
                return 437;
            case 436:
                return 438;
            case 437:
                return 439;
            case 438:
                return 440;
            case 441:
                return 443;
            case 443:
                return 445;
            case 445:
                return 447;
            case 448:
                return 450;
            case 449:
                return 451;
            case 450:
                return 452;
            case 451:
                return 453;
            case 452:
                return 454;
            case 453:
                return 455;
            case 454:
                return 456;
            case 455:
                return 457;
            case 456:
                return 458;
            case 457:
                return 459;
            case 458:
                return 460;
            case 459:
                return 461;
            case 460:
                return 462;
            case 462:
                return 464;
            case 463:
                return 465;
            case 464:
                return 466;
            case 465:
                return 467;
            case 466:
                return 468;
            case 467:
                return 469;
            case 470:
                return 472;
            case 471:
                return 473;
            case 472:
                return 474;
            case 473:
                return 475;
            case 474:
                return 476;
            case 475:
                return 477;
            case 476:
                return 478;
            case 477:
                return 479;
            case 478:
                return 480;
            case 479:
                return 481;
            case 480:
                return 482;
            case 481:
                return 483;
            case 483:
                return 485;
            case 484:
                return 486;
            case 485:
                return 487;
            case 486:
                return 488;
            case 487:
                return 489;
            case 489:
                return 491;
            case 490:
                return 492;
            case 491:
                return 493;
            case 493:
                return 495;
            case 494:
                return 496;
            case 495:
                return 497;
            case 496:
                return 498;
            case 497:
                return 499;
            case 498:
                return 500;
            case 499:
                return 501;
            case 500:
                return 502;
            case 501:
                return 503;
            case 504:
                return 506;
            case 505:
                return 507;
            case 506:
                return 508;
            case 509:
                return 511;
            case 513:
                return 515;
            case 514:
                return 516;
            case 515:
                return 517;
            case 516:
                return 518;
            case 519:
                return 521;
            case 520:
                return 522;
            case 521:
                return 523;
            case 522:
                return 524;
            case 523:
                return 525;
            case 524:
                return 526;
            case 525:
                return 527;
            case 528:
                return 530;
            case 529:
                return 531;
            case 530:
                return 532;
            case 531:
                return 533;
            case 532:
                return 534;
            case 533:
                return 535;
            case 534:
                return 536;
            case 535:
                return 537;
            case 536:
                return 538;
            case 537:
                return 539;
            case 545:
                return 547;
            case 547:
                return 549;
            case 548:
                return 550;
            case 549:
                return 551;
            case 550:
                return 552;
            case 551:
                return 553;
            case 552:
                return 554;
            case 553:
                return 555;
            case 554:
                return 556;
            case 556:
                return 558;
            case 557:
                return 559;
            case 558:
                return 560;
            case 559:
                return 561;
            case 560:
                return 562;
            case 561:
                return 563;
            case 562:
                return 564;
            case 566:
                return 568;
            case 567:
                return 569;
            case 568:
                return 570;
            case 569:
                return 571;
            case 570:
                return 572;
            case 571:
                return 573;
            case 572:
                return 574;
            case 573:
                return 575;
            case 574:
                return 576;
            case 575:
                return 577;
            case 579:
                return 581;
            case 580:
                return 582;
            case 581:
                return 583;
            case 582:
                return 584;
            case 583:
                return 585;
            case 584:
                return 586;
            case 585:
                return 587;
            case 586:
                return 588;
            case 587:
                return 589;
            case 588:
                return 590;
            case 589:
                return 591;
            case 590:
                return 592;
            case 591:
                return 593;
            case 592:
                return 594;
            case 593:
                return 595;
            case 594:
                return 596;
            case 596:
                return 598;
            case 597:
                return 599;
            case 598:
                return 600;
            case 599:
                return 601;
            case 600:
                return 602;
            case 606:
                return 608;
            case 607:
                return 609;
            case 608:
                return 610;
            case 609:
                return 611;
            case 610:
                return 612;
            case 611:
                return 613;
            case 612:
                return 614;
            case 623:
                return 625;
            case 624:
                return 626;
            case 625:
                return 627;
            case 626:
                return 628;
            case 627:
                return 629;
            case 628:
                return 630;
            case 630:
                return 632;
            case 631:
                return 633;
            case 632:
                return 634;
            case 633:
                return 635;
            case 634:
                return 636;
            case 635:
                return 637;
            case 636:
                return 638;
            case 638:
                return 640;
            case 639:
                return 641;
            case 640:
                return 642;
            case 641:
                return 643;
            case 642:
                return 644;
            case 643:
                return 645;
            case 644:
                return 646;
            case 645:
                return 647;
            case 646:
                return 648;
            case 647:
                return 649;
            case 648:
                return 650;
            case 649:
                return 651;
            case 650:
                return 652;
            case 651:
                return 653;
            case 652:
                return 654;
            case 653:
                return 655;
            case 654:
                return 656;
            case 655:
                return 657;
            case 656:
                return 658;
            case 657:
                return 659;
            case 658:
                return 660;
            case 659:
                return 661;
            case 660:
                return 662;
            case 661:
                return 663;
            case 665:
                return 667;
            case 666:
                return 668;
            case 670:
                return 672;
            case 671:
                return 673;
            case 672:
                return 674;
            case 673:
                return 675;
            case 674:
                return 676;
            case 676:
                return 678;
            case 677:
                return 679;
            case 678:
                return 680;
            case 679:
                return 681;
            case 684:
                return 686;
            case 685:
                return 687;
            case 686:
                return 688;
            case 687:
                return 689;
            case 688:
                return 690;
            case 689:
                return 691;
            case 690:
                return 692;
            case 691:
                return 693;
            case 692:
                return 694;
            case 694:
                return 696;
            case 695:
                return 697;
            case 698:
                return 700;
            case 699:
                return 701;
            case 700:
                return 702;
            case 701:
                return 703;
            case 702:
                return 704;
            case 704:
                return 706;
            case 706:
                return 708;
            case 707:
                return 709;
            case 709:
                return 711;
            case 710:
                return 712;
            case 712:
                return 714;
            case 713:
                return 715;
            case 714:
                return 716;
            case 715:
                return 717;
            case 716:
                return 718;
            case 717:
                return 719;
            case 718:
                return 720;
            case 720:
                return 722;
            case 721:
                return 723;
            case 722:
                return 724;
            case 723:
                return 725;
            case 724:
                return 726;
            case 725:
                return 727;
            case 726:
                return 728;
            case 727:
                return 729;
            case 728:
                return 730;
            case 729:
                return 731;
            case 730:
                return 732;
            case 731:
                return 733;
            case 739:
                return 741;
            case 740:
                return 742;
            case 741:
                return 743;
            case 743:
                return 745;
            case 744:
                return 746;
            case 745:
                return 747;
            case 746:
                return 748;
            case 750:
                return 752;
            case 751:
                return 753;
            case 752:
                return 754;
            case 753:
                return 755;
            case 754:
                return 756;
            case 755:
                return 757;
            case 756:
                return 758;
            case 758:
                return 760;
            case 759:
                return 761;
            case 760:
                return 762;
            case 761:
                return 763;
            case 762:
                return 764;
            case 763:
                return 765;
            case 764:
                return 766;
            case 765:
                return 767;
            case 766:
                return 768;
            case 767:
                return 769;
            case 768:
                return 770;
            case 769:
                return 771;
            case 770:
                return 772;
            case 771:
                return 773;
            case 772:
                return 774;
            case 773:
                return 775;
            case 774:
                return 776;
            case 775:
                return 777;
            case 776:
                return 778;
            case 780:
                return 782;
            case 781:
                return 783;
            case 783:
                return 785;
            case 784:
                return 786;
            case 785:
                return 787;
            case 787:
                return 789;
            case 791:
                return 793;
            case 792:
                return 794;
            case 794:
                return 796;
            case 795:
                return 797;
            case 796:
                return 798;
            case 797:
                return 799;
            case 798:
                return 800;
            case 799:
                return 801;
            case 800:
                return 802;
            case 801:
                return 803;
            case 802:
                return 804;
            case 803:
                return 805;
            case 805:
                return 807;
            case 806:
                return 808;
            case 807:
                return 809;
            case 808:
                return 810;
            case 809:
                return 811;
            case 810:
                return 812;
            case 811:
                return 813;
            case 813:
                return 815;
            case 814:
                return 816;
            case 815:
                return 817;
            case 816:
                return 818;
            case 817:
                return 819;
            case 818:
                return 820;
            case 819:
                return 821;
            case 820:
                return 822;
            case 821:
                return 823;
            case 822:
                return 824;
            case 823:
                return 825;
            case 824:
                return 826;
            case 827:
                return 829;
            case 828:
                return 830;
            case 829:
                return 831;
            case 830:
                return 832;
            case 831:
                return 833;
            case 832:
                return 834;
            case 837:
                return 839;
            case 839:
                return 841;
            case 840:
                return 842;
            case 841:
                return 843;
            case 842:
                return 844;
            case 843:
                return 845;
            case 844:
                return 846;
            case 845:
                return 847;
            case 846:
                return 848;
            case 847:
                return 849;
            case 851:
                return 853;
            case 852:
                return 854;
            case 853:
                return 855;
            case 854:
                return 856;
            case 857:
                return 859;
            case 858:
                return 860;
            case 859:
                return 861;
            case 867:
                return 869;
            case 868:
                return 870;
            case 869:
                return 871;
            case 870:
                return 872;
            case 871:
                return 873;
            case 872:
                return 874;
            case 873:
                return 875;
            case 874:
                return 876;
            case 875:
                return 877;
            case 876:
                return 878;
            case 877:
                return 879;
            case 878:
                return 880;
            case 879:
                return 881;
            case 880:
                return 882;
            case 881:
                return 883;
            case 882:
                return 884;
            case 883:
                return 885;
            case 884:
                return 886;
            case 885:
                return 887;
            case 886:
                return 888;
            case 887:
                return 889;
            case 888:
                return 890;
            case 889:
                return 891;
            case 890:
                return 892;
            case 891:
                return 893;
            case 892:
                return 894;
            case 893:
                return 895;
            case 894:
                return 896;
            case 895:
                return 897;
            case 896:
                return 898;
            case 897:
                return 899;
            case 898:
                return 900;
            case 899:
                return 901;
            case 900:
                return 902;
            case 901:
                return 903;
            case 902:
                return 904;
            case 903:
                return 905;
            case 904:
                return 906;
            case 905:
                return 907;
            case 906:
                return 908;
            case 907:
                return 909;
            case 908:
                return 910;
            case 909:
                return 911;
            case 910:
                return 912;
            case 911:
                return 913;
            case 916:
                return 918;
            case 917:
                return 919;
            case 918:
                return 920;
            case 919:
                return 921;
            case 926:
                return 928;
            case 927:
                return 929;
            case 928:
                return 930;
            case 929:
                return 931;
            case 930:
                return 932;
            case 931:
                return 933;
            case 932:
                return 934;
            case 933:
                return 935;
            case 935:
                return 937;
            case 936:
                return 938;
            case 937:
                return 939;
            case 938:
                return 940;
            case 939:
                return 941;
            case 940:
                return 942;
            case 943:
                return 945;
            case 944:
                return 946;
            case 949:
                return 951;
            case 953:
                return 955;
            case 954:
                return 956;
            case 955:
                return 957;
            case 956:
                return 958;
            case 958:
                return 960;
            case 959:
                return 961;
            case 960:
                return 962;
            case 961:
                return 963;
            case 962:
                return 964;
            case 963:
                return 965;
            case 964:
                return 966;
            case 965:
                return 967;
            case 966:
                return 968;
            case 969:
                return 971;
            case 971:
                return 973;
            case 972:
                return 974;
            case 973:
                return 975;
            case 974:
                return 976;
            case 976:
                return 978;
            case 988:
                return 990;
            case 989:
                return 991;
            case 990:
                return 992;
            case 991:
                return 993;
            case 992:
                return 994;
            case 993:
                return 995;
            case 995:
                return 997;
            case 996:
                return 998;
            case 998:
                return 1000;
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
            case 1012:
                return 1014;
            case 1013:
                return 1015;
            case 1015:
                return 1017;
            case 1016:
                return 1018;
            case 1017:
                return 1019;
            case 1018:
                return 1020;
            case 1019:
                return 1021;
            case 1020:
                return 1022;
            case 1021:
                return 1023;
            case 1022:
                return 1024;
            case 1023:
                return 1025;
            case 1024:
                return 1026;
            case 1025:
                return 1027;
            case 1026:
                return 1028;
            case 1027:
                return 1029;
            case 1028:
                return 1030;
            case 1029:
                return 1031;
            case 1030:
                return 1032;
            case 1031:
                return 1033;
            case 1032:
                return 1034;
            case 1033:
                return 1035;
            case 1034:
                return 1036;
            case 1035:
                return 1037;
            case 1038:
                return 1040;
            case 1048:
                return 1050;
            case 1049:
                return 1051;
            case 1050:
                return 1052;
            case 1051:
                return 1053;
            case 1053:
                return 1055;
            case 1054:
                return 1056;
            case 1055:
                return 1057;
            case 1056:
                return 1058;
            case 1057:
                return 1059;
            case 1058:
                return 1060;
            case 1059:
                return 1061;
            case 1060:
                return 1062;
            case 1061:
                return 1063;
            case 1062:
                return 1064;
            case 1063:
                return 1065;
            case 1070:
                return 1072;
            case 1071:
                return 1073;
            case 1072:
                return 1074;
            case 1078:
                return 1080;
            case 1079:
                return 1081;
            case 1080:
                return 1082;
            case 1084:
                return 1086;
            case 1085:
                return 1087;
            case 1086:
                return 1088;
            case 1087:
                return 1089;
            case 1088:
                return 1090;
            case 1089:
                return 1091;
            case 1090:
                return 1092;
            case 1092:
                return 1094;
            case 1093:
                return 1095;
            case 1094:
                return 1096;
            case 1095:
                return 1097;
            case 1096:
                return 1098;
            case 1097:
                return 1099;
            case 1098:
                return 1100;
            case 1099:
                return 1101;
            case 1100:
                return 1102;
            case 1101:
                return 1103;
            case 1102:
                return 1104;
            case 1103:
                return 1105;
            case 1104:
                return 1106;
            case 1105:
                return 1107;
            case 1106:
                return 1108;
            case 1107:
                return 1109;
            case 1108:
                return 1110;
            case 1109:
                return 1111;
            case 1111:
                return 1113;
            case 1117:
                return 1119;
            case 1118:
                return 1120;
            case 1119:
                return 1121;
            case 1120:
                return 1122;
            case 1121:
                return 1123;
            case 1122:
                return 1124;
            case 1123:
                return 1125;
            case 1124:
                return 1126;
            case 1125:
                return 1127;
            case 1126:
                return 1128;
            case 1127:
                return 1129;
            case 1128:
                return 1130;
            case 1129:
                return 1131;
            case 1131:
                return 1133;
            case 1132:
                return 1134;
            case 1133:
                return 1135;
            case 1135:
                return 1137;
            case 1136:
                return 1138;
            case 1137:
                return 1139;
            case 1138:
                return 1140;
            case 1139:
                return 1141;
            case 1140:
                return 1142;
            case 1142:
                return 1144;
            case 1143:
                return 1145;
            case 1145:
                return 1147;
            case 1147:
                return 1149;
            case 1148:
                return 1150;
            case 1150:
                return 1152;
            case 1151:
                return 1153;
            case 1152:
                return 1154;
            case 1153:
                return 1155;
            case 1154:
                return 1156;
            case 1155:
                return 1157;
            case 1162:
                return 1164;
            case 1163:
                return 1165;
            case 1164:
                return 1166;
            case 1165:
                return 1167;
            case 1166:
                return 1168;
            case 1167:
                return 1169;
            case 1168:
                return 1170;
            case 1169:
                return 1171;
            case 1170:
                return 1172;
            case 1171:
                return 1173;
            case 1172:
                return 1174;
            case 1173:
                return 1175;
            case 1174:
                return 1176;
            case 1175:
                return 1177;
            case 1177:
                return 1179;
            case 1178:
                return 1180;
            case 1179:
                return 1181;
            case 1182:
                return 1184;
            case 1183:
                return 1185;
            case 1184:
                return 1186;
            case 1185:
                return 1187;
            case 1187:
                return 1189;
            case 1188:
                return 1190;
            case 1189:
                return 1191;
            case 1190:
                return 1192;
            case 1191:
                return 1193;
            case 1192:
                return 1194;
            case 1193:
                return 1195;
            case 1194:
                return 1196;
            case 1195:
                return 1197;
            case 1196:
                return 1198;
            case 1204:
                return 1206;
            case 1205:
                return 1207;
            case 1206:
                return 1208;
            case 1207:
                return 1209;
            case 1208:
                return 1210;
            case 1210:
                return 1212;
            case 1211:
                return 1213;
            case 1212:
                return 1214;
            case 1214:
                return 1216;
            case 1215:
                return 1217;
            case 1218:
                return 1220;
            case 1219:
                return 1221;
            case 1220:
                return 1222;
            case 1222:
                return 1224;
            case 1223:
                return 1225;
            case 1224:
                return 1226;
            case 1225:
                return 1227;
            case 1226:
                return 1228;
            case 1227:
                return 1229;
            case 1228:
                return 1230;
            case 1230:
                return 1232;
            case 1231:
                return 1233;
            case 1232:
                return 1234;
            case 1233:
                return 1235;
            case 1234:
                return 1236;
            case 1235:
                return 1237;
            case 1236:
                return 1238;
            case 1237:
                return 1239;
            case 1238:
                return 1240;
            case 1244:
                return 1246;
            case 1245:
                return 1247;
            case 1246:
                return 1248;
            case 1247:
                return 1249;
            case 1249:
                return 1251;
            case 1250:
                return 1252;
            case 1251:
                return 1253;
            case 1252:
                return 1254;
            case 1253:
                return 1255;
            case 1254:
                return 1256;
            case 1255:
                return 1257;
            case 1261:
                return 1263;
            case 1262:
                return 1264;
            case 1265:
                return 1267;
            case 1266:
                return 1268;
            case 1272:
                return 1274;
            case 1273:
                return 1275;
            case 1274:
                return 1276;
            case 1275:
                return 1277;
            case 1276:
                return 1278;
            case 1277:
                return 1279;
            case 1278:
                return 1280;
            case 1279:
                return 1281;
            case 1291:
                return 1293;
            case 1292:
                return 1294;
            case 1293:
                return 1295;
            case 1294:
                return 1296;
            case 1295:
                return 1297;
            case 1296:
                return 1298;
            case 1297:
                return 1299;
            case 1298:
                return 1300;
            case 1299:
                return 1301;
            case 1300:
                return 1302;
            case 1301:
                return 1303;
            case 1302:
                return 1304;
            case 1304:
                return 1306;
            case 1307:
                return 1309;
            case 1308:
                return 1310;
            case 1311:
                return 1313;
            case 1312:
                return 1314;
            case 1313:
                return 1315;
            case 1314:
                return 1316;
            case 1316:
                return 1318;
            case 1317:
                return 1319;
            case 1318:
                return 1320;
            case 1319:
                return 1321;
            case 1321:
                return 1323;
            case 1322:
                return 1324;
            case 1323:
                return 1325;
            case 1324:
                return 1326;
            case 1325:
                return 1327;
            case 1326:
                return 1328;
            case 1327:
                return 1329;
            case 1328:
                return 1330;
            case 1329:
                return 1331;
            case 1330:
                return 1332;
            case 1331:
                return 1333;
            case 1332:
                return 1334;
            case 1333:
                return 1335;
            case 1334:
                return 1336;
            case 1337:
                return 1339;
            case 1339:
                return 1341;
            case 1340:
                return 1342;
            case 1341:
                return 1343;
            case 1342:
                return 1344;
            case 1343:
                return 1345;
            case 1345:
                return 1347;
            case 1346:
                return 1348;
            case 1347:
                return 1349;
            case 1348:
                return 1350;
            case 1349:
                return 1351;
            case 1350:
                return 1352;
            case 1351:
                return 1353;
            case 1352:
                return 1354;
            case 1353:
                return 1355;
            case 1354:
                return 1356;
            case 1355:
                return 1357;
            case 1356:
                return 1358;
            case 1357:
                return 1359;
            case 1358:
                return 1360;
            case 1359:
                return 1361;
            case 1362:
                return 1364;
            case 1363:
                return 1365;
            case 1366:
                return 1368;
            case 1367:
                return 1369;
            case 1368:
                return 1370;
            case 1369:
                return 1371;
            case 1370:
                return 1372;
            case 1371:
                return 1373;
            case 1372:
                return 1374;
            case 1373:
                return 1375;
            case 1374:
                return 1376;
            case 1375:
                return 1377;
            case 1376:
                return 1378;
            case 1377:
                return 1379;
            case 1378:
                return 1380;
            case 1379:
                return 1381;
            case 1380:
                return 1382;
            case 1381:
                return 1383;
            case 1382:
                return 1384;
            case 1383:
                return 1385;
            case 1384:
                return 1386;
            case 1385:
                return 1387;
            case 1386:
                return 1388;
            case 1389:
                return 1391;
            case 1390:
                return 1392;
            case 1391:
                return 1393;
            case 1392:
                return 1394;
            case 1393:
                return 1395;
            case 1394:
                return 1396;
            case 1395:
                return 1397;
            case 1401:
                return 1403;
            case 1402:
                return 1404;
            case 1403:
                return 1405;
            case 1404:
                return 1406;
            case 1405:
                return 1407;
            case 1406:
                return 1408;
            case 1407:
                return 1409;
            case 1408:
                return 1410;
            case 1409:
                return 1411;
            case 1410:
                return 1412;
            case 1411:
                return 1413;
            case 1413:
                return 1415;
            case 1414:
                return 1416;
            case 1417:
                return 1419;
            case 1418:
                return 1420;
            case 1419:
                return 1421;
            case 1420:
                return 1422;
            case 1421:
                return 1423;
            case 1422:
                return 1424;
            case 1424:
                return 1426;
            case 1425:
                return 1427;
            case 1426:
                return 1428;
            case 1427:
                return 1429;
            case 1428:
                return 1430;
            case 1429:
                return 1431;
            case 1430:
                return 1432;
            case 1431:
                return 1433;
            case 1432:
                return 1434;
            case 1434:
                return 1436;
            case 1435:
                return 1437;
            case 1436:
                return 1438;
            case 1437:
                return 1439;
            case 1438:
                return 1440;
            case 1439:
                return 1441;
            case 1441:
                return 1443;
            case 1442:
                return 1444;
        }
    }

    public static int h(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 5) {
            return 6;
        }
        if (i != 10) {
            return i != 20 ? 0 : 21;
        }
        return 11;
    }

    public static final /* synthetic */ defpackage.ajyi i(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ajyi(akzxVar);
    }

    public static final /* synthetic */ defpackage.ajyi j(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ajyi(akzxVar);
    }

    public static final /* synthetic */ defpackage.ajyi k(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new defpackage.ajyi(akzxVar);
    }

    public static int l(int i) {
        if (i == 9999) {
            return 10000;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                return 10;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                return 11;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return 12;
            case 12:
                return 13;
            default:
                return 0;
        }
    }

    public static final void m(int i, akzx akzxVar) {
        akzxVar.u();
        amon amonVar = akzxVar.b;
        amon amonVar2 = amon.a;
        amonVar.c = i - 1;
        amonVar.b |= 1;
    }

    public static final double n(double d, double d2, double d3) {
        if (d3 >= d) {
            return d3 > d2 ? d2 : d3;
        }
        return d;
    }

    public static final double o(double d, double d2) {
        return 180.0d - java.lang.Math.abs(java.lang.Math.abs(d - d2) - 180.0d);
    }

    public static final double[] p(double[] dArr, double[][] dArr2) {
        aooh.f(dArr, "row");
        double d = dArr[0];
        double[] dArr3 = dArr2[0];
        double d2 = dArr3[0] * d;
        double d3 = dArr[1];
        double d4 = dArr3[1] * d3;
        double d5 = dArr[2];
        double d6 = dArr3[2] * d5;
        double[] dArr4 = dArr2[1];
        double d7 = dArr4[0] * d;
        double d8 = dArr4[1] * d3;
        double d9 = dArr4[2] * d5;
        double[] dArr5 = dArr2[2];
        return new double[]{d2 + d4 + d6, d7 + d8 + d9, (d * dArr5[0]) + (d3 * dArr5[1]) + (d5 * dArr5[2])};
    }

    public static final double q(double d) {
        double d2 = d % 360.0d;
        return d2 < 0.0d ? d2 + 360.0d : d2;
    }

    public static final double r(double d, double d2) {
        return q(d2 - d) <= 180.0d ? 1.0d : -1.0d;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0349  */
    /* JADX WARN: Code duplicated, block: B:102:0x034c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0350  */
    /* JADX WARN: Code duplicated, block: B:121:0x027c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0351 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:45:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:46:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:54:0x0201  */
    /* JADX WARN: Code duplicated, block: B:55:0x020b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x020d  */
    /* JADX WARN: Code duplicated, block: B:58:0x021d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0227  */
    /* JADX WARN: Code duplicated, block: B:61:0x0237  */
    /* JADX WARN: Code duplicated, block: B:62:0x0241  */
    /* JADX WARN: Code duplicated, block: B:64:0x0244  */
    /* JADX WARN: Code duplicated, block: B:66:0x024a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0250 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0252  */
    /* JADX WARN: Code duplicated, block: B:71:0x0261  */
    /* JADX WARN: Code duplicated, block: B:74:0x0274  */
    /* JADX WARN: Code duplicated, block: B:75:0x0277  */
    /* JADX WARN: Code duplicated, block: B:81:0x029b  */
    /* JADX WARN: Code duplicated, block: B:83:0x02a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:88:0x02be  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:96:0x0343  */
    /* JADX WARN: Code duplicated, block: B:98:0x0346  */
    public static final defpackage.amnm s(double d, double d2, double d3) {
        int iD;
        double d4;
        boolean z;
        int i;
        boolean z2;
        double d5;
        double d6;
        double[] dArr;
        double[] dArr2;
        double[] dArr3;
        double dE;
        double[] dArr4;
        int i2;
        double d7;
        double d8;
        int iB;
        double d9;
        double d10;
        int iC;
        int i3;
        int iFloor;
        double[] dArr5;
        double d11;
        boolean zH;
        double d12;
        double d13;
        double d14;
        double d15;
        int i4;
        double d16;
        double d17;
        double d18;
        double[] dArr6;
        double d19;
        double dE2;
        double d20;
        double d21;
        double d22;
        double d23;
        double d24;
        double[][] dArr7 = defpackage.amnn.a;
        if (d2 < 1.0E-4d || d3 < 1.0E-4d || d3 > 99.9999d) {
            double[][] dArr8 = defpackage.amnp.a;
            iD = defpackage.amnp.d(d3);
        } else {
            double dQ = q(d);
            double[][] dArr9 = defpackage.amnp.a;
            double dG = anar.g((d3 + 16.0d) / 116.0d) * 100.0d;
            double dSqrt = java.lang.Math.sqrt(dG) * 11.0d;
            defpackage.amno amnoVar = defpackage.amno.a;
            double d25 = 1.0d;
            double dPow = 1.0d / java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, amnoVar.b), 0.73d);
            double d26 = (dQ / 180.0d) * 3.141592653589793d;
            double d27 = 2.0d;
            double dCos = (java.lang.Math.cos(d26 + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * amnoVar.e;
            double dSin = java.lang.Math.sin(d26);
            double dCos2 = java.lang.Math.cos(d26);
            int i5 = 0;
            while (true) {
                double d28 = d25;
                double d29 = d27;
                if (i5 < 5) {
                    double d30 = dSqrt / 100.0d;
                    d4 = d26;
                    double dPow2 = java.lang.Math.pow(((d2 == 0.0d || dSqrt == 0.0d) ? 0.0d : d2 / java.lang.Math.sqrt(d30)) * dPow, 1.1111111111111112d);
                    amnoVar = amnoVar;
                    double d31 = amnoVar.c;
                    double d32 = amnoVar.f;
                    double dPow3 = (java.lang.Math.pow(d30, 1.4492753623188408d / amnoVar.j) * d31) / amnoVar.d;
                    double d33 = (((0.305d + dPow3) * 23.0d) * dPow2) / (((23.0d * dCos) + ((dPow2 * 11.0d) * dCos2)) + ((dPow2 * 108.0d) * dSin));
                    double d34 = d33 * dCos2;
                    double d35 = d33 * dSin;
                    double d36 = dPow3 * 460.0d;
                    double[] dArrP = p(new double[]{defpackage.amnn.d(((d36 + (451.0d * d34)) + (288.0d * d35)) / 1403.0d), defpackage.amnn.d(((d36 - (891.0d * d34)) - (261.0d * d35)) / 1403.0d), defpackage.amnn.d(((d36 - (d34 * 220.0d)) - (d35 * 6300.0d)) / 1403.0d)}, defpackage.amnn.a);
                    double d37 = dArrP[0];
                    if (d37 >= 0.0d) {
                        double d38 = dArrP[1];
                        if (d38 >= 0.0d) {
                            double d39 = dArrP[2];
                            if (d39 >= 0.0d) {
                                double[] dArr10 = defpackage.amnn.b;
                                double d40 = (dArr10[0] * d37) + (dArr10[1] * d38) + (dArr10[2] * d39);
                                if (d40 > 0.0d) {
                                    if (i5 != 4) {
                                        double d41 = d40 - dG;
                                        if (java.lang.Math.abs(d41) >= 0.002d) {
                                            dSqrt -= (d41 * dSqrt) / (d40 + d40);
                                            i5++;
                                            d25 = d28;
                                            d27 = d29;
                                            d26 = d4;
                                        }
                                    }
                                    if (dArrP[0] <= 100.01d && dArrP[1] <= 100.01d && dArrP[2] <= 100.01d) {
                                        iD = defpackage.amnp.c(dArrP);
                                    }
                                    if (iD == 0) {
                                        z = true;
                                        z2 = false;
                                        d5 = 0.0d;
                                        d6 = 0.0d;
                                        dArr = null;
                                        dArr2 = null;
                                        for (i = 0; i < 12; i++) {
                                            double[] dArr11 = defpackage.amnn.b;
                                            d13 = dArr11[0];
                                            d14 = dArr11[1];
                                            d15 = dArr11[2];
                                            i4 = i % 4;
                                            if (i % 2 == 0) {
                                                d16 = 0.0d;
                                            } else {
                                                d16 = 100.0d;
                                            }
                                            if (i4 <= 1) {
                                                d17 = 0.0d;
                                            } else {
                                                d17 = 100.0d;
                                            }
                                            if (i < 4) {
                                                d24 = ((dG - (d14 * d17)) - (d15 * d16)) / d13;
                                                if (anar.i(d24)) {
                                                    dArr6 = new double[]{d24, d17, d16};
                                                } else {
                                                    dArr6 = null;
                                                }
                                            } else if (i < 8) {
                                                d19 = ((dG - (d13 * d16)) - (d15 * d17)) / d14;
                                                if (anar.i(d19)) {
                                                    dArr6 = new double[]{d16, d19, d17};
                                                } else {
                                                    dArr6 = null;
                                                }
                                            } else {
                                                d18 = ((dG - (d13 * d17)) - (d14 * d16)) / d15;
                                                if (anar.i(d18)) {
                                                    dArr6 = new double[]{d17, d16, d18};
                                                } else {
                                                    dArr6 = null;
                                                }
                                            }
                                            if (dArr6 != null) {
                                                dE2 = defpackage.amnn.e(dArr6);
                                                if (z2) {
                                                    if (z) {
                                                        d20 = dE2;
                                                    } else {
                                                        d20 = dE2;
                                                        if (anar.h(d6, dE2, d5)) {
                                                        }
                                                        z2 = true;
                                                        z = false;
                                                    }
                                                    d21 = d6;
                                                    d22 = d20;
                                                    d23 = d4;
                                                    d6 = d21;
                                                    d4 = d23;
                                                    if (anar.h(d21, d23, d22)) {
                                                        dArr2 = dArr6;
                                                        d5 = d22;
                                                    } else {
                                                        dArr = dArr6;
                                                        d6 = d22;
                                                    }
                                                    z2 = true;
                                                    z = false;
                                                } else {
                                                    dArr = dArr6;
                                                    dArr2 = dArr;
                                                    d5 = dE2;
                                                    d6 = d5;
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        aooh.c(dArr);
                                        aooh.c(dArr2);
                                        double[][] dArr12 = {dArr, dArr2};
                                        dArr3 = dArr12[0];
                                        dE = defpackage.amnn.e(dArr3);
                                        dArr4 = dArr12[1];
                                        for (i2 = 0; i2 < 3; i2++) {
                                            d7 = dArr3[i2];
                                            d8 = dArr4[i2];
                                            if (d7 == d8) {
                                                if (d7 < d8) {
                                                    iB = defpackage.amnn.c(anar.j(d7));
                                                } else {
                                                    iB = defpackage.amnn.b(anar.j(d7));
                                                }
                                                d9 = dArr3[i2];
                                                d10 = dArr4[i2];
                                                if (d9 < d10) {
                                                    iC = defpackage.amnn.b(anar.j(d10));
                                                } else {
                                                    iC = defpackage.amnn.c(anar.j(d10));
                                                }
                                                i3 = 0;
                                                while (i3 < 8 && java.lang.Math.abs(iC - iB) > d28) {
                                                    iFloor = (int) java.lang.Math.floor(((double) (iB + iC)) / d29);
                                                    double d42 = defpackage.amnn.c[iFloor];
                                                    aooh.f(dArr3, "source");
                                                    aooh.f(dArr4, "target");
                                                    double d43 = dArr3[i2];
                                                    double d44 = d42 - d43;
                                                    double d45 = dArr4[i2] - d43;
                                                    aooh.f(dArr3, "source");
                                                    aooh.f(dArr4, "target");
                                                    double d46 = dArr3[0];
                                                    double d47 = d44 / d45;
                                                    double d48 = dArr3[1];
                                                    double d49 = dArr3[2];
                                                    dArr5 = new double[]{d46 + ((dArr4[0] - d46) * d47), d48 + ((dArr4[1] - d48) * d47), d49 + ((dArr4[2] - d49) * d47)};
                                                    double dE3 = defpackage.amnn.e(dArr5);
                                                    d11 = dE;
                                                    zH = anar.h(d11, d4, dE3);
                                                    d12 = dE3;
                                                    if (true == zH) {
                                                        iC = iFloor;
                                                    }
                                                    if (true != zH) {
                                                        iB = iFloor;
                                                    }
                                                    if (true == zH) {
                                                        dArr4 = dArr5;
                                                    }
                                                    if (true == zH) {
                                                        d12 = d11;
                                                    }
                                                    if (true != zH) {
                                                        dArr3 = dArr5;
                                                    }
                                                    i3++;
                                                    dE = d12;
                                                }
                                                dE = dE;
                                            }
                                        }
                                        aooh.f(dArr3, "a");
                                        aooh.f(dArr4, "b");
                                        iD = defpackage.amnp.c(new double[]{(dArr3[0] + dArr4[0]) / d29, (dArr3[1] + dArr4[1]) / d29, (dArr3[2] + dArr4[2]) / d29});
                                    }
                                }
                            }
                        }
                    }
                } else {
                    d4 = d26;
                }
                iD = 0;
                if (iD == 0) {
                    z = true;
                    z2 = false;
                    d5 = 0.0d;
                    d6 = 0.0d;
                    dArr = null;
                    dArr2 = null;
                    while (i < 12) {
                        double[] dArr13 = defpackage.amnn.b;
                        d13 = dArr13[0];
                        d14 = dArr13[1];
                        d15 = dArr13[2];
                        i4 = i % 4;
                        if (i % 2 == 0) {
                            d16 = 0.0d;
                        } else {
                            d16 = 100.0d;
                        }
                        if (i4 <= 1) {
                            d17 = 0.0d;
                        } else {
                            d17 = 100.0d;
                        }
                        if (i < 4) {
                            d24 = ((dG - (d14 * d17)) - (d15 * d16)) / d13;
                            if (anar.i(d24)) {
                                dArr6 = new double[]{d24, d17, d16};
                            } else {
                                dArr6 = null;
                            }
                        } else if (i < 8) {
                            d19 = ((dG - (d13 * d16)) - (d15 * d17)) / d14;
                            if (anar.i(d19)) {
                                dArr6 = new double[]{d16, d19, d17};
                            } else {
                                dArr6 = null;
                            }
                        } else {
                            d18 = ((dG - (d13 * d17)) - (d14 * d16)) / d15;
                            if (anar.i(d18)) {
                                dArr6 = new double[]{d17, d16, d18};
                            } else {
                                dArr6 = null;
                            }
                        }
                        if (dArr6 != null) {
                            dE2 = defpackage.amnn.e(dArr6);
                            if (z2) {
                                dArr = dArr6;
                                dArr2 = dArr;
                                d5 = dE2;
                                d6 = d5;
                                z2 = true;
                            } else {
                                if (z) {
                                    d20 = dE2;
                                    if (anar.h(d6, dE2, d5)) {
                                    }
                                    z2 = true;
                                    z = false;
                                } else {
                                    d20 = dE2;
                                }
                                d21 = d6;
                                d22 = d20;
                                d23 = d4;
                                d6 = d21;
                                d4 = d23;
                                if (anar.h(d21, d23, d22)) {
                                    dArr2 = dArr6;
                                    d5 = d22;
                                } else {
                                    dArr = dArr6;
                                    d6 = d22;
                                }
                                z2 = true;
                                z = false;
                            }
                        }
                    }
                    aooh.c(dArr);
                    aooh.c(dArr2);
                    double[][] dArr14 = {dArr, dArr2};
                    dArr3 = dArr14[0];
                    dE = defpackage.amnn.e(dArr3);
                    dArr4 = dArr14[1];
                    while (i2 < 3) {
                        d7 = dArr3[i2];
                        d8 = dArr4[i2];
                        if (d7 == d8) {
                            if (d7 < d8) {
                                iB = defpackage.amnn.c(anar.j(d7));
                            } else {
                                iB = defpackage.amnn.b(anar.j(d7));
                            }
                            d9 = dArr3[i2];
                            d10 = dArr4[i2];
                            if (d9 < d10) {
                                iC = defpackage.amnn.b(anar.j(d10));
                            } else {
                                iC = defpackage.amnn.c(anar.j(d10));
                            }
                            i3 = 0;
                            while (i3 < 8) {
                                iFloor = (int) java.lang.Math.floor(((double) (iB + iC)) / d29);
                                double d410 = defpackage.amnn.c[iFloor];
                                aooh.f(dArr3, "source");
                                aooh.f(dArr4, "target");
                                double d411 = dArr3[i2];
                                double d412 = d410 - d411;
                                double d413 = dArr4[i2] - d411;
                                aooh.f(dArr3, "source");
                                aooh.f(dArr4, "target");
                                double d414 = dArr3[0];
                                double d415 = d412 / d413;
                                double d416 = dArr3[1];
                                double d417 = dArr3[2];
                                dArr5 = new double[]{d414 + ((dArr4[0] - d414) * d415), d416 + ((dArr4[1] - d416) * d415), d417 + ((dArr4[2] - d417) * d415)};
                                double dE4 = defpackage.amnn.e(dArr5);
                                d11 = dE;
                                zH = anar.h(d11, d4, dE4);
                                d12 = dE4;
                                if (true == zH) {
                                    iC = iFloor;
                                }
                                if (true != zH) {
                                    iB = iFloor;
                                }
                                if (true == zH) {
                                    dArr4 = dArr5;
                                }
                                if (true == zH) {
                                    d12 = d11;
                                }
                                if (true != zH) {
                                    dArr3 = dArr5;
                                }
                                i3++;
                                dE = d12;
                            }
                            dE = dE;
                        }
                    }
                    aooh.f(dArr3, "a");
                    aooh.f(dArr4, "b");
                    iD = defpackage.amnp.c(new double[]{(dArr3[0] + dArr4[0]) / d29, (dArr3[1] + dArr4[1]) / d29, (dArr3[2] + dArr4[2]) / d29});
                }
            }
        }
        return new defpackage.amnm(iD);
    }

    public static /* synthetic */ double t(double d, double d2, double d3, boolean z, double d4) {
        if (z) {
            double d5 = d2 - 0.5d;
            double d6 = s(d, d2, d3).b;
            if (d6 < d5) {
                double d7 = d3;
                for (int i = 1; i < 6; i++) {
                    double d8 = d3 + ((double) i);
                    if (d8 > 100.0d) {
                        return d7;
                    }
                    double d9 = s(d, d2, d8).b;
                    if (d9 > d6) {
                        d6 = d9;
                        d7 = d8;
                    }
                    if (d9 >= d5) {
                        return d7;
                    }
                }
                return d7;
            }
        } else {
            int iMax = (int) java.lang.Math.max(0.0d, d4);
            if (iMax <= 98) {
                double d10 = d2 - 0.5d;
                double d11 = -1.0d;
                int i2 = 98;
                double d12 = d3;
                while (true) {
                    double d13 = i2;
                    double d14 = s(d, d2, d13).b;
                    if (d14 >= d10) {
                        return d13;
                    }
                    if (d14 > d11) {
                        d11 = d14;
                        d12 = d13;
                    }
                    if (i2 == iMax) {
                        return d12;
                    }
                    i2--;
                }
            }
        }
        return d3;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    public static /* synthetic */ double u(double d, boolean z) {
        double d2;
        double dQ = q(d);
        if (dQ <= 40.0d) {
            d2 = 1.1d;
        } else if (dQ <= 60.0d) {
            d2 = 1.2d;
        } else if (dQ <= 80.0d) {
            d2 = 1.0d;
        } else if (dQ <= 90.0d) {
            d2 = 0.85d;
        } else if (dQ <= 110.0d) {
            d2 = 0.75d;
        } else if (dQ <= 120.0d) {
            d2 = 0.9d;
        } else if (dQ <= 130.0d) {
            d2 = 0.5d;
        } else if (dQ <= 160.0d) {
            d2 = 0.7d;
        } else if (dQ <= 200.0d || (dQ > 280.0d && dQ <= 330.0d)) {
            d2 = 0.9d;
        } else {
            d2 = 1.0d;
        }
        return z ? d2 * 1.1d : d2;
    }

    public static /* synthetic */ defpackage.amnm v(defpackage.amnm amnmVar, defpackage.amnm amnmVar2, boolean z, double d, boolean z2) {
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7 = amnmVar2.c;
        double d8 = amnmVar.c;
        double dAbs = java.lang.Math.abs(d7 - d8);
        boolean z3 = true;
        if (dAbs > 20.0d) {
            if (z2) {
                if (z) {
                    d4 = d8 * 0.28d;
                    d5 = 0.72d;
                } else {
                    d4 = d8 * 0.42d;
                    d5 = 0.58d;
                }
                d6 = d4 + (d7 * d5);
            } else {
                d2 = (d8 + d8) / 3.0d;
                d3 = d7 / 3.0d;
                d6 = d2 + d3;
                z3 = false;
            }
        } else if (dAbs < 8.0d) {
            d6 = (d8 / 3.0d) + ((d7 + d7) / 3.0d);
            z3 = z2;
        } else if (z2) {
            d4 = d8 * 0.25d;
            d5 = 0.75d;
            d6 = d4 + (d7 * d5);
        } else {
            d2 = d8 / 2.0d;
            d3 = d7 / 2.0d;
            d6 = d2 + d3;
            z3 = false;
        }
        double d9 = amnmVar.b;
        double d10 = amnmVar2.b;
        double dMax = (d9 + d10) / 2.0d;
        if (z3) {
            dMax = java.lang.Math.max(d9, d10);
        }
        return s(d, dMax, d6);
    }

    public static /* synthetic */ boolean w(defpackage.amnm amnmVar, defpackage.amnm amnmVar2) {
        if (amnmVar.b < amnmVar2.b * 2.5d) {
            double d = amnmVar.c;
            double d2 = amnmVar2.c;
            if (d2 > 50.0d ? 100.0d - d < java.lang.Math.max(2.0d, 100.0d - d2) * 3.5d : d < java.lang.Math.max(2.0d, d2) * 3.5d) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078 A[SYNTHETIC] */
    public static /* synthetic */ double x(double d, double d2, double d3) {
        double d4;
        boolean z;
        int i;
        double d5;
        boolean z2;
        double d6;
        double d7 = -0.5d;
        boolean z3 = false;
        int iW = aooc.w((int) java.lang.Math.ceil(d3 - 0.5d), 0, 100);
        double d8 = iW;
        double d9 = s(d, d2, d8).b;
        double d10 = d2 - 0.5d;
        if (d9 >= d10) {
            return d8;
        }
        int i2 = iW - 1;
        boolean z4 = true;
        int i3 = iW + 1;
        double d11 = d9;
        double d12 = d8;
        double d13 = d11;
        while (true) {
            if (i2 >= 0) {
                if (i3 > 100) {
                    d4 = d7;
                } else {
                    d4 = d7;
                    if (java.lang.Math.abs(((double) i2) - d3) <= java.lang.Math.abs(((double) i3) - d3)) {
                    }
                    if (z4 != z) {
                        i = i3;
                    } else {
                        i = i2;
                    }
                    d5 = i;
                    z2 = z4;
                    d6 = s(d, d2, d5).b;
                    if (d6 <= d9 || (d6 == d9 && d5 < d12)) {
                        d9 = d6;
                        d12 = d5;
                    }
                    if (d6 >= d10) {
                        return d5;
                    }
                    if (z) {
                        if (i < 98 || d6 >= d11 + d4) {
                            i2--;
                            d11 = d6;
                        } else {
                            i2 = -1;
                        }
                    } else if (d6 < d13 + d4) {
                        i3 = 101;
                    } else {
                        i3++;
                        d13 = d6;
                    }
                    d7 = d4;
                    z4 = z2;
                    z3 = false;
                }
                z = z4;
                if (z4 != z) {
                    i = i3;
                } else {
                    i = i2;
                }
                d5 = i;
                z2 = z4;
                d6 = s(d, d2, d5).b;
                if (d6 <= d9) {
                    d9 = d6;
                    d12 = d5;
                } else {
                    d9 = d6;
                    d12 = d5;
                }
                if (d6 >= d10) {
                    return d5;
                }
                if (z) {
                    if (i < 98) {
                        i2--;
                        d11 = d6;
                    } else {
                        i2--;
                        d11 = d6;
                    }
                } else if (d6 < d13 + d4) {
                    i3 = 101;
                } else {
                    i3++;
                    d13 = d6;
                }
                d7 = d4;
                z4 = z2;
                z3 = false;
            } else {
                if (i3 > 100) {
                    return d12;
                }
                d4 = d7;
            }
            z = z3;
            if (z4 != z) {
                i = i3;
            } else {
                i = i2;
            }
            d5 = i;
            z2 = z4;
            d6 = s(d, d2, d5).b;
            if (d6 <= d9) {
                d9 = d6;
                d12 = d5;
            } else {
                d9 = d6;
                d12 = d5;
            }
            if (d6 >= d10) {
                return d5;
            }
            if (z) {
                if (i < 98) {
                    i2--;
                    d11 = d6;
                } else {
                    i2--;
                    d11 = d6;
                }
            } else if (d6 < d13 + d4) {
                i3 = 101;
            } else {
                i3++;
                d13 = d6;
            }
            d7 = d4;
            z4 = z2;
            z3 = false;
        }
    }

    public static int y(defpackage.ammz ammzVar, int[] iArr) {
        int i = ammzVar.b;
        int i2 = (i << 10) + (i << 6) + i;
        int i3 = ammzVar.d;
        int i4 = i3 << 5;
        int i5 = i2 + i4 + i3;
        int i6 = ammzVar.f;
        int i7 = iArr[i5 + i6];
        int i8 = ammzVar.e;
        int i9 = i7 - iArr[i5 + i8];
        int i10 = ammzVar.c;
        int i11 = i10 << 5;
        int i12 = i2 + i11 + i10;
        int i13 = (i9 - iArr[i12 + i6]) + iArr[i12 + i8];
        int i14 = ammzVar.a;
        int i15 = (i14 << 10) + (i14 << 6) + i14;
        int i16 = i4 + i15 + i3;
        int i17 = i15 + i11 + i10;
        return (((i13 - iArr[i16 + i6]) + iArr[i16 + i8]) + iArr[i6 + i17]) - iArr[i17 + i8];
    }

    static int z(defpackage.ammz ammzVar, int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = i - 1;
        if (i4 == 0) {
            int i5 = ammzVar.a;
            int i6 = ammzVar.d;
            int i7 = ammzVar.f;
            int i8 = (i5 << 10) + (i5 << 6) + i5;
            int i9 = (i6 << 5) + i8 + i6;
            int i10 = -iArr[i9 + i7];
            int i11 = ammzVar.e;
            int i12 = i10 + iArr[i9 + i11];
            int i13 = ammzVar.c;
            int i14 = i8 + (i13 << 5) + i13;
            i2 = i12 + iArr[i7 + i14];
            i3 = iArr[i14 + i11];
        } else if (i4 != 1) {
            int i15 = ammzVar.b;
            int i16 = ammzVar.d;
            int i17 = ammzVar.e;
            int i18 = i16 << 5;
            int i19 = (i15 << 10) + (i15 << 6) + i15;
            int i20 = -iArr[i19 + i18 + i16 + i17];
            int i21 = ammzVar.c;
            int i22 = i21 << 5;
            int i23 = i20 + iArr[i19 + i22 + i21 + i17];
            int i24 = ammzVar.a;
            int i25 = (i24 << 10) + (i24 << 6) + i24;
            i2 = i23 + iArr[i18 + i25 + i16 + i17];
            i3 = iArr[i25 + i22 + i21 + i17];
        } else {
            int i26 = ammzVar.b;
            int i27 = ammzVar.c;
            int i28 = ammzVar.f;
            int i29 = i27 << 5;
            int i30 = (i26 << 10) + (i26 << 6) + i26 + i29 + i27;
            int i31 = -iArr[i30 + i28];
            int i32 = ammzVar.e;
            int i33 = i31 + iArr[i30 + i32];
            int i34 = ammzVar.a;
            int i35 = (i34 << 10) + (i34 << 6) + i34 + i29 + i27;
            i2 = i33 + iArr[i28 + i35];
            i3 = iArr[i35 + i32];
        }
        return i2 - i3;
    }
}
