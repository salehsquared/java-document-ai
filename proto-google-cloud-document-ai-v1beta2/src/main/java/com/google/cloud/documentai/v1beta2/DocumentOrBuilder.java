/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/documentai/v1beta2/document.proto

package com.google.cloud.documentai.v1beta2;

public interface DocumentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta2.Document)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Currently supports Google Cloud Storage URI of the form
   *    `gs://bucket_name/object_name`. Object versioning is not supported.
   *    See [Google Cloud Storage Request
   *    URIs](https://cloud.google.com/storage/docs/reference-uris) for more
   *    info.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * Currently supports Google Cloud Storage URI of the form
   *    `gs://bucket_name/object_name`. Object versioning is not supported.
   *    See [Google Cloud Storage Request
   *    URIs](https://cloud.google.com/storage/docs/reference-uris) for more
   *    info.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Inline document content, represented as a stream of bytes.
   * Note: As with all `bytes` fields, protobuffers use a pure binary
   * representation, whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes content = 2;</code>
   *
   * @return The content.
   */
  com.google.protobuf.ByteString getContent();

  /**
   *
   *
   * <pre>
   * An IANA published MIME type (also referred to as media type). For more
   * information, see
   * https://www.iana.org/assignments/media-types/media-types.xhtml.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * An IANA published MIME type (also referred to as media type). For more
   * information, see
   * https://www.iana.org/assignments/media-types/media-types.xhtml.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  /**
   *
   *
   * <pre>
   * UTF-8 encoded text in reading order from the document.
   * </pre>
   *
   * <code>string text = 4;</code>
   *
   * @return The text.
   */
  java.lang.String getText();
  /**
   *
   *
   * <pre>
   * UTF-8 encoded text in reading order from the document.
   * </pre>
   *
   * <code>string text = 4;</code>
   *
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * Styles for the [Document.text][google.cloud.documentai.v1beta2.Document.text].
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Style text_styles = 5;</code>
   */
  java.util.List<com.google.cloud.documentai.v1beta2.Document.Style> getTextStylesList();
  /**
   *
   *
   * <pre>
   * Styles for the [Document.text][google.cloud.documentai.v1beta2.Document.text].
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Style text_styles = 5;</code>
   */
  com.google.cloud.documentai.v1beta2.Document.Style getTextStyles(int index);
  /**
   *
   *
   * <pre>
   * Styles for the [Document.text][google.cloud.documentai.v1beta2.Document.text].
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Style text_styles = 5;</code>
   */
  int getTextStylesCount();
  /**
   *
   *
   * <pre>
   * Styles for the [Document.text][google.cloud.documentai.v1beta2.Document.text].
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Style text_styles = 5;</code>
   */
  java.util.List<? extends com.google.cloud.documentai.v1beta2.Document.StyleOrBuilder>
      getTextStylesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Styles for the [Document.text][google.cloud.documentai.v1beta2.Document.text].
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Style text_styles = 5;</code>
   */
  com.google.cloud.documentai.v1beta2.Document.StyleOrBuilder getTextStylesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Visual page layout for the [Document][google.cloud.documentai.v1beta2.Document].
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Page pages = 6;</code>
   */
  java.util.List<com.google.cloud.documentai.v1beta2.Document.Page> getPagesList();
  /**
   *
   *
   * <pre>
   * Visual page layout for the [Document][google.cloud.documentai.v1beta2.Document].
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Page pages = 6;</code>
   */
  com.google.cloud.documentai.v1beta2.Document.Page getPages(int index);
  /**
   *
   *
   * <pre>
   * Visual page layout for the [Document][google.cloud.documentai.v1beta2.Document].
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Page pages = 6;</code>
   */
  int getPagesCount();
  /**
   *
   *
   * <pre>
   * Visual page layout for the [Document][google.cloud.documentai.v1beta2.Document].
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Page pages = 6;</code>
   */
  java.util.List<? extends com.google.cloud.documentai.v1beta2.Document.PageOrBuilder>
      getPagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Visual page layout for the [Document][google.cloud.documentai.v1beta2.Document].
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Page pages = 6;</code>
   */
  com.google.cloud.documentai.v1beta2.Document.PageOrBuilder getPagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A list of entities detected on [Document.text][google.cloud.documentai.v1beta2.Document.text]. For document shards,
   * entities in this list may cross shard boundaries.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Entity entities = 7;</code>
   */
  java.util.List<com.google.cloud.documentai.v1beta2.Document.Entity> getEntitiesList();
  /**
   *
   *
   * <pre>
   * A list of entities detected on [Document.text][google.cloud.documentai.v1beta2.Document.text]. For document shards,
   * entities in this list may cross shard boundaries.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Entity entities = 7;</code>
   */
  com.google.cloud.documentai.v1beta2.Document.Entity getEntities(int index);
  /**
   *
   *
   * <pre>
   * A list of entities detected on [Document.text][google.cloud.documentai.v1beta2.Document.text]. For document shards,
   * entities in this list may cross shard boundaries.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Entity entities = 7;</code>
   */
  int getEntitiesCount();
  /**
   *
   *
   * <pre>
   * A list of entities detected on [Document.text][google.cloud.documentai.v1beta2.Document.text]. For document shards,
   * entities in this list may cross shard boundaries.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Entity entities = 7;</code>
   */
  java.util.List<? extends com.google.cloud.documentai.v1beta2.Document.EntityOrBuilder>
      getEntitiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of entities detected on [Document.text][google.cloud.documentai.v1beta2.Document.text]. For document shards,
   * entities in this list may cross shard boundaries.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Entity entities = 7;</code>
   */
  com.google.cloud.documentai.v1beta2.Document.EntityOrBuilder getEntitiesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Relationship among [Document.entities][google.cloud.documentai.v1beta2.Document.entities].
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.EntityRelation entity_relations = 8;
   * </code>
   */
  java.util.List<com.google.cloud.documentai.v1beta2.Document.EntityRelation>
      getEntityRelationsList();
  /**
   *
   *
   * <pre>
   * Relationship among [Document.entities][google.cloud.documentai.v1beta2.Document.entities].
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.EntityRelation entity_relations = 8;
   * </code>
   */
  com.google.cloud.documentai.v1beta2.Document.EntityRelation getEntityRelations(int index);
  /**
   *
   *
   * <pre>
   * Relationship among [Document.entities][google.cloud.documentai.v1beta2.Document.entities].
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.EntityRelation entity_relations = 8;
   * </code>
   */
  int getEntityRelationsCount();
  /**
   *
   *
   * <pre>
   * Relationship among [Document.entities][google.cloud.documentai.v1beta2.Document.entities].
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.EntityRelation entity_relations = 8;
   * </code>
   */
  java.util.List<? extends com.google.cloud.documentai.v1beta2.Document.EntityRelationOrBuilder>
      getEntityRelationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Relationship among [Document.entities][google.cloud.documentai.v1beta2.Document.entities].
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.EntityRelation entity_relations = 8;
   * </code>
   */
  com.google.cloud.documentai.v1beta2.Document.EntityRelationOrBuilder getEntityRelationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Information about the sharding if this document is sharded part of a larger
   * document. If the document is not sharded, this message is not specified.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta2.Document.ShardInfo shard_info = 9;</code>
   *
   * @return Whether the shardInfo field is set.
   */
  boolean hasShardInfo();
  /**
   *
   *
   * <pre>
   * Information about the sharding if this document is sharded part of a larger
   * document. If the document is not sharded, this message is not specified.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta2.Document.ShardInfo shard_info = 9;</code>
   *
   * @return The shardInfo.
   */
  com.google.cloud.documentai.v1beta2.Document.ShardInfo getShardInfo();
  /**
   *
   *
   * <pre>
   * Information about the sharding if this document is sharded part of a larger
   * document. If the document is not sharded, this message is not specified.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta2.Document.ShardInfo shard_info = 9;</code>
   */
  com.google.cloud.documentai.v1beta2.Document.ShardInfoOrBuilder getShardInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * [Label][google.cloud.documentai.v1beta2.Document.Label]s for this document.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Label labels = 11;</code>
   */
  java.util.List<com.google.cloud.documentai.v1beta2.Document.Label> getLabelsList();
  /**
   *
   *
   * <pre>
   * [Label][google.cloud.documentai.v1beta2.Document.Label]s for this document.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Label labels = 11;</code>
   */
  com.google.cloud.documentai.v1beta2.Document.Label getLabels(int index);
  /**
   *
   *
   * <pre>
   * [Label][google.cloud.documentai.v1beta2.Document.Label]s for this document.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Label labels = 11;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * [Label][google.cloud.documentai.v1beta2.Document.Label]s for this document.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Label labels = 11;</code>
   */
  java.util.List<? extends com.google.cloud.documentai.v1beta2.Document.LabelOrBuilder>
      getLabelsOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Label][google.cloud.documentai.v1beta2.Document.Label]s for this document.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta2.Document.Label labels = 11;</code>
   */
  com.google.cloud.documentai.v1beta2.Document.LabelOrBuilder getLabelsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Any error that occurred while processing this document.
   * </pre>
   *
   * <code>.google.rpc.Status error = 10;</code>
   *
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   *
   *
   * <pre>
   * Any error that occurred while processing this document.
   * </pre>
   *
   * <code>.google.rpc.Status error = 10;</code>
   *
   * @return The error.
   */
  com.google.rpc.Status getError();
  /**
   *
   *
   * <pre>
   * Any error that occurred while processing this document.
   * </pre>
   *
   * <code>.google.rpc.Status error = 10;</code>
   */
  com.google.rpc.StatusOrBuilder getErrorOrBuilder();

  public com.google.cloud.documentai.v1beta2.Document.SourceCase getSourceCase();
}
