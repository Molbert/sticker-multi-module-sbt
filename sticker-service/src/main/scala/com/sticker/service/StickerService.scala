package com.sticker.service

import com.sticker.data.{StickerDao, Sticker}

class StickerService {

  private val stickerDao = new StickerDao

  def getTrendyStickers: List[Sticker] = stickerDao.allStickers
}
